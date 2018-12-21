
/** required package class namespace */
package game;

/** required imports */
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;


/**
 * GameEngine.java - the logic connected to the user interface that runs game logic
 *
 * @author Mr. Wachs 
 * @since 20-Dec-2018 
 */
public class GameEngine 
{
    private Hero      hero;
    private Objective objective;
    private Enemy     enemy;
    private Wall[]    walls;
   
    
    /**
     * Constructor for the class, sets class property data
     * 
     * @param ui the user interface container for the game
     * @param heroImage the label image for the corresponding object
     * @param objectiveImage the label image for the corresponding object
     * @param enemyImage the label image for the corresponding object
     * @param wallImages the label image array for the corresponding object
     */
    public GameEngine(UI ui, JLabel heroImage, JLabel objectiveImage, 
                      JLabel enemyImage, JLabel[] wallImages) {
        objective = new Objective(objectiveImage);  // create objective
        walls = new Wall[wallImages.length];        // create all walls
        for (int i = 0; i < walls.length; i++) {    // traverse the array
            walls[i] = new Wall(wallImages[i]);     // create wall objects
        }
        hero = new Hero(heroImage, objective, walls);   // create a hero
        enemy = new Enemy(enemyImage, hero, walls);     // create a enemy
        ui.getContentPane().setBackground(Color.white); // set container look
        ui.setBackground(Color.white);  
        ui.setSize(900, 720);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);        
    }

    /**
     * The user's keyboard event of pressing a key to respond to
     * 
     * @param event the keyboard event registered
     */
    public void keypress(KeyEvent event) {
        hero.keypress(event);
    }
        
}
