
/** required package class namespace */
package game.tools;

/** required imports */
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * GameImage.java - represents a box to display an image in a container for
 * a user interface and useful methods
 *
 * @author Mr. Wachs 
 * @since 14-May-2019 
 */
public class GameImage 
{
    
    private JLabel    label;
    private String    imageFile;
    private ImageIcon icon;
    
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param label the label used to display the image
     */
    public GameImage(JLabel label) {
        this(label, "", Color.white);               // set debug mode
    }
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param label the label used to display the image
     * @param background the background color of the label
     */
    public GameImage(JLabel label, Color background) {
        this(label,"",background);
    }
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param label the label used to display the image
     * @param text the text inside the label
     * @param background the background color of the label
     */
    public GameImage(JLabel label, String text, Color background) {
        this.label = label;                         // set parameter to property
        setDebug(text,background);                  // set debug mode
    }
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param label the label used to display the image
     * @param imageFile the relative image filename to display
     */
    public GameImage(JLabel label, String imageFile) {
        this.label = label;                         // set parameter to property
        setImage(imageFile);                        // set image
        resizeToContainer();                        // resize
    }
      
    /** Shows (makes visible) the GameImage in the container */
    public void show() {
        if (imageFile != null) label.setIcon(icon); // checks for an image
        label.setVisible(true);                     // make label visible
    }
    
    /** Hides (makes invisible) the GameImage in the container */
    public void hide() {
        label.setIcon(null);                        // removes any image
        label.setVisible(false);                    // make label invisible
    }
    
    /**
     * Resizes the image for the GameImage
     * 
     * @param width the new width to set to
     * @param height the new height to set to 
     */
    public void resize(int width, int height) {
        label.setSize(width, height);                   // resize label
        resizeToContainer();                            // resize image
    }
    
    /** Resizes the image inside the label to match the size of the label */
    public void resizeToContainer() {
        int       width         = label.getWidth();     // get label width
        int       height        = label.getHeight();    // get label height
        ImageIcon originalIcon  = (ImageIcon)label.getIcon();   // get icon
        if (originalIcon == null) return;               // error trap
        Image     originalImage = originalIcon.getImage();      // get image
        Image     newImage      = originalImage.getScaledInstance(
                                          width,height,Image.SCALE_SMOOTH);
        icon                    = new ImageIcon(newImage);  // set new image
        label.setIcon(icon);                            // set icon to label
    }
    
    /**
     * Update the coordinates of the GameImage current location data
     * 
     * @param coordinates the coordinates object to update
     */
    public void update(Coordinates coordinates) {
        if (coordinates == null) coordinates = new Coordinates();
        coordinates.x      = label.getX();
        coordinates.y      = label.getY();
        coordinates.width  = label.getWidth();
        coordinates.height = label.getHeight();
        coordinates.recalculate();
    }
    
    /**
     * Re-positions GameImage in it's container based on coordinate data 
     * 
     * @param coordinates the coordinates object to re-position to
     */
    public void redraw(Coordinates coordinates) {
        if (coordinates == null) return;            // error trap
        int x = coordinates.x;
        int y = coordinates.y;
        int w = coordinates.width;
        int h = coordinates.height;
        label.setBounds(x, y, w, h);
    }
    
    /**
     * Change the image inside a label to a new image an possibly resize the 
     * image to fit the label size
     * 
     * @param imageFile the new image file to change the label to
     */
    public void setImage(String imageFile) {
        this.imageFile = imageFile;             // set property to parameter
        label.setBorder(null);                  // remove border
        label.setOpaque(false);                 // remove background color
        icon = new ImageIcon(getClass().getResource(imageFile));    // set icon
        label.setIcon(icon);                    // set icon to label
        show();                                 // display picturebox 
        resizeToContainer();                    // resize
    }
    
    /**
     * Change the image inside a label to a new image an possibly resize the 
     * image to fit the label size
     * 
     * @param spriteSheet imageFile the new image file to change the label to
     * @param x
     * @param y
     * @param width
     * @param height 
     */
    public void setImage(
            String spriteSheet, 
            int x, 
            int y, 
            int width, 
            int height) {
        this.imageFile = spriteSheet;             // set property to parameter
        try {
            URL           url      = getClass().getResource(spriteSheet);   // convert to URL
            URI           uri      = url.toURI();                        // convert to URI
            File          file     = new File(uri);                      // create file
            BufferedImage bigImage = ImageIO.read(file);            
            BufferedImage subImage = bigImage.getSubimage(x, y, width, height);
            label.setBorder(null);                  // remove border
            label.setOpaque(false);                 // remove background color
            label.setText("");
            icon = new ImageIcon(subImage);    // set icon
            label.setIcon(icon);                    // set icon to label            
        } catch (IOException ex) {
            System.out.println("File read error: " + ex.toString());
        } catch (URISyntaxException ex) {        
            System.out.println("File convert error: " + ex.toString());
        }
        show();                                 // display picturebox 
        resizeToContainer();                    // resize
    }
    
    /**
     * Sets the image to debug mode, meaning it removes any graphics and
     * changes to a colored rectangle with text
     * 
     * @param text the text to display in the image
     * @param background the background color of the image
     */
    public void setDebug(String text, Color background) {
        setColor(background);                                   // set color
        label.setBorder(BorderFactory.createEtchedBorder());    // set border
        label.setHorizontalAlignment(SwingConstants.CENTER);    // set align
        label.setFont(new Font("Arial Narrow",Font.BOLD,8));    // set font
        label.setText(text);                                    // set text
    }
    
    /**
     * Sets the background color of the GameImage to the passed color and the
     * foreground color of the GameImage to the opposite color
     * 
     * @param color the background color to set to
     */
    public void setColor(Color color) {
        label.setBorder(null);                  // remove any border
        label.setIcon(null);                    // remove any icon
        label.setOpaque(true);                  // allow background color
        label.setBackground(color);             // set background color
        label.setForeground(invert(color));     // set foreground to opposite
        label.setText("");                      // remove any text
    }
    
    /**
     * Inverts (creates an opposite color) directly opposite the passed color
     * on the color wheel
     * 
     * @param color the color to invert
     * @return an opposite (inverted) color 
     */
    private Color invert(Color color) {
        int r = color.getRed();         // get red value of original color
        int g = color.getGreen();       // get green value of original color
        int b = color.getBlue();        // get blue value of original color
        r = 255 - r;                    // calculate opposite red value
        g = 255 - g;                    // calculate opposite green value
        b = 255 - b;                    // calculate opposite blue value
        return new Color(r,g,b);        // return new color
    }

    public void setClear() {
        label.setBorder(null);          // remove any border
        label.setIcon(null);            // remove any icon
        label.setOpaque(false);         // no background color
        label.setBackground(null);      // no background color
        label.setForeground(null);      // no foreground 
        label.setText("");              // no text
    }
    
}
