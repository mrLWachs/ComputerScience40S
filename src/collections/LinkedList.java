
/** required package class namespace */
package collections;

/** required imports */
import java.lang.reflect.Array;


/**
 * LinkedList.java - an implementation of a linked list abstract (advanced)
 * data (dynamic) type (ADT) and its useful methods
 *
 * @author Mr. Wachs 
 * @param <T> The generic type used 
 * @since 16-Nov-2018 
 * @instructor Mr. Wachs
 */
public class LinkedList <T>
{

    /** 
     * The number of nodes in the list 
     */
    private int length;    
    
    /** 
     * Node reference entry point to the first node in the list 
     */
    private Node head;
    
    /** 
     * Node reference entry point to the last node in the list 
     */
    private Node tail;
    
    /** 
     * Flag to indicate a search operation was not found 
     */
    public static final int NOT_FOUND = -1;
    
    
    /** 
     * Default constructor for the class 
     */
    public LinkedList() {
        finalize();
    }
    
    /**
     * Constructor instantiates list from the passed data
     * 
     * @param array the data objects to create the list from
     */
    public LinkedList(T[] array) {
        fromArray(array);
    }
        
    /**
     * Constructor instantiates list from the passed data
     * 
     * @param list the data objects to create the list from
     */
    public LinkedList(LinkedList<T> list) {
        fromLinkedList(list);
    }
    
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {        
        if (isEmpty()) return "Empty list";             // no nodes to display
        else {
            String text = "[";                          // starting character
            Node current = head;                        // start at head node
            while (current.next != null) {              // traverse list
                text += current.toString() + ",";       // append data
                current = current.next;                 // move to next node
            }            
            return text + current.toString() + "]";     // append end character
        }        
    }

    /**
     * Determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        LinkedList<T> list = (LinkedList<T>)object;     // cast object to list
        if (this.size() != list.size()) return false;   // not same sizes
        else {            
            Node current1 = this.getFirstNode();        // get reference to
            Node current2 = list.getFirstNode();        // nodes in each list    
            while (current1 != null) {                  // traverse lists
                if (!current1.equals(current2)) {       // not equal data 
                    return false;                       // not equal lists
                }                
                current1 = current1.next;               // move each reference
                current2 = current2.next;               // to next node
            }
            return true;                                // lists are equal
        }        
    }

    /**
     * Creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    public LinkedList clone() {
        LinkedList<T> list = new LinkedList<>();    // create new list memory
        for (int i = 0; i < length; i++) {          // traverse list
            list.addBack((T)this.getNode(i).data);  // get and add node data          
        }        
        return list;                                // new list returned
    }
    
    /**
     * Determines if the list is empty (no content)
     * 
     * @return is empty (true) or not empty (false)
     */
    public boolean isEmpty() {
        return length == 0;                         // compares length to zero
    }
       
    /**
     * The number of nodes (the length) of the list
     * 
     * @return the number of nodes in the list
     */
    public int size() {
        return length;                              // encapsulated property
    } 
    
    /**
     * Frees up all memory used by this object
     */
    @Override
    public final void finalize() {
        length = 0;                                 // length set to zero
        head = tail = null;                         // references set to nulls
        System.gc();                                // garbage collector called
    }
    
    /**
     * Inserts data into the front (head) of the list
     * 
     * @param data the data type to add
     * @return the operation was successful (true) or not (false)
     */
    public boolean addFront(T data) {
        if (data == null) return false;     // null data cannot be added        
        Node<T> node = new Node<>(data);    // new node memory created    
        if (isEmpty()) {                    // adding first node
            head = tail = node;             // set references
        }
        else {                              // subsequent nodes added
            node.next = head;               // link node to rest of list
            head.previous = node;           // connect rest of list to node
            head = node;                    // reassign head reference
        }
        length++;                           // increase length environmental
        return true;                        // operation successful
    }
    
