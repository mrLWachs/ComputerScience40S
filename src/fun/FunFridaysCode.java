/** Required package class namespace */
package fun;

import fun.files.Files;
import fun.searching.Searching;
import fun.sorting.Sorting;
import fun.virus.Virus;


/**
 * FunFridaysCode - this is some of the "extra" learning we have done in our
 * course for both "Fun Fridays" and "new content Thursdays"
 * 
 * @author Mr. Wachs
 * @since Mar 4, 2024
*/
public class FunFridaysCode
{

    public static final int NOT_RUN       = 0;
    public static final int RUN_SIMULATED = 1;
    public static final int RUN_NORMAL    = 2;
    
    
    /**
     * Default constructor, set class properties
     * 
     * @param shouldRun determines if this test should run (true) or not (false)
     */
    public FunFridaysCode(boolean shouldRun) {
        if (!shouldRun) {
            return;
        }
        new Files(shouldRun);
        new Virus(RUN_SIMULATED);
        new Searching(shouldRun);
        new Sorting(shouldRun);
    }

}