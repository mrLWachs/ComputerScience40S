
/** Required package class namespace */
package testing;

/** Required API imports */
import io.Simulator;
import testing.cs42sap.ComputerScience42SAP;
import testing.cs42sap.PostCourseContent;
import testing.cs42sap.PreCourseContent;


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
        Simulator.title("Mr. Wachs Computer Science");
        new PreCourseContent(false);        
//        new ComputerScience42SAP();        
        new PostCourseContent(true);
        Simulator.saveOutput();
    }
    
}