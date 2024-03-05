/** Required package class namespace */
package testing.cs42sap.tests;

/** Required API imports */
import utility.io.Simulator;


/*
 * PracticeTestsCS42SAP - description
 * 
 * @author YOUR NAME
 * @since Feb 28, 2024
*/
public class PracticeTestsCS42SAP
{

    /**
     * Default constructor, set class properties
     * 
     * @param shouldRun determines if this test should run (true) or not (false)
     */
    public PracticeTestsCS42SAP(boolean shouldRun) {
        if (!shouldRun) {
            Simulator.note("Computer Science 42SAP practice tests not running");
            return;
        }
        Simulator.title("Computer Science 42SAP practice tests");         
        new PracticeTest1(shouldRun);   
        new PracticeTest2(!shouldRun);   
        new PracticeTest3(!shouldRun); 
    }

}