    /**
     * Inserts data into the back (tail) of the list
     * 
     * @param data the data type to add
     * @return the operation was successful (true) or not (false)
     */
    public boolean addBack(T data) {
        if (data == null) return false;     // null data cannot be added            
        Node<T> node = new Node<>(data);    // new node memory created    
        if (isEmpty()) {                    // adding first node
            head = tail = node;             // set references
        }
        else {                              // subsequent nodes added
            node.previous = tail;           // link node to rest of list
            tail.next = node;               // connect rest of list to node
            tail = node;                    // reassign tail reference
        }
        length++;                           // increase length environmental
        return true;                        // operation successful
    }
    
    /**
     * Accessor for the data at the specified index
     * 
     * @param index the index location to access
     * @return the data (or null) at the index
     */
    public T get(int index) {        
        if (!inRange(index)) return null;   // invalid index, return flag        
        return (T)getNode(index).data;      // get reference and retrieve data  
    }
    
    /**
     * Mutator method sets the index location to the new data
     * 
     * @param index the index location to mutate
     * @param data the new data to mutate into
     * @return the operation was successful (true) or not (false)
     */
    public boolean set(int index, T data) {
        Node current = getNode(index);              // get to node at index
        if (current == null) return false;          // invalid index
        if (data == null)    return false;          // invalid data
        current.data = data;                        // change node data
        return true;                                // operation successful
    }
    
    /**
     * Accesses the first, head, front data in the list
     * 
     * @return the head data
     */
    public T front() {
        return get(0);                              // first node
    }
    
    /**
     * Accesses the last, tail, back data in the list
     * 
     * @return the tail data
     */
    public T back() {
        return get(length-1);                       // last node
    }
    
    /**
     * Removes (deletes) the first (head) node of the list
     * 
     * @return the data in the first node (or null)
     */
    public T removeFront() {
        if (isEmpty()) return null;         // no front to remove
        else {
            T data = (T)head.data;          // store head data
            if (length == 1) finalize();    // 1 node list, wipe list
            else {                
                head = head.next;           // advanced head reference
                head.previous.next = null;  // cut old head reference
                head.previous = null;       // cut reference to old head
                length--;                   // reduce list length
                System.gc();                // call system garbage collector
            }
            return data;                    // return stored data
        }
    }
    
    /**
     * Removes (deletes) the last (tail) node of the list
     * 
     * @return the data in the last node (or null)
     */
    public T removeBack() {
        if (isEmpty()) return null;         // no back to remove
        else {
            T data = (T)tail.data;          // store tail data
            if (length == 1) finalize();    // 1 node list, wipe list
            else {                
                tail = tail.previous;       // advanced tail reference
                tail.next.previous = null;  // cut old tail reference
                tail.next = null;           // cut reference to old tail
                length--;                   // reduce list length
                System.gc();                // call system garbage collector
            }
            return data;                    // return stored data
        }
    }
    
    /**
     * Checks if the specified data is inside the list
     * 
     * @param data the data to check for
     * @return data is in the list (true) or not (false)
     */ 
    public boolean contains(T data) {
        Node current = head;                    // start reference at head
        while (current != null) {               // traverse list
            if (current.data.equals(data)) {    // found first occurrence
                return true;                    // indicate found
            }
            current = current.next;             // move to next node
        }
        return false;                           // not found in list
    }
    
    /**
     * Inserts data as a new node after the passed index
     * 
     * @param data the data type to insert
     * @param index the index location to insert after
     * @return the operation was successful (true) or not (false)
     */
    public boolean addAfter(T data, int index) {
        if (!inRange(index)) return false;              // index out of range
        if (data == null)    return false;              // invalid data to add
        if (index == length-1) return addBack(data);    // add to end of list
        else {                                          // adding into middle
            Node node = new Node(data);                 // create node object
            Node current = getNode(index);              // get to index spot
            node.next = current.next;                   // set proper references
            current.next.previous = node;
            current.next = node;
            node.previous = current;            
            length++;                                   // increase length
            return true;                                // opperation successful
        }
    }
    
