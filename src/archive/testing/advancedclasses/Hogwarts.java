
/** required package class namespace */
package archive.testing.advancedclasses;


/**
 * Hogwarts.java - represents the fictional location of Hogwarts
 *
 * @author Mr. Wachs 
 * @since 1-Apr-2019 
 */
public class Hogwarts 
{

    private Wizard wizards[];           // "has a" relationship (composition)      
    private int index;                  // encapsulated (locked in the class)
    
    /**
     * Default constructor for the class, sets class properties
     */
    public Hogwarts() {
        wizards = new Wizard[1000000];  // builds the wizard array
    }
    
    /**
     * Enters the station nine and three quarters for the passed wizard
     * 
     * @param wizard the wizard to add to Hogwarts
     */
    public void enterStation9ThreeQuarters(Wizard wizard){
        wizards[index] = wizard;                // add to array
        index++;                                // increaase count
    }
    
    /**
     * Displays the data inside of Hogwarts and all of its wizards
     */
    public void triWizardTournament() {
        // enhanced for loop, can be read as: "for every wizard in wizards"
        for (Wizard wizard : wizards) {
        // for (int i = 0; i < wizards.length; i++ ) 
            // wizards[i] = .....
            if (wizard != null) {
                wizard.castSpell();
            }
        }
    }
        
}
