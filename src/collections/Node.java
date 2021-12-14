
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
        String text = "";
        
        // Display the data stored in the node (or null)
        if (data == null) text += "null";               // Invalid data 
        else              text += data.toString();      // Generic has toString
                
        // Display the connection to the next node
        text += "\t";
        if      (next      == null) text += "n -> null";
        else if (next.data == null) text += "n -> node";
        else                        text += "n -> " + next.data.toString();
        
        // Display the connection to the previous node 
        text += "\t";
        if      (previous      == null) text += "p -> null";
        else if (previous.data == null) text += "p -> node";
        else                            text += "p -> " + previous.data.toString();
                
        // Add the memory address of this node
        text += "\t" + super.toString();
        
        // Return all the data compiled
        return text;
    }
   
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        // Error check first for nulls appearing which could cause crashes
        if (this.data == null) return false;    // Data inside this object
        if (object    == null) return false;    // Parameter sent to this method
        // Convert (cast) the object into a "Node"
        Node that = (Node)object;
        if (that.data == null) return false;    // Data inside the parameter
        // Now compare both data properties
        return this.data.equals(that.data);        
        // Same kind of code as...
//        T dataFromThisClass = (T)this.data;
//        T dataFromParameter = (T)that.data;        
//        if (dataFromThisClass.equals(dataFromParameter)) {
//            return true;
//        }
//        else {
//            return false;
//        }
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
    
    /**
     * Frees up all memory used by this object, and it is called when this 
     * object is "deleted" or "removed" or "destroyed"
     */
    @Override
    public void finalize() {
        data = null;
        next = previous = null;     // Simplified line of code
        System.gc();                // Runs the garbage collector in Java
        // The 'garbage collector' is how Java manages memory. References to 
        // 'memory' locations (e.g. variables, objects, etc.) that do not 
        // contain actual data (for example a null) can be considered 'garbage'
        // wastes of memory and should be 'cleaned up'. This means the memory 
        // can be 'freed up' so other parts of the program could use that 
        // memory and the memory isn't wasted. Java does do this automatically
        // (like C# it has "automatic garbage collection") when it 'finds the 
        // time' in the execution cycle, but you can make Java do it 
        // explicitly by running the line above.
    }
    
}