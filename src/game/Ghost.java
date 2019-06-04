
/** required package class namespace */
package game;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import game.tools.Animation;
import game.tools.Directions;
import game.tools.FileHandler;
import game.tools.GameCharacter;
import game.tools.MediaPlayer;

public class Ghost extends GameCharacter
{

    private Wall[]      walls;
    private Pacman      pacman;
    private MediaPlayer player;    
    private FileHandler file;
    
    
    public Ghost(
            JLabel ghostLabel, 
            Pacman pacman, 
            Wall[] walls, 
            MediaPlayer player,
            FileHandler file) {
        super(ghostLabel, 1, Directions.STOP, 10,
                Directions.FOUR_DIRECTIONS);
        this.walls  = walls;
        this.pacman = pacman;
        this.player = player;        
        this.file   = file; 
        mover.randomDirection();
        setAnimations(ghostLabel);
        spawn();
    }

    @Override
    public void action() {
        mover.move();
        
        // checking the walls
        for (int i = 0; i < walls.length; i++) {            
            if (detector.isOverLapping(walls[i])) {
                reactor.bounceOff(walls[i]);
                mover.randomDirection();
            }            
        }
        
        // checking for pacman
        if (detector.isOverLapping(pacman)) {
            pacman.mover.stop();
            pacman.sprite.animate(0);
            player.playWAV("/game/media/pacman_death.wav");
            String name = JOptionPane.showInputDialog("Enter name");
            String[] data = { name, "" + pacman.points };
            file.write(data);
            System.exit(0);
        }
        
        // redraw
        redraw();
    }

    private void setAnimations(JLabel label) {
        String[] ghostImages = {
            "/game/media/ghost01.png",
            "/game/media/ghost02.png",
            "/game/media/ghost03.png",
            "/game/media/ghost04.png",
            "/game/media/ghost05.png",
            "/game/media/ghost06.png"
        };
        
        int delay = 2000;
        Animation[] animations = new Animation[1];
        animations[0] = new Animation(label, ghostImages, delay, true);
        sprite.setAnimations(animations);
        sprite.animate(0);
    }

    
}
