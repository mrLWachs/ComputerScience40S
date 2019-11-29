
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
        
        // build some node objects, testing various constructors
        Node<String> a = new Node<>();
        Node<String> b = new Node<>("duck");
        Node<String> c = new Node<>("waddle",a);
        Node<String> d = new Node<>("bread",c,b);
        
        // text the overloaded toString method
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("\nCollections Test completed!\n");
    }

}
