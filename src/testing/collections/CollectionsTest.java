
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
        
        
        
        
        
        
        
        
        
        
        
        
        // code continues next class.......................................
        
        
        System.out.println("\nCompleted Collections Test!\n");
    }

}
