
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
public class LinkedList 
{
    
    /** Reference (link) to the first (front) node in the list (entry point) */
    private Node head;
    
    /** Reference (link) to the last (back) node in the list (entry point) */
    private Node tail;

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
