/** Required package class namespace */
package testing.extras.collections;

/** Required API imports */
import java.util.*;

/**
 * CollectionsExtrasTest.java - a bonus example of the collection unit code 
 * used in a more practical way. It also show the imported LinkedList (and 
 * other ADTs from the java.util collections framework). Further resources for 
 * this topic can be found here:
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
        final int SIZE = 100;               // Constant for the size of the ADTs
        
        // Create an array data structure.......................................
        Integer[] array = new Integer[SIZE];    // Like int[] a = new int[SIZE];
        Random random = new Random();                // For making random values
        for (int i = 0; i < array.length; i++) {               // Traverse array
            array[i] = random.nextInt(SIZE);          // Fill with random values
        }
        System.out.println("Array:\t" + Arrays.toString(array));      // Display
        // The use of the "Arrays" class and one of its methods (toString) for 
        // working with arrays
        
        // Create an imported LinkedList data structure.........................
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (Integer integer : array) {                         // Traverse list
            linkedList.add(integer);                              // Add to list
        }
        System.out.println("LinkedList:\t\t" + linkedList);           // Display
        
        // Create an imported ArrayList data structure..........................
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Integer integer : array) {
            arrayList.add(integer);
        }
        System.out.println("ArrayList:\t\t" + arrayList);
        /////////////////////////////////////////////////////////////////
        Stack<Integer> stack = new Stack<>();
        for (Integer integer : array) {
            stack.push(integer);
        }
        System.out.println("Stack:\t\t\t" + stack);
        /////////////////////////////////////////////////////////////////
        Vector<Integer> vector = new Vector<>();
        for (Integer integer : array) {
            vector.add(integer);
        }
        System.out.println("Vector:\t\t\t" + vector);
        /////////////////////////////////////////////////////////////////        
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (Integer integer : array) {
            priorityQueue.add(integer);
        }
        System.out.println("PriorityQueue:\t\t" + priorityQueue);
        /////////////////////////////////////////////////////////////////
        System.out.println("\nNow some ADT methods...\n");
        /////////////////////////////////////////////////////////////////
        Arrays.sort(array);
        System.out.println("Sort Array:\t\t" + Arrays.toString(array));
        /////////////////////////////////////////////////////////////////
        //linkedList = linkedList.reversed();
        //System.out.println("Reversed LinkedList:\t" + linkedList);
        /////////////////////////////////////////////////////////////////
        int value = array[SIZE/2];
        arrayList.remove(value);
        System.out.println("ArrayList Remove " + value + ":\t" + arrayList);
        /////////////////////////////////////////////////////////////////
        Integer i = stack.pop();
        System.out.println("Stack pop " + i + ":\t\t" + stack);
        /////////////////////////////////////////////////////////////////
        vector.removeElementAt(2);
        System.out.println("Vector remove 2:\t" + vector);
        /////////////////////////////////////////////////////////////////
        Integer[] a = (Integer[])vector.toArray(array);
        System.out.println("Vector to array:\t" + vector);
        System.out.println("Array:\t\t\t" + Arrays.toString(a));
        /////////////////////////////////////////////////////////////////
        UserInterface ui = new UserInterface();
    }

}
