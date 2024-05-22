/** Required package class namespace */
package collections;

/**
 * Node.java - a representation of a generic node for use with a LinkedList
 * object (could be thought of a "link" in the "chain") - we need need the Node
 * to build the LinkedList (aka LinkedList "has a" Node).
 *                      NODE
 *                +--------------+
 * previous <---- |              |
 *                |     data     |
 *                |   (generic)  |
 *                |              |----> next
 *                +--------------+
 *
 * @author YOUR NAME
 * @param <T> The generic data type used in the class
 * @since May 16, 2024, 9:29:10 a.m.
 */
public class Node <T> 
{

    /**
     * The generic data type the node stores
     */
    public T data;
    
    /** 
     * Self reference (pointer, link) to the next node that 'will' be
     * in a 'chain' (linked list)
     */
    public Node next;
    
    /** Link / pointer / reference to the previous (back) node */
    public Node previous;
    

    
}
