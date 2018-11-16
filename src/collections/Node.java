/*
 *  Mr. Wachs' classes - Java Computer Science learning file Node.java
 *  for project ComputerScience40S on 16-Nov-2018 at 10:41:54 AM by lawrence.wachs
 */


/** required package class namespace */
package collections;



/**
 * Node.java - 
 *
 * @author Mr. Wachs 
 * @since 16-Nov-2018 
 */
public class Node 
{

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
