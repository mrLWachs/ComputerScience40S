/** Required package class namespace */
package testing;
 
/* Required API imports */
import collections.Node;


/**
 * CollectionsTest.java - tests the concepts learned in this unit.
 *
 * @author Mr. Wachs
 * @since May 8, 2026, 10:43:14 AM
 */
public class CollectionsTest 
{

    /**
     * Default constructor, set class properties
     */
    public CollectionsTest() {
        System.out.println("\nStart Collections test...\n");
        
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
        
        // =====================================================================
        // (2) THE NODE CLASS
        // =====================================================================        
        // A Node represents a single distinct unit of data that is used as a 
        // building block for the upcoming LinkedList of collection data. It is 
        // made as it's own distinct class so that we can define multiple 
        // properties and methods. We have properties to store the data (which 
        // will be generic data and therefore more universally useful as a data
        // structure) and other properties to "link" this Node object to another 
        // Node object (thus eventually forming a "chain" or "linked" list of 
        // data). The property (or multiple properties) that "points" or "links"
        // or "references" potentially another Node object makes this a 
        // "self-referencing" class. The word "node" is borrowed from graph  
        // theory in mathematics. We can also add methods for using this data 
        // structure more effectively (like constructors, error checks, etc.)
        
        // Create some node objects...
        
        Node<String> a = new Node<>();
        Node<String> b = new Node<>("Pros");
        Node<String> c = new Node<>("Joes", b);
        Node<String> d = new Node<>("Huskies", c, b);
        
        // =====================================================================
        // (3) NODE CLASS METHODS
        // =====================================================================        
        // The Node class has a number of useful methods including several 
        // constructor methods, and over-ridden toString(), equals(), and 
        // clone() methods - along with an over-ride on the finalize() method 
        // from the Object class
        
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
        
        // Then finalize some nodes (wipe out, "destroy" them, free up memory)
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
        
        
        
        
        
        
        
        
        
        
        System.out.println("\nCompleted collections test!\n");
    }
     
}