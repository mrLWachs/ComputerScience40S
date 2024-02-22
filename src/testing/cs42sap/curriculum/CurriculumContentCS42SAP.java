
/** Required package class namespace */
package testing.cs42sap.curriculum;

/** Required API imports */
import io.Simulator;

 
/**
 * CurriculumContentCS42SAP.java - the curriculum content from the advanced
 * placement (AP) Computer Science curriculum.
 *
 * @author Mr. Wachs
 * @since June 2023
 */
public class CurriculumContentCS42SAP 
{

    /**
     * Default constructor, set class properties
     * 
     * @param shouldRun determines if this test should run (true) or not (false)
     */
    public CurriculumContentCS42SAP(boolean shouldRun) {
        if (!shouldRun) return;
        Simulator.title("Computer Science 42SAP curriculum content");         
        new Part1(shouldRun);
        new Part2(shouldRun);
        new Part3(!shouldRun);
        new Part4(!shouldRun);
    }
    
}