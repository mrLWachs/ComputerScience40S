
/** required package class namespace */
package testing.collections;

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
        Node<Character> n1 = new Node<>();
        n1.data = 'b';                          // mutate data
        Node<Character> n2 = new Node<>('a');
        n1.next     = n2;                       // reference next
        n2.previous = n1;                       // reference previous
        Node<Character> n3 = new Node<>('c',n1,n2);
        
        // output node data
        System.out.println(n1.toString());
        System.out.println(n2.toString());
        System.out.println(n3.toString());
        
        // test node class methods
        n1.finalize();
        System.out.println(n1.toString());        
        Node<Character> n4 = n2.clone();
        if (n2.equals(n4)) 
            System.out.println("n2 == n4");
        if (n2.equals(n3)) 
            System.out.println("n2 == n3");
        
        // linked list class
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("\nCompleted Collections Test!\n");
    }

    
}
