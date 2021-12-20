
/** Required package class namespace */
package testing;

import collections.LinkedList;
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
        System.out.println("\nCollections Test started...\n");
        
        // Create some node objects...
        System.out.println("\nTesting constructors.........................\n");
        Node<String> a = new Node<>();
        Node<String> b = new Node<>("Meat");
        Node<String> c = new Node<>("Cheese",b);
        Node<String> d = new Node<>("Sauce",c,b);
        
        // Output my nodes...
        System.out.println("\nTesting toString()...........................\n");
        System.out.println("Node a = " + a.toString());
        System.out.println("Node b = " + b.toString());
        System.out.println("Node c = " + c.toString());
        System.out.println("Node d = " + d.toString());
        
        // Check if Nodes are equal...
        System.out.println("\nTesting equals().............................\n");
        System.out.println("Node a == b? -> " + a.equals(b));
        System.out.println("Node b == c? -> " + b.equals(c));
        System.out.println("Node a == a? -> " + a.equals(a));
        System.out.println("Node b == b? -> " + b.equals(b));
                
        // Clone a node...
        System.out.println("\nTesting clone()..............................\n");
        Node<String> e = a.clone();
        Node<String> f = b.clone();
        Node<String> g = c.clone();
        Node<String> h = d.clone();
        System.out.println("Node e = " + e.toString());
        System.out.println("Node f = " + f.toString());
        System.out.println("Node g = " + g.toString());
        System.out.println("Node h = " + h.toString());
        
        // Check if Nodes are equal...
        System.out.println("\nTesting equals().............................\n");
        System.out.println("Node a == b? -> " + a.equals(b));
        System.out.println("Node b == c? -> " + b.equals(c));
        System.out.println("Node c == d? -> " + c.equals(d));
        System.out.println("Node a == e? -> " + a.equals(e));
        System.out.println("Node b == f? -> " + b.equals(f));
        System.out.println("Node c == g? -> " + c.equals(g));
        System.out.println("Node d == h? -> " + d.equals(h));
        
        // finalize some nodes (wipe em out, "destroy" them, free up memory)
        System.out.println("\nTesting finalize()...........................\n");
        System.out.println("Node a = " + a.toString());
        System.out.println("Node b = " + b.toString());
        System.out.println("Node c = " + c.toString());
        System.out.println("Node d = " + d.toString());
        System.out.println("Node e = " + e.toString());
        System.out.println("Node f = " + f.toString());   
        System.out.println("Node g = " + g.toString());   
        System.out.println("Node h = " + h.toString());   
        a.finalize();
        b.finalize();
        c.finalize();
        d.finalize();
        e.finalize();
        f.finalize();  
        g.finalize();  
        h.finalize();  
        System.out.println("Node a = " + a.toString());
        System.out.println("Node b = " + b.toString());
        System.out.println("Node c = " + c.toString());
        System.out.println("Node d = " + d.toString());
        System.out.println("Node e = " + e.toString());
        System.out.println("Node f = " + f.toString());
        System.out.println("Node g = " + g.toString());
        System.out.println("Node h = " + h.toString());
        
        // Create a LinkedList to test the constructor
        System.out.println("\nTesting default LinkedList constructor.......\n");
        
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        
        // Test isEmpty method (before I add anything to the list)
        System.out.println("\nTesting isEmpty method......................\n");        
        System.out.println("L1 empty? -> " + list1.isEmpty());
        
        // Test size method (before I add anything to the list)
        System.out.println("\nTesting size method.........................\n");        
        System.out.println("L1 size? -> " + list1.size());
        
        // Test toString method (before I add anything to the list)
        System.out.println("\nTesting toString method.....................\n");        
        System.out.println(list1.toString());
        
        System.out.println("\nTest addBack method.........................\n");        
        list1.addBack(5);
        list1.addBack(50);
        list1.addBack(500);
        list1.addBack(-5);
        list1.addBack(-50);        
        System.out.println(list1.toString());
        
        System.out.println("\nTest addFront method.........................\n");        
        list1.addFront(-60); 
        list1.addFront(-6);
        list1.addFront(600);
        list1.addFront(60);
        list1.addFront(6);
        System.out.println(list1.toString());
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("\nCollections Test complete!\n");
    }
    
}