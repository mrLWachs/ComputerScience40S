
/** required package class namespace */
package testing.advancedclasses;



/**
 * Hogwarts.java - 
 *
 * @author Mr. Wachs 
 * @since 1-Apr-2019 
 */
public class Hogwarts 
{

    private Wizard wizards[];
    private int index;
    
    // encapsulated (locked in the class)
    
    public Hogwarts() {
        wizards = new Wizard[1000000];
    }
    
    public void enterStation9ThreeQuarters(Wizard wizard){
        wizards[index] = wizard;
        index++;
    }
    
    public void triWizardTournament() {
        // enhanced for loop
        // can be read as:
        // "for every wizard in wizards"
        for (Wizard wizard : wizards) {
        // for (int i = 0; i < wizards.length; i++ ) 
            // wizards[i] = .....
            if (wizard != null) {
                wizard.castSpell();
            }
        }
    }
        
}
