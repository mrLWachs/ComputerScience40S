
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
 * @since May 2026
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
    
    
}