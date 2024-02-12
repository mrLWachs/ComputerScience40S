
/** Required package class namespace */
package testing;

/** Required API imports */
import io.Simulator;
import testing.cs42sap.ComputerScience42SAP;


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
        Simulator.header("Mr. Wachs Computer Science testing started...");
//        new PreCourseContent();        
        new ComputerScience42SAP();        
//        new PostCourseContent();
        Simulator.saveOutput();
        Simulator.header("Mr. Wachs Computer Science testing complete!");
    }
    
}