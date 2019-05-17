
/** required package class namespace */
package testing.collections;

import collections.LinkedList;
import collections.Node;


/**
 * CollectionsTest.java - tests the concepts learned in this unit
 *
 * @author Mr. Wachs 
 * @since 3-May-2019 
 */
public class CollectionsTest 
{

    /**
     * Default constructor for the class, sets class properties
     */
    public CollectionsTest() {
        System.out.println("\nCollections started...\n");
        
        Node<String> a = new Node<>();                  // create node objects
        Node<String> b = new Node<>("dragon");
        Node<String> c = new Node<>("Stark",a,b);
        Node<String> d = new Node<>("Stark",a,b);
        Node<String> e = new Node<>("Stark",c,d);
        Node<String> f = new Node<>("Stark");
                
        System.out.println(a.toString());               // output node objects
        System.out.println(b.toString());
        System.out.println(c.toString());
        
        if (c.equals(a)) System.out.println("c == a");  // test equals 
        if (c.equals(b)) System.out.println("c == b");
        if (c.equals(d)) System.out.println("c == d");
        if (c.equals(e)) System.out.println("c == e");
        if (c.equals(f)) System.out.println("c == f");
        
        Node g = f.clone();                             // test clone
        System.out.println(f.toString());
        System.out.println(g.toString());
        
        // create Linked List object
        LinkedList<Integer> list = new LinkedList<>();
        
        // testing isEmpty, size, and toString
        System.out.println(list.isEmpty());
        System.out.println(list.size());        
        System.out.println(list.toString());
        
        // testing add to the front
        System.out.println(list.addFront(null));
        System.out.println(list.addFront(17));
        System.out.println(list.addFront(246));
        System.out.println(list.addFront(59));
        
        // testing add to the back
        System.out.println(list.addBack(null));
        System.out.println(list.addBack(45));
        System.out.println(list.addBack(99));
        System.out.println(list.addBack(12));
        
        // testing toString again
        System.out.println(list.toString());
        
        // edge testing the get method (accessor)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(5));
        System.out.println(list.get(-10));
        System.out.println(list.get(100));
        
        // edge testing the set method (mutator)
        System.out.println(list.set(0,97));
        System.out.println(list.set(1,65));
        System.out.println(list.set(5,102));
        System.out.println(list.set(-10,545));
        System.out.println(list.set(100,193));
        System.out.println(list.set(2,null));
                
        System.out.println(list.toString());
        
        LinkedList<Integer> list2 = new LinkedList<>();
        
        if (list.equals(list2)) System.out.println("==");
        else                    System.out.println("!=");
        
        list2 = list.clone();
        
        System.out.println(list.toString());
        System.out.println(list2.toString());
        
        if (list.equals(list2)) System.out.println("==");
        else                    System.out.println("!=");
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("\nCollections complete!\n");
    }

}
