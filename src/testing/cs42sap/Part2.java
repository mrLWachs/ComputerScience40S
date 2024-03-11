
/** Required package class namespace */
package testing.cs42sap;

/** Required API imports */
import utility.io.Simulator;
import testing.cs42sap.units.APUnit02UsingObjects;
import testing.cs42sap.units.APUnit05WritingClasses;
import testing.cs42sap.units.APUnit09Inheritance;

 
/**
 * Part2.java - Part 2 of the Advanced Placement (AP) curriculum content which
 * covers the following topics from the curriculum:
 *      (1) Using Objects - AP Unit 2
 *      (2) Writing Classes - AP Unit 5
 *      (3) Inheritance - AP Unit 9
 * 
 * @author Mr. Wachs
 * @since June 2023
 */
public class Part2 
{

    /**
     * Default constructor, set class properties
     * 
     * @param shouldRun determines if this test should run (true) or not (false)
     */
    public Part2(boolean shouldRun) {
        if (!shouldRun) {
            Simulator.note("AP curriculum - Part 2 not running");
            return;
        }
        Simulator.title("AP curriculum - Part 2");
        new APUnit02UsingObjects(shouldRun);
        new APUnit05WritingClasses(shouldRun);
        new APUnit09Inheritance(shouldRun);        
    }
        
}