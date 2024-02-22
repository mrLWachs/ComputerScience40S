
/** Required package class namespace */
package testing.cs42sap;

/** Required API imports */
import utility.io.Simulator;
import testing.cs42sap.units.APUnit06Arrays;
import testing.cs42sap.units.APUnit082DArrays;

 
/**
 * Part3.java - Part 3 of the Advanced Placement (AP) curriculum content which
 * covers the following topics from the curriculum:
 *      (1) Arrays - AP Unit 6
 *      (2) 2D Arrays - AP Unit 8
 *
 * @author Mr. Wachs
 * @since June 2023
 */
public class Part3 
{

    /**
     * Default constructor, set class properties
     * 
     * @param shouldRun determines if this test should run (true) or not (false)
     */
    public Part3(boolean shouldRun) {
        if (!shouldRun) {
            Simulator.note("AP curriculum - Part 3 not running");
            return;
        };
        Simulator.title("AP curriculum - Part 3");
        new APUnit06Arrays(shouldRun);
        new APUnit082DArrays(shouldRun);        
    }
        
}