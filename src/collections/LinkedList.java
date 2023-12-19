
/** Required package class namespace */
package collections;

 
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
    
}