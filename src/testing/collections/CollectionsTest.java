
/** required package class namespace */
package testing.collections;

/** required imports */
import collections.LinkedList;
import collections.Node;
import numbers.Calculator;
import testing.advancedclasses.Athlete;


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
        System.out.println(list.toString());                // output list
        
        list.addBack("pie");                                // add 1st item
        list.addBack("fish");                               // add second item
        list.addBack("crab");                               // add >1 items
        list.addBack("stool");
        list.addFront("potato");                            // now front adding
        list.addFront("cheese");                            
        list.addFront("cat");                              
        list.addFront("chair");
        
        System.out.println("Is empty = " + list.isEmpty()); // test if empty
        System.out.println("Size = " + list.size());        // test size     
        System.out.println(list.toString());                // output list
        
        System.out.println(list.get(3));                    // accessor 
        System.out.println(list.set(3, "graph"));           // modifier
             
        System.out.println(list.toString());                // output list
        
        // try code with lists of different types
        LinkedList<Boolean>   booleans   = new LinkedList<>();
        LinkedList<Integer>   integers   = new LinkedList<>();
        LinkedList<Double>    doubles    = new LinkedList<>();
        LinkedList<Character> characters = new LinkedList<>();        
        LinkedList<Athlete>   athletes   = new LinkedList<>();
        final int MAX = 10;
        for (int i = 0; i < MAX; i++) {
            boolean   random1   = Calculator.random();
            int       random2   = Calculator.random(-MAX,MAX);
            double    random3   = Calculator.random((double)-MAX,(double)MAX);
            char      random4   = Calculator.random('A','Z');
            String    name      = Calculator.random(5);
            int       age       = Calculator.random(18,30);
            boolean   gender    = Calculator.random();
            int       number    = Calculator.random(100,999);
            Boolean   bool      = new Boolean(random1);
            Integer   integer   = new Integer(random2);
            Double    doub      = new Double(random3);            
            Character character = new Character(random4);
            Athlete   athlete   = new Athlete(name,age,gender,number);            
            booleans.addBack(bool);
            integers.addFront(integer);
            doubles.addBack(doub);
            characters.addFront(character);
            athletes.addBack(athlete);
        }
        System.out.println("Boolean   List = " + booleans.toString());
        System.out.println("Integer   List = " + integers.toString());
        System.out.println("Double    List = " + doubles.toString());
        System.out.println("Character List = " + characters.toString());
        System.out.println("Athlete   List = " + athletes.toString());
        
        // testing cloning
        LinkedList<String> clone = list.clone();
        System.out.println(clone.toString());
        
        // testing equals
        if (list.equals(clone)) 
            System.out.println("list == clone");        
        LinkedList<String> different = list.clone();
        different.addBack("Cheese string");        
        if (!list.equals(different)) 
            System.out.println("list != different");
                
        // test removing
        System.out.println(list.toString());        
        String removal1 = list.removeFront();
        String removal2 = list.removeBack();
        System.out.println(removal1);
        System.out.println(removal2);        
        System.out.println(list.toString());
        
        System.out.println(list.contains("pie"));
        System.out.println(list.contains("zebra"));
        
        // test add before and after
        System.out.println(list.toString());
        list.addAfter("chart", 2);
        System.out.println(list.toString());
        list.addBefore("sardines", 5);
        System.out.println(list.toString());
        
        // test remove
        System.out.println(list.remove(5));
        System.out.println(list.toString());        
        
        advancedTesting();
        
        System.out.println("\nCompleted Collections Test!\n");
    }

    /**
     * Advanced LinkedList method testing done outside of class time
     */
    private void advancedTesting() {
        out("\nCollections Testing (outside of class time) starting...\n"); 
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
        for (int i = 0; i < 2; i++) {
            int random1 = (int)((list.size() - 0 + 1) * Math.random() + 0);
            list.addBefore('Z',random1);
            int random2 = (int)((list.size() - 0 + 1) * Math.random() + 0);
            list.addAfter('Z',random2);            
        }
        out("Rebuild List -> \t\t\t" + list);
        int[] indices = list.allIndices('Z');
        Integer[] indexValues = new Integer[indices.length];
        for (int i = 0; i < indices.length; i++) {
            indexValues[i] = indices[i];
        }
        out("All indices of 'Z' -> \t\t\t" + print(indexValues));
        indices = list.allIndices('X');
        if (indices != null) {
            indexValues = new Integer[indices.length];
            for (int i = 0; i < indices.length; i++) {
                indexValues[i] = indices[i];
            }
        }
        else {
            indexValues = null;
        }
        out("All indices of 'X' -> \t\t\t" + print(indexValues));        
        LinkedList<Character> letters = new LinkedList<>();
        for (int i = 0; i < 26; i++) {
            letters.add(new Character((char)(i+65)));
        }
        out("Build new List -> \t\t\t" + letters);
        list.fromLinkedList(letters);
        out("Original from new (method) -> \t\t" + list);
        LinkedList list1 = new LinkedList(letters);
        out("New from original (constructor) -> \t" + list1);
        Character[] name = {'W','A','C','H','S'};
        LinkedList list2 = new LinkedList(name);
        out("New from array (constructor) -> \t" + list2);
        Character[] alpha = new Character[0];
        alpha = letters.toArray(alpha);
        out("Array from list - > \t\t\t" + print(alpha));
        String[] words = {"apple","commercial","marshmellow","catwoman"};
        out("New array -> \t\t\t\t" + print(words));
        LinkedList<String> phrases = new LinkedList<>(words);
        out("New List from array (constructor) -> \t" + phrases);
        String[] things = new String[0];
        things = phrases.toArray(things);
        out("New array from list (constructor) -> \t" + print(words));
        out("\nCollections Testing (outside of class time) complete!\n");
    }

        /**
     * Outputs the passed item to the screen with standard output
     *  
     * @param object the item to output
     */
    private void out(Object object) {
        System.out.println(object);
    }

    /**
     * Turns an array into a 'printable' string formatted
     * 
     * @param <T> the generic data type
     * @param a the array to 'print'
     * @return a formatted string representing the array
     */
    private<T> String print(T[] a) {
        if (a == null) return "null";
        String text = "[";
        for (int i = 0; i < a.length-1; i++) {
            text += a[i].toString() + ",";
        }
        return text + a[a.length-1].toString() + "]";
    }
    
}
