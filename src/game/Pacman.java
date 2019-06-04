

/** required package class namespace */
package game;

/** required imports */
import java.awt.HeadlessException;
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
    
    private Wall[]      walls;
    private Dot[]       dots;
    private Ghost[]     ghosts;    
    private MediaPlayer player;
    private FileHandler file;
    
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
            Wall[] walls, 
            Dot[] dots, 
            MediaPlayer player, 
            FileHandler file) {
        super(pacmanLabel, 1, Directions.STOP, 1,
                Directions.FOUR_DIRECTIONS);
        this.walls  = walls;
        this.dots   = dots;
        this.player = player;
        this.file   = file;
        setAnimations(pacmanLabel);     
        spawn();
    }
    
    public void setGhosts(Ghost[] ghosts) {
        this.ghosts = ghosts;
    }

    /**
     * Set up all the animations for this character
     * 
     * @param label the label to associate the animation with
     */
    private void setAnimations(JLabel label) {
        String[] animateUp = {
            "/game/media/pacmanUp01.png",
            "/game/media/pacmanUp02.png",
            "/game/media/pacmanUp03.png"
        };
        String[] animateDown = {
            "/game/media/pacmanDown01.png",
            "/game/media/pacmanDown02.png",
            "/game/media/pacmanDown03.png"
        };
        String[] animateLeft = {
            "/game/media/pacmanLeft01.png",
            "/game/media/pacmanLeft02.png",
            "/game/media/pacmanLeft03.png"
        };
        String[] animateRight = {
            "/game/media/pacmanRight01.png",
            "/game/media/pacmanRight02.png",
            "/game/media/pacmanRight03.png"
        };
        String[] animateIdle = {
            "/game/media/pacmanIdle01.png",
            "/game/media/pacmanIdle02.png",
            "/game/media/pacmanIdle03.png",
            "/game/media/pacmanIdle04.png"
        };        
        int delay = 350;
        Animation[] animations = new Animation[5];
        animations[0] = new Animation(label, animateIdle, delay, true);
        animations[1] = new Animation(label, animateUp, delay, true);
        animations[2] = new Animation(label, animateDown, delay, true);
        animations[3] = new Animation(label, animateLeft, delay, true);
        animations[4] = new Animation(label, animateRight, delay, true);        
        sprite.setAnimations(animations);
        sprite.animate(0);
    }

    /**
     * The user's keyboard event of pressing a key to respond to
     * 
     * @param event the keyboard event registered
     */
    public void keypress(KeyEvent evt) {
        super.keypress(evt);                    // send event to super class
        animate();                              // change animation to respond
    }
    
    /** The action this enemy does in it's timer */
    @Override
    public void action() {
        mover.move();
        
        // checking the walls
        for (int i = 0; i < walls.length; i++) {            
            if (detector.isOverLapping(walls[i])) {
                reactor.stickTo(walls[i]);
                mover.stop();
                sprite.animate(0);
            }            
        }
        
        // checking the dots
        for (int i = 0; i < dots.length; i++) {            
            if (detector.isOverLapping(dots[i])) {
                dots[i].despawn();
                player.playWAV("/game/media/pacman_chomp.wav");
                points++;
                if (points == dots.length) {
                    winGame();
                }
            }            
        }
        
        // redraw
        redraw();
    }

    private void winGame() throws HeadlessException {
        for (int i = 0; i < ghosts.length; i++) {
            ghosts[i].mover.stop();
        }
        sprite.animate(0);
        player.playWAV("/game/media/pacman_eatghost.wav");
        String name = JOptionPane.showInputDialog("You win!\n"
                + "Enter name");
        String[] data = { name, "" + points };
        file.write(data);
        System.exit(0);
    }

    private void animate() {
        if (coordinates.direction == Directions.STOP) {
            sprite.animate(0);
        }
        else if (coordinates.direction == Directions.UP) {
            sprite.animate(1);
        }
        else if (coordinates.direction == Directions.DOWN) {
            sprite.animate(2);
        }
        else if (coordinates.direction == Directions.LEFT) {
            sprite.animate(3);
        }
        else if (coordinates.direction == Directions.RIGHT) {
            sprite.animate(4);
        }        
    }


}
