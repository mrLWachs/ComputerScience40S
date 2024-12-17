/** Required package class namespace */
package testing.extras.trees;

/** Required API imports */
import java.io.Serializable;

 
/**
 * BinaryTreeNode.java - representation of a generic node for use with a binary
 * tree object.It could be visualized as:
 
                    BinaryTreeNode
                 +-----------------+
                 |      data       |
                 +-----------------+
                 |  left  |  right |
                 +-----------------+
                    /           \
                   /             \
            BinaryTreeNode   BinaryTreeNode
 *
 * @author Mr. Wachs
 * @param <T> Generic data property
 * @since June 2023
 */
public class BinaryTreeNode <T extends Comparable<T> > implements Serializable
{

    /** 
     * The class data property (a generic object)
     */
    public T data;   
    
    /** 
     * Self reference to the left node object (sub-tree)
     */
    public BinaryTreeNode left;
    
    /** 
     * Self reference to the right node object (sub-tree)
     */
    public BinaryTreeNode right;
    
    
    /**
     * Class constructor sets class property data
     * 
     * @param data the generic data for the class
     */
    public BinaryTreeNode(T data) {
        this(data, null, null);
    }
     
    /**
     * Class constructor sets class property data
     * 
     * @param data the generic data for the class
     * @param left reference to the left sub-tree
     * @param right reference to the right sub-tree 
     */
    public BinaryTreeNode(T data, BinaryTreeNode left, BinaryTreeNode right) {
        this.data  = data;
        this.left  = left;
        this.right = right;              
    }
    
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return data.toString();
    }
   
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        BinaryTreeNode that = (BinaryTreeNode)object;     // Cast object to node
        try {
            return this.data.equals(that.data);     // Use internal data equals
        }
        catch (NullPointerException error) {        // Null parameter
            System.out.println("null error");
            return false;
        } 
        catch(ClassCastException error) {           // Casting error
            System.out.println("Casting error");
            return false;
        }
    }
       
    /**
     * a Deep clone, creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public BinaryTreeNode clone() {
        return new BinaryTreeNode<>(this.data);
    }
    
    /**
     * Insets data (recursively) into the binary tree at its correct position
     * 
     * @param data the generic data to insert into the tree
     * @return the operation was successful (true) or not (false)
     */
    public boolean insert(T data) {
        if (data == null) return false;             // Error check
        // Decide which sub-tree the data goes into...
        if (data.compareTo(this.data) < 0) {        // Means we insert left
            // Nest a check if we are inserting a this spot...
            if (this.left == null) {
                this.left = new BinaryTreeNode<>(data);   // Insert here
            }
            else {                                  // Insert recursively
                this.left.insert(data);
            }            
        }
        else if (data.compareTo(this.data) >= 0) {  // Means we insert right
            if (this.right == null) {
                this.right = new BinaryTreeNode<>(data);  // Insert here
            }
            else {                                  // Insert recursively
                this.right.insert(data);
            } 
        }
        return true;                                // Completed successfully
    }
    
}