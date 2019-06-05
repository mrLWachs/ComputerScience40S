
/** required package class namespace */
package game;

/** required imports */
import collections.LinkedList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import game.tools.Animation;
import game.tools.Directions;
import game.tools.FileHandler;
import game.tools.GameCharacter;
import game.tools.MediaPlayer;


/**
 * Enemy.java - representation of a enemy in a game 
 *
 * @author Mr. Wachs 
 * @since 15-May-2019 
 */
public class Ghost extends GameCharacter
{

    private LinkedList<Wall> walls;
    private Pacman           pacman;
    private MediaPlayer      player;    
    private FileHandler      file;
    
    
    /**
     * Constructor for the class, sets class property data
     * 
     * @param ghostLabel the label associated with the image for the game character
     * @param pacman the pacman object
     * @param walls the list of wall objects
     * @param player the media player object
     * @param file the file handler object
     */
    public Ghost(
            JLabel ghostLabel, 
            Pacman pacman, 
            LinkedList<Wall> walls, 
            MediaPlayer player,
            FileHandler file) {
        super(ghostLabel, 1, Directions.STOP, 10,
                Directions.FOUR_DIRECTIONS);
        this.walls  = walls;                // associate parameters with objects
        this.pacman = pacman;
        this.player = player;        
        this.file   = file; 
        mover.randomDirection();            // start in a random direction
        LinkedList<String> ghostImages = new LinkedList<>();
        ghostImages.add("/game/media/ghost01.png");
        ghostImages.add("/game/media/ghost02.png");
        ghostImages.add("/game/media/ghost03.png");
        ghostImages.add("/game/media/ghost04.png");
        ghostImages.add("/game/media/ghost05.png");
        ghostImages.add("/game/media/ghost06.png"); // list of animation images
        int delay = 2000;                   // animation delay
        LinkedList<Animation> animations = new LinkedList<>(); // animation
        animations.add(new Animation(ghostLabel, ghostImages, delay, true));
        sprite.setAnimations(animations);
        sprite.animate(0);                  // start animating
        spawn();                            // spawn this ghost
    }

    /** The action this ghost does in it's timer */
    @Override
    public void action() {
        mover.move();                               // move coordinates
        for (int i = 0; i < walls.size(); i++) {    // traverse walls
            if (detector.isOverLapping(walls.get(i))) { // colliding with wall
                reactor.bounceOff(walls.get(i));    // bounce off wall
                mover.randomDirection();            // go random direction
                i = walls.size();                   // exit loop early 
            }
        }
        if (detector.isOverLapping(pacman)) {       // checking for pacman
            pacman.mover.stop();                    // stop pacman
            pacman.sprite.animate(0);               // change pacman animation
            player.playWAV("/game/media/pacman_death.wav"); // play sound
            String name = JOptionPane.showInputDialog("Enter name"); // get name
            String[] data = { name, "" + pacman.points };       // make array
            file.write(data);                       // save array to file
            System.exit(0);                         // exit application
        }        
        redraw();                                   // redraw ghost
    }

}
