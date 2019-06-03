

/** required package class namespace */
package game;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import game.tools.FileHandler;
import game.tools.MediaPlayer;



/**
 * GameEngine.java - 
 *
 * @author Mr. Wachs 
 * @since 3-Jun-2019 
 */
public class GameEngine 
{

    private Pacman      pacman;
    private Background  background;    
    private Ghost[]     ghosts;
    private Wall[]      walls;
    private Dot[]       dots;
    private MediaPlayer player;
    private FileHandler file;
    
    
    public GameEngine(
            JLabel pacmanLabel, 
            JLabel backgroundLabel,
            JLabel[] wallLabels, 
            JLabel[] dotLabels, 
            JLabel[] ghostLabels, 
            UserInterface ui) {
        // create objects
        player = new MediaPlayer();
        file   = new FileHandler("/game/Media/data.txt");
        background = new Background(backgroundLabel);
        // build the arrays
        walls  = new Wall[wallLabels.length];
        dots   = new Dot[dotLabels.length];
        ghosts = new Ghost[ghostLabels.length];
        // fill the arrays
        for (int i = 0; i < walls.length; i++) {
            walls[i] = new Wall(wallLabels[i]);
        }
        for (int i = 0; i < dots.length; i++) {
            dots[i] = new Dot(dotLabels[i]);
        }
        // make the characters
        pacman = new Pacman(pacmanLabel,walls,dots,player,file);
        for (int i = 0; i < ghosts.length; i++) {
            ghosts[i] = new Ghost(ghostLabels[i],pacman,walls,player,file);
        }        
        pacman.setGhosts(ghosts);
        // check for saved data
        String[] data = file.read();
        if (data != null) {
            JOptionPane.showMessageDialog(ui, "Previous score for " +
                    data[0] + " was " + data[1] + " points!");
        }        
        // set UI values
        ui.setSize(710, 800);
        ui.setResizable(false);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    }

    public void keypress(KeyEvent evt) {
        pacman.keypress(evt);
    }
    
}
