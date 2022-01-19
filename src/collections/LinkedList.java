
/** Required package class namespace */
package collections;

/** Required imports */
import java.lang.reflect.Array;

 
/**
 * LinkedList.java - an implementation of a linked list abstract (advanced)
 * data (dynamic) type (ADT) and useful methods, and could be "visualized" as:
 * 
 *             +------+       +------+       +------+       +------+      
 *  null <---- |      | <---- |      | <---- |      | <---- |      |  
 *             | NODE |       | NODE |       | NODE |       | NODE |       
 *             |      |---->  |      |---->  |      |---->  |      |----> null  
 *             +------+       +------+       +------+       +------+      
 *                 ^                                           ^
 *                 |                                           |
 *                head                                        tail
 *
 * @author Mr. Wachs
 * @param <T> The generic data type used in the class
 * @since 8-Dec-2021, 11:58:01 AM
 */
public class LinkedList <T>
{
    
    /** Flag to indicate a search was not found */
    public final int NOT_FOUND = -1;
    
    /** Reference (link) to the first (front) node in the list (entry point) */
    private Node head;
    
    /** Reference (link) to the last (back) node in the list (entry point) */
    private Node tail;
    
    /** 
     * The number of nodes in the list, cannot be changed outside the class,
     * so it is an immutable encapsulated property
     */
    private int length;
    
    
    /**
     * Default constructor, set class properties
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
     * Frees up all memory used by this object
     */
    @Override
    public void finalize() {
        length = 0;                 // length set to zero
        head = tail = null;         // References set to nulls
        System.gc();                // Runs the garbage collector in Java
    }
        
    /**
     * Determines if the list is empty (no nodes) or not
     * 
     * @return it is empty (true) or it does contain some data (false)
     */
    public boolean isEmpty() {
        return length == 0;
    }
    
