
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
 * @since 8-Dec-2021, 11:58:50 AM
 */
public class Node <T>
{

    /** The generic data type stored */
    public T data;
    
    /** 
     * Self reference (pointer,link) to the next node that 'will' be
     * in a 'chain' (linked list)
     */
    public Node next;
    
    /** Link / pointer / reference to the previous (back) node */
    public Node previous;
    
    
    /**
     * Class constructor, sets the class properties
     * 
     * @param data the node data (generic)
     * @param next reference to the next Node object
     * @param previous reference to the previous Node object
     */
    public Node(T data, Node next, Node previous) {
        this.data     = data;
        this.next     = next;
        this.previous = previous;
        // We assign the parameters of this method to the properties of this 
        // class (the global variables of the class)        
    }
    
    /**
     * Class constructor, sets the class properties
     * 
     * @param data the node data (generic)
     * @param next reference to the next Node object
     */
    public Node(T data, Node next) {
        this.data     = data;
        this.next     = next;
        this.previous = null;       
    }
    
    
    /**
     * Class constructor, sets the class properties
     * 
     * @param data the node data (generic)
     */
    public Node(T data) {
        this.data     = data;
        this.next     = null;
        this.previous = null;       
    }
        
    /**
     * Default constructor, set class properties
     */
    public Node() {
        // As an option, you can have one constructor call another constructor
        // (methods can other methods) - but constructors, in Java we use the
        // keyword "this"
        this(null,null,null);
    }
        
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        if (data == null) return "null";    // Invalid data
        return data.toString();             // Generic has toString
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
        return new Node(this.data, this.next, this.previous);
        // Annoynmous clone object created and returned
    }
    
}