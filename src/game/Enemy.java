
/** required package class namespace */
package game;

/** required imports */
import game.gametools.Directions;
import game.gametools.GameCharacter;
import java.awt.Color;
import javax.swing.JLabel;


/**
 * Enemy.java - representation of a Enemy in a game 
 *
 * @author Mr. Wachs 
 * @since 19-Dec-2018 
 */
public class Enemy extends GameCharacter
{

    private Hero   hero;
    private Wall[] walls;
    
    
    /**
     * Constructor for the class, sets class property data
     * 
     * @param image the label associated with the image for the game character
     * @param hero the hero object
     * @param walls the array of wall objects
     */
    public Enemy(JLabel image, Hero hero, Wall[] walls) {
        super(image,1,Directions.STOP,1,Directions.FOUR_DIRECTIONS);
        this.hero  = hero;
        this.walls = walls;
        mover.randomDirection();
        gameImage.debug("ENEMY", Color.red);
    }

    /**
     * The action this hero does in it's timer
     */
    @Override
    public void action() {
        mover.move();                               // move coordinates
        for (int i = 0; i < walls.length; i++) {    // traverse walls
            if (detector.isOverLapping(walls[i])) { // colliding with wall
                reactor.bounceOff(walls[i]);        // bounce off wall
                mover.randomDirection();            // go random direction
                i = walls.length;                   // exit loop early                   
            }
        }
        if (detector.isOverLapping(hero)) {         // colliding with hero
            System.exit(0);                         // end application
        }
        redraw();                                   // re draw hero
    }

}
