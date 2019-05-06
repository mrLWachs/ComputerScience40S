
/** required package class namespace */
package collections;


/**
 * Node.java - a representation of a generic node for use with
 * a LinkedList object
 *
 * @author Mr. Wachs 
 * @param <T> the generic data type used in the class
 * @since 6-May-2019 
 */
public class Node <T>
{

    /** Self reference (link) to the next node in the "chain" */
    Node next;
    /** Self reference (pointer) to the previous node in the "list" */
    Node previous;    
    /** the generic data to remember */
    T data;
    
    
    /**
     * Default constructor for the class, sets class properties
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
        return "Node " + super.toString();
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
    public Node clone() {
        return this;
    }

}
