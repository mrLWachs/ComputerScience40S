
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
        LinkedList<Boolean>   values     = new LinkedList<>();
        LinkedList<Integer>   numbers    = new LinkedList<>();
        LinkedList<Double>    decimals   = new LinkedList<>();
        LinkedList<Character> characters = new LinkedList<>();        
        LinkedList<Athlete>   athletes   = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            boolean   random1   = Calculator.random();
            int       random2   = Calculator.random(1,99);
            double    random3   = Calculator.random(0.0d,9.9d);
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
            values.addBack(bool);
            numbers.addFront(integer);
            decimals.addBack(doub);
            characters.addFront(character);
            athletes.addBack(athlete);
        }
        System.out.println("Boolean   List = " + values.toString());
        System.out.println("Integer   List = " + numbers.toString());
        System.out.println("Double    List = " + decimals.toString());
        System.out.println("Character List = " + characters.toString());
        System.out.println("Athlete   List = " + athletes.toString());
        
        // testing cloning
        LinkedList<String> clone = list.clone();
        System.out.println(clone.toString());
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // code continues next class.......................................
        
        
        System.out.println("\nCompleted Collections Test!\n");
    }

}