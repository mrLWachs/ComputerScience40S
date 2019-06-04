

/** required package class namespace */
package game;

import java.awt.Color;
import javax.swing.JLabel;
import game.tools.GameObject;

public class Wall extends GameObject
{

    public Wall(JLabel image) {
        super(image);
        sprite.setColor(Color.blue);
//        sprite.setClear();
    }

}
