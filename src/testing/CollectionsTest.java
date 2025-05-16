/** Required package class namespace */
package testing;
 
/** Required API imports */
import collections.Node;


/**
 * CollectionsTest.java - tests the concepts learned in this unit.
 *
 * @author YOUR NAME
 * @since May 15, 2025, 10:11:48 a.m.
 */
public class CollectionsTest 
{

    /**
     * Default constructor, set class properties
     */
    public CollectionsTest() {
        System.out.println("\nCollections testing begins...\n");
        
        // Create some node objects...
        System.out.println("\nTesting Node constructors....................\n");
        Node<String> a = new Node<>();
        Node<String> b = new Node<>("Pros");
        Node<String> c = new Node<>("Joes", b);
        Node<String> d = new Node<>("Huskies", c, b);
        
        
    }
     
}