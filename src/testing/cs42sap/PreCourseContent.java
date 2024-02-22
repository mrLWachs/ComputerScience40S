
/** Required package class namespace */
package testing.cs42sap;

import io.Simulator;
import testing.cs30s.ComputerScience30S;
import testing.cs40s.ComputerScience40S;

 
/**
 * PreCourseContent.java - description
 *
 * @author Mr. Wachs
 * @since Feb 12, 2024, 2:25:50 p.m.
 */
public class PreCourseContent 
{

    /**
     * Default constructor, set class properties
     * 
     * @param shouldRun determines if this test should run (true) or not (false)
     */
    public PreCourseContent(boolean shouldRun) {
        if (!shouldRun) return;
        Simulator.title("Computer Science 42SAP pre-course content"); 
        new ComputerScience30S(shouldRun);
        new ComputerScience40S(shouldRun);
    }
     
}
