
/** required package class namespace */
package collections;


/**
 * Node.java - a representation of a generic node for use with
 * a LinkedList object
 *
 * @author Mr. Wachs 
 * @param <T> The generic data type used in the class
 * @since 16-Nov-2018 
 */
public class Node <T>
{

    /**
     * The generic data stored in the node
     */
    public T data;
    
    /**
     * A reference (link) to the next node in the collection
     */
    public Node next;
    
    /**
     * A reference (link) to the previous node in the collection
     */
    public Node previous;
    
    
    /**
     * Default constructor for the class, sets class properties
     */
    public Node() {
        this(null,null,null);               // one constructor calls another
    }
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param data the generic data stored in the node
     */
    public Node(T data) {
        this(data,null,null);               // one constructor calls another
    }
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param data the generic data stored in the node
     * @param next reference (link) to the next node in the collection
     */
    public Node(T data, Node next) {
        this(data,next,null);               // one constructor calls another
    }
        
    /**
     * Constructor for the class, sets class properties
     * 
     * @param data the generic data stored in the node
     * @param next reference (link) to the next node in the collection
     * @param previous reference (link) to the previous node in the collection
     */
    public Node(T data, Node next, Node previous) {
        this.next     = next;               // set parameters to the properties
        this.previous = previous;
        this.data     = data;
    }    

    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        if (data == null) return "null";
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
        Node node = (Node)object;               // cast the object into a node
        return this.data.equals(node.data);     // compare node data
    }
    
    /**
     * Creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Node clone() {
        return new Node(
            this.data,
            this.next,
            this.previous);
    }
    
    /**
     * Wipes out all memory used by this object
     */
    @Override
    public void finalize() {
        data = null;
        next = previous = null;
    }

}
