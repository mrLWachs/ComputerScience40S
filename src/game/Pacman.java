
/** required package class namespace */
package game;

/** required imports */
import collections.LinkedList;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import game.tools.Animation;
import game.tools.Directions;
import game.tools.FileHandler;
import game.tools.GameCharacter;
import game.tools.MediaPlayer;


/**
 * Pacman.java - representation of Pacman  
 *
 * @author Mr. Wachs 
 * @since 15-May-2019 
 */
public class Pacman extends GameCharacter
{
    
    private LinkedList<Wall>  walls;
    private LinkedList<Dot>   dots;
    private LinkedList<Ghost> ghosts;    
    private MediaPlayer       player;
    private FileHandler       file;
    
    /** the total points pacman has received in the game */
    public int points;

    
    /**
     * Constructor for the class, sets class property data
     * 
     * @param pacmanLabel the label associated with the image for the game character
     * @param walls the array of wall objects
     * @param dots the array of dot objects
     * @param player the media player object
     * @param file the file handler object
     */
    public Pacman(
            JLabel pacmanLabel, 
            LinkedList<Wall> walls, 
            LinkedList<Dot> dots, 
            MediaPlayer player, 
            FileHandler file) {
        super(pacmanLabel, 1, Directions.STOP, 1,
                Directions.FOUR_DIRECTIONS);
        this.walls  = walls;                // associate parameters with objects
        this.dots   = dots;
        this.player = player;
        this.file   = file;
        setAnimations(pacmanLabel);         // sets all the animations
        spawn();                            // spawn this pacman
    }
    
    /**
     * Associates the ghosts array object with this classes property
     * @param ghosts 
     */
    public void setGhosts(LinkedList<Ghost> ghosts) {
        this.ghosts = ghosts;
    }

    /**
     * Set up all the animations for this character
     * 
     * @param label the label to associate the animation with
     */
    private void setAnimations(JLabel label) {
        LinkedList<String> animateUp = new LinkedList<>();
        for (int i = 1; i <= 3; i++) {
            animateUp.add("/game/media/pacmanUp0" + i + ".png");
        }        
        LinkedList<String> animateDown = new LinkedList<>();
        for (int i = 1; i <= 3; i++) {
            animateDown.add("/game/media/pacmanDown0" + i + ".png");
        }
        LinkedList<String> animateLeft = new LinkedList<>();
        for (int i = 1; i <= 3; i++) {
            animateLeft.add("/game/media/pacmanLeft0" + i + ".png");
        }
        LinkedList<String> animateRight = new LinkedList<>();
        for (int i = 1; i <= 3; i++) {
            animateRight.add("/game/media/pacmanRight0" + i + ".png");
        }
        LinkedList<String> animateIdle = new LinkedList<>();
        for (int i = 1; i <= 4; i++) {
            animateIdle.add("/game/media/pacmanIdle0" + i + ".png");
        }
        int delay = 350;                            // the animations delays
        LinkedList<Animation> animations = new LinkedList<>(); // animation
        animations.add(new Animation(label, animateIdle, delay, true));
        animations.add(new Animation(label, animateUp, delay, true));
        animations.add(new Animation(label, animateDown, delay, true));
        animations.add(new Animation(label, animateLeft, delay, true));
        animations.add(new Animation(label, animateRight, delay, true));      
        sprite.setAnimations(animations);           // set animations to sprite
        sprite.animate(0);                          // start first animation
    }

    /**
     * The user's keyboard event of pressing a key to respond to
     * 
     * @param event the keyboard event registered
     */
    @Override
    public void keypress(KeyEvent event) {
        super.keypress(event);                  // send event to super class
        animate();                              // change animation to respond
    }
    
    /** The action this pacman does in it's timer */
    @Override
    public void action() {
        mover.move();                                   // move coordinates
        for (int i = 0; i < walls.size(); i++) {        // traverse walls
            if (detector.isOverLapping(walls.get(i))) { // colliding with wall
                reactor.stickTo(walls.get(i));          // stick to wall
                i = walls.size();                       // exit loop early
                mover.stop();                           // stop movement
                animate();                              // change animation
            }
        }  
        
        for (int i = 0; i < dots.size(); i++) {         // traverse dots
            if (detector.isOverLapping(dots.get(i))) {  // hit a dot
                dots.get(i).despawn();                  // remove dot
                player.playWAV("/game/media/pacman_chomp.wav"); // play sound
                points++;                               // add a point
                if (points == dots.size()) {            // check for end game
                    winGame();
                }
            }
        }
        redraw();                                       // re draw
    }

    /** Pacman has won the game (eaten all the dots) */
    private void winGame() {
        for (int i = 0; i < ghosts.size(); i++) {   // traverse ghosts
            ghosts.get(i).mover.stop();             // stop all ghosts
        }
        sprite.animate(0);                          // run first animation
        player.playWAV("/game/media/pacman_eatghost.wav");  // play sound
        String name = JOptionPane.showInputDialog("You win!\n"
                + "Enter name");                    // get user's name
        String[] data = { name, "" + points };      // create array
        file.write(data);                           // write array to file
        System.exit(0);                             // terminate application
    }

    /** changes the animation set to the appropriate animation based on direction */
    private void animate() {
        if      (coordinates.direction == Directions.STOP)  sprite.animate(0);
        else if (coordinates.direction == Directions.UP)    sprite.animate(1);
        else if (coordinates.direction == Directions.DOWN)  sprite.animate(2);
        else if (coordinates.direction == Directions.LEFT)  sprite.animate(3);
        else if (coordinates.direction == Directions.RIGHT) sprite.animate(4);
    }

}
