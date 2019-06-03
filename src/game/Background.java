
/** required package class namespace */
package game;

import game.tools.GameObject;
import java.awt.Color;
import javax.swing.JLabel;

public class Background extends GameObject
{

    public Background(JLabel image) {
        super(image);
//        gameSprite.setColor(Color.black);
        gameSprite.setImage("/game/media/background.png");
    }
    
}
