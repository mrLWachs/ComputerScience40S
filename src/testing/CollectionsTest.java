
/** required package class namespace */
package testing;

import collections.Node;

 
/**
 * CollectionsTest.java - description
 *
 * @author Mr. Wachs
 * @since Nov. 25, 2019, 11:12:06 a.m.
 */
public class CollectionsTest 
{

    /**
     * Default constructor, set class properties
     */
    public CollectionsTest() {
        System.out.println("\nCollections Test started...\n");
        
        Node<String> a = new Node<>();
        Node<String> b = new Node<>("donut");
        Node<String> c = new Node<>("chicken",a,b);
        
        Node<String> d = new Node<>("pee",a,c);        
        Node<String> e = new Node<>("poop",c,d);        
        Node<String> f = new Node<>("fart");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("\nCollections Test completed!\n");
    }

}
