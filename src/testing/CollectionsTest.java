
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
        System.out.println("Testing Node class......");
        Node<Integer> node1 = new Node<>(50);   // create node objects
        Node<Integer> node2 = new Node<>(10);
        Node<Integer> node3 = new Node<>(90);        
        node1.next     = node2;                 // connect node objects
        node1.previous = node3;
        System.out.println("Node data:     " + node1);  // output node objects
        System.out.println("Next Node:     " + node1.next);
        System.out.println("Previous Node: " + node1.previous);
        System.out.println("Testing LinkedList class......");
        LinkedList list = new LinkedList();     // create LinkedList object 
        System.out.println("List is empty = " + list.isEmpty());
        System.out.println("List size = " + list.size());  
        System.out.println("output list = " + list); 
        System.out.println("Adding to front and back, then outputing.....");
        System.out.print("Adding Front A = " + list.addFront('A'));
        System.out.println(" -> " + list);
        System.out.print("Adding Back  B = " + list.addBack( 'B'));
        System.out.println(" -> " + list);
        System.out.print("Adding Front C = " + list.addFront('C'));
        System.out.println(" -> " + list);
        System.out.print("Adding Back  D = " + list.addBack( 'D'));
        System.out.println(" -> " + list);
        System.out.print("Adding Front E = " + list.addFront('E'));      
        System.out.println(" -> " + list);
        System.out.println("Edge testing get method.....");
        System.out.println("Get Spot 2  = " + list.get(2) + " -> " + list);
        System.out.println("Get Spot 0  = " + list.get(0) + " -> " + list);
        System.out.println("Get Spot 4  = " + list.get(4) + " -> " + list);
        System.out.println("Get Spot 6  = " + list.get(6) + " -> " + list);
        System.out.println("Get Spot -2 = " + list.get(-2) + " -> " + list);
        System.out.println("Edge testing set method......");
        System.out.println("Before Set = " + list);
        System.out.println("Set 0  to W = " + list.set(0,'W') + " -> " + list);
        System.out.println("Set 2  to T = " + list.set(2,'T') + " -> " + list);
        System.out.println("Set 4  to R = " + list.set(4,'R') + " -> " + list);
        System.out.println("Set 6  to V = " + list.set(6,'V') + " -> " + list);
        System.out.println("Set -2 to M = " + list.set(-2,'M') + " -> " + list);         
        System.out.println("Testing front/back");
        System.out.println("List front = " + list.front() + " -> " + list);
        System.out.println("List back = " + list.back() + " -> " + list);         
        LinkedList<Character> test1 = new LinkedList();               
        System.out.println("Testing front/back with empty list");
        System.out.println("List front = " + test1.front() + " -> " + test1);
        System.out.println("List back = " + test1.back() + " -> " + test1);        
        LinkedList<Character> test2 = new LinkedList();
        test2.addBack('A'); 
        System.out.println("Testing front/back with 1 item list");
        System.out.println("List front = " + test2.front() + " -> " + test2);
        System.out.println("List back = " + test2.back() + " -> " + test2);        
        System.out.println("Testing remove front/back");
        System.out.print("Remove front = " + list.removeFront());
        System.out.println(" -> " + list);
        System.out.print("Remove back = " + list.removeBack());
        System.out.println(" -> " + list);        
        System.out.println("Testing remove front/back with empty list");
        System.out.print("Remove front = " + test1.removeFront());
        System.out.println(" -> " + test1);
        test2.addBack('A'); 
        System.out.print("Remove back = " + test1.removeBack());
        System.out.println(" -> " + test1);
        
        System.out.println("Testing remove front/back with 1 item list");
        System.out.print("Remove front = " + test2.removeFront());
        System.out.println(" -> " + test2);
        System.out.print("Remove back = " + test2.removeBack());
        System.out.println(" -> " + test2);
        
        
        
        System.out.print("List contains 'C' = " + list.contains('C'));
        System.out.println(" -> " + list);
        System.out.print("List contains 'Z' = " + list.contains('Z'));
        System.out.println(" -> " + list);
        System.out.println("Adding 'Z' after 1 = " + 
                list.addAfter('Z',1) + " -> " + list);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("\nCompleted collections test!\n");
    }

}