    /**
     * Accessor method for the number of nodes in the list (the length is a 
     * immutable encapsulated property of the class) - no mutator method will
     * be written (so 'length' remains a read-only property from outside the 
     * class)
     * 
     * @return the number of nodes in the list
     */
    public int size() {
        return length;
    }
         
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        if (isEmpty()) return "Empty LinkedList";   // No nodes to display
        String text = "LinkedList [";               // String to build up
        // Start a reference (link) at the first (head) node (entry point)
        Node current = head;                    // Start at head node
        while (current.next != null) {          // Traverse (travel) the list
            // Appending the node data to the string and a seperator comma
            text += current.data.toString() + ",";   
            current = current.next;             // Move to the next node
        }
        return text + current.data.toString() + "]";  
        // Sending back the string
    }
   
    /**
     * Inserts (adds) data (generic type) into the back (tail, end, etc) of
     * this list
     * 
     * @param data the generic type to add in
     * @return the operation was successful (true) or not (false)
     */
    public boolean addBack(T data) {
        if (data == null) return false;     // null data cannot be added            
        Node<T> node = new Node<>(data);    // new (memory) Node object created
        
        // General programmer scenarios to consider:
        //  (1) Typical case - what does a 'normal' user do?
        //  (2) Edge case(s) - what if we pushing the edge/limits?
        //  (3) Beyond the edge - what if we try to intentially crash this?
        
        // Scenarios for this method to consider:
        //  (1) Empty list
        //  (2) List of 1 or more nodes
        
        if (isEmpty()) {                    // Adding first node
            head = tail = node;             // Set LinkedList references
        }
        else {                              // Subsequent nodes added
            node.previous = tail;           // Link node to rest of list
            tail.next = node;               // Connect rest of list to node
            tail = node;                    // Reassign tail reference
        }
        length++;                           // Increase length environmental
        return true;                        // Operation successful
    }
    
    
    /**
     * Inserts (adds) data (generic type) into the front (head, start, etc) of
     * this list
     * 
     * @param data the generic type to add in
     * @return the operation was successful (true) or not (false)
     */
    public boolean addFront(T data) {
        if (data == null) return false;     // null data cannot be added            
        Node<T> node = new Node<>(data);    // new (memory) Node object created
        if (isEmpty()) {                    // Adding first node
            head = tail = node;             // Set LinkedList references
        }
        else {                              // Subsequent nodes added
            node.next = head;               // Link node to rest of list
            head.previous = node;           // Connect rest of list to node
            head = node;                    // Reassign head reference
        }
        length++;                           // Increase length environmental
        return true;                        // Operation successful
    }
    
    /**
     * Accessor for the data at the specified index
     * 
     * @param index the index location to access
     * @return the data (or null) at the index
     */
    public T get(int index) {        
        if (!inRange(index)) return null;   // Invalid index, return flag        
        return (T)getNode(index).data;      // Get reference and retrieve data  
    }
    
    /**
     * Mutator method sets the index location to the new data
     * 
     * @param index the index location to mutate
     * @param data the new data to mutate into
     * @return the operation was successful (true) or not (false)
     */
    public boolean set(int index, T data) {
        if (!inRange(index)) return false;          // Invalid index
        if (data == null)    return false;          // Invalid data
        Node current = getNode(index);              // Get to node at index
        current.data = data;                        // Change node data
        return true;                                // Operation successful
    }
    
    /**
     * Adds the data to the back of the list (wrapper method)
     * 
     * @param data the data to add
     * @return the operation was successful (true) or not (false)
     */
    public boolean add(T data) {
        return addBack(data);                           // Wrapper method call
    }
        
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        LinkedList<T> that = (LinkedList<T>)object;     // Cast object to list
        if (this.size() != that.size()) return false;   // Not same sizes      
        Node current1 = this.getFirstNode();            // Get reference to
        Node current2 = that.getFirstNode();            // Nodes in each list    
        while (current1 != null) {                      // Traverse lists
            if (!current1.equals(current2)) {           // Not equal data 
                return false;                           // Not equal lists
            }                
            current1 = current1.next;                   // Move each reference
            current2 = current2.next;                   // to next node
        }
        return true;                                    // Lists are equal
    }
       
    /**
     * a Deep clone, creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public LinkedList clone() {
        LinkedList<T> that = new LinkedList<>();    // Create new list memory
        for (int i = 0; i < this.length; i++) {     // Traverse list
            that.add((T)this.get(i));               // Get and add node data
        }        
        return that;                                // New list returned
    }
    
    /**
     * Inserts data as a new node after the passed index
     * 
     * @param data the data type to insert
     * @param index the index location to insert after
     * @return the operation was successful (true) or not (false)
     */
    public boolean addAfter(T data, int index) {
        if (data == null)    return false;              // invalid data to add
        if (!inRange(index)) return false;              // index out of range        
        if (index == length-1) return addBack(data);    // add to end of list
        Node<T> node = new Node<>(data);                // create node object
        Node current = getNode(index);                  // get to index spot
        node.next = current.next;                       // set proper references
        current.next.previous = node;
        current.next = node;
        node.previous = current;            
        length++;                                       // increase length
        return true;                                    // opperation successful
    }
        
    /**
     * Inserts data as a new node before the passed index
     * 
     * @param data the data type to insert
     * @param index the index location to insert before
     * @return the operation was successful (true) or not (false)
     */
    public boolean addBefore(T data, int index) {
        if (data == null)    return false;              // invalid data to add
        if (!inRange(index)) return false;              // index out of range        
        if (index == 0)      return addFront(data);     // add to start of list
        Node<T> node = new Node<>(data);                // create node object
        Node current = getNode(index);                  // get to index spot
        node.previous = current.previous;               // set proper references
        current.previous.next = node;
        current.previous = node;
        node.next = current;            
        length++;                                       // increase length
        return true;                                    // opperation successful
    }    
        
    /**
     * Adds the data before the passed index (wrapper method)
     * 
     * @param data the data to add
     * @param index the index location to add before
     * @return the operation was successful (true) or not (false)
     */
    public boolean add(T data, int index) {
        return addAfter(data, index);                   // wrapper method call
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
        if (isEmpty()) return null;             // no front to remove
        T data = front();                       // store head data
        if (length == 1) finalize();            // 1 node list, wipe list
        else {                
            head = head.next;                   // advanced head reference
            head.previous.next = null;          // cut old head reference
            head.previous = null;               // cut reference to old head
            length--;                           // reduce list length
            System.gc();                        // call system garbage collector
        }
        return data;                            // return stored data
    }
    
    /**
     * Removes (deletes) the last (tail) node of the list
     * 
     * @return the data in the last node (or null)
     */
    public T removeBack() {
        if (isEmpty()) return null;             // no back to remove
        T data = back();                        // store tail data
        if (length == 1) finalize();            // 1 node list, wipe list
        else {                
            tail = tail.previous;               // advanced tail reference
            tail.next.previous = null;          // cut old tail reference
            tail.next = null;                   // cut reference to old tail
            length--;                           // reduce list length
            System.gc();                        // call system garbage collector
        }
        return data;                            // return stored data
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
     * Checks (searches) if the specified data is inside the list
     * 
     * @param data the data to check for
     * @return data is in the list (true) or not (false)
     */ 
    public boolean contains(T data) {
        if (data == null) return false;         // invalid data to search for
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
     * Finds the node matching the data at the first occurrence in the list
     * and returns it's index or -1 (NOT_FOUND) if not in the list
     * 
     * @param data the node data to search for
     * @return index of first occurrence or -1 (NOT_FOUND)
     */
    public int firstIndexOf(T data) {
        if (data == null) return NOT_FOUND;     // null data rejected
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
        if (data == null) return NOT_FOUND;     // null data rejected
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
     * The number of instances this data occurs in the list
     * 
     * @param data the data to search for
     * @return the number of instances of the data
     */
    public int numberOf(T data) {
        if (data == null) return 0;             // reject null data
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
     * Accesses all occurrences of the passed data in the list and returns an
     * integer array containing all index values the data occurred at
     * 
     * @param data the data to search for
     * @return all indices location in an array or null if no indices
     */
    public int[] allIndices(T data) {
        if (data == null)    return null;       // reject null data
        if (!contains(data)) return null;       // no data in the list
        int size = numberOf(data);              // get number of occurrences
        int[] array = new int[size];            // create array 
        Node current = head;                    // start at head
        int counter = 0;                        // start counter
        for (int i = 0; i < length; i++) {      // traverse list
            if (current.data.equals(data)) {    // item encountered
                array[counter] = i;             // insert index into array
                counter++;                      // increase counter
                if (counter >= size) {
                    return array;
                }
            }
            current = current.next;             // move to next node
        }
        return array;                           // return completed array
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
     * Appends all the items from the passed list to the end of the 
     * current list
     * 
     * @param items the array to append on
     */
    public void addAll(T[] items) {
        if (items == null) return;                  // error check
        for (int i = 0; i < items.length; i++) {    // traverse array
            this.add(items[i]);                     // add array item
        }
    }
    
    /**
     * Appends all the items from the passed list to the end of the 
     * current list
     * 
     * @param list the Linked list to append on
     */
    public void addAll(LinkedList<T> list) {
        if (list == null) return;                   // error check
        for (int i = 0; i < list.size(); i++) {     // traverse list
            this.add(list.get(i));                  // get and add item
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
        if (items == null)   return;                // error check
        if (!inRange(index)) return;                // error check
        for (int i = 0; i < items.length; i++) {    // traverse array
            this.addAfter(items[i], index);         // add array item after
            index++;                                // increase index
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
        if (list == null)    return;                // error check
        if (!inRange(index)) return;                // error check
        for (int i = 0; i < list.size(); i++) {     // traverse list
            this.addAfter(list.get(i), index);      // get and add item after
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
        if (array == null) return;                  // error check
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
        if (list == null) return;                   // error check
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
        if (array == null) return null;
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
     * Accessor method to the encapsulated (private) property of the first
     * (head) node of the list
     * 
     * @return reference to the first node
     */
    protected Node getFirstNode() {
        return head;
    }
    
    /**
     * Accessor method to the encapsulated (private) property of the last
     * (tail) node of the list
     * 
     * @return reference to the last node
     */
    protected Node getLastNode() {
        return tail;
    }
    
    /**
     * Accessor method to retrieve a node reference (link, pointer to) for this
     * index location
     * 
     * @param index the subscript, location, index value
     * @return a reference to the node at this location or null 
     */
    protected Node getNode(int index) {
        if (!inRange(index))   return null;             // not valid index
        if (index == 0)        return getFirstNode();   // first node returned     
        if (index == length-1) return getLastNode();    // last node returned
        Node current = head;                            // start at first node
        for (int i = 0; i < index; i++) {               // move to index
            current = current.next;                     // advance reference
        }
        return current;                                 // return reference
    }
    
    /**
     * Error checks to see if the index is in the range of the list
     * 
     * @param index the location (element number) to check
     * @return it is in-range (true) or not (false)
     */
    private boolean inRange(int index) {
        if (isEmpty())       return false;  // Empty list no valid index
        if (index < 0)       return false;  // index before first valid number
        if (index >= length) return false;  // index after last valid number
        return true;                        // index is valid
    }
    
}