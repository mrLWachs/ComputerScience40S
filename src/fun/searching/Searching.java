/** Required package class namespace */
package fun.searching;

/** Required API imports */
import java.util.ArrayList;
import testing.Tester;


/*
 * Searching - useful methods for searching through arrays and lists of
 * data for a specific item
 * 
 * @author Mr. Wachs
 * @since Feb 29, 2024
*/
public class Searching
{

    /**
     * Default constructor, set class properties
     * 
     * @param state the run state of this code module
     */
    public Searching(int state) {
        if (state == Tester.DO_NOT_RUN) {
            return;
        }
        // Array of item to search through
        String[] array = {
            "Adam",
            "Chylsy",
            "Colton",
            "Foxx",
            "James",
            "Lanze",
            "Manskrit",
            "Miles",
            "Samantha",
            "Scott",
            "Tyler",
            "Wachs"
        };
        // An item to search for
        String item = "Wachs";
        
        // Now with a list structure (ADT)
        ArrayList<String> list = new ArrayList<>();        
        for (String array1 : array) {
            list.add(array1);
        }
        System.out.println("List/Array is: " + list.toString());
        
        // Get the simple result of a seach 
        boolean result = search(array,item);

        // Display the result
        if (result) System.out.println("Found " + item);
        else        System.out.println("Not found " + item);

        // Get a more detailed result of a search
        int index = linearSearch(array,item);
        // Display the result
        System.out.println("Linear Search array: " + item + " was at " + index);

        index = linearSearch(list,item);
        System.out.println("Linear Search list: " + item + " was at " + index);
        
        index = binarySearch(array,item);
        System.out.println("Binary Search array: " + item + " was at " + index);
        
        index = binarySearch(list,item);
        System.out.println("Binary Search list: " + item + " was at " + index);
        
    }
    
    /**
     * A simple search, determines if the item is in the array or not
     * 
     * @param array an array to search through
     * @param item the item to search for
     * @return found (true) or not (false)
     */
    private static boolean search(String[] array, String item) {
        // Traverse (travel through, "visit" every spot, loop) the array
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(item)) {
                return true;
            }
        }
        // Go through the entire array, never found it
        return false;
    }

    /**
     * An implementation of a linear search (sequential search) algorithm. It
     * will find the first occurrence of an item in the array and return
     * the index where it found it, or a -1 if not found 
     * 
     * @param list the array to search through
     * @param item the item to search for in the list
     * @return the first index found at, or a -1 if not found
     */
    private static int linearSearch(String[] array, String item) {
        // Traverse (travel through, "visit" every spot, loop) the array
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(item)) {
                return i;
            }
        }
        // Go through the entire array, never found it
        return -1;
        
        // An alternative loop structure
        // int i = 0;
        // while (i < array.length) {
        //     if (array[i].equals(item)) {
        //         return i;
        //     }
        //     i++;
        // }
        // return -1;
    }

    /**
     * An implementation of a linear search (sequential search) algorithm. It
     * will find the first occurrence of an item in the LinkedList and return
     * the index where it found it, or a -1 if not found 
     * 
     * @param list the ArrayList to search through
     * @param item the item to search for in the list
     * @return the first index found at, or a -1 if not found
     */
    private static int linearSearch(ArrayList<String> list, String item) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(item)) return i;
        }
        return -1;
    }

    /**
     * An implementation of a binary search algorithm. It will find the first 
     * occurrence of an item in the array and return the index where it 
     * found it, or a -1 if not found
     * 
     * @param list the array to search through
     * @param item the item to search for in the list
     * @return the first index found at, or a -1 if not found 
     */
    private int binarySearch(String[] array, String item) {
        int low  = 0;                   // Marker for the low end
        int high = array.length - 1;    // Marker for the high end
        while(low <= high) {            // Continue while markers not collapsed
            int mid = (high + low) / 2; // Calculate middle between markers
            if      (array[mid].equals(item))        return mid; // Found it
            else if (array[mid].compareTo(item) > 0) high = mid - 1; // Too high 
            else if (array[mid].compareTo(item) < 0) low  = mid + 1; // Too low
        }
        return -1;  // Not found
    }

/// HERE IS AN EXAMPLE OF THE SAME ALGORITHM USING INTEGERS.....
//    private int binarySearch(int[] array, int item) {
//        int low  = 0;                   
//        int high = array.length - 1;    
//        while(low <= high) {          
//            int middle = (high + low) / 2;  
//            if (array[middle] == item){
//                return middle;
//            } 
//            else if (array[middle] > item) {
//                high = middle - 1;
//            }
//            else if (array[middle] < item) {
//                low  = middle + 1;
//            }
//        }
//        return -1;  
//    }

    
    /**
     * Another implementation of a binary search algorithm. This implementation
     * uses a wrapper method around a private utility recursive method. It will
     * find the first occurrence of an item in the ArrayList and return the 
     * index where it found it, or a -1 if not found
     * 
     * @param list the ArrayList to search through
     * @param item the item to search for in the list
     * @return the first index found at, or a -1 if not found 
     */
    private int binarySearch(ArrayList<String> list, String item) {
        return binaryRecursive(list,item,0,list.size());
    }

    /**
     * Recursive method used to find the item in the list and return the index 
     * of it's location or a -1 if not found
     * 
     * @param list the ArrayList to search through
     * @param item the item to search for in the list
     * @param low the lowest index to start from
     * @param high the highest index to go to
     * @return the first index found at, or a -1 if not found 
     */
    private int binaryRecursive(ArrayList<String> list, String item, 
                                      int low, int high) {
        if (low <= high) {                      // While markers not collapsed
            int mid = low + (high - low) / 2;   // Calculate middle point 
            if      (list.get(mid) == null)             return -1;
            else if (list.get(mid).compareTo(item) > 0) return binaryRecursive(list,item,low,mid-1);
            else if (list.get(mid).compareTo(item) < 0) return binaryRecursive(list,item,mid+1,high);
            else                                        return mid;
        }
        return -1;                              // Not found
    }
    
}