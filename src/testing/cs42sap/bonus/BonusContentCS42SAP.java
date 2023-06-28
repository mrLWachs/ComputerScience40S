
/** Required package class namespace */
package testing.cs42sap.bonus;

/** Required API imports */
import io.Simulator;

 
/**
 * BonusContentCS42SAP.java - some bonus Computer Science content used to 
 * enhance the curricular content (covered if time permits and may change to 
 * be tailored to student needs) and to better prepare students for specific 
 * post-secondary Computer Science programs. 
 *
 * @author Mr. Wachs
 * @since June 2023
 */
public class BonusContentCS42SAP 
{

    /**
     * Default constructor, set class properties
     */
    public BonusContentCS42SAP() {
        Simulator.header("Computer Science 42SAP bonus content starting...");         
        new PermanentStorageTest();
        new StacksQueuesTest();
        new SearchSortTest();   
        new TreesTest();        
        Simulator.header("Computer Science 42SAP bonus content complete!");
    }
     
}