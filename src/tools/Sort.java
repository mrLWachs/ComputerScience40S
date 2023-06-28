
/** Required package class namespace */
package tools;

/** Required API imports */
import collections.LinkedList;


/**
 * Sort.java - useful methods for sorting arrays and LinkedLists of generic
 * data into ascending order
 * 
 * @author Mr. Wachs
 * @param <T> the generic object used in this class
 * @since June 2023
 */
public class Sort <T extends Comparable<T>> 
{
       
    /**
     * A simple implementation of a bubble sort algorithm it will sort the 
     * array into ascending order
     * 
     * @param array the array of generic items to sort
     */
    public void bubble(T[] array) {
        if (array == null) return;                          // error check
        for (int i = 0; i < array.length; i++) {            // traverse array
            for (int j = 0; j < array.length - 1; j++) {    // traverse again
                T item1 = array[j];
                T item2 = array[j+1];
                if (item1.compareTo(item2) > 0) {           // out of order
                    array[j]   = item2;                     // swap positions
                    array[j+1] = item1;
                }
            }
        }
    }    
    
    /**
     * An efficient implementation of a bubble sort algorithm it will sort the 
     * list into ascending order
     * 
     * @param list the LinkedList to sort
     */
    public void bubble(LinkedList<T> list) {
        if (list == null) return;                   // error check
        boolean sorted = true;                      // flag to stop or not
        for (int i = list.size()-1; i >= 0; i--) {  // traverse list
            sorted = true;                          // assume sorted
            for (int j = 0; j < i; j++) {           // traverse again
                T item1 = list.get(j);  
                T item2 = list.get(j+1);
                if (item1.compareTo(item2) > 0) {   // out of order
                    sorted = false;                 // flag no sorted
                    list.set(j, item2);             // swap positions
                    list.set(j+1, item1);
                } 
            }
            if (sorted) return;                     // return early
        }
    }
    
    /**
     * An implementation of a selection sort algorithm it will sort the array
     * into ascending order
     * 
     * @param array the array of generic items to sort
     */
    public void selection(T[] array) {
        if (array == null) return;                          // error check
        for (int i = 0; i < array.length-1; i++) {          // traverse array
            int lowest = i;                                 // take low index
            for (int j = i+1; j < array.length; j++) {      // traverse again
                if (array[j].compareTo(array[lowest]) < 0) { // swap with low
                    lowest = j;
                }
            }
            if (lowest != i) {                              // perform swap
                T temp        = array[i];
                array[i]      = array[lowest];
                array[lowest] = temp;
            }
        }
    }
    
    /**
     * An implementation of a selection sort algorithm it will sort the list
     * into ascending order
     * 
     * @param list the LinkedList to sort
     */
    public void selection(LinkedList<T> list) {
        if (list == null) return;                       // error check
        for (int i = 0; i < list.size()-1; i++) {       // traverse array
            int lowest = i;                             // take low index
            for (int j = i+1; j < list.size(); j++) {   // traverse again
                T item1 = list.get(j);
                T item2 = list.get(lowest);
                if (item1.compareTo(item2) < 0) {       // swap with low
                    lowest = j;
                }
            }
            if (lowest != i) {                          // perform swap
                T temp1 = list.get(i);
                T temp2 = list.get(lowest);
                list.set(i, temp2);
                list.set(lowest, temp1);
            }
        }
    }
    
    /**
     * An implementation of a insertion sort algorithm it will sort the array
     * into ascending order
     * 
     * @param array the array of generic items to sort
     */
    public void insertion(T[] array) {
        if (array == null) return;                          // error check
        for (int i = 1; i < array.length; i++) {
            int j = i;
            T temp = array[i];
            while ((j > 0) && 
                   (array[j-1].compareTo(temp) > 0)) {
                array[j] = array[j-1];
                j--;
            }
            array[j] = temp;
        }        
    }
    
    /**
     * An implementation of a insertion sort algorithm it will sort the list
     * into ascending order
     * 
     * @param list the LinkedList to sort
     */
    public void insertion(LinkedList<T> list) {
        if (list == null) return;                       // error check
        for (int i = 1; i < list.size(); i++) {
            int j = i;
            T temp = list.get(i);
            while ((j > 0) &&
                   (list.get(j-1).compareTo(temp) > 0)) {
                list.set(j, list.get(j-1));                
                j--;
            }
            list.set(j, temp); 
        }      
    }
        