    /**
     * Inserts data as a new node before the passed index
     * 
     * @param data the data type to insert
     * @param index the index location to insert before
     * @return the operation was successful (true) or not (false)
     */
    public boolean addBefore(T data, int index) {
        if (!inRange(index)) return false;              // index out of range
        if (data == null)    return false;              // invalid data to add
        if (index == 0)      return addFront(data);     // add to start of list
        else {                                          // adding into middle
            Node node = new Node(data);                 // create node object
            Node current = getNode(index);              // get to index spot
            node.previous = current.previous;           // set proper references
            current.previous.next = node;
            current.previous = node;
            node.next = current;            
            length++;                                   // increase length
            return true;                                // opperation successful
        }
    }
    
    /**
     * Adds the data to the back of the list
     * 
     * @param data the data to add
     * @return the operation was successful (true) or not (false)
     */
    public boolean add(T data) {
        return addBack(data);                           // wrapper method call
    }
    
    /**
     * Adds the data before the passed index
     * 
     * @param data the data to add
     * @param index the index location to add before
     * @return the operation was successful (true) or not (false)
     */
    public boolean add(T data, int index) {
        return addAfter(data, index);                   // wrapper method call
    }
    
    /**
     * Deletes the node at the specified index and mutates the list
     * 
     * @param index the index location to remove
     * @return the data at the specified index (or null)
     */
    public T remove(int index) {
        if (!inRange(index))   return null;             // not in range
        if (index == 0)        return removeFront();    // remove first
        if (index == length-1) return removeBack();     // remove last
        Node current = getNode(index);                  // get to index
        current.next.previous = current.previous;       // change references
        current.previous.next = current.next;
        current.next = current.previous = null;        
        length--;                                       // reduce list length
        return (T)current.data;                         // return index data
    }
    
    /**
     * Finds the node matching the data at the first occurrence in the list
     * and returns it's index or -1 (NOT_FOUND) if not in the list
     * 
     * @param data the node data to search for
     * @return index of first occurrence or -1 (NOT_FOUND)
     */
    public int firstIndexOf(T data) {
        Node current = head;                    // start at head
        int index = 0;                          // start count at 0
        while (current != null) {               // traverse list
            if (current.data.equals(data)) {    // found first occurrence
                return index;                   // return location
            }
            current = current.next;             // advance to next node
            index++;                            // advance count
        }
        return NOT_FOUND;                       // data not found
    }
    
    /**
     * Finds the node matching the data at the last occurrence in the list
     * and returns it's index or -1 (NOT_FOUND) if not in the list
     * 
     * @param data the node data to search for
     * @return index of last occurrence or -1 (NOT_FOUND) 
     */
    public int lastIndexOf(T data) {
        Node current = tail;                    // start at head
        int index = length-1;                   // start count at total nodes
        while (current != null) {               // traverse list
            if (current.data.equals(data)) {    // found last occurrence
                return index;                   // return location
            }
            current = current.previous;         // return to previous node
            index--;                            // decrease count
        }
        return NOT_FOUND;                       // data not found
    }
    
    /**
     * Deletes the first occurrence of the data in the list
     * 
     * @param data the node data to remove
     * @return the operation was successful (true) or not (false) 
     */
    public boolean remove(T data) {
        if (data == null) return false;         // nothing to remove
        int index = firstIndexOf(data);         // get first location
        if (index == NOT_FOUND) return false;   // not in list
        remove(index);                          // remove
        return true;                            // operation successful
    }
    
    /**
     * Deletes the last occurrence of the data in the list
     * 
     * @param data the node data to remove
     * @return the operation was successful (true) or not (false) 
     */
    public boolean removeLast(T data) {
        if (data == null) return false;         // nothing to remove
        int index = lastIndexOf(data);          // get first location
        if (index == NOT_FOUND) return false;   // not in list
        remove(index);                          // remove
        return true;                            // operation successful
    }
    
    /**
     * Deletes all occurrences of the data in the list
     * 
     * @param data the node data to remove
     * @return the operation was successful (true) or not (false)
     */
    public boolean removeAll(T data) {
        if (data == null)    return false;      // nothing to remove
        if (!contains(data)) return false;      // not in list
        while(contains(data)) {                 // loop continuously
            remove(data);                       // removing the data
        }
        return true;                            // operation successful
   }
    
