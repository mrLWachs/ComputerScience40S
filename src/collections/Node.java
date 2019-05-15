
/** required package class namespace */
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
 * @param <T> the generic data type used in the class
 * @since 6-May-2019 
 */
public class Node <T>
{

    /** Self reference (link) to the next node in the "chain" */
    public Node next;
    /** Self reference (pointer) to the previous node in the "list" */
    public Node previous;    
    /** the generic data to remember */
    public T data;
    
    
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
     * Class constructor sets class properties 
     * 
     * @param data the Node data
     */
    public Node(T data) {
        this.data = data;
        this.next = this.previous = null;
    }
    
    /** 
     * Default constructor for the class 
     */
    public Node() {
        this(null,null,null);
    }
    
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        if (data == null) return "Node " + null;    // invalid data, output null
        return data.toString();                     // output data in node
    }
        
    /**
     * Determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        if (object == null) return false;       // error check
        Node node = (Node)object;               // cast object into node
        return data.equals(node.data);          // compare data in nodes
    }

    /**
     * Creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Node clone() {
        return new Node(this.data);             // annoynmous object
    }

    /**
     * Frees up all memory used by this object
     */
    @Override
    public void finalize() {
        data = null;
        next = previous = null;
        System.gc();
    }
        
}
