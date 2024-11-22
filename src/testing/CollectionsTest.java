/** Required package class namespace */
package testing;
 
import collections.Node;


/**
 * CollectionsTest.java - description
 *
 * @author Mr. Wachs
 * @since Nov 18, 2024, 11:55:31 a.m.
 */
public class CollectionsTest 
{

    /**
     * Default constructor, set class properties
     */
    public CollectionsTest() {
        System.out.println("Start learning collections...");
        
        // Create some node objects...
        System.out.println("\nTesting Node constructors....................\n");
        Node<String> a = new Node<>();
        Node<String> b = new Node<>("Pros");
        Node<String> c = new Node<>("Joes", b);
        Node<String> d = new Node<>("cat", c, b);
        
        // Output our nodes...
        System.out.println("\nTesting Node toString()......................\n");
        System.out.println("Node a = " + a.toString());
        System.out.println("Node b = " + b.toString());
        System.out.println("Node c = " + c.toString());
        System.out.println("Node d = " + d.toString());
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("Completed learning collections!");
    }
    
}