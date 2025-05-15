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
 * @since May 2025
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
        this(null,null,null);
        // Instead of code like...
        // data = null;
        // next = null;
        // previous = null;
    }
    
    /**
     * Class constructor, sets the class properties
     * 
     * @param data the node data (generic)
     */
    public Node(T data) {
        this(data,null,null);
        // Instead of code like...
        // this.data = data;
        // next = null;
        // previous = null;
    }
    
    /**
     * Class constructor, sets the class properties
     * 
     * @param data the node data (generic)
     * @param next reference to the next Node object
     */
    public Node(T data, Node next) {
        // You can have one constructor method call another constructor method:
        this(data,next,null);        
        // Instead of code like...
        // this.data = data;
        // this.next = next;
        // previous = null;
    }
    
    /**
     * Class constructor, sets the class properties. Another option when 
     * creating multiple constructors (overloading) write the constructor with
     * ALL the possible arguments first. You can use other constructors to 
     * call this one.
     * 
     * @param data the node data (generic)
     * @param next reference to the next Node object
     * @param previous reference to the previous Node object
     */
    public Node(T data, Node next, Node previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
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