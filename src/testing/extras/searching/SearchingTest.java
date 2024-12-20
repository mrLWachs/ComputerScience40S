/** Required package class namespace */
package testing.extras.searching;

/** Required API imports */
import collections.LinkedList;
import testing.extras.sorting.Sort;
import testing.extras.utility.Numbers;
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
        
        // Use a class to help with formatting arrays for outputs...............
        Text text = new Text();
        
        // Some data to sort (e.g. array. LinkedList, etc.).....................
        Integer[] array = { 64, 27, 99, 89, 15, 99, 22, 48, 10, 98 };
        Integer number = 99;
        Integer index = linearSearch(array,number);
        System.out.println("In the array " + text.toString(array) +
                " searching for " + number + " it is at index: " + index);
        
        // Test some "built-in" searching in our LinkedList class...............
        LinkedList<Integer> list = new LinkedList<>(array);
        index = list.lastIndexOf(number);
        System.out.println("In the list " + list.toString() +
                " searching for " + number + " it is at index: " + index);
        
        // And the binary search................................................        
        // But the array must be sorted first, so we use the Sort class covered 
        // in the last extras example to sort the array
        Sort sort = new Sort();               // So we can use the binary search
        sort.quick(array);
        
        // Now the basic binary search algorithm................................
        index = binarySearch(array,number);
        System.out.println("In the array " + text.toString(array) +
                " binary searching for " + number + " it is at index: " + index);
        
        // Now to touch on some of the more complexities and different versions
        // of possibilities to use when searching, once again we will use some 
        // classes as resources (also the links at the top of this class). Some
        // of these classes (Text and Numbers) are just collections of methods
        // to help make random numbers and words. These classes can be found in 
        // the "utility" package in this "extras" package. Also I have included
        // a "Search" class in this package for you to explore and possibly use
        // as part of projects with more and more complex algorithms
        
        Numbers numbers  = new Numbers();     // For random numbers and booleans
        Search  searcher = new Search();   // To implement the search algorithms
        
        final int MAX = 10;                             // The size of the lists
        
        LinkedList<Boolean>   booleans   = numbers.randomList(MAX);
        LinkedList<Integer>   integers   = numbers.randomList(0, 9, MAX);
        LinkedList<Double>    doubles    = numbers.randomList(0.0, 9.9, 2, MAX);
        LinkedList<Character> characters = text.randomList('A', 'Z', MAX);        
        LinkedList<String>    strings    = text.randomList(MAX, 4);
        
        // Display the lists....................................................
        System.out.println("\nVarious Lists...\n");
        System.out.println("Boolean   list: " + booleans);
        System.out.println("Integer   list: " + integers);
        System.out.println("Double    list: " + doubles);
        System.out.println("Character list: " + characters);
        System.out.println("String    list: " + strings);
        
        // Call various search algorithms.......................................
        Boolean   item1 = true;
        Integer   item2 = 0;
        Double    item3 = 0.0;
        Character item4 = 'A';
        String    item5 = text.randomWord(4);
                
        int result1 = searcher.linear(item1, booleans);
        int result2 = searcher.linear(item2, integers);
        int result3 = searcher.linear(item3, doubles);
        int result4 = searcher.linear(item4, characters);
        int result5 = searcher.linear(item5, strings);
        
        // Display the results..................................................
        System.out.println("Item " + item1 + ": " + result1 + ": " + booleans);
        System.out.println("Item " + item2 + ": " + result2 + ": " + integers);
        System.out.println("Item " + item3 + ": " + result3 + ": " + doubles);
        System.out.println("Item " + item4 + ": " + result4 + ": " + characters);
        System.out.println("Item " + item5 + ": " + result5 + ": " + strings);
        
        // Now sort the lists for the binary search.............................
        sort.quick(booleans);
        sort.quick(integers);
        sort.quick(doubles);
        sort.quick(characters);
        sort.quick(strings);
        result1 = searcher.binary(item1, booleans);
        result2 = searcher.binary(item2, integers);
        result3 = searcher.binary(item3, doubles);
        result4 = searcher.binary(item4, characters);
        result5 = searcher.binary(item5, strings);
        System.out.println("Item " + item1 + ": " + result1 + ": " + booleans);
        System.out.println("Item " + item2 + ": " + result2 + ": " + integers);
        System.out.println("Item " + item3 + ": " + result3 + ": " + doubles);
        System.out.println("Item " + item4 + ": " + result4 + ": " + characters);
        System.out.println("Item " + item5 + ": " + result5 + ": " + strings);        
                
        // Even custom classes can be sorted IF they implement the comparable 
        // interface and then have a compareTo() method written in the class
        // so that it can be called to determine if each obejct is "less than"
        // or "greater than" or "equal to" another object for searching
        System.out.println("\nSearching Algorithms test complete!\n");
    }

    
    /**
     * An implementation of a linear search (sequential search) algorithm. It
     * will find the first occurance of an item in the array and return the 
     * index where it found it, or a -1 if not found
     * 
     * @param array an array of integers to search through
     * @param item the integer to search for in the list
     * @return the first index found at, or a -1 if not found
     */
    public int linearSearch(Integer[] array, Integer item) {
        for (int i = 0; i < array.length; i++) {         // Traverse entire list
            if (array[i] == item) {                     // Found first occurance
                return i;                                // Stop loop and return
            }
        }        
        return -1;                                                  // Not found     
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