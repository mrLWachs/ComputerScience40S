
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
        
        LinkedList list = new LinkedList();
        
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        
        
        
        System.out.println("\nCollections complete!\n");
    }

}
