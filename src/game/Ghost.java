
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

    private LinkedList<Wall>   walls;
    private LinkedList<Portal> portals;
    private Pacman             pacman;
    private MediaPlayer        player;    
    private FileHandler        file;
    private LinkedList<Ghost>  ghosts;
    
    
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
        buildAnimations(ghostLabel,settings);
        mover.randomDirection();            // start in a random direction
        spawn();                            // spawn this ghost
    }

    /** The action this ghost does in it's timer */
    @Override
    public void action() {
        mover.move();                               // move coordinates.
        animate();
        for (int i = 0; i < walls.size(); i++) {    // traverse walls
            if (detector.isOverLapping(walls.get(i))) { // colliding with wall
                reactor.bounceOff(walls.get(i));    // bounce off wall
                mover.randomDirection();            // go random direction
                i = walls.size();                   // exit loop early 
            }
        }
        if (detector.isOverLapping(portals.get(0))) {
            reactor.stickToRight(portals.get(1));
        }
        if (detector.isOverLapping(portals.get(1))) {
            reactor.stickToLeft(portals.get(0));
        }
        if (ghosts != null) {
            for (int i = 0; i < ghosts.size(); i++) {
                if (!this.equals(ghosts.get(i))) {
                    if (detector.isOverLapping(ghosts.get(i))) {
                        reactor.bounceOff(ghosts.get(i));   // bounce off wall
                        i = walls.size();                   // exit loop early 
                    }
                }
            }
        }
        if (detector.isOverLapping(pacman)) loseGame();      
        redraw();                                   // redraw ghost
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
        pacman.sprite.animate(4);                       // new pacman animation
        for (int i = 0; i < ghosts.size(); i++) {       // traverse ghosts
            ghosts.get(i).mover.stop();                 // stop all ghosts
        }
        player.playWAV(Constants.GAME_OVER_LOSE_SOUND); // play sound
        String name = JOptionPane.showInputDialog("Enter name"); // get name
        LinkedList<String> data = new LinkedList<>();
        data.add(name);
        data.add("" + pacman.points);
        file.write(data);                               // save array to file
        System.exit(0);                                 // exit application
    }

    /** changes the animation set to the appropriate animation based on direction */
    private void animate() {
        if (sprite == null) return;
        if (sprite.hasAnimations() == false) return;
        if      (coordinates.direction == Directions.RIGHT)  {
            if (sprite.isRunning(0) == false) sprite.animate(0);
        }
        else if (coordinates.direction == Directions.DOWN)    {
            if (sprite.isRunning(1) == false) sprite.animate(1);
        }
        else if (coordinates.direction == Directions.LEFT)    {
            if (sprite.isRunning(2) == false) sprite.animate(2);
        }
        else if (coordinates.direction == Directions.UP)    {
            if (sprite.isRunning(3) == false) sprite.animate(3);
        }
    }

    private void buildAnimations(JLabel label, LinkedList<String> settings) {
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
        LinkedList<Animation> ghostAnimations = new LinkedList<>(); // animation
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
        sprite.animate(0);                  // start animating
        
        
        
        
//        String sheet = Constants.SPRITE_SHEET;
//        int    delay = Constants.GHOST_ANIMATION_DELAY; 
//        LinkedList<Integer> imageX      = new LinkedList<>();
//        LinkedList<Integer> imageY      = new LinkedList<>();
//        LinkedList<Integer> imageWidth  = new LinkedList<>();
//        LinkedList<Integer> imageHeight = new LinkedList<>();
//         
//        // RIGHT................................................
//        int x = 0;
//        int y = 0;
//        int w = 50;
//        int h = 50;
//        int count = 1;
//        for (int i = 0; i < 6; i++) {
//            if (count == 1) {
//                imageX.add(x);
//                imageY.add(y);
//                imageWidth.add(w);
//                imageHeight.add(h); 
//                count = 2;
//                y = y + h;
//            }
//            else if (count == 2) {
//                imageX.add(x);
//                imageY.add(y);
//                imageWidth.add(w);
//                imageHeight.add(h); 
//                count = 1;
//                y = y - h;
//                x = x + w;
//            }
//        }                        
//        Animation ghostRight = new Animation(label, sheet, imageX, imageY, 
//                                       imageWidth, imageHeight, delay, true);
//        
//        // DOWN................................................
//        imageX.clear();
//        imageY.clear();
//        imageWidth.clear();
//        imageHeight.clear();
//        x = 0;
//        y = y + h + h;
//        count = 1;
//        for (int i = 0; i < 6; i++) {
//            if (count == 1) {
//                imageX.add(x);
//                imageY.add(y);
//                imageWidth.add(w);
//                imageHeight.add(h); 
//                count = 2;
//                y = y + h;
//            }
//            else if (count == 2) {
//                imageX.add(x);
//                imageY.add(y);
//                imageWidth.add(w);
//                imageHeight.add(h); 
//                count = 1;
//                y = y - h;
//                x = x + w;
//            }
//        }        
//        Animation ghostDown = new Animation(label, sheet, imageX, imageY, 
//                                       imageWidth, imageHeight, delay, true);
//        
//        // LEFT................................................
//        imageX.clear();
//        imageY.clear();
//        imageWidth.clear();
//        imageHeight.clear();
//        x = 0;
//        y = y + h + h;
//        count = 1;
//        for (int i = 0; i < 6; i++) {
//            if (count == 1) {
//                imageX.add(x);
//                imageY.add(y);
//                imageWidth.add(w);
//                imageHeight.add(h); 
//                count = 2;
//                y = y + h;
//            }
//            else if (count == 2) {
//                imageX.add(x);
//                imageY.add(y);
//                imageWidth.add(w);
//                imageHeight.add(h); 
//                count = 1;
//                y = y - h;
//                x = x + w;
//            }
//        }        
//        Animation ghostLeft = new Animation(label, sheet, imageX, imageY, 
//                                       imageWidth, imageHeight, delay, true);
//        
//        // UP................................................
//        imageX.clear();
//        imageY.clear();
//        imageWidth.clear();
//        imageHeight.clear();
//        x = 0;
//        y = y + h + h;
//        count = 1;
//        for (int i = 0; i < 6; i++) {
//            if (count == 1) {
//                imageX.add(x);
//                imageY.add(y);
//                imageWidth.add(w);
//                imageHeight.add(h); 
//                count = 2;
//                y = y + h;
//            }
//            else if (count == 2) {
//                imageX.add(x);
//                imageY.add(y);
//                imageWidth.add(w);
//                imageHeight.add(h); 
//                count = 1;
//                y = y - h;
//                x = x + w;
//            }
//        }        
//        Animation ghostUp = new Animation(label, sheet, imageX, imageY, 
//                                       imageWidth, imageHeight, delay, true);
//        
//        LinkedList<Animation> ghostAnimations = new LinkedList<>(); // animation
//        ghostAnimations.add(ghostRight);
//        ghostAnimations.add(ghostDown);
//        ghostAnimations.add(ghostLeft);
//        ghostAnimations.add(ghostUp);
//                
//        sprite.setAnimations(ghostAnimations);
//        sprite.animate(0);                  // start animating
    }
    
}
