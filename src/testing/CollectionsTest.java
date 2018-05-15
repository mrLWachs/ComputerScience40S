
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
        out("\nStarting collections unit test...\n"); 
        Node<Integer> node1 = new Node<>(50);   // create node objects
        Node<Integer> node2 = new Node<>(10);
        Node<Integer> node3 = new Node<>(90);        
        node1.next     = node2;                 // connect node objects
        node1.previous = node3;
        out("Node data:     " + node1);         // output node objects
        out("Next Node:     " + node1.next);
        out("Previous Node: " + node1.previous);
        LinkedList list = new LinkedList();     // create LinkedList object 
        out("List is empty = " + list.isEmpty());
        out("List size     = " + list.size());  
        out("Output list   = " + list); 
        out("Adding Front A = " + list.addFront('A') + " -> \t" + list);
        out("Adding Back  B = " + list.addBack( 'B') + " -> \t" + list);
        out("Adding Front C = " + list.addFront('C') + " -> \t" + list);
        out("Adding Back  D = " + list.addBack( 'D') + " -> \t" + list);
        out("Adding Front E = " + list.addFront('E') + " -> \t" + list);
        out("Get Spot 2  = " + list.get(2) + " -> \t" + list);
        out("Get Spot 0  = " + list.get(0) + " -> \t" + list);
        out("Get Spot 4  = " + list.get(4) + " -> \t" + list);
        out("Get Spot 6  = " + list.get(6) + " -> \t" + list);
        out("Get Spot -2 = " + list.get(-2) + " -> \t" + list);
        out("Set 0  to W = " + list.set(0,'W') + " -> \t" + list);
        out("Set 2  to T = " + list.set(2,'T') + " -> \t" + list);
        out("Set 4  to R = " + list.set(4,'R') + " -> \t" + list);
        out("Set 6  to V = " + list.set(6,'V') + " -> \t" + list);
        out("Set -2 to M = " + list.set(-2,'M') + " -> \t" + list);    
        out("Front = " + list.front() + " -> \t" + list);
        out("Back  = " + list.back() + " -> \t" + list);         
        LinkedList<Character> test = new LinkedList();           
        out("Front with empty list = " + test.front() + " -> \t" + test);
        out("Back with empty list  = " + test.back() + " -> \t" + test); 
        test.addBack('A'); 
        out("Front with 1 item list = " + test.front() + " -> \t" + test);
        out("Back  with 1 item list = " + test.back()  + " -> \t" + test);
        out("Remove front = " + list.removeFront() + " -> \t" + list);
        test.addBack('A');
        out("Remove back  = " + list.removeBack() +  " -> \t" + list);  
        test.finalize();
        out("Remove front (empty) = " + test.removeFront() + " -> \t" + test);
        out("Remove back  (empty) = " + test.removeBack() + " -> \t" + test);
        test.addBack('A');
        out("Remove front (1 item) = " + test.removeFront() + " -> \t" + test);
        test.addBack('A');
        out("Remove back  (1 item) = " + test.removeBack() + " -> \t" + test);
        out("Contains 'C' = " + list.contains('C') + "  -> \t" + list);
        out("Contains 'Z' = " + list.contains('Z') + " -> \t" + list);
        out("Add 'Z' After 1 = " + list.addAfter('Z',1) + " -> \t" + list);        
        out("Add 'Z' After 3 = " + list.addAfter('Z',3) + " -> \t" + list);
        out("Add 'Z' After 0 = " + list.addAfter('Z',0) + " -> \t" + list);
        out("Add 'Z' After 9 = " + list.addAfter('Z',9) + " -> \t" + list);
        out("Add 'Z' Before 1 = " + list.addBefore('Z',1) + " -> \t" + list);        
        out("Add 'Z' Before 3 = " + list.addBefore('Z',3) + " -> \t" + list);
        out("Add 'Z' Before 0 = " + list.addBefore('Z',0) + " -> \t" + list);
        out("Add 'Z' Before 9 = " + list.addBefore('Z',9) + " -> \t" + list);
        out("Remove 3 = " + list.remove(3) + " -> \t" + list);
        out("Remove 0 = " + list.remove(0) + " -> \t" + list);
        out("Remove 6 = " + list.remove(6) + " -> \t" + list);
        out("Remove 9 = " + list.remove(9) + " -> \t" + list);        
        out("First index of Z = " + list.firstIndexOf('Z') + " -> \t" + list);
        out("Last  index of Z = " + list.lastIndexOf('Z') + " -> \t" + list);
        out("First index of Q = " + list.firstIndexOf('Q') + " -> \t" + list);
        out("Last  index of Q = " + list.lastIndexOf('Q') + " -> \t" + list);
        

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        out("\nCompleted collections test!\n");
    }
    
    private void out(Object object) {
        System.out.println(object);
    }

}