    /**
     * An implementation of a shell sort algorithm it will sort the array into
     * ascending order
     * 
     * @param array the array of generic items to sort
     */
    public void shell(T[] array) {
        if (array == null) return;                          // error check
        int j = 0;
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                T temp = array[i];
                for (j = i; 
                     (j >= gap) && (temp.compareTo(array[j-gap]) < 0); 
                     j -= gap) {
                    array[j] = array[j-gap];
                }
                array[j] = temp;
            }
        }        
    }
    
    /**
     * An implementation of a shell sort algorithm it will sort the list into
     * ascending order
     * 
     * @param list the LinkedList to sort
     */
    public void shell(LinkedList<T> list) {
        if (list == null) return;                       // error check
        int j = 0;
        for (int gap = list.size() / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < list.size(); i++) {
                T temp = list.get(i);
                for (j = i; 
                     (j >= gap) && (temp.compareTo(list.get(j-gap)) < 0); 
                     j -= gap) {
                    list.set(j, list.get(j-gap));
                }
                list.set(j,temp);
            }
        }        
    }
    
    /**
     * An implementation of a quick sort algorithm it will sort the array into 
     * ascending order
     * 
     * @param array the array of generic items to sort 
     */    
    public void quick(T[] array) {
        if (array == null) return;                          // error check
        recursiveQuick(array,0,array.length-1);
    }

    /**
     * An implementation of a quick sort algorithm it will sort the list into
     * ascending order
     * 
     * @param list the LinkedList to sort
     */    
    public void quick(LinkedList<T> list) {
        if (list == null) return;                       // error check
        recursiveQuick(list,0,list.size()-1);
    }
    
    /**
     * Recursive implementation of a quick sort algorithm 
     * 
     * @param array the array of generic items to sort
     * @param front the marker for the front partition
     * @param back the marker for the back partition 
     */
    private void recursiveQuick(T[] array, int front, int back) {
        if (back <= front) return;
        else {
            int pivot = partition(array,front,back);
            recursiveQuick(array,front,pivot-1);
            recursiveQuick(array,pivot+1,back);
        }
    }
    
    /**
     * Recursive implementation of a quick sort algorithm 
     * 
     * @param list the LinkedList to sort
     * @param front the marker for the front partition
     * @param back the marker for the back partition 
     */
    private void recursiveQuick(LinkedList<T> list, int front, int back) {
        if (back <= front) return;
        else {
            int pivot = partition(list,front,back);
            recursiveQuick(list,front,pivot-1);
            recursiveQuick(list,pivot+1,back);
        }
    }

    /**
     * Partitions the array into S1 and S2 and separates
     * 
     * @param array the array of generic items to partition
     * @param front the marker for the front partition
     * @param back the marker for the back partition 
     * @return the position of the partition in the array
     */
    private int partition(T[] array, int front, int back) {
        T pivot = array[front];
        while (back > front) {
            while (back > front && array[back].compareTo(pivot) > 0)
                back--;
            if (back == front) break;
            array[front] = array[back];
            front++;
            while (back > front && array[front].compareTo(pivot) < 0)
                front++;
            if (back == front) break;
            array[back] = array[front];
            back--;
        }
        array[front] = pivot; 
        return front;
    }    
    
    /**
     * Partitions the list into S1 and S2 and separates
     * 
     * @param list the LinkedList to partition
     * @param front the marker for the front partition
     * @param back the marker for the back partition 
     * @return the position of the partition in the list
     */
    private int partition(LinkedList<T> list, int front, int back) {
        T pivot = list.get(front);
        while (back > front) {
            while (back > front && list.get(back).compareTo(pivot) > 0)
                back--;
            if (back == front) break;
            list.set(front,list.get(back));
            front++;            
            while (back > front && list.get(front).compareTo(pivot) < 0)
                front++;
            if (back == front) break;
            list.set(back,list.get(front));
            back--;
        }
        list.set(front,pivot);
        return front;
    } 
        
    /**
     * An implementation of a merge sort algorithm it will sort the array into 
     * ascending order. 
     * 
     * @param list the LinkedList to sort
     */    
    public void merge(LinkedList<T> list) {
        if (list == null) return;                          // error check
        recursiveMerge(list,list.size());
    } 
    
    /**
     * The recursive wrapper method for merge sort. This algorithm takes the 
     * list parameter and its length and uses a recursive wrapper method (with 
     * a base and the recursive conditions). The base condition checks if the 
     * length is 1 and it will just return. For the rest of the cases, the 
     * recursive call will be executed. For the recursive case, we get the 
     * middle index and create two temporary lists. Then both two lists are 
     * recursively sorted. 
     * 
     * @param list the LinkedList to sort
     * @param length the length of the list
     */
    private void recursiveMerge(LinkedList<T> list, int length) {
        if (length < 2) return;
        int mid = length / 2;
        LinkedList<T> leftList  = new LinkedList<>();
        LinkedList<T> rightList = new LinkedList<>();
        for (int i = 0; i < mid; i++) {
            leftList.add(list.get(i));
        }
        for (int i = mid; i < length; i++) {
            rightList.add(list.get(i));
        }
        for (int i = mid; i < length; i++) {
            rightList.set(i-mid,list.get(i));
        }
        recursiveMerge(leftList, mid);
        recursiveMerge(rightList, length - mid);
        mergeAssist(list, leftList, rightList, mid, length - mid);
    }
    
    /**
     * An assist method for the merge sort. We then call the merge method 
     * which takes in the input and both the sub-lists and the starting and 
     * end indices of both the lists. It compares the elements of both 
     * sub-lists one by one and places the smaller element into the input 
     * list. When we reach the end of one of the sub-lists, the rest of the 
     * elements from the other list are copied into the input list thereby 
     * giving us the final sorted list.
     * 
     * @param list the LinkedList to sort
     * @param leftList the left sub-list
     * @param rightList the right sub-list
     * @param left the left starting index
     * @param right the right starting index 
     */
    private void mergeAssist(LinkedList<T> list, LinkedList<T> leftList,
            LinkedList<T> rightList, int left, int right) {        
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (leftList.get(i).compareTo(rightList.get(j)) <= 0) {
                list.set(k++, leftList.get(i++));
            }
            else {
                list.set(k++, rightList.get(j++));
            }
        }
        while (i < left) {
            list.set(k++, leftList.get(i++));
        }
        while (j < right) {
            list.set(k++, rightList.get(j++));
        }        
    }

    /**
     * An implementation of a merge sort algorithm it will sort the array into 
     * ascending order. 
     * 
     * @param array the array of generic items to sort
     */    
    public T[] merge(T[] array) {
        if (array == null) return null;                          // error check
        LinkedList list = new LinkedList(array);
        merge(list);
        array = (T[]) list.toArray(array);
        return array;
    } 
    
    /**
     * An implementation of a heap sort algorithm it will sort the array into 
     * ascending order. 
     * 
     * @param array the array of generic items to sort
     */    
    public T[] heap(T[] array) {
        if (array == null) return null;                         // Error check
        int length = array.length;
        for (int i = length / 2 - 1; i >= 0; i--) {
            heapify(array, length, i);      // Build heap (rearrange array)
        }
        for (int i = length - 1; i > 0; i--) {  // Extract element from heap            
            T temp = array[0];                  // Move current root to end
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);       // Call max heapify on the reduced heap
        }
        return array;
    } 

    /**
     * To 'heapify' a sub-tree rooted with node index which is an index in 
     * array[] with length being the size of heap
     * 
     * @param array
     * @param length
     * @param index 
     */
    private void heapify(T[] array, int length, int index) {
        int largest = index; // Initialize largest as root
        int left    = 2 * index + 1; 
        int right   = 2 * index + 2; 
        if (left < length && array[left].compareTo(array[largest]) > 0) {
            largest = left;     // If left child is larger than root
        }
        if (right < length && array[right].compareTo(array[largest]) > 0) {
            largest = right;    // If right child is larger than largest so far
        }
        if (largest != index) {             // If largest is not root
            T swap = array[index];
            array[index] = array[largest];
            array[largest] = swap;
            heapify(array, length, largest);    // Recursively heapify sub-tree
        }
    }
            
    /**
     * An implementation of a heap sort algorithm it will sort the array into 
     * ascending order. 
     * 
     * @param list the LinkedList to sort
     */    
    public void heap(LinkedList<T> list) {
        if (list == null) return;                       // error check
    } 
 
    /**
     * An implementation of a radix sort algorithm it will sort the array into 
     * ascending order. 
     * 
     * @param list the LinkedList to sort
     */    
    public void radix(LinkedList<T> list) {
        if (list == null) return;                          // error check
    }
    
}