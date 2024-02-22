
/** Required package class namespace */
package testing;

import utility.io.Simulator;
import testing.prerequisite.cs30s.ComputerScience30S;
import testing.prerequisite.cs40s.ComputerScience40S;

 
/**
 * PreCourseContent.java - description
 *
 * @author Mr. Wachs
 * @since Feb 12, 2024, 2:25:50 p.m.
 */
public class PrerequisiteContent 
{

    /**
     * Default constructor, set class properties
     * 
     * @param shouldRun determines if this test should run (true) or not (false)
     */
    public PrerequisiteContent(boolean shouldRun) {
        if (!shouldRun) {
            Simulator.note("Computer Science 42SAP Prerequisite content not running");
            return;
        }
        Simulator.title("Computer Science 42SAP Prerequisite Content:"); 
        new ComputerScience30S(shouldRun);
        new ComputerScience40S(shouldRun);
    }
     
}
