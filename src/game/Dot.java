
/** required package class namespace */
package game;

import javax.swing.JLabel;
import game.tools.Animation;
import game.tools.GameObject;

public class Dot extends GameObject
{

    public Dot(JLabel image) {
        super(image);
        setAnimations(image);
    }

    private void setAnimations(JLabel label) {
        String[] images = {
            "/game/media/dot01.png",
            "/game/media/dot02.png"
        };        
        int delay = 250;
        Animation[] animations = new Animation[1];
        animations[0] = new Animation(label, images, delay, true);
        sprite.setAnimations(animations);
        sprite.animate(0);
    }

}
