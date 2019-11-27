

/** required package class namespace */
package collections;

 
/**
 * Node.java - description
 *
 * @author Mr. Wachs
 * @since Nov. 25, 2019, 11:33:57 a.m.
 */
public class Node <T>
{

    // the content (data)
    public T data;
    
    // the link to another node (self-referenceing class)
    
    public Node next;
    
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
