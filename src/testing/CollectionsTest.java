
/** required package class namespace */
package testing;

/** required imports */
import collections.LinkedList;
import collections.Node;

/**
 * CollectionsTest.java - tests the concepts learned in this unit
 *
 * @author Mr. Wachs
 * @since Apr 26, 2018 
 * @instructor Mr. Wachs
 */
public class CollectionsTest 
{

    /** 
     * Default constructor for the class 
     */
    public CollectionsTest() {
        System.out.println("\nStarting collections unit test...\n");
        
        Node<Integer> node1 = new Node<>(50);   // create node objects
        Node<Integer> node2 = new Node<>(10);
        Node<Integer> node3 = new Node<>(90);        
        node1.next     = node2;                 // connect node objects
        node1.previous = node3;
        System.out.println(node1);              // output node objects
        System.out.println(node2);
        System.out.println(node3);
        
        
        LinkedList list = new LinkedList();
        
        
        
        
        
        
        // more to come...
        
        
        System.out.println("\nCompleted collections test!\n");
    }

}
