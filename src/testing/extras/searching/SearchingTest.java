/** Required package class namespace */
package testing.extras.searching;

import collections.LinkedList;
import testing.extras.sorting.Sort;
import testing.extras.utility.Text;

 
/**
 * SearchingTest.java - a bonus example of search algorithms. Further resources 
 * for this topic can be found here:
 *      - Lecture on topic: https://bit.ly/3DaZWty
 *      - Older Example: https://bit.ly/3DaZWty
 *      - Sample Assignment: https://bit.ly/3DaZWty
 *      - Review sheet: https://bit.ly/3DaZWty 
 * 
 * @author Mr. Wachs
 * @since December 2024
 */
public class SearchingTest 
{

    /**
     * Default constructor method
     */
    public SearchingTest() {
        System.out.println("\nSearching Algorithms test starting...\n");
        
        
        Text text = new Text();
        
        // Some data to sort (e.g. array. LinkedList, etc.).....................
        Integer[] array = { 64, 27, 99, 89, 15, 99, 22, 48, 10, 98 };
        Integer number = 99;
        Integer index = search(array,number);
        System.out.println("In the array " + text.toString(array) +
                " searching for " + number + " it is at index: " + index);
        
        // Test some "built-in" searching in our LinkedList class...
        LinkedList<Integer> list = new LinkedList<>(array);
        index = list.lastIndexOf(number);
        System.out.println("In the list " + list.toString() +
                " searching for " + number + " it is at index: " + index);
        
        // And the binary search.......
        
        // But the array must be sorted first....
        Sort sort = new Sort();
        sort.quick(array);
        
        index = binarySearch(array,number);
        System.out.println("In the array " + text.toString(array) +
                " binary searching for " + number + " it is at index: " + index);
        
        System.out.println("\nSearching Algorithms test complete!\n");
    }

    
    /**
     * Linear or sequential search algorithm
     * 
     * @param array
     * @param item
     * @return 
     */
    public int search(Integer[] array, Integer item) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == item) {
                return i;
            }
        }        
        return -1;
    }
    
    /**
     * An implementation of a binary search algorithm. It will find an 
     * occurance of an item in the array and return the index where it found 
     * it, or a -1 if not found
     * 
     * @param array an array to search through
     * @param item the item to search for
     * @return the first index found at, or a -1 if not found
     */
    private int binarySearch(Integer[] array, Integer item) {
        // Track the low and high indices of the array with "markers"
        int low  = 0;
        int high = array.length - 1;
        // Loop while the markers are not "collapsed" on themselves
        while (low <= high) {
            // Find (calculate) the middle between low and high
            int mid = (high + low) / 2;
            // Check if we found it
            if (array[mid] == item) return mid;
            // Check if the spot I'm at is bigger (greater) than item
            else if (array[mid] > item) high = mid - 1;
            // Check if the spot I'm at is smaller (less) than item
            else if (array[mid] < item) low  = mid + 1;
        }
        return -1;  // Not found!
    }
    
    
}