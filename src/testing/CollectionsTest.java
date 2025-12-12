/** Required package class namespace */
package testing;
 
/** Required code library (API) imports */
import static tools.Format.PURPLE;
import static tools.Format.RESET;
import collections.Node;


/**
 * CollectionsTest.java - tests the concepts learned in this unit.
 *
 * @author Mr. Wachs
 * @since Dec 10, 2025, 9:31:12 AM
 */
public class CollectionsTest 
{

    /**
     * Default constructor, set class properties
     */
    public CollectionsTest() {
        System.out.println(PURPLE + "Start Collections Test..." + RESET);
        
        // =====================================================================
        // (1) DYNAMIC DATA STRUCTURE
        // =====================================================================        
        // The concept of a "collection" implies a group of data that we can 
        // add and remove items from as we "use" the structure. Data 
        // (information) is stored ("remembered") in a "structure" that you 
        // first learn can be a variable, then more complicated "structures" 
        // like arrays and classes. A static data structure (like variables and
        // arrays) have a fixed size amount as the memory is allocated 
        // (assigned) at compile time. A dynamic data structure (like the ones 
        // we will study in this unit, and others) has a changing size that can
        // grow and shrink at run time. Static data structures can be faster 
        // and easier to implement. Dynamic data structures are more flexible 
        // and manage memory better
        
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
        
        
        
        
        
        
        System.out.println(PURPLE + "Collections Test Completed!" + RESET);
    }
     
}