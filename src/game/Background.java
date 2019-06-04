
/** required package class namespace */
package game;

import game.tools.GameObject;
import java.awt.Color;
import javax.swing.JLabel;

public class Background extends GameObject
{

    public Background(JLabel image) {
        super(image);
        sprite.setColor(Color.black);
//        sprite.setImage("/game/media/background.png");
    }
    
}
