
/** required package class namespace */
package collections;


/**
 * LinkedList.java - an implementation of a linked list abstract (advanced)
 * data (dynamic) type (ADT) and its useful methods
 *
 * @author Mr. Wachs 
 * @param <T> The generic data type used in the class
 * @since 16-Nov-2018 
 */
public class LinkedList <T>
{

    /**
     * The number of nodes in the list, immutable property
     */
    private int length;
    
    /**
     * Reference (link) to the first node in the list (entry point)
     */
    private Node head;
    
    /**
     * Reference (link) to the last node in the list (entry point)
     */
    private Node tail;
        
    
    /**
     * Default constructor for the class, sets class properties
     */
    public LinkedList() {
        finalize();
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
        return super.equals(object);
    }
    
    /**
     * Creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public LinkedList clone() {
        LinkedList<T> list = new LinkedList<>();    // create new list memory
        for (int i = 0; i < length; i++) {          // traverse list
            list.addBack((T)this.getNode(i).data);  // get and add node data          
        }        
        return list;                                // new list returned
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
     * Determines if the list is empty (no content)
     * 
     * @return is empty (true) or not empty (false)
     */
    public boolean isEmpty() {
        return length == 0;                         // compares length to zero
    }
    
    /**
     * Accessor method for the number of nodes (the length) of the list
     * 
     * @return the number of nodes in the list
     */
    public int size() {
        return length;                              // encapsulated property
    }
    
    /**
     * Inserts data to the back (tail) of the list, for an (1) empty list, 
     * (2) list of 1 node, (3) list of > 1 node
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
     * Inserts data to the front (head) of the list, for an (1) empty list, 
     * (2) list of 1 node, (3) list of > 1 node
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
     * Checks to see if the index is in the range of the list
     * 
     * @param index the location to check
     * @return it is in range (true) or not (false)
     */
    private boolean inRange(int index) {
        if (isEmpty())      return false;
        if (index < 0)      return false;
        if (index > length) return false;
        return true;
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
