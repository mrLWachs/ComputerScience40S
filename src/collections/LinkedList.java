
/** Required package class namespace */
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
 * @param <T> The generic data type used in the class
 * @since 8-Dec-2021, 11:58:01 AM
 */
public class LinkedList <T>
{
    
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
        return "LinkedList: " + super.toString();
    }
   
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
       
    /**
     * a Deep clone, creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public LinkedList clone() {
        return this;
    }
    
}