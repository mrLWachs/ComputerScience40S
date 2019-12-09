
/** required package class namespace */
package testing;

import collections.LinkedList;
import collections.Node;

 
/**
 * CollectionsTest.java - description
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
        boolean result = false;
        result = a.equals(b);
        System.out.println("a==b is " + result);
        result = b.equals(c);
        System.out.println("b==c is " + result);
        result = c.equals(d);
        System.out.println("c==d is " + result);
        
        // test clone method
        Node<String> e = d.clone();
        System.out.println(e.toString());
        result = e.equals(d);
        System.out.println("e==d is " + result);
        
        // test finalize method
        e.finalize();
        System.out.println(e.toString());
        
        // create a linked list
        LinkedList<String> list = new LinkedList<>();
        
        // test the methods
        System.out.println("Testing LinkedList code.....................");
        System.out.println("Size  = " + list.size());
        System.out.println("Empty = " + list.isEmpty());
        
        System.out.println(list.toString());
        
        System.out.println(list.addFront(null));
        System.out.println(list.addFront("aardvark"));
        System.out.println(list.addFront("apple"));
        System.out.println(list.addFront("cheesecake"));
        
        System.out.println(list.addBack(null));
        System.out.println(list.addBack("mongral"));
        System.out.println(list.addBack("mongoose"));
        System.out.println(list.addBack("monkey"));
        
        System.out.println("Size  = " + list.size());
        System.out.println("Empty = " + list.isEmpty());
        
        System.out.println(list.toString());
        
        System.out.println(list.get(2));
        System.out.println(list.get(-1));
        System.out.println(list.get(list.size()+1));
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));
                
        System.out.println(list.set(2,"gratuitous"));
        System.out.println(list.set(0,"axolotl"));
        System.out.println(list.set(list.size()-1,"cat"));
        System.out.println(list.set(list.size()+1,"cat"));
        System.out.println(list.set(-1,"cat"));
        System.out.println(list.set(2,null));
        System.out.println(list.toString());
        
        // testing typical index, the list edges and 
        // beyond the edges
        
        
        
        
        
        
        System.out.println("\nCollections Test completed!\n");
    }
    


}
