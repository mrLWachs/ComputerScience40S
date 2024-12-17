/** Required package class namespace */
package testing.extras.collections;

/** Required API imports */
import java.util.*;

/**
 * CollectionsExtrasTest.java - a bonus example of the collection unit code 
 * used in a more practical way. It also show the imported LinkedList (and 
 * other ADTs from the java.util collections framework). Further resources for 
 * this topic can be found here:
 *     - Formal documentation on collections framework: https://bit.ly/3ZNDsI4
 *     - Start at slide 59 of this presentation: https://bit.ly/4gxrA2t
 *     - Some other example of using this: https://bit.ly/3BdGegh
 *
 * @author Mr. Wachs
 * @since December 2024
 */
public class CollectionsExtrasTest
{

    /**
     * Default constructor method
     */
    public CollectionsExtrasTest() {
        System.out.println("\nCollections Extras test starting...\n");
        final int SIZE = 10;                // Constant for the size of the ADTs
        
        // Create an array data structure.......................................
        Integer[] array = new Integer[SIZE];    // Like int[] a = new int[SIZE];
        Random random = new Random();                // For making random values
        for (int i = 0; i < array.length; i++) {               // Traverse array
            array[i] = random.nextInt(SIZE);          // Fill with random values
        }
        System.out.println("Array: " + Arrays.toString(array));       // Display
        // The use of the "Arrays" class and one of its methods (toString) for 
        // working with arrays
        
        // Create an imported LinkedList data structure.........................
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (Integer integer : array) {                         // Traverse list
            linkedList.add(integer);                              // Add to list
        }
        System.out.println("LinkedList: " + linkedList);              // Display
        
        // Create an imported ArrayList data structure..........................
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Integer integer : array) {                         // Traverse list
            arrayList.add(integer);                               // Add to list
        }
        System.out.println("ArrayList: " + arrayList);                // Display
        
        // Create an imported Stack data structure..............................
        Stack<Integer> stack = new Stack<>();
        for (Integer integer : array) {                        // Traverse stack
            stack.push(integer);                              // Push onto stack
        }
        System.out.println("Stack: " + stack);                        // Display
        
        // Create an imported Vector data structure.............................
        Vector<Integer> vector = new Vector<>();
        for (Integer integer : array) {                       // Traverse vector
            vector.add(integer);                                // Add to vector
        }
        System.out.println("Vector: " + vector);                      // Display
        // Note: the "Vector" ADT is considered "obsolete" and is mostly now 
        // replaced with the ArrayList ADT and Vector is considered a "legacy"
        // data structure
        
        // Create an imported PriorityQueue data structure......................        
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (Integer integer : array) {                        // Traverse Queue
            priorityQueue.add(integer);                          // Add to Queue
        }
        System.out.println("PriorityQueue: " + priorityQueue);        // Display
        
        // Now a variety of methods from these ADTs ............................
        System.out.println("\nNow some ADT methods...\n");
        Arrays.sort(array);
        System.out.println("Sort Array: " + Arrays.toString(array));
        linkedList = linkedList.reversed();
        System.out.println("Reversed LinkedList: " + linkedList);
        int value = array[SIZE/2];
        arrayList.remove(value);
        System.out.println("ArrayList Remove " + value + ": " + arrayList);
        Integer i = stack.pop();
        System.out.println("Stack pop " + i + ": " + stack);
        vector.removeElementAt(2);
        System.out.println("Vector remove 2: " + vector);
        Integer[] a = (Integer[])vector.toArray(array);
        System.out.println("Vector to array: " + vector);
        System.out.println("Array: " + Arrays.toString(a));
        
        // Now a more practical use of the LinkedList class we created in a 
        // user interface example...
        new CollectionsUserInterface();
        
        System.out.println("\nCollections Extras test complete!\n");
    }

}
