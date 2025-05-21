/** Required package class namespace */
package testing;
 
/** Required API imports */
import collections.Node;
import collections.LinkedList;


/**
 * CollectionsTest.java - tests the concepts learned in this unit.
 *
 * @author Mr. Wachs
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
        
        // Output our nodes...
        System.out.println("\nTesting Node toString()......................\n");
        System.out.println("Node a = " + a.toString());
        System.out.println("Node b = " + b.toString());
        System.out.println("Node c = " + c.toString());
        System.out.println("Node d = " + d.toString());
        
        // Clone a node...
        System.out.println("\nTesting Node clone().........................\n");
        Node<String> e = a.clone();
        Node<String> f = b.clone();
        Node<String> g = c.clone();
        Node<String> h = d.clone();
        System.out.println("Node e = " + e.toString());
        System.out.println("Node f = " + f.toString());
        System.out.println("Node g = " + g.toString());
        System.out.println("Node h = " + h.toString());
        
        // Check if nodes are equal...
        System.out.println("\nTesting Node equal().........................\n");
        System.out.println("Node a == b? -> " + a.equals(b));
        System.out.println("Node b == c? -> " + b.equals(c));
        System.out.println("Node c == d? -> " + c.equals(d));
        System.out.println("Node d == d? -> " + d.equals(d));
        System.out.println("Node e == a? -> " + e.equals(a));
        System.out.println("Node f == b? -> " + f.equals(b));
        System.out.println("Node g == c? -> " + g.equals(c));
        System.out.println("Node h == d? -> " + h.equals(d));
        
        // finalize some nodes (wipe em out, "destroy" them, free up memory)
        System.out.println("\nTesting Node finalize()......................\n");
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
        System.out.println("\nTesting default LinkedList constructor.......\n"); 
        
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        
        // Test isEmpty() method...............................................
        System.out.println("L1 empty? -> " + list1.isEmpty());
        System.out.println("L2 empty? -> " + list2.isEmpty());
        
        // Test size() method..................................................
        System.out.println("L1 size -> " + list1.size());
        System.out.println("L2 size -> " + list2.size());
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("\nTest add (first to the back) of the list.....\n");        
        System.out.println("addBack -> " + list1.addBack(51)   + "\t" + list1);
        System.out.println("addBack -> " + list1.addBack(50)   + "\t" + list1);
        System.out.println("addBack -> " + list1.addBack(-50)  + "\t" + list1);
        System.out.println("addBack -> " + list1.addBack(55)   + "\t" + list1);
        System.out.println("addBack -> " + list1.addBack(null) + "\t" + list1);
        
        ////////////////////////////////////////////////////////////////////////        
        System.out.println("\nTest add (second to the front) of the list...\n");        
        System.out.println("addFront -> " + list1.addFront(80)   + "\t" + list1);
        System.out.println("addFront -> " + list1.addFront(81)   + "\t" + list1);
        System.out.println("addFront -> " + list1.addFront(-80)  + "\t" + list1);
        System.out.println("addFront -> " + list1.addFront(88)   + "\t" + list1);
        System.out.println("addFront -> " + list1.addFront(null) + "\t" + list1);
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("\nRe-testing empty, size methods...............\n");  
        System.out.println("L1 empty? -> " + list1.isEmpty() + "\t" + list1);
        System.out.println("L2 empty? -> " + list2.isEmpty() + "\t" + list2);
        System.out.println("L1 size -> "   + list1.size()    + "\t" + list1);
        System.out.println("L2 size -> "   + list2.size()    + "\t" + list2);
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("\nTest get method..............................\n");
        for (int i = 0-1; i < list1.size()+1; i++) {
            Integer value = list1.get(i);
            System.out.println("Getting " + i + " = " + value + "\t" + list1);
        }
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("\nTest set method..............................\n");
        for (int i = 0-1; i < list1.size()+1; i++) {
            Integer value = new Integer(i+10);
            System.out.println("Setting " + i + " to " + value + " -> " + 
                               list1.set(i, value) + "\t" + list1);
        }
        System.out.println("Setting 0 to null -> " + list1.set(0, null) + 
                           "\t" + list1);
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("\nTest equals method...........................\n");
        System.out.println("List 1 = " + list1.toString());
        System.out.println("List 2 = " + list2.toString());
        System.out.println("List1 == List2 -> " + list1.equals(list2));
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("\nTest clone method............................\n");
        list2 = list1.clone();
        System.out.println("List 1 = " + list1.toString());
        System.out.println("List 2 = " + list2.toString());
        System.out.println("Re-testing equals...");
        System.out.println("List1 == List2 -> " + list1.equals(list2));
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("\nTest addAfter method.........................\n");
        int size = list1.size();
        for (int i = 0-1; i < size; i++) {
            int number = i + 100;
            Integer value = new Integer(number);
            System.out.println("Adding value \t"   + value                   + 
                               "\t after index \t" + i                       + 
                               "\t result \t"      + list1.addAfter(value,i) + 
                               "\t"                + list1.toString());            
        }
        System.out.println("Test other edge case");
        size = list1.size()+1; 
        System.out.println("Adding value \t"   + 10                      + 
                           "\t after index \t" + size                    + 
                           "\t result \t"      + list1.addAfter(10,size) + 
                           "\t"                + list1.toString());
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("\nTest addBefore method.........................\n");
        size = list1.size();
        for (int i = 0-1; i < size; i++) {
            int number = i + 100;
            Integer value = new Integer(number);
            System.out.println("Adding value \t"   + value                   + 
                               "\t before index \t" + i                       + 
                               "\t result \t"      + list1.addBefore(value,i) + 
                               "\t"                + list1.toString());            
        }
        System.out.println("Test other edge case");
        size = list1.size()+1; 
        System.out.println("Adding value \t"   + 10                      + 
                           "\t before index \t" + size                    + 
                           "\t result \t"      + list1.addBefore(10,size) + 
                           "\t"                + list1.toString());
        
        
    }
     
}