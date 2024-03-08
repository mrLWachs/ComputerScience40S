/** Required package class namespace */
package fun.searching;

import java.util.ArrayList;


/*
 * Searching - description
 * 
 * @author YOUR NAME
 * @since Feb 29, 2024
*/
public class Searching
{

    /**
     * Main method for the project
     * 
     * @param args the command line arguments
     */
    public Searching() {
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
        // Get the simple result of a seach 
        boolean result = search(array,item);

        // Display the result
        if (result) System.out.println("Found");
        else        System.out.println("Not found");

        // Get a more detailed result of a search
        int index = linearSearch(array,item);

        // Display the result
        System.out.println("Linear Search: " + item + " was at " + index);

        // Now with a list structure (ADT)
        ArrayList<String> list = new ArrayList<>();        
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        
        index = linearSearch(list,item);
        System.out.println("Linear Search: " + item + " was at " + index);
        
        index = binarySearch(array,item);
        System.out.println("Binary Search: " + item + " was at " + index);
        
        index = binarySearch(list,item);
        System.out.println("Binary Search: " + item + " was at " + index);
        
    }
    
    

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

    private static int linearSearch(String[] array, String item) {
        // Traverse (travel through, "visit" every spot, loop) the array
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(item)) {
                return i;
            }
        }
        // Go through the entire array, never found it
        return -1;
        
        // Alternative loop structure
//        int i = 0;
//        while (i < array.length) {
//            if (array[i].equals(item)) {
//                return i;
//            }
//            i++;
//        }
//        return -1;
    }

    private static int linearSearch(ArrayList<String> list, String item) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(item)) return i;
        }
        return -1;
    }

    private int binarySearch(String[] array, String item) {
        int low  = 0;                   // Marker for the low end
        int high = array.length - 1;    // Marker for the high end
        while(low <= high) {           // Continue while markers not collapsed
            int middle = (high + low) / 2;  // Calculate middle between markers
            if (array[middle].equals(item)) return middle; // Found it
            else if (array[middle].compareTo(item)  > 0) high = middle - 1;
            else if (array[middle].compareTo(item)  < 0) low  = middle + 1;
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

    private int binarySearch(ArrayList<String> list, String item) {
        return recursiveBinarySearch(list,item,0,list.size());
    }

    private int recursiveBinarySearch(ArrayList<String> list, String item, 
            int low, int high) {
        if (low <= high) {                      // while markers not collapsed
            int mid = low + (high - low) / 2;   // calculate middle point 
            if (list.get(mid) == null) return -1;
            if (list.get(mid).compareTo(item) >  0)
                return recursiveBinarySearch(list,item,low,mid-1);
            else if (list.get(mid).compareTo(item) <  0)
                return recursiveBinarySearch(list,item,mid+1,high);
            else 
                return mid;
        }
        return -1;                       // not found
    }
    
}