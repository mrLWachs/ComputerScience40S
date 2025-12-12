
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
        System.out.println("\nTesting Node constructors....................\n");
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
        
        // =====================================================================
        // (4) THE LINKEDLIST CLASS
        // =====================================================================        
        // The LinkedList class is a collection of data objects (nodes) 
        // "linked together" and where each Node object maintains a reference 
        // (a "pointer") to the next Node object in the list. It is structured 
        // into a class so that we can also add useful properties and methods 
        // for using this abstract data type (ADT) effectively. It will allow 
        // for more flexible operations over static data structures (like 
        // arrays) like insertions, deletions, accessing (get), mutations (set),
        // traversals, etc. It will also manage memory allocations dynamically
        
        // =====================================================================
        // (5) SINGULAR AND DOUBLY LINKEDLIST 
        // =====================================================================        
        // Since LinkedList objects link together Node objects to form a "chain"
        // The Node reference to "next" moves the list in one direction 
        // (forward) from a starting point (like a one-way road) called a 
        // singular LinkedList. If we use our Node references to next and 
        // previous we can now move in two directions (forward and backwards) 
        // from multiple starting points (like a two-way road) called a doubly 
        // LinkedList
        
        // =====================================================================
        // (6) LINKEDLIST ENTRY POINTS
        // =====================================================================        
        // In order to traverse (travel) through a LinkedList in addition to 
        // eventually doing operations (like additions/deletions), we need an 
        // entry point (or "points") to the list. The head is a "pointer" 
        //reference property in the LinkedList class that allows access to the 
        // very first Node. It acts as an entry point into the list, and if the
        // list is empty, the head is set to null. The tail is another potential
        // entry point that "points" to the last Node in the LinkedList (it is 
        // also set to null on an empty list). Sometimes, the head and tail are 
        // called by other identifier names like "start", "end", "front", 
        // "back", etc.
        
        // =====================================================================
        // (7) LINKEDLIST METHODS
        // =====================================================================        
        // The LinkedList class has a number of methods (public, private, and 
        // protected), overloaded methods, wrapper methods, and constructor 
        // option methods. They serve a number of functions such as adding, 
        // deleting, accessors, mutators, traversals, and more.
        
        
        
        
        
        
        System.out.println(PURPLE + "Collections Test Completed!" + RESET);
    }
     
}