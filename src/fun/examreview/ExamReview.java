/** Required package class namespace */
package fun.examreview;

/** Required API imports */ 
import testing.Tester;
import utility.io.Simulator;


/**
 * AdvancedDataStructures.java - these are a look at more advanced data 
 * structures that could be encountered in various post-secondary programs 
 * (like the U of M Computer Science courses in second year)
 *
 * @author Mr. Wachs
 * @since April 2024
 */
public class ExamReview 
{
    
    /**
     * Default constructor, set class properties
     * 
     * @param state the run state of this code module
     */
    public ExamReview(int state) {
        if (state == Tester.DO_NOT_RUN) {
            return;
        }        
        Simulator.comment("Student requested exam review topics");
        new ArrayLists(state);
    }
     
}