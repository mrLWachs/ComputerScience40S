
/** Required package class namespace */
package testing;

import collections.LinkedList;
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
        Node<String> b = new Node<>("Sass");
        Node<String> c = new Node<>("Pros", b);
        Node<String> d = new Node<>("Joes", c, b);
        
        // Output our nodes...
        System.out.println("\nTesting toString()...........................\n");
        System.out.println("Node a = " + a.toString());
        System.out.println("Node b = " + b.toString());
        System.out.println("Node c = " + c.toString());
        System.out.println("Node d = " + d.toString());
        
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
        
        // Check if nodes are equal...
        System.out.println("\nTesting equal()..............................\n");
        System.out.println("Node a == b? -> " + a.equals(b));
        System.out.println("Node b == c? -> " + b.equals(c));
        System.out.println("Node c == d? -> " + c.equals(d));
        System.out.println("Node d == d? -> " + d.equals(d));
        System.out.println("Node e == a? -> " + e.equals(a));
        System.out.println("Node f == b? -> " + f.equals(b));
        System.out.println("Node g == c? -> " + g.equals(c));
        System.out.println("Node h == d? -> " + h.equals(d));
        
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
        
        // Create a LinkedList object to test the constructor
        System.out.println("\nTesting default LinkedList constructor.........");        
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        
        // Test toString() method (before I add anything into the list)........
        System.out.println("\nTesting toString, empty, size methods..........");        
        System.out.println("L1 -> " + list1.toString());
        System.out.println("L2 -> " + list2.toString());
        
        // Test isEmpty() method...............................................
        System.out.println("L1 empty? -> " + list1.isEmpty());
        System.out.println("L2 empty? -> " + list2.isEmpty());
        
        // Test size() method..................................................
        System.out.println("L1 size -> " + list1.size());
        System.out.println("L2 size -> " + list2.size());
        
        // More testing, explained in the outputs..............................
        System.out.println("\nTest add (first to the back) of the list.......");
        
        System.out.println("addBack->" + list1.addBack(5)    + ":" + list1);
        System.out.println("addBack->" + list1.addBack(50)   + ":" + list1);
        System.out.println("addBack->" + list1.addBack(-5)   + ":" + list1);
        System.out.println("addBack->" + list1.addBack(55)   + ":" + list1);
        System.out.println("addBack->" + list1.addBack(null) + ":" + list1);
                
        System.out.println("\nTest add (second to the front) of the list.....");        
        System.out.println("addFront->" + list1.addFront(8)    + ":" + list1);
        System.out.println("addFront->" + list1.addFront(80)   + ":" + list1);
        System.out.println("addFront->" + list1.addFront(-8)   + ":" + list1);
        System.out.println("addFront->" + list1.addFront(88)   + ":" + list1);
        System.out.println("addFront->" + list1.addFront(null) + ":" + list1);
        
        System.out.println("\nRe-testing empty, size methods.................");  
        System.out.println("L1 empty? -> " + list1.isEmpty());
        System.out.println("L2 empty? -> " + list2.isEmpty());
        System.out.println("L1 size -> " + list1.size());
        System.out.println("L2 size -> " + list2.size());
        
        System.out.println("\nTest get method..............................\n");
        for (int i = 0-1; i < list1.size()+1; i++) {
            Integer value = list1.get(i);
            System.out.println("Getting list " + i + " = " + value);
        }
        
        System.out.println("\nTest set method..............................\n");
        for (int i = 0-1; i < list1.size()+1; i++) {
            Integer value = new Integer(i+10);
            System.out.println("Setting list " + i + " to " + (i+10) +
                    " result = " + list1.set(i, value));
            System.out.println(list1);
        }
        System.out.println("Setting list 0 to null result = " + 
                list1.set(0, null));
        System.out.println(list1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("\nCollections testing complete!\n");
    }
     
}