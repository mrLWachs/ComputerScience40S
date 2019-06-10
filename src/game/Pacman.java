
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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;


/**
 * Pacman.java - representation of Pacman  
 *
 * @author Mr. Wachs 
 * @since 15-May-2019 
 */
public class Pacman extends GameCharacter
{
    
    private Prize                prize;
    private LinkedList<Wall>     walls;
    private LinkedList<Dot>      dots;
    private LinkedList<Ghost>    ghosts;  
    private LinkedList<Portal>   portals;
    private LinkedList<PowerDot> powerDots;
    private MediaPlayer          player;
    private FileHandler          file;
    private Timer                powerTimer;
    
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
            Prize prize,
            LinkedList<Wall> walls, 
            LinkedList<Dot> dots,
            LinkedList<Portal> portals,
            LinkedList<PowerDot> powerDots,
            MediaPlayer player, 
            FileHandler file,
            LinkedList<String> settings) {
        super(pacmanLabel, Constants.PACMAN_MOVE_AMOUNT, Directions.STOP, 
                Constants.PACMAN_TIMER_DELAY, Directions.FOUR_DIRECTIONS);
        this.walls     = walls;             // associate parameters with objects
        this.prize     = prize;
        this.dots      = dots;
        this.portals   = portals;
        this.powerDots = powerDots;
        this.player    = player;
        this.file      = file;
        setAnimations(pacmanLabel,settings);// sets all the animations
        setTimer();
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
    private void setAnimations(JLabel label, LinkedList<String> settings) {
        String sheet = Constants.SPRITE_SHEET;
        int    delay = Constants.PACMAN_ANIMATION_DELAY; 
        String tag   = Constants.PACMAN_LEFT_TAG;        
        Animation pacmanLeft = Animator.getAnimation(sheet, label, 
                                                       delay, settings, tag);
        tag = Constants.PACMAN_RIGHT_TAG;        
        Animation pacmanRight = Animator.getAnimation(sheet, label, 
                                                       delay, settings, tag);
        tag = Constants.PACMAN_UP_TAG;        
        Animation pacmanUp = Animator.getAnimation(sheet, label, 
                                                       delay, settings, tag);
        tag = Constants.PACMAN_DOWN_TAG;        
        Animation pacmanDown = Animator.getAnimation(sheet, label, 
                                                       delay, settings, tag);
        tag = Constants.PACMAN_DEATH_TAG;        
        Animation pacmanDeath = Animator.getAnimation(sheet, label, 
                                                       delay, settings, tag);
        LinkedList<Animation> pacmanAnimations = new LinkedList<>(); 
        pacmanAnimations.add(pacmanUp);
        pacmanAnimations.add(pacmanDown);
        pacmanAnimations.add(pacmanLeft);
        pacmanAnimations.add(pacmanRight);
        pacmanAnimations.add(pacmanDeath);                
        pacmanAnimations.get(4).setDelay(1000);
        pacmanAnimations.get(4).setLoop(false);        
        sprite.setAnimations(pacmanAnimations);
        
        
        
        
//        LinkedList<Animation> prizeAnimations = new LinkedList<>(); // animation
//        prizeAnimations.add(pacmanRight);                
//        sprite.setAnimations(prizeAnimations);
//        sprite.animate(0);                  // start animating
//        
//        
//        String sheet = Constants.SPRITE_SHEET;
//        int    delay = Constants.PACMAN_ANIMATION_DELAY; 
//        LinkedList<Integer> imageX      = new LinkedList<>();
//        LinkedList<Integer> imageY      = new LinkedList<>();
//        LinkedList<Integer> imageWidth  = new LinkedList<>();
//        LinkedList<Integer> imageHeight = new LinkedList<>();
//                 
//        // RIGHT................................................
//        int w = 50;
//        int h = 50;
//        int x = (w * 17);
//        int y = 0;
//        for (int i = 0; i < 3; i++) {
//            imageX.add(x);
//            imageY.add(y);
//            imageWidth.add(w);
//            imageHeight.add(h);
//            y = y + h;
//        }                        
//        Animation pacmanRight = new Animation(label, sheet, imageX, imageY, 
//                                       imageWidth, imageHeight, delay, true);
//        
//        // Down................................................
//        imageX.clear();
//        imageY.clear();
//        imageWidth.clear();
//        imageHeight.clear();  
//        for (int i = 0; i < 3; i++) {
//            imageX.add(x);
//            imageY.add(y);
//            imageWidth.add(w);
//            imageHeight.add(h);
//            y = y + h;
//        }                        
//        Animation pacmanDown = new Animation(label, sheet, imageX, imageY, 
//                                       imageWidth, imageHeight, delay, true);
//        
//        // Left................................................
//        imageX.clear();
//        imageY.clear();
//        imageWidth.clear();
//        imageHeight.clear();
//        for (int i = 0; i < 3; i++) {
//            imageX.add(x);
//            imageY.add(y);
//            imageWidth.add(w);
//            imageHeight.add(h);
//            y = y + h;
//        }                        
//        Animation pacmanLeft = new Animation(label, sheet, imageX, imageY, 
//                                       imageWidth, imageHeight, delay, true);
//        
//        // Up................................................
//        imageX.clear();
//        imageY.clear();
//        imageWidth.clear();
//        imageHeight.clear();
//        for (int i = 0; i < 3; i++) {
//            imageX.add(x);
//            imageY.add(y);
//            imageWidth.add(w);
//            imageHeight.add(h);
//            y = y + h;
//        }                        
//        Animation pacmanUp = new Animation(label, sheet, imageX, imageY, 
//                                       imageWidth, imageHeight, delay, true);
//        
//        // DEATH................................................
//        imageX.clear();
//        imageY.clear();
//        imageWidth.clear();
//        imageHeight.clear();
//        
//        for (int i = 0; i < 2; i++) {
//        
//            imageX.add(351);
//            imageY.add(3);
//            imageWidth.add(46);
//            imageHeight.add(43);
//
//            imageX.add(357);
//            imageY.add(57);
//            imageWidth.add(36);
//            imageHeight.add(37);
//
//            imageX.add(357);
//            imageY.add(107);
//            imageWidth.add(38);
//            imageHeight.add(35);
//
//            imageX.add(361);
//            imageY.add(160);
//            imageWidth.add(28);
//            imageHeight.add(30);
//        
//        }
//        
//        imageX.add(362);
//        imageY.add(512);
//        imageWidth.add(26);
//        imageHeight.add(26);
//        
//        imageX.add(362);
//        imageY.add(562);
//        imageWidth.add(26);
//        imageHeight.add(26);
//        
//        Animation pacmanDeath = new Animation(label, sheet, imageX, imageY, 
//                                       imageWidth, imageHeight, delay, true);
//        
//        LinkedList<Animation> pacmanAnimations = new LinkedList<>(); // animation
//        pacmanAnimations.add(pacmanUp);
//        pacmanAnimations.add(pacmanDown);
//        pacmanAnimations.add(pacmanLeft);
//        pacmanAnimations.add(pacmanRight);
//        pacmanAnimations.add(pacmanDeath);
//                
//        pacmanAnimations.get(4).setDelay(1000);
//        pacmanAnimations.get(4).setLoop(false);
//        
//        sprite.setAnimations(pacmanAnimations);
////        sprite.animate(0);                  // start animating
//        
    }

//    /**
//     * The user's keyboard event of pressing a key to respond to
//     * 
//     * @param event the keyboard event registered
//     */
//    @Override
//    public void keypress(KeyEvent event) {
//        super.keypress(event);                  // send event to super class
//    }
    
    /** The action this pacman does in it's timer */
    @Override
    public void action() {
        animate();                              // change animation to respond
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
                player.playWAV(Constants.EAT_DOT_SOUND);// play sound
                points += Constants.DOT_POINT;          // add a point
            }
        }
        for (int i = 0; i < powerDots.size(); i++) {         // traverse dots
            if (detector.isOverLapping(powerDots.get(i))) {  // hit a dot
                powerDots.get(i).despawn();                  // remove dot
                player.playWAV(Constants.EAT_DOT_SOUND);     // play sound
                points += Constants.POWER_DOT_POINT;         // add a point
            }
        }
        if (detector.isOverLapping(portals.get(0))) {
            reactor.stickToRight(portals.get(1));
        }
        if (detector.isOverLapping(portals.get(1))) {
            reactor.stickToLeft(portals.get(0));
        }        
        if (detector.isOverLapping(prize)) {
            prize.despawn();                            // remove prize
            player.playWAV(Constants.GAME_OVER_WIN_SOUND);    // play sound
            points += Constants.PRIZE_POINT;            // add a point
        }
        if (points >= 
            (Constants.DOT_POINT * dots.size()) + 
            Constants.PRIZE_POINT +
            (Constants.POWER_DOT_POINT * powerDots.size())) { // check end game
            winGame();
        }
        redraw();                                       // re draw
    }

    /** Pacman has won the game (eaten all the dots) */
    private void winGame() {
        for (int i = 0; i < ghosts.size(); i++) {   // traverse ghosts
            ghosts.get(i).mover.stop();             // stop all ghosts
        }
        sprite.animate(4);                          // run first animation
        player.playWAV(Constants.GAME_OVER_WIN_SOUND);  // play sound
        String name = JOptionPane.showInputDialog("You win!\n"
                + "Enter name");                    // get user's name
        LinkedList<String> data = new LinkedList<>();
        data.add(name);
        data.add("" + points);
        file.write(data);                           // write array to file
        System.exit(0);                             // terminate application
    }

    /** changes the animation set to the appropriate animation based on direction */
    private void animate() {
        if      (coordinates.direction == Directions.UP)    sprite.animate(0);
        else if (coordinates.direction == Directions.DOWN)  sprite.animate(1);
        else if (coordinates.direction == Directions.LEFT)  sprite.animate(2);
        else if (coordinates.direction == Directions.RIGHT) sprite.animate(3);
    }

    private void setTimer() {
        powerTimer = new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tick();
            }
        });
    }
    
    private void tick() {
        powerTimer.setDelay(Constants.POWER_TIMER_DELAY);
        
    }

}