    /**
     * Deletes all occurrences of the different data items in the array 
     * from the list
     * 
     * @param items the node data array items to remove
     * @return the operation was successful (true) or not (false)
     */
    public boolean removeAll(T[] items) {
         if (items == null)     return false;   // invalid array
         if (items.length == 0) return false;   // invalid array
         for (T item : items) {                 // traverse array
             removeAll(item);                   // remove array item
         }
         return true;                           // operation successful
    } 
   
    /**
     * Deletes all occurrences of the different data items in the passed
     * list from the current list
     * 
     * @param list the LinkedList of items to remove
     * @return the operation was successful (true) or not (false)
     */
    public boolean removeAll(LinkedList<T> list) {
        if (list == null)   return false;           // invalid list
        if (list.isEmpty()) return false;           // empty list
        for (int i = 0; i < list.size(); i++) {     // traverse list
            removeAll(list.get(i));                 // remove list item
        }
        return true;                                // operation successful
    }
   
    /**
     * Wipes out all memory of all contents of the list
     */
    public void clear() {
        Node current = head;                // start at head of the list
        while (current != null) {           // traverse the list
            Node next = current.next;       // reference to the next node
            current.finalize();             // wipe all memory from the node
            current = next;                 // move to the next node
        }
        finalize();                         // wipe all memory from the list
    }
   
    /**
     * Checks the list to see if it contains all the items in the array
     * 
     * @param items the node data array items to check
     * @return all items are in the array (true) or not (false)
     */
    public boolean containsAll(T[] items) {
        if (items == null)     return false;    // invalid array
        if (items.length == 0) return false;    // invalid array
        for (T item : items) {                  // traverse array
            if (!contains(item)) return false;  // item not in list
        }
        return true;                            // operation successful
    }
    
    /**
     * Checks the list to see if it contains all the items in the array
     * 
     * @param list the LinkedList of items to check
     * @return all items are in the list (true) or not (false)
     */
    public boolean containsAll(LinkedList<T> list) {
        if (list == null)     return false;         // invalid list
        if (list.size() == 0) return false;         // invalid list
        for (int i = 0; i < list.size(); i++) {     // traverse array
            if (!contains((T)list.get(i))) 
                return false;                       // item not in list
        }
        return true;                                // operation successful
    }
        
    /**
     * The number of instances this data occurs in the list
     * 
     * @param data the data to search for
     * @return the number of instances of the data
     */
    public int numberOf(T data) {
        int counter = 0;                        // start a counter
        Node current = head;                    // start at head of list
        while (current != null) {               // traverse list
            if (current.data.equals(data)) {    // item found in list
                counter++;                      // increase counter
            }
            current = current.next;             // advance to next node
        }
        return counter;                         // counter returned
    }
   
    /**
     * Appends all the items from the passed list to the end of the 
     * current list
     * 
     * @param list the Linked list to append on
     */
    public void addAll(LinkedList<T> list) {
        for (int i = 0; i < list.size(); i++) {     // traverse list
            this.add(list.get(i));                  // get and add item
        }
    }
   
    /**
     * Appends all the items from the passed list into the current list 
     * after the passed index
     * 
     * @param list the Linked list to append on
     * @param index the index location to append from
     */
    public void addAll(LinkedList<T> list, int index) {
        for (int i = 0; i < list.size(); i++) {     // traverse list
            this.addAfter(list.get(i), index);      // get and add item after
            index++;                                // increase index
        }
    }
        
    /**
     * Appends all the items from the passed list to the end of the 
     * current list
     * 
     * @param items the array to append on
     */
    public void addAll(T[] items) {
        for (int i = 0; i < items.length; i++) {    // traverse array
            this.add(items[i]);                     // add array item
        }
    }
    
