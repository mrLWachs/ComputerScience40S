
/** Required package class namespace */
package testing.cs42sap;

/** Required API imports */
import io.Simulator;
import testing.cs42sap.curriculum.CurriculumContentCS42SAP;


/**
 * ComputerScience42SAP.java - the large in class example we continue to work 
 * on in each unit adding example code on the new concepts of each unit 
 * along with any in class requests for code examples that might come up 
 * over the course
 *
 * @author Mr. Wachs 
 * @since June 2023
 */
public class ComputerScience42SAP 
{

    /**
     * Default constructor for the class, sets class properties
     * 
     * @param shouldRun determines if this test should run (true) or not (false)
     */
    public ComputerScience42SAP(boolean shouldRun) {
        if (!shouldRun) return;
        Simulator.title("Computer Science 42SAP starting...");         
        new CurriculumContentCS42SAP(shouldRun);
    }
    
}