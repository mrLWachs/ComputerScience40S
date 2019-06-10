
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
 * Ghost.java - representation of a ghost in a pacman game 
 *
 * @author Mr. Wachs 
 * @since 15-May-2019 
 */
public class Ghost extends GameCharacter
{

    private LinkedList<Wall>   walls;
    private LinkedList<Portal> portals;
    private Pacman             pacman;
    private MediaPlayer        player;    
    private FileHandler        file;
    private LinkedList<Ghost>  ghosts;
    
    private final int ANIMATE_RIGHT = 0;
    private final int ANIMATE_DOWN  = 1;
    private final int ANIMATE_LEFT  = 2;
    private final int ANIMATE_UP    = 3;
    
    
    
    /**
     * Constructor for the class, sets class property data
     * 
     * @param ghostLabel the label associated with the image for the character
     * @param pacman the pacman object
     * @param walls the list of wall objects
     * @param portals the list of portal objects
     * @param player the media player object
     * @param file the file handler object
     * @param settings the list of setting values for the images 
     */
    public Ghost(
            JLabel ghostLabel, 
            Pacman pacman, 
            LinkedList<Wall> walls,
            LinkedList<Portal> portals,
            MediaPlayer player,
            FileHandler file,
            LinkedList<String> settings) {
        super(ghostLabel, Constants.GHOST_MOVE_AMOUNT, Directions.STOP, 
                Constants.GHOST_TIMER_DELAY, Directions.FOUR_DIRECTIONS);
        this.walls   = walls;               // associate parameters with objects
        this.pacman  = pacman;
        this.portals = portals;
        this.player  = player;        
        this.file    = file; 
        setAnimations(ghostLabel,settings); // build all animations
        mover.randomDirection();            // start in a random direction
        spawn();                            // spawn this ghost
    }

    /** The action this ghost does in it's timer */
    @Override
    public void action() {
        mover.move();                               // move coordinates.
        animate();                                  // animate character
        for (int i = 0; i < walls.size(); i++) {    // traverse walls
            if (detector.isOverLapping(walls.get(i))) { // colliding with wall
                reactor.bounceOff(walls.get(i));    // bounce off wall
                mover.randomDirection();            // go random direction
                i = walls.size();                   // exit loop early 
            }
        }
        if (detector.isOverLapping(portals.get(0))) {   // hit portal
            reactor.stickToRight(portals.get(1));       // teleport
        }
        if (detector.isOverLapping(portals.get(1))) {   // hit portal
            reactor.stickToLeft(portals.get(0));        // teleport
        }
        if (ghosts != null) {                           // ghosts exist
            for (int i = 0; i < ghosts.size(); i++) {   // traverse ghosts
                if (!this.equals(ghosts.get(i))) {      // hit a ghost (not me)
                    if (detector.isOverLapping(ghosts.get(i))) {
                        reactor.bounceOff(ghosts.get(i));   // bounce off ghost
                        i = ghosts.size();                  // exit loop early 
                    }
                }
            }
        }
        if (detector.isOverLapping(pacman)) loseGame();     // hit pacman  
        redraw();                                           // redraw ghost
    }
    
    /**
     * Associates the ghosts list parameter with the class encapsulated 
     * property
     * 
     * @param ghosts the ghost list to associate with
     */
    public void setAllGhosts(LinkedList<Ghost> ghosts) {
        this.ghosts = ghosts;
    }
    
    /** Pacman has lost the game (captured by a ghost) */
    private void loseGame() {
        pacman.mover.stop();                            // stop pacman
        pacman.sprite.animate(pacman.ANIMATE_DEATH);    // new pacman animation
        for (int i = 0; i < ghosts.size(); i++) {       // traverse ghosts
            ghosts.get(i).mover.stop();                 // stop all ghosts
        }
        player.playWAV(Constants.GAME_OVER_LOSE_SOUND); // play sound
        String name = JOptionPane.showInputDialog("Enter name"); // get name
        LinkedList<String> data = new LinkedList<>();   // create list
        data.add(name);                                 // add values to list
        data.add("" + pacman.points);
        file.write(data);                               // save array to file
        System.exit(0);                                 // exit application
    }

