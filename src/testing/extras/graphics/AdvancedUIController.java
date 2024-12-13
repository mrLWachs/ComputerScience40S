/** Required package class namespace */
package testing.extras.graphics;
 
/** Required API imports */
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.List;
import java.awt.event.MouseEvent;


/**
 * AdvancedUIController.java - this class as acting as the "logic" or "engine"
 * or "controller" or even the "brain" connected to the other class acting as 
 * the "design" or "body" or "view"
 *
 * @author Mr. Wachs
 * @since Dec 12, 2024, 11:47:34 a.m.
 */
public class AdvancedUIController 
{

    // The list of properties that are "linked" to the same properties on the
    // user interface "view" class so they can be modified and connected to in 
    // this "controller" class...
    
    private List                  allNamesList;
    private JButton               enterButton;
    private JTextField            nameTextField;
    private JPanel                drawingPanel;
    private AdvancedUserInterface ui;    
    
    
    /**
     * Class constructor connects this logic class to the user interface design 
     * class through the effected controls and the container object
     * 
     * @param allNamesList the list box of all name
     * @param enterButton the button to enter a name into the list
     * @param nameTextField the text box to type a name into
     * @param drawingPanel the panel the user can draw in
     * @param ui the user interface container
     */
    public AdvancedUIController(
            List                  allNamesList,
            JButton               enterButton,
            JTextField            nameTextField,
            JPanel                drawingPanel,
            AdvancedUserInterface ui) {
        this.allNamesList  = allNamesList;          // Connnect the parameters 
        this.enterButton   = enterButton;           // to the encapsulated 
        this.nameTextField = nameTextField;         // properties
        this.ui            = ui;
        ui.setLocationRelativeTo(null);             // Center UI on screen
        ui.setResizable(false);                     // User cannot size frame
        ui.setVisible(true);                        // Show UI to user
    }

    /**
     * The enter button action
     */
    public void buttonClick() {
        String name = nameTextField.getText();         // Access text in textbox
        if (name == null || name.equals("")) {                // Check that text
            allNamesList.add("Please enter a name...");        // Add message
        }
        else {
            allNamesList.add(name);                       // Add name to listbox
        }
        nameTextField.setText("");                          // Clear out textbox
        nameTextField.requestFocus();               // Put focus back on textbox
    }

    /**
     * The mouse click action on the list box
     * 
     * @param event the specific mouse click event
     */
    public void listMouseClick(MouseEvent event) {
        int button = event.getButton();
        System.out.println("Button was " + button);
    }
    
}