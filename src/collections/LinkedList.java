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
 * @since May 2025
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