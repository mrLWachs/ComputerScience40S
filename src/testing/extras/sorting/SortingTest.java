/** Required package class namespace */
package testing.extras.sorting;

/** Required API imports */
import collections.LinkedList;
import java.util.Arrays;
import testing.extras.utility.Numbers;
import testing.extras.utility.Text;

/**
 * SortingTest.java - a bonus example of sort algorithms. Further resources for
 * this topic can be found here: 
 *      - Lecture on topic: https://bit.ly/3DaZWty 
 *      - Older Example: https://bit.ly/3DaZWty 
 *      - Sample Assignment: https://bit.ly/3DaZWty 
 *      - Review sheet: https://bit.ly/3DaZWty
 *
 * @author Mr. Wachs
 * @since December 2024
 */
public class SortingTest {

    /**
     * Default constructor method
     */
    public SortingTest() {
        System.out.println("\nSorting Algorithms test starting...\n");

        // Some data to sort (e.g. array. LinkedList, etc.).....................
        int[] array1 = { 64, 27, 13, 89, 15, 99, 22, 48, 10, 98 };

        // Output before the sort, then after the sort of that array using
        // the imported (from java.util) the "Arrays" class to help format
        // the array into a nice string for outputs.............................
        System.out.println("Bubble Sort before: \t" + Arrays.toString(array1));
        
        // Now call the method to sort..........................................
        array1 = bubbleSort(array1);
        
        System.out.println("Bubble Sort after: \t" + Arrays.toString(array1));

        // Now we create a second array of values (same values shuffled).......
        int[] array2 = { 15, 98, 48, 22, 64, 10, 99, 13, 27, 89 };
                     
        // Now the same process with a different sorting algorithm: the 
        // selection sort algorithm.............................................
        System.out.println("Selection Sort before: \t" + Arrays.toString(array2));
        array2 = selectionSort(array2);
        System.out.println("Selection Sort after: \t" + Arrays.toString(array2));

        // Now to touch on some of the more complexities and different versions
        // of possibilities to use when sorting, I have provided some other 
        // classes as resources (also the links at the top of this class). Some
        // of these classes (Text and Numbers) are just collections of methods
        // to help make random numbers and words. These classes can be found in 
        // the "utility" package in this "extras" package. Also I have included
        // a "Sort" class in this package for you to explore and possibly use
        // as part of projects with more and more complex sorting algorithms
        
        Text    text    = new Text();         // For random words and characters
        Numbers numbers = new Numbers();      // For random numbers and booleans
        Sort    sorter  = new Sort();        // To implement the sort algorithms
        
        final int MAX = 10;                             // The size of the lists
        
        LinkedList<Boolean>   booleans   = numbers.randomList(MAX);
        LinkedList<Integer>   integers   = numbers.randomList(0, 9, MAX);
        LinkedList<Double>    doubles    = numbers.randomList(0.0, 9.9, 2, MAX);
        LinkedList<Character> characters = text.randomList('A', 'Z', MAX);        
        LinkedList<String>    strings    = text.randomList(MAX, 4);
        
        // Display the list before the sorts....................................
        System.out.println("\nVarious Lists before...\n");
        System.out.println("Boolean   list: " + booleans);
        System.out.println("Integer   list: " + integers);
        System.out.println("Double    list: " + doubles);
        System.out.println("Character list: " + characters);
        System.out.println("String    list: " + strings);
        
        // Call various sort algorithms.........................................
        sorter.quick(booleans);
        sorter.heap(integers);
        sorter.merge(doubles);
        sorter.shell(characters);
        sorter.insertion(strings);
        
        // Display the results..................................................
        System.out.println("\nVarious Lists after...\n");
        System.out.println("Boolean   Quick     sort: " + booleans);
        System.out.println("Integer   Heap      sort: " + integers);
        System.out.println("Double    Merge     sort: " + doubles);
        System.out.println("Character Shell     sort: " + characters);
        System.out.println("String    Insertion sort: " + strings);
                
        // Even custom classes can be sorted IF they implement the comparable 
        // interface and then have a compareTo() method written in the class
        // so that it can be called to determine if each obejct is "less than"
        // or "greater than" another object for sorting
        System.out.println("\nSorting Algorithms test complete!\n");
    }

    /**
     * A simple implementation of a sort algorithms (the bubble sort), it will 
     * sort the array into ascending order
     * 
     * @param array the array of items to sort 
     * @return a sorted array (from lowest to highest)
     */
    private int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {         // Traversing the array
            for (int j = 0; j < array.length - 1; j++) { // Traverse 1 less 
                if (array[j] > array[j+1]) {             // Checking items
                    int temp   = array[j];               // Temporary variable
                    array[j]   = array[j+1];             // Swapping items
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    /**
     * An implementation of a selection sort algorithm it will sort the array
     * into ascending order
     *
     * @param array the array of items to sort
     */
    private int[] selectionSort(int[] array) {
        // Create a new array, same size as the passed array
        int[] sorted = new int[array.length];
        // Make it a copy of that original
        System.arraycopy(array, 0, sorted, 0, array.length);
        // Sort that array using the selection sort algorithm...
        // Traverse the entire array
        for (int i = 0; i < sorted.length; i++) {
            // Track the lowest index, assume it's the first spot
            int lowest = i;
            // Nested inner for loop, starts at one over from current position
            // of the outer for loop used to find the lowest spot
            for (int j = i + 1; j < sorted.length; j++) {
                int item1 = sorted[j];
                int item2 = sorted[lowest];
                // check the spots
                if (item1 < item2) {
                    // fouond a new low
                    lowest = j;
                }
            }
            // Outside the inner loop, now that we have the lowest spot, swap
            // the content of the lowest spot with the current spot i
            if (lowest != i) {
                int temp = sorted[i];
                sorted[i] = sorted[lowest];
                sorted[lowest] = temp;
            }
        }
        return sorted;
    }

}