    /**
     * Appends all the items from the passed list into the current list 
     * after the passed index
     * 
     * @param items the array to append on
     * @param index the index location to append from
     */
    public void addAll(T[] items, int index) {
        for (int i = 0; i < items.length; i++) {    // traverse array
            this.addAfter(items[i], index);         // add array item after
            index++;                                // increase index
        }
    }
   
    /**
    * Accesses a sub list from the main list based on the passed parameters
    * 
    * @param from the index to start the sublist from
    * @param to the index to end the sub list at
    * @return a sub list from the main list
    */
    public LinkedList<T> subList(int from, int to) {
        if (!inRange(from)) return null;            // index out of range
        if (!inRange(to))   return null;            // index out of range
        if (from > to)      return null;            // index not in line
        LinkedList<T> list = new LinkedList<>();    // create list
        for (int i = from; i <= to; i++) {          // traverse indices
            list.add(this.get(i));                  // add to list from list
        }
        return list;                                // return new list
    }
    
    /**
     * Mutates the list into a list only matching the contents of the array
     * 
     * @param array the data objects to form the list from
     */
    public final void fromArray(T[] array) {
        finalize();                                 // wipe list memory
        for (T item : array) {                      // traverse array
            add(item);                              // add array item
        }
    }
    
    /**
     * Mutates list into a list only matching the contents of the other list
     * 
     * @param list the data objects to form the list from
     */
    public final void fromLinkedList(LinkedList<T> list) {
        finalize();                                 // wipe list memory
        for (int i = 0; i < list.size(); i++) {     // traverse list
            add(list.get(i));                       // get and add item
        }
    }
    
    /**
     * Returns an array that contains the same data as the list
     * 
     * @param array the data type array
     * @return an array of generic type T
     */
    public T[] toArray(T[] array) {
        array = (T[])(
                Array.newInstance(
                        array.getClass().getComponentType(), 
                        length)
                );                              // create empty array
        for (int i = 0; i < length; i++) {      // traverse list
            array[i] = get(i);                  // add to array
        }
        return array;                           // return completed array
    }
    
    /**
     * Accesses all occurrences of the passed data in the list and returns an
     * integer array containing all index values the data occurred at
     * 
     * @param data the data to search for
     * @return all indices location in an array or null if no indices
     */
    public int[] allIndices(T data) {
        if (!contains(data)) return null;       // no data in the list
        int size = numberOf(data);              // get number of occurrences
        int[] array = new int[size];            // create array 
        Node current = head;                    // start at head
        int counter = 0;                        // start counter
        for (int i = 0; i < length; i++) {      // traverse list
            if (current.data.equals(data)) {    // item encountered
                array[counter] = i;             // insert index into array
                counter++;                      // increase counter
                if (counter >= size) return array;
            }
            current = current.next;             // move to next node
        }
        return array;                           // return completed array
    }
    
    /**
     * Checks to see if the index is in range of the list
     * 
     * @param index the location to check
     * @return it is in range (true) or not (false)
     */        
    private boolean inRange(int index) {
        if (isEmpty())       return false;  // empty list no valid index
        if (index < 0)       return false;  // index before first valid number
        if (index >= length) return false;  // index after last valid number
        return true;                        // index is valid
    }
    
    /**
     * Reference to the first (head) node in the list
     * 
     * @return reference to the head (first) node
     */
    protected Node getFirstNode() {
        return head;
    }

    /**
     * Reference to the last (tail) node in the list
     * 
     * @return reference to the tail (last) node
     */
    protected Node getLastNode() {
        return tail;
    }
    
    /**
     * Accesses the node reference for this index location
     * 
     * @param index the index location
     * @return a reference to the node at this index or null
     */
    protected Node getNode(int index) {
        if (!inRange(index))   return null;             // not valid index
        if (index == 0)        return getFirstNode();   // first node returned
        if (index == length-1) return getLastNode();    // last node returned
        else {                                          // internal node
            Node current = head;                        // start at first node
            for (int i = 0; i < index; i++) {           // move to index
                current = current.next;                 // advance reference
            }
            return current;                             // return reference
        }
    }
    
}
