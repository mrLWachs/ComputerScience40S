
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
        out("Node data -> \t\t\t\t" + node1);         // output node objects
        out("Next Node -> \t\t\t\t" + node1.next);
        out("Previous Node -> \t\t\t" + node1.previous);
        LinkedList list = new LinkedList();     // create LinkedList object 
        out("List is empty -> \t\t\t" + list.isEmpty());
        out("List size -> \t\t\t\t" + list.size());  
        out("Output list -> \t\t\t\t" + list); 
        out("Adding Front C = " + list.addFront('C') + " -> \t\t" + list);
        out("Adding Back  D = " + list.addBack( 'D') + " -> \t\t" + list);
        out("Adding Front B = " + list.addFront('B') + " -> \t\t" + list);
        out("Adding Back  E = " + list.addBack( 'E') + " -> \t\t" + list);
        out("Adding Front A = " + list.addFront('A') + " -> \t\t" + list);
        out("Get Spot 2  = " + list.get(2) + " -> \t\t\t" + list);
        out("Get Spot 0  = " + list.get(0) + " -> \t\t\t" + list);
        out("Get Spot 4  = " + list.get(4) + " -> \t\t\t" + list);
        out("Get Spot 6  = " + list.get(6) + " -> \t\t\t" + list);
        out("Get Spot -2 = " + list.get(-2) + " -> \t\t\t" + list);
        out("Set 0  to Z = " + list.set(0,'Z') + " -> \t\t\t" + list);
        out("Set 2  to S = " + list.set(2,'S') + " -> \t\t\t" + list);
        out("Set 4  to T = " + list.set(4,'T') + " -> \t\t\t" + list);
        out("Set 6  to U = " + list.set(6,'U') + " -> \t\t\t" + list);
        out("Set -2 to V = " + list.set(-2,'V') + " -> \t\t\t" + list);    
        out("Front = " + list.front() + " -> \t\t\t\t" + list);
        out("Back  = " + list.back() + " -> \t\t\t\t" + list);         
        LinkedList<Character> test = new LinkedList();           
        out("Front (empty) = " + test.front() + " -> \t\t" + test);
        out("Back (empty)  = " + test.back() + " -> \t\t" + test); 
        test.addBack('A'); 
        out("Front with 1 item list = " + test.front() + " -> \t\t" + test);
        out("Back  with 1 item list = " + test.back()  + " -> \t\t" + test);
        out("Remove front = " + list.removeFront() + " -> \t\t\t" + list);
        test.addBack('A');
        out("Remove back  = " + list.removeBack() +  " -> \t\t\t" + list);  
        test.finalize();
        out("Remove front (empty) = " + test.removeFront() + " -> \t\t" + test);
        out("Remove back  (empty) = " + test.removeBack() + " -> \t\t" + test);
        test.addBack('A');
        out("Remove front (1 item) = " + test.removeFront() + " -> \t\t" + test);
        test.addBack('A');
        out("Remove back  (1 item) = " + test.removeBack() + " -> \t\t" + test);
        out("Contains 'B' = " + list.contains('B') + "  -> \t\t" + list);
        out("Contains 'Z' = " + list.contains('Z') + " -> \t\t" + list);
        out("Add 'Z' After 1 = " + list.addAfter('Z',1) + " -> \t\t" + list);        
        out("Add 'Z' After 3 = " + list.addAfter('Z',3) + " -> \t\t" + list);
        out("Add 'Z' After 0 = " + list.addAfter('Z',0) + " -> \t\t" + list);
        out("Add 'Z' After 9 = " + list.addAfter('Z',9) + " -> \t\t" + list);
        out("Add 'Z' Before 1 = " + list.addBefore('Z',1) + " -> \t\t" + list);        
        out("Add 'Z' Before 3 = " + list.addBefore('Z',3) + " -> \t\t" + list);
        out("Add 'Z' Before 0 = " + list.addBefore('Z',0) + " -> \t\t" + list);
        out("Add 'Z' Before 9 = " + list.addBefore('Z',9) + " -> \t\t" + list);
        out("Remove 3 = " + list.remove(3) + " -> \t\t\t" + list);
        out("Remove 0 = " + list.remove(0) + " -> \t\t\t" + list);
        out("Remove 6 = " + list.remove(6) + " -> \t\t\t" + list);
        out("Remove 9 = " + list.remove(9) + " -> \t\t\t" + list);        
        out("First index of Z = " + list.firstIndexOf('Z') + " -> \t\t" + list);
        out("Last  index of Z = " + list.lastIndexOf('Z') + " -> \t\t" + list);
        out("First index of Q = " + list.firstIndexOf('Q') + " -> \t\t" + list);
        out("Last  index of Q = " + list.lastIndexOf('Q') + " -> \t\t" + list);
        Character item = new Character('Z');
        Character not  = new Character('N');        
        out("Remove Z = " + list.remove(item) + " -> \t\t\t" + list);
        out("Remove N = " + list.remove(not)  + " -> \t\t\t" + list);        
        out("Remove Last Z = " + list.removeLast(item) + " -> \t\t" + list);
        out("Remove Last N = " + list.removeLast(not)  + " -> \t\t" + list);
        for (int i = 0; i < 2; i++) {
            int random1 = (int)((list.size() - 0 + 1) * Math.random() + 0);
            list.addBefore('Z',random1);
            int random2 = (int)((list.size() - 0 + 1) * Math.random() + 0);
            list.addAfter('Z',random2);            
        }
        out("Rebuild List -> \t\t\t" + list);        
        out("Remove All Z = " + list.removeAll(item) + " -> \t\t\t" + list); 
        out("Remove All N = " + list.removeAll(not)  + " -> \t\t" + list); 
        list.clear();
        for (int i = 0; i < 26; i++) {
            list.add(new Character((char)(i+65)));
        }
        out("Rebuild List -> \t\t\t" + list); 
        Character[] vowels = {'A','E','I','O','U'};
        list.removeAll(vowels);
        out("Remove All Array -> \t\t\t" + list);
        LinkedList<Character> haters = new LinkedList<>();
        haters.add('H');
        haters.add('N');
        haters.add('W');
        list.removeAll(haters);
        out("Remove All LinkedList -> \t\t" + list);
        for (int i = 0; i < 2; i++) {
            int random1 = (int)((list.size() - 0 + 1) * Math.random() + 0);
            list.addBefore('Z',random1);
            int random2 = (int)((list.size() - 0 + 1) * Math.random() + 0);
            list.addAfter('Z',random2);            
        }
        out("Rebuild List -> \t\t\t" + list);
        out("Number Of Z = " + list.numberOf('Z') + " -> \t\t\t" + list); 
        out("Number Of N = " + list.numberOf('N') + " -> \t\t\t" + list); 
        list.addAll(haters);
        out("Add All List: " + haters + " -> \t\t" + list);
        list.addAll(haters, 4);
        out("Add All List: " + haters + " at 4 -> \t\t" + list);
        LinkedList<Character> sub = list.subList(2,12);        
        out("Sub List from 2 to 12 -> \t\t" + sub);
        Character[] favs = {'W','A','C','H','S'};
        list.fromArray(favs);
        out("List from Array: [W,A,C,H,S] -> \t" + list);
        
        
        
        
        
        
        
        
        
        out("\nCompleted collections test!\n");
    }
    
    /**
     * Outputs the passed item to the screen with standard output
     *  
     * @param object the item to output
     */
    private void out(Object object) {
        System.out.println(object);
    }

}
