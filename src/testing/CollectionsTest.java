
/** required package class namespace */
package testing;

import collections.LinkedList;
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
        Node<String> d = new Node<>("waddle",c,b);
        
        // test the overloaded toString method
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());
        
        // test the equals method
        boolean result = false;
        result = a.equals(b);
        System.out.println("a==b is " + result);
        result = b.equals(c);
        System.out.println("b==c is " + result);
        result = c.equals(d);
        System.out.println("c==d is " + result);
        
        // test clone method
        Node<String> e = d.clone();
        System.out.println(e.toString());
        result = e.equals(d);
        System.out.println("e==d is " + result);
        
        // test finalize method
        e.finalize();
        System.out.println(e.toString());
        
        // create a linked list
        LinkedList<String> list = new LinkedList<>();
        
        // test methods
        System.out.println("Size is " + list.size());
        System.out.println("Empty is " + list.isEmpty());
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("\nCollections Test completed!\n");
    }

}
