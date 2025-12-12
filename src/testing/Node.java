/** Required package class namespace */
package testing;
 
/**
 * Node.java - description
 *
 * @author YOUR NAME
 * @since Dec 12, 2025, 9:28:44 AM
 */
class Node<T> 
{

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