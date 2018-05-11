
/** required package class namespace */
package collections;

/**
 * LinkedList.java - an implementation of a linked list abstract (advanced)
 * data (dynamic) type (ADT) and its useful methods
 *
 * @author Mr. Wachs 
 * @param <T> The generic type used 
 * @since Apr 26, 2018 
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
     * Default constructor for the class 
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
        if (!inRange(index)) return false;
        if (data == null)    return false;
        if (index == length-1) return addBack(data);
        else {
            Node node = new Node(data);
            Node current = getNode(index);            
            node.next = current.next;
            current.next.previous = node;
            current.next = node;
            node.previous = current;            
            length++;
            return true;
        }
     }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
