
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
     * Default constructor for the class, sets class properties
     * 
     * @param shouldRun determines if this test should run (true) or not (false)
     */
    public Tester(boolean shouldRun) {
        if (!shouldRun) {
            return;
        }
        Simulator.initialize();
        Simulator.title("Mr. Wachs' Computer Science Classes");
        new PrerequisiteContent(!shouldRun);        
        new ComputerScience42SAP(!shouldRun);        
        new PostSecondaryContent(shouldRun);
        Simulator.saveOutput();
    }
    
}