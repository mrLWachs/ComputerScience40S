
/** required package class namespace */
package collections;

/**
 * Node.java - a representation of a generic node for use with
 * a LinkedList object
 *
 * @author Mr. Wachs 
 * @param <T> the generic data type used in the class
 * @since Apr 26, 2018 
 * @instructor Mr. Wachs
 */
public class Node <T>
{

    /**
     * Generic data to remember
     */
    public T data;
    
    /**
     * Self reference (link) to the next node in the "chain"
     */
    public Node next;
    
    /**
     * Self reference (link) to the previous node in the "chain"
     */
    public Node previous;
    
 
    /** 
     * Default constructor for the class 
     */
    public Node() {
        this(null);
    }

    /**
     * Class constructor sets class properties 
     * 
     * @param data the Node data
     */
    public Node(T data) {
        this(data,null,null);
    }
    
    /**
     * Class constructor sets class properties 
     * 
     * @param data the node data
     * @param next reference to the next Node object
     */
    public Node(T data, Node next) {
        this(data,next,null);
    }
    
    /**
     * Class constructor sets class properties 
     * 
     * @param data the node data
     * @param next reference to the next Node object
     * @param previous reference to the previous Node object
     */
    public Node(T data, Node next, Node previous) {
        this.data     = data;
        this.next     = next;
        this.previous = previous;
    }
    
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        if (data == null) return null;
        return data.toString();
    }

    /**
     * Determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        Node node = (Node)object;
        return data.equals(node.data);       
    }

    /**
     * Creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    public Node clone() {
        return this;
    }

}
