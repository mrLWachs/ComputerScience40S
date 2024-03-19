
/** Required package class namespace */
package testing;

/** Required API imports */
import fun.FunFridaysCode;
import utility.io.Simulator;
import testing.postsecondary.PermanentStorageTest;
import testing.postsecondary.SearchSortTest;
import testing.postsecondary.StacksQueuesTest;
import testing.postsecondary.TreesTest;

 
/**
 * BonusContentCS42SAP.java - some bonus Computer Science content used to 
 * enhance the curricular content (covered if time permits and may change to 
 * be tailored to student needs) and to better prepare students for specific 
 * post-secondary Computer Science programs. 
 *
 * @author Mr. Wachs
 * @since June 2023
 */
public class PostSecondaryContent 
{

    /**
     * Default constructor, set class properties
     * 
     * @param shouldRun determines if this test should run (true) or not (false)
     */
    public PostSecondaryContent(boolean shouldRun) {
        if (!shouldRun) {
            Simulator.note("Computer Science 42SAP Post Secondary content not running");
            return;
        }
        Simulator.title("Computer Science 42SAP Post Secondary Content:");
        new FunFridaysCode(shouldRun);
        new PermanentStorageTest(shouldRun);
        new StacksQueuesTest(shouldRun);
        new SearchSortTest(shouldRun);   
        new TreesTest(shouldRun);  
    }
     
}