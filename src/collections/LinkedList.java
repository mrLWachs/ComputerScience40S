
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
     * Default constructor for the class, sets class properties
     */
    public LinkedList() {
        finalize();
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
     * Accessor method of the immutable property
     * 
     * @return the number of nodes in the list
     */
    public int size() {
        return length;                              // encapsulated property
    } 
    
    /**
     * Inserts data into the front (head) of the list
     * 
     * @param data the data type to add
     * @return the operation was successful (true) or not (false)
     */
    public boolean addFront(T data) {
        
        
        return true;
    }
    
    
    
    
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "LinkedList " + super.toString();
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
        return this;
    }

}
