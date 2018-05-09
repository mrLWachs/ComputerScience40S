
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
        
        LinkedList list = new LinkedList();     // create LinkedList object        
        System.out.println(list.isEmpty());     // see if empty
        System.out.println(list.size());        // check size
        System.out.println(list);               // output list (toString())        
        list.addFront('A');                     // add data tofront and back
        list.addBack('B');
        list.addFront('C');
        list.addBack('D');        
        list.addFront('E');        
        System.out.println(list);               // output list
        System.out.println("Testing get method");
        System.out.println(list.get(2));
        System.out.println(list.get(0));
        System.out.println(list.get(4));
        System.out.println(list.get(20));
        System.out.println(list.get(-2));
        System.out.println("Testing set method");
        System.out.println(list.set(0,'W'));
        System.out.println(list.set(2,'T'));
        System.out.println(list.set(4,'R'));
        System.out.println(list.set(40,'V'));
        System.out.println(list.set(-4,'M'));        
        System.out.println(list);
        
        System.out.println(list.front());
        System.out.println(list.back());
        
        System.out.println(list.removeFront());
        System.out.println(list);
        
        
        
        
        
        
        
        
        
        
        
        
        
        // more to come...
        
        
        
        
        System.out.println("\nCompleted collections test!\n");
    }

}
