
/** Required package class namespace */
package collections;

/** Required API imports */
import java.lang.reflect.Array;

 
/**
 * LinkedList.java - an implementation of a linked list abstract (advanced)
 * data (dynamic) type (ADT) and useful methods. A linked list is a collection
 * of data objects "linked together" and where each object maintains a 
 * reference (a "pointer") to the next object in the list. This is different 
 * from an array where we have one identifier referencing all the items. This 
 * is useful because each object (each spot) is connected to the next spot 
 * like a chain. If we also use each "spot" to store data, we have a structure
 * like an array that stores multiple data items, but where we can add and 
 * remove "spots" from the chain. It could be "visualized" as:
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
 * @since Dec 6, 2023, 10:38:11 a.m.
 */
public class LinkedList <T>
{
    
    /** 
     * The number of nodes in the list, cannot be changed outside the class,
     * so it is an immutable encapsulated property
     */
    private int length;
    
    /** Reference (link) to the first (front) node in the list (entry point) */
    private Node head;
    
    /** Reference (link) to the last (back) node in the list (entry point) */
    private Node tail;
    
    /** Flag to indicate a search was not found */
    public final int NOT_FOUND = -1;
    
    /**
     * Default constructor, set class properties
     */
    public LinkedList() {
        finalize();
    }
    
