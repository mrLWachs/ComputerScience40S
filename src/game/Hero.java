
/** required package class namespace */
package game;

/** required imports */
import collections.LinkedList;
import game.gametools.Directions;
import game.gametools.GameCharacter;
import java.awt.Color;
import javax.swing.JLabel;


/**
 * Hero.java - representation of a Hero in a game 
 *
 * @author Mr. Wachs 
 * @since 19-Dec-2018 
 */
public class Hero extends GameCharacter
{

    private Objective        objective;
    private LinkedList<Wall> walls;
    
    
    /**
     * Constructor for the class, sets class property data
     * 
     * @param image the label associated with the image for the game character
     * @param objective the objective object
     * @param walls the list of wall objects
     */
    public Hero(JLabel image, Objective objective, LinkedList<Wall> walls) {
        super(image,1,Directions.STOP,1,Directions.FOUR_DIRECTIONS);
        this.objective = objective;
        this.walls     = walls;
        gameImage.debug("HERO", Color.yellow);
    }

    /**
     * The action this hero does in it's timer
     */
    @Override
    public void action() {
        mover.move();                                   // move coordinates
        for (int i = 0; i < walls.size(); i++) {        // traverse walls
            if (detector.isOverLapping(walls.get(i))) { // colliding with wall
                reactor.stickTo(walls.get(i));          // stick to wall
                i = walls.size();                       // exit loop early
            }
        }
        if (detector.isOverLapping(objective)) {    // colliding with objective
            System.exit(0);                         // end application
        }
        redraw();                                   // re draw hero
    }

}
