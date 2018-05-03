
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
        return length;
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
    
    
    
    public void add(T data) {
        
    }
    
    
    
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return super.toString();
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
    public LinkedList clone() {
        return this;
    }

}
