
/** required package class namespace */
package collections;

/**
 * LinkedList.java - an implementation of a linked list abstract (advanced)
 * data (dynamic) type (ADT) and its useful methods
 *
 * @author Mr. Wachs 
 * @since Apr 26, 2018 
 * @instructor Mr. Wachs
 */
public class LinkedList <T>
{

    private Node head;  // entry point - front of the list
    private Node tail;  // entry point - back of the list
    private int length; // count of all nodes
        
    
    /** 
     * Default constructor for the class 
     */
    public LinkedList() {
        finalize();
    }
    
    public boolean isEmpty() {
        return length == 0;
    }
    
    /**
     * Accessor method of the number of nodes
     * 
     * @return the length of the list
     */
    public int size() {
        return length;
    }
    
    @Override
    public final void finalize() {
        length = 0;
        head = tail = null;
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
