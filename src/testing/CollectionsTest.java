
/** required package class namespace */
package testing;

/** required imports */
import collections.LinkedList;
import collections.Node;

 
/**
 * CollectionsTest.java - tests the concepts learned in this unit
 *
 * @author Mr. Wachs
 * @since Nov. 25, 2019, 11:12:06 a.m.
 */
public class CollectionsTest 
{

    /**
     * Default constructor, set class properties
     */
    public CollectionsTest() {
        System.out.println("\nCollections Test started...\n");
        
        // build some node objects, testing various constructors
        System.out.println("Testing Node code.....................");
        Node<String> a = new Node<>();
        Node<String> b = new Node<>("duck");
        Node<String> c = new Node<>("waddle",a);
        Node<String> d = new Node<>("waddle",c,b);
        
        // test the overloaded toString method
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());
        
        // test the equals method
        System.out.println("a==b is " + a.equals(b));
        System.out.println("b==c is " + b.equals(c));
        System.out.println("c==d is " + c.equals(d));
        
        // test clone method
        Node<String> e = d.clone();
        System.out.println(e.toString());
        System.out.println("e==d is " + e.equals(d));
        
        // test finalize method
        e.finalize();
        System.out.println(e.toString());
        
        // create a linked list
        LinkedList<String> list = new LinkedList<>();
        
        // test the various LinkedList methods:
        
        System.out.println("Testing LinkedList code.....................");
        
        System.out.println("Size  = " + list.size());
        System.out.println("Empty = " + list.isEmpty());
        
        System.out.println(list.toString());
        
        System.out.println(list.addFront(null));
        System.out.println(list.addFront("Aardvark"));
        System.out.println(list.addFront("Apple"));
        System.out.println(list.addFront("Cheesecake"));
        
        System.out.println(list.addBack(null));
        System.out.println(list.addBack("Mongral"));
        System.out.println(list.addBack("Mongoose"));
        System.out.println(list.addBack("Monkey"));
        
        System.out.println("Size  = " + list.size());
        System.out.println("Empty = " + list.isEmpty());
        
        System.out.println(list.toString());
        
        // testing typical index, the list edges, and beyond the edges
        
        System.out.println(list.get(2));
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));
        System.out.println(list.get(list.size()+1));
        System.out.println(list.get(-1));
        
        System.out.println(list.set(2,"Birdy"));
        System.out.println(list.set(0,"Wheeler"));
        System.out.println(list.set(list.size()-1,"Jets"));
        System.out.println(list.set(list.size()+1,"Potato"));
        System.out.println(list.set(-1,"Gorilla"));
        System.out.println(list.set(2,null));
                
        System.out.println(list.toString());
        
        LinkedList<String> list2 = list.clone();
        System.out.println(list2.toString());
        
        System.out.println("1==2 is " + list.equals(list2));
        list2.set(2, "Random");
        System.out.println(list.toString());
        System.out.println(list2.toString());
        System.out.println("1==2 is " + list.equals(list2));
        
        // make a clone and test remove methods....
        LinkedList<String> list3 = list2.clone();
        
        System.out.println("2 = " + list2.toString());
        System.out.println("3 = " + list3.toString());
        
        for (int i = 0; i < list.size()+1; i++) {            
            System.out.println("2 = " + list2.removeFront());
            System.out.println("3 = " + list3.removeBack());
            System.out.println("2 = " + list2.toString());
            System.out.println("3 = " + list3.toString());
        }
        
        
        
        
        
        
        ///////////////////////////////////////////////////
        // MORE TESTING TO COME....
        ///////////////////////////////////////////////////
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("\nCollections Test completed!\n");
    }
    


}