    /**
     * Frees up all memory used by this object (Note: when you add the "final"
     * modifier keyword to the method signature, it make it so that this method
     * can NOT ever be overloaded)
     */
    @Override
    public final void finalize() {
        length = 0;                 // The length is set to zero
        head = tail = null;         // References set to nulls
        System.gc();                // Runs the garbage collector in Java
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
     * Determines if the list is empty (no nodes) or not
     * 
     * @return it is empty (true) or it does contain some data (false)
     */
    public boolean isEmpty() {        
        return length == 0;        
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
     * A protected (can be called inside the class and by any children of this
     * class) accessor method to retrieve a node reference (link, pointer, 
     * address, etc.) to the passed index location (using an array style of
     * indexing)
     * 
     * @param index the subscript, location, spot, index value
     * @return a reference (not the data) to the node at this location or null
     */
    protected Node getNode(int index) {
        if (!inRange(index))   return null;             // Not valid index
        if (index == 0)        return getFirstNode();   // First node returned
        if (index == length-1) return getLastNode();    // Last node returned
        Node current = head;                            // Start at first node
        for (int i = 0; i < index; i++) {               // Move to index
            current = current.next;                     // Advance reference
        }
        return current;                                 // Return reference
    }
    
    /**
     * A private (encapsulated or "help") method to error check to see if the
     * index is in range (or "in bounds") of the list
     * 
     * @param index the location (element, subscript) to check
     * @return it is in range (true) or not (false)
     */
    private boolean inRange(int index) {
        if (isEmpty())       return false;  // Empty list no valid index
        if (index < 0)       return false;  // index before first valid number
        if (index >= length) return false;  // index after last valid number
        return true;                        // index valid
    }
        
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        if (isEmpty()) return "Empty LinkedList";       // No nodes to display
        String text = "LinkedList [";                   // String to build up
        // Start a reference (link) at the first (head) node (entry point)
        Node current = head;                            // Start at head node
        while (current.next != null) {          // Traverse (travel) the list
            // Appending the node data to the string and a seperator comma
            text += current.data.toString() + ",";   
            current = current.next;                     // Move to next node
        }
        return text + current.data.toString() + "]";    // Send back the string                                                    
    }
    
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        LinkedList<T> that = (LinkedList<T>)object;     // Cast object parameter        
        if (this.size() != that.size()) return false;   // Not the same sizes
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
            head = node;                    // Reassign tail reference
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
     * a Deep clone, creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public LinkedList clone() {
        LinkedList<T> that = new LinkedList<>();    // Create new list memory
        for (int i = 0; i < this.length; i++) {     // Traverse list
            that.addBack((T)this.get(i));
            // This one line is the same as...
            // T data = (T)this.get(i);
            // that.addBack(data);
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
        // First error check the data and index values
        if (data == null)      return false;            // Invalid data to add
        if (!inRange(index))   return false;            // Index out of range
        
        // The simple index number calls a method we already have
        if (index == length-1) return addBack(data);    // Add to the end 
        Node<T> node = new Node<>(data);                // Create node object
        Node current = getNode(index);                  // Get to index spot
        
        // Next, set all 4 proper references to insert the new node
        node.next = current.next;                       
        current.next.previous = node;
        current.next = node;
        node.previous = current;
        
        // Finishing up, add to lenght class property and return successfull
        length++;                                       // Increase length
        return true;                                    // Opperation successful
    }
    
    /**
     * Inserts data as a new node before the passed index
     * 
     * @param data the data type to insert
     * @param index the index location to insert before
     * @return the operation was successful (true) or not (false)
     */
    public boolean addBefore(T data, int index) {
        if (data == null)      return false;            // Invalid data to add
        if (!inRange(index))   return false;            // Index out of range
        if (index == 0) return addFront(data);          // Add to the head 
        Node<T> node = new Node<>(data);                // Create node object
        Node current = getNode(index);                  // Get to index spot
        // Copy and paste the addAfter method and then applied "dual" opperation
        // logic on all the references below ("next" becomes "previous", etc.)
        node.previous = current.previous;                       
        current.previous.next = node;
        current.previous = node;
        node.next = current;
        length++;                                       // Increase length
        return true;                                    // Opperation successful
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
     * Adds the data before the passed index (wrapper method)
     * 
     * @param data the data to add
     * @param index the index location to add before
     * @return the operation was successful (true) or not (false)
     */
    public boolean add(T data, int index) {
        return addAfter(data, index);                   // Wrapper method call
    }
    
    /**
     * Accesses the first, head, front data in the list
     * 
     * @return the head data
     */
    public T front() {
        return get(0);                              // First node
    }
    
    /**
     * Accesses the last, tail, back data in the list
     * 
     * @return the tail data
     */
    public T back() {
        return get(length-1);                       // Last node
    }
    
    /**
     * Wipes out all memory of all contents of the list
     */
    public void clear() {
        Node current = head;                // Start at head of the list
        while (current != null) {           // Traverse the list
            Node next = current.next;       // Reference to the next node
            current.finalize();             // Wipe all memory from the node
            current = next;                 // Move to the next node
        }
        finalize();                         // Wipe all memory from the list
    }
    
    /**
     * Removes (deletes) the first (head) node of the list (mutator method)
     * 
     * @return the data in the first node (or null)
     */
    public T removeFront() {
        if (isEmpty()) return null;             // No front to remove
        T data = front();                       // Store head data
        if (length == 1) finalize();            // One node list, wipe list
        else {                
            head = head.next;                   // Advanced head reference
            head.previous.next = null;          // Cut old head reference
            head.previous = null;               // Cut reference to old head
            length--;                           // Reduce list length
            System.gc();                        // Call system garbage collector
        }        
        return data;                            // Return stored data
    }
    
    /**
     * Removes (deletes) the last (tail) node of the list
     * 
     * @return the data in the last node (or null)
     */
    public T removeBack() {
        if (isEmpty()) return null;             // No back to remove
        T data = back();                        // Store tail data
        if (length == 1) finalize();            // One node list, wipe list
        else {                
            tail = tail.previous;               // Advanced tail reference
            tail.next.previous = null;          // Cut old tail reference
            tail.next = null;                   // Cut reference to old tail
            length--;                           // Reduce list length
            System.gc();                        // Call system garbage collector
        }
        return data;                            // Return stored data
    }
    
    /**
     * Deletes the node at the specified index and mutates the list
     * 
     * @param index the index location to remove
     * @return the data at the specified index (or null)
     */
    public T remove(int index) {
        if (!inRange(index))   return null;             // Not in range
        if (index == 0)        return removeFront();    // Remove first
        if (index == length-1) return removeBack();     // Remove last
        Node current = getNode(index);                  // Get to index
        current.next.previous = current.previous;       // Change references
        current.previous.next = current.next;
        current.next = current.previous = null;        
        length--;                                       // Reduce list length
        return (T)current.data;                         // Return index data
    }
    
    /**
     * Checks (searches) if the specified data is inside the list
     * 
     * @param data the data to check for
     * @return data is in the list (true) or not (false)
     */ 
    public boolean contains(T data) {
        if (data == null) return false;         // Invalid data to search for
        Node current = head;                    // Start reference at head
        while (current != null) {               // Traverse list
            if (current.data.equals(data)) {    // Found first occurrence
                return true;                    // Indicate found
            }
            current = current.next;             // Move to next node
        }
        return false;                           // Not found in list
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
        Node current = head;                    // Start at head
        int index = 0;                          // Start count at 0
        while (current != null) {               // Traverse list
            if (current.data.equals(data)) {    // Found first occurrence
                return index;                   // Return location
            }
            current = current.next;             // Advance to next node
            index++;                            // Advance count
        }
        return NOT_FOUND;                       // Data not found
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
        Node current = tail;                    // Start at head
        int index = length-1;                   // Start count at total nodes
        while (current != null) {               // Traverse list
            if (current.data.equals(data)) {    // Found last occurrence
                return index;                   // Return location
            }
            current = current.previous;         // Return to previous node
            index--;                            // Decrease count
        }
        return NOT_FOUND;                       // Data not found
    }
    
    /**
     * The number of instances this data occurs in the list
     * 
     * @param data the data to search for
     * @return the number of instances of the data
     */
    public int numberOf(T data) {
        if (data == null) return 0;             // Reject null data
        int counter = 0;                        // Start a counter
        Node current = head;                    // Start at head of list
        while (current != null) {               // Traverse list
            if (current.data.equals(data)) {    // Item found in list
                counter++;                      // Increase counter
            }
            current = current.next;             // Advance to next node
        }
        return counter;                         // Counter returned
    }
    
    /**
     * Accesses all occurrences of the passed data in the list and returns an
     * integer array containing all index values the data occurred at
     * 
     * @param data the data to search for
     * @return all indices location in an array or null if no indices
     */
    public int[] allIndices(T data) {
        if (data == null)    return null;       // Reject null data
        if (!contains(data)) return null;       // No data in the list
        int size = numberOf(data);              // Get number of occurrences
        int[] array = new int[size];            // Create array 
        Node current = head;                    // Start at head
        int counter = 0;                        // Start counter
        for (int i = 0; i < length; i++) {      // Traverse list
            if (current.data.equals(data)) {    // Item encountered
                array[counter] = i;             // Insert index into array
                counter++;                      // Increase counter
                if (counter >= size) {
                    return array;
                }
            }
            current = current.next;             // Move to next node
        }
        return array;                           // Return completed array
    }
    
    /**
     * Deletes the first occurrence of the data in the list
     * 
     * @param data the node data to remove
     * @return the operation was successful (true) or not (false) 
     */
    public boolean remove(T data) {
        if (data == null) return false;         // Nothing to remove
        int index = firstIndexOf(data);         // Get first location
        if (index == NOT_FOUND) return false;   // Not in list
        remove(index);                          // Remove
        return true;                            // Operation successful
    }
    
    /**
     * Deletes the last occurrence of the data in the list
     * 
     * @param data the node data to remove
     * @return the operation was successful (true) or not (false) 
     */
    public boolean removeLast(T data) {
        if (data == null) return false;         // Nothing to remove
        int index = lastIndexOf(data);          // Get first location
        if (index == NOT_FOUND) return false;   // Not in list
        remove(index);                          // Remove
        return true;                            // Operation successful
    }
    
    /**
     * Deletes all occurrences of the data in the list
     * 
     * @param data the node data to remove
     * @return the operation was successful (true) or not (false)
     */
    public boolean removeAll(T data) {
        if (data == null)    return false;      // Nothing to remove
        if (!contains(data)) return false;      // Not in list
        while(contains(data)) {                 // Loop continuously
            remove(data);                       // Removing the data
        }
        return true;                            // Operation successful
    }
    
    /**
     * Deletes all occurrences of the different data items in the array 
     * from the list
     * 
     * @param items the node data array items to remove
     * @return the operation was successful (true) or not (false)
     */
    public boolean removeAll(T[] items) {
         if (items == null)     return false;   // Invalid array
         if (items.length == 0) return false;   // Invalid array
         for (T item : items) {                 // Traverse array
             removeAll(item);                   // Remove array item
         }
         return true;                           // Operation successful
    } 
   
    /**
     * Deletes all occurrences of the different data items in the passed
     * list from the current list
     * 
     * @param list the LinkedList of items to remove
     * @return the operation was successful (true) or not (false)
     */
    public boolean removeAll(LinkedList<T> list) {
        if (list == null)   return false;           // Invalid list
        if (list.isEmpty()) return false;           // Empty list
        for (int i = 0; i < list.size(); i++) {     // Traverse list
            removeAll(list.get(i));                 // Remove list item
        }
        return true;                                // Operation successful
    }
    
    /**
     * Checks the list to see if it contains all the items in the array
     * 
     * @param items the node data array items to check
     * @return all items are in the array (true) or not (false)
     */
    public boolean containsAll(T[] items) {
        if (items == null)     return false;    // Invalid array
        if (items.length == 0) return false;    // Invalid array
        for (T item : items) {                  // Traverse array
            if (!contains(item)) return false;  // Item not in list
        }
        return true;                            // Operation successful
    }
    
    /**
     * Checks the list to see if it contains all the items in the array
     * 
     * @param list the LinkedList of items to check
     * @return all items are in the list (true) or not (false)
     */
    public boolean containsAll(LinkedList<T> list) {
        if (list == null)     return false;         // Invalid list
        if (list.size() == 0) return false;         // Invalid list
        for (int i = 0; i < list.size(); i++) {     // Traverse array
            if (!contains((T)list.get(i))) 
                return false;                       // Item not in list
        }
        return true;                                // Operation successful
    }
            
    /**
     * Appends all the items from the passed list to the end of the 
     * current list
     * 
     * @param items the array to append on
     */
    public void addAll(T[] items) {
        if (items == null) return;                  // Error check
        for (int i = 0; i < items.length; i++) {    // Traverse array
            this.add(items[i]);                     // Add array item
        }
    }
    
    /**
     * Appends all the items from the passed list to the end of the 
     * current list
     * 
     * @param list the Linked list to append on
     */
    public void addAll(LinkedList<T> list) {
        if (list == null) return;                   // Error check
        for (int i = 0; i < list.size(); i++) {     // Traverse list
            this.add(list.get(i));                  // Get and add item
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
        if (items == null)   return;                // Error check
        if (!inRange(index)) return;                // Error check
        for (int i = 0; i < items.length; i++) {    // Traverse array
            this.addAfter(items[i], index);         // Add array item after
            index++;                                // Increase index
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
        if (list == null)    return;                // Error check
        if (!inRange(index)) return;                // Error check
        for (int i = 0; i < list.size(); i++) {     // Traverse list
            this.addAfter(list.get(i), index);      // Get and add item after
            index++;                                // Increase index
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
        if (!inRange(from)) return null;            // Index out of range
        if (!inRange(to))   return null;            // Index out of range
        if (from > to)      return null;            // Index not in line
        LinkedList<T> list = new LinkedList<>();    // Create list
        for (int i = from; i <= to; i++) {          // Traverse indices
            list.add(this.get(i));                  // Add to list from list
        }
        return list;                                // Return new list
    }
    
    /**
     * Mutates the list into a list only matching the contents of the array
     * 
     * @param array the data objects to form the list from
     */
    public final void fromArray(T[] array) {
        if (array == null) return;                  // Error check
        finalize();                                 // Wipe list memory
        for (T item : array) {                      // Traverse array
            add(item);                              // Add array item
        }
    }
    
    /**
     * Mutates list into a list only matching the contents of the other list
     * 
     * @param list the data objects to form the list from
     */
    public final void fromLinkedList(LinkedList<T> list) {
        if (list == null) return;                   // Error check
        finalize();                                 // Wipe list memory
        for (int i = 0; i < list.size(); i++) {     // Traverse list
            add(list.get(i));                       // Get and add item
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
                );                              // Create empty array
        for (int i = 0; i < length; i++) {      // Traverse list
            array[i] = get(i);                  // Add to array
        }
        return array;                           // Return completed array
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
}