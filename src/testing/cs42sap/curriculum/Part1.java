
/** Required package class namespace */
package testing.cs42sap.curriculum;

/** Required API imports */
import utility.io.Simulator;
import testing.cs42sap.curriculum.units.APUnit01PrimitiveTypes;
import testing.cs42sap.curriculum.units.APUnit03BooleanExpressionsAndIfStatements;
import testing.cs42sap.curriculum.units.APUnit04Iteration;

 
/**
 * Part1.java - Part 1 of the Advanced Placement (AP) curriculum content which
 * covers the following topics from the curriculum:
 *      (1) Primitive Types - AP Unit 1
 *      (2) Boolean Expressions and if Statements - AP Unit 3
 *      (3) Iteration - AP Unit 4
 * 
 * @author Mr. Wachs
 * @since June 2023
 */
public class Part1 
{

    /**
     * Default constructor, set class properties
     * 
     * @param shouldRun determines if this test should run (true) or not (false)
     */
    public Part1(boolean shouldRun) {
        if (!shouldRun) {
            Simulator.note("AP curriculum - Part 1 not running");
            return;
        }
        Simulator.title("AP curriculum - Part 1");
        new APUnit01PrimitiveTypes(shouldRun);
        new APUnit03BooleanExpressionsAndIfStatements(shouldRun);
        new APUnit04Iteration(shouldRun);
    }
        
}