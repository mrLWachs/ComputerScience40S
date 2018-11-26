
/** required package class namespace */
package testing.collections;

/** required imports */
import collections.LinkedList;
import collections.Node;


/**
 * CollectionsTest.java - the unit test to test the concept of collections
 *
 * @author Mr. Wachs 
 * @since 15-Nov-2018 
 */
public class CollectionsTest 
{

    /**
     * Default constructor for the class, sets class properties
     */
    public CollectionsTest() {
        System.out.println("\nStarting Collections Test...\n");
        
        // create node objects
        Node<Character> n1 = new Node<>();              // create node object
        n1.data = 'b';                                  // mutate data
        Node<Character> n2 = new Node<>('a');           // another constructor
        n1.next     = n2;                               // reference next
        n2.previous = n1;                               // reference previous
        Node<Character> n3 = new Node<>('c',n1,n2);     // final constructor
        
        // output node data
        System.out.println(n1.toString());
        System.out.println(n2.toString());
        System.out.println(n3.toString());
        
        // test node class methods
        n1.finalize();
        System.out.println(n1.toString());        
        Node<Character> n4 = n2.clone();
        if (n2.equals(n4)) System.out.println("n2 == n4");
        if (n2.equals(n3)) System.out.println("n2 == n3");
        
        // linked list class        
        LinkedList<String> list = new LinkedList<>();       // create list 
        System.out.println("Is empty = " + list.isEmpty()); // test if empty
        System.out.println("Size = " + list.size());        // test size
        
        list.addBack("pie");                                // add 1st item
        list.addBack("fish");                               // add second item
        list.addBack("crab");                               // add >1 items
        list.addBack("stool");
        
        System.out.println("Is empty = " + list.isEmpty()); // test if empty
        System.out.println("Size = " + list.size());        // test size
        
        list.addFront("potato ");                           // now front adding
        list.addFront("cheese");                            
        list.addFront("cat");                              
        list.addFront("chair");
        
        System.out.println("Is empty = " + list.isEmpty()); // test if empty
        System.out.println("Size = " + list.size());        // test size
        
        
        // code continues next class.......................................
        
        
        System.out.println("\nCompleted Collections Test!\n");
    }

}