    /** changes the animation set to the appropriate animation based on direction */
    private void animate() {
        if (sprite == null) return;
        if (sprite.hasAnimations() == false) return;
        if (coordinates.direction == Directions.RIGHT)  {
            if (sprite.isRunning(ANIMATE_RIGHT) == false) 
                sprite.animate(ANIMATE_RIGHT);
        }
        else if (coordinates.direction == Directions.DOWN)    {
            if (sprite.isRunning(ANIMATE_DOWN) == false) 
                sprite.animate(ANIMATE_DOWN);
        }
        else if (coordinates.direction == Directions.LEFT)    {
            if (sprite.isRunning(ANIMATE_LEFT) == false) 
                sprite.animate(ANIMATE_LEFT);
        }
        else if (coordinates.direction == Directions.UP)    {
            if (sprite.isRunning(ANIMATE_UP) == false) 
                sprite.animate(ANIMATE_UP);
        }
    }

    /**
     * Set up all the animations for this character
     * 
     * @param label the label to associate the animation with
     * @param settings the list of animation settings
     */
    private void setAnimations(JLabel label, LinkedList<String> settings) {
        String sheet = Constants.SPRITE_SHEET;
        int    delay = Constants.GHOST_ANIMATION_DELAY; 
        String tag   = Constants.GHOST_UP_TAG;        
        Animation ghostUp = Animator.getAnimation(sheet, label, 
                                                       delay, settings, tag);
        tag = Constants.GHOST_DOWN_TAG;        
        Animation ghostDown = Animator.getAnimation(sheet, label, 
                                                       delay, settings, tag);
        tag = Constants.GHOST_LEFT_TAG;        
        Animation ghostLeft = Animator.getAnimation(sheet, label, 
                                                       delay, settings, tag);
        tag = Constants.GHOST_RIGHT_TAG;        
        Animation ghostRight = Animator.getAnimation(sheet, label, 
                                                       delay, settings, tag);        
        tag = Constants.GHOST_DANGER_UP_TAG;        
        Animation ghostDangerUp = Animator.getAnimation(sheet, label, 
                                                       delay, settings, tag);
        tag = Constants.GHOST_DANGER_DOWN_TAG;        
        Animation ghostDangerDown = Animator.getAnimation(sheet, label, 
                                                       delay, settings, tag);
        tag = Constants.GHOST_DANGER_LEFT_TAG;        
        Animation ghostDangerLeft = Animator.getAnimation(sheet, label, 
                                                       delay, settings, tag);
        tag = Constants.GHOST_DANGER_RIGHT_TAG;        
        Animation ghostDangerRight = Animator.getAnimation(sheet, label, 
                                                       delay, settings, tag);
        tag = Constants.GHOST_DEAD_UP_TAG;        
        Animation ghostDeadUp = Animator.getAnimation(sheet, label, 
                                                       delay, settings, tag);
        tag = Constants.GHOST_DEAD_DOWN_TAG;        
        Animation ghostDeadDown = Animator.getAnimation(sheet, label, 
                                                       delay, settings, tag);
        tag = Constants.GHOST_DEAD_LEFT_TAG;        
        Animation ghostDeadLeft = Animator.getAnimation(sheet, label, 
                                                       delay, settings, tag);
        tag = Constants.GHOST_DEAD_RIGHT_TAG;        
        Animation ghostDeadRight = Animator.getAnimation(sheet, label, 
                                                       delay, settings, tag);
        LinkedList<Animation> ghostAnimations = new LinkedList<>(); 
        ghostAnimations.add(ghostRight);
        ghostAnimations.add(ghostDown);
        ghostAnimations.add(ghostLeft);
        ghostAnimations.add(ghostUp);
        ghostAnimations.add(ghostDangerRight);
        ghostAnimations.add(ghostDangerDown);
        ghostAnimations.add(ghostDangerLeft);
        ghostAnimations.add(ghostDangerUp);
        ghostAnimations.add(ghostDeadRight);
        ghostAnimations.add(ghostDeadDown);
        ghostAnimations.add(ghostDeadLeft);
        ghostAnimations.add(ghostDeadUp);
        sprite.setAnimations(ghostAnimations);             
    }
    
}
