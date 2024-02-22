
/** Required package class namespace */
package testing;

/** Required API imports */
import utility.io.Simulator;


/**
 * Tester.java - the unit testing class that drives the various unit tests
 *
 * @author Mr. Wachs 
 * @since June 2023
 */
public class Tester 
{

    /**
     * Default class constructor, runs on instantiation
     */
    public Tester() {
        Simulator.initialize();
        Simulator.title("Mr. Wachs' Computer Science Classes");
        new PrerequisiteContent(false);        
        new ComputerScience42SAP(true);        
        new PostSecondaryContent(false);
        Simulator.saveOutput();
    }
    
}