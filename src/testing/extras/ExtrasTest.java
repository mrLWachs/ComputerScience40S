/** Required package class namespace */
package testing.extras;

/** Required API imports */
import testing.extras.collections.CollectionsExtrasTest;
import testing.extras.graphics.GraphicsTest;
import testing.extras.pathfinding.PathfindingTest;
import testing.extras.searching.SearchingTest;
import testing.extras.sorting.SortingTest;
import testing.extras.storage.StorageTest;
import testing.extras.threading.ThreadingTest;
import testing.extras.trees.TreesTest;

 
/**
 * ExtrasTest.java - some bonus content done at the end of the Computer 
 * Science 40S course by student request
 *
 * @author Mr. Wachs
 * @since December 2024
 */
public class ExtrasTest 
{

    /**
     * Default constructor, set class properties
     */
    public ExtrasTest() {
        System.out.println("\nExtras content test starting...\n");
        // Code to quickly run the desired test.......
        new TreesTest();
        
        
        
        
        // Code to choose which etras test to run...
//        final String TITLE = "Computer Science 40S: Extra Units and Learning";
//        final String TEXT  = "Please choose an bonus project...";
//        final String[] CHOICES = {
//            "Practical Collections example",
//            "Graphics and User Interfaces examples",
//            "Permanent Storage examples",
//            "Binary Trees",
//            "Sorting Algorithms",
//            "Searching Algorithms",
//            "Threading examples",
//            "Path finding examples",
//            "All examples...",
//            "Quit"
//        };
//        Dialogs dialog = new Dialogs(TITLE);
//        String choice = dialog.choices(TEXT,CHOICES);
//        if      (choice.equals(CHOICES[0])) new CollectionsExtrasTest();
//        else if (choice.equals(CHOICES[1])) new GraphicsTest();
//        else if (choice.equals(CHOICES[2])) new StorageTest();
//        else if (choice.equals(CHOICES[3])) new TreesTest();
//        else if (choice.equals(CHOICES[4])) new SortingTest();
//        else if (choice.equals(CHOICES[5])) new SearchingTest();
//        else if (choice.equals(CHOICES[6])) new ThreadingTest();
//        else if (choice.equals(CHOICES[7])) new PathfindingTest(); 
//        else if (choice.equals(CHOICES[8])) {
//            new CollectionsExtrasTest();
//            new GraphicsTest();
//            new StorageTest();
//            new TreesTest();
//            new SortingTest();
//            new SearchingTest();
//            new ThreadingTest();
//            new PathfindingTest();
//        }
//        else System.exit(0); 
//        System.out.println("\nExtras content test completed!\n");
    }
    
}