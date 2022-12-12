
/** Required package class namespace */
package testing;

import collections.Node;

 
/**
 * CollectionsTest.java - tests the concepts learned in this unit.
 *
 * @author Mr. Wachs
 * @since 7-Dec-2022, 11:46:45 AM
 */
public class CollectionsTest 
{

    /**
     * Default constructor, set class properties
     */
    public CollectionsTest() {
        System.out.println("\nCollections testing begins...\n");
        
        // Create some node objects...
        System.out.println("\nTesting constructors.........................\n");
        Node<String> a = new Node<>();
        Node<String> b = new Node<>("Sassaffras");
        Node<String> c = new Node<>("Pros", b);
        Node<String> d = new Node<>("Joes", c, b);
        
        // Output our nodes...
        System.out.println("\nTesting toString()...........................\n");
        System.out.println("Node a = " + a.toString());
        System.out.println("Node b = " + b.toString());
        System.out.println("Node c = " + c.toString());
        System.out.println("Node d = " + d.toString());
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("\nCollections testing complete!\n");
    }
     
}