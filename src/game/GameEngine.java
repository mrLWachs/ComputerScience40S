
/** required package class namespace */
package game;

/** required imports */
import collections.LinkedList;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import game.tools.FileHandler;
import game.tools.MediaPlayer;


/**
 * GameEngine.java - the logic connected to the user interface that runs game 
 * logic
 *
 * @author Mr. Wachs 
 * @since 15-May-2019 
 */
public class GameEngine 
{

    private Pacman               pacman;
    private Prize                prize;
    private Background           background;    
    private LinkedList<Ghost>    ghosts;
    private LinkedList<Wall>     walls;
    private LinkedList<Dot>      dots;
    private LinkedList<PowerDot> powerDots;    
    private LinkedList<Portal>   portals;
    private MediaPlayer          player;
    private FileHandler          playerData;
    private FileHandler          settingsFile;
        
    
    /**
     * Constructor for the class, sets class property data
     * 
     * @param pacmanLabel the label image for the corresponding object
     * @param prizeLabel the label image for the corresponding object
     * @param backgroundLabel the label image for the corresponding object
     * @param wallLabels the label image list for the corresponding object
     * @param dotLabels the label image list for the corresponding object
     * @param ghostLabels the label image list for the corresponding object
     * @param portalLabels the label image list for the corresponding object
     * @param powerDotLabels the label image list for the corresponding object
     * @param ui the user interface container for the game 
     */
    public GameEngine(
            JLabel pacmanLabel, 
            JLabel prizeLabel,
            JLabel backgroundLabel,
            LinkedList<JLabel> wallLabels, 
            LinkedList<JLabel> dotLabels, 
            LinkedList<JLabel> ghostLabels, 
            LinkedList<JLabel> portalLabels,
            LinkedList<JLabel> powerDotLabels,
            UserInterface ui) {        
        // create objects
        player       = new MediaPlayer();
        playerData   = new FileHandler(Constants.PLAYER_DATA_FILE);
        settingsFile = new FileHandler(Constants.SETTINGS_DATA_FILE); 
        //check for game settings
        LinkedList<String> settings = settingsFile.read();
        // create game objects       
        background   = new Background(backgroundLabel);
        prize        = new Prize(prizeLabel,settings);       
        // build the lists
        walls        = new LinkedList<>();
        dots         = new LinkedList<>();
        ghosts       = new LinkedList<>();
        portals      = new LinkedList<>();
        powerDots    = new LinkedList<>();
        // fill the lists
        for (int i = 0; i < wallLabels.size(); i++) {
            walls.add(new Wall(wallLabels.get(i)));
        }
        for (int i = 0; i < dotLabels.size(); i++) {
            dots.add(new Dot(dotLabels.get(i),settings));
        }
        for (int i = 0; i < portalLabels.size(); i++) {
            portals.add(new Portal(portalLabels.get(i)));
        } 
        for (int i = 0; i < powerDotLabels.size(); i++) {
            powerDots.add(new PowerDot(powerDotLabels.get(i),settings));
        }
        // make the characters
        pacman = new Pacman(pacmanLabel,prize,walls,dots,portals,powerDots,
                player,playerData,settings);        
        for (int i = 0; i < ghostLabels.size(); i++) {
            ghosts.add(new Ghost(ghostLabels.get(i),pacman,walls,portals,
                                 player,playerData,settings));
        }     
        pacman.setGhosts(ghosts);
        for (int i = 0; i < ghostLabels.size(); i++) {
            ghosts.get(i).setAllGhosts(ghosts);
        }     
        // check for saved data
        LinkedList<String> data = playerData.read();
        if (data != null) {
            JOptionPane.showMessageDialog(ui, "Previous score for " +
                    data.get(0) + " was " + data.get(1) + " points!");
        }
        // set UI properties
        ui.setSize(Constants.UI_WIDTH,Constants.UI_HEIGHT);
        ui.setResizable(false);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    }

    /**
     * The user's keyboard event of pressing a key to respond to
     * 
     * @param event the keyboard event registered
     */
    public void keypress(KeyEvent event) {
        pacman.keypress(event);
    }
    
}
