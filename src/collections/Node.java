
/** Required package class namespace */
package collections;

 
/**
 * Node.java - a representation of a generic node for use with
 * a LinkedList object, and could be "visualized" as:
 * 
 *                      NODE
 *                +--------------+
 * previous <---- |              |
 *                |     data     |
 *                |   (generic)  |
 *                |              |----> next
 *                +--------------+
 *
 * @author Mr. Wachs
 * @param <T> The generic data type used in the class
 * @since Dec 6, 2023, 10:38:48 a.m.
 */
public class Node <T>
{

    /** The generic data type the node stores */
    public T data;
    
    /** 
     * Self reference (pointer, link) to the next node that 'will' be
     * in a 'chain' (linked list)
     */
    public Node next;
    
    /** Link / pointer / reference to the previous (back) node */
    public Node previous;
    
    
    
    
    /**
     * Default constructor, set class properties
     */
    public Node() {
        
    }
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Node: " + super.toString();
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
    public Node clone() {
        return this;
    }
    
}
