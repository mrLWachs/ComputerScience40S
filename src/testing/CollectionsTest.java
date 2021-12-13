
/** Required package class namespace */
package testing;

import collections.Node;

 
/**
 * CollectionsTest.java - tests the concepts learned in this unit
 *
 * @author Mr. Wachs
 * @since 8-Dec-2021, 11:37:02 AM
 */
public class CollectionsTest 
{

    /**
     * Default constructor, set class properties
     */
    public CollectionsTest() {
        System.out.println("Collections Test started...");
        
        // Create some node objects...
        Node<String> a = new Node<>();
        Node<String> b = new Node<>("Meat");
        Node<String> c = new Node<>("Cheese",a);
        Node<String> d = new Node<>("Sauce",b,c);
        
        // Output my nodes...
        System.out.println("Node a = " + a.toString());
        System.out.println("Node b = " + b.toString());
        System.out.println("Node c = " + c.toString());
        System.out.println("Node d = " + d.toString());
        
        // Check if Nodes are equal...
        System.out.println("Does a == b? -> " + a.equals(b));
        System.out.println("Does b == c? -> " + b.equals(c));
        
        // Clone a node...
        Node<String> e = a.clone();
        Node<String> f = d.clone();
        
        // Check if Nodes are equal...
        System.out.println("Does e == a? -> " + e.equals(a));
        System.out.println("Does f == d? -> " + f.equals(d));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("Collections Test complete!");
    }
    
}