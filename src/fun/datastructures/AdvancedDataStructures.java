
/** Required package class namespace */
package fun.datastructures;

/** Required API imports */ 
import testing.Tester;

/**
 * AdvancedDataStructures.java - these are a look at more advanced data 
 * structures that could be encountered in various post-secondary programs 
 * (like the U of M Computer Science courses in second year)
 *
 * @author Mr. Wachs
 * @since April 2024
 */
public class AdvancedDataStructures 
{
    
    /**
     * Default constructor, set class properties
     * 
     * @param state the run state of this code module
     */
    public AdvancedDataStructures(int state) {
        if (state == Tester.DO_NOT_RUN) {
            return;
        }        
        new StacksAndQueues(state);
        new BinaryTrees(state);
        new HashTablesDictionariesGraphsAndMore(state);
    }
     
}