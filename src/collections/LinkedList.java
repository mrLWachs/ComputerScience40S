
/** required package class namespace */
package collections;

 
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
 * @param <T> the generic data type used in the class
 * @since 6-May-2019 
 */
public class LinkedList <T>
{
    
    /** Reference (link) to the first (front) node in the list (entry point) */
    private Node head;
    
    /** Reference (link) to the last (back) node in the list (entry point) */
    private Node tail;
    
    /** The number of nodes in the list, immutable property */
    private int length;
    
    /**
     * Default constructor, set class properties
     */
    public LinkedList() {
        finalize();
    }
    
    /**
     * Determines if the list is empty (no content)
     * 
     * @return is empty (true) or not empty (false)
     */
    public boolean isEmpty() {
        return length == 0;
    }
    
    /**
     * Accessor method of the immutable property
     * 
     * @return the number of nodes in the list
     */
    public int size() {
        return length;
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
        // Scenarios to consider:    
        // 1) empty list
        // 2) list of 1 or more nodes
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
        if (!inRange(index)) return false;          // invalid index
        if (data == null)    return false;          // invalid data
        Node current = getNode(index);              // get to node at index
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
        if (isEmpty()) return null;             // no front to remove
        T data = (T)head.data;                  // store head data
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
        T data = (T)tail.data;                  // store tail data
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
    
    
    
    
    
    
    
    
    
    /******************************************************************
     * MORE METHODS TO COME........
     ******************************************************************/
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        if (isEmpty()) return "Empty LinkedList";       // no nodes to display
        String text = "Linked List [";                  // starting character
        Node current = head;                            // start at head node
        while (current.next != null) {                  // traverse list
            text += current.toString() + ",";           // append data
            current = current.next;                     // move to next node
        }            
        return text + current.toString() + "]";         // append end character      
    }
        
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        LinkedList<T> that = (LinkedList<T>)object;     // cast object to list
        if (this.size() != that.size()) return false;   // not same sizes      
        Node current1 = this.getFirstNode();            // get reference to
        Node current2 = that.getFirstNode();            // nodes in each list    
        while (current1 != null) {                      // traverse lists
            if (!current1.equals(current2)) {           // not equal data 
                return false;                           // not equal lists
            }                
            current1 = current1.next;                   // move each reference
            current2 = current2.next;                   // to next node
        }
        return true;                                    // lists are equal
    }
        
    /**
     * a Deep clone, creates a duplicate object using new memory
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
    public void finalize() {
        length = 0;                 // length set to zero
        head = tail = null;         // references set to nulls
        System.gc();                // runs the garbage collector in Java
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
     * Accesses the node reference for this index location
     * 
     * @param index the index location
     * @return a reference to the node at this index or null
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
        
}
