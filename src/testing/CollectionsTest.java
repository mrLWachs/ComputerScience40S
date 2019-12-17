
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
        
        // various node constructor methods
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
        
        System.out.println("Testing LinkedList code.....................");
        
        // create a linked list
        LinkedList<String> list = new LinkedList<>();
        
        // test the size and is empty methods
        System.out.println("Size  = " + list.size());
        System.out.println("Empty = " + list.isEmpty());
        
        // test the over-ridden to string method
        System.out.println(list.toString());
        
        // test the add front method 
        System.out.println(list.addFront(null));
        System.out.println(list.addFront("Aardvark"));
        System.out.println(list.addFront("Apple"));
        System.out.println(list.addFront("Cheesecake"));
        
        // test the add back method 
        System.out.println(list.addBack(null));
        System.out.println(list.addBack("Mongral"));
        System.out.println(list.addBack("Mongoose"));
        System.out.println(list.addBack("Monkey"));
        
        // re-test the size, is empty, and to string methods
        System.out.println("Size  = " + list.size());
        System.out.println("Empty = " + list.isEmpty());
        System.out.println(list.toString());
        
        // test the get method (accessor method), and test edges:
            // (1) testing typical index (within the list)
            // (2) the list edges (first and last index)
            // (3) beyond the edges (past first and last indices)        
        System.out.println(list.get(2));
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));
        System.out.println(list.get(list.size()+1));
        System.out.println(list.get(-1));
        
        // test the get method (accessor method), and test edges:
            // also test the second argument
        System.out.println(list.set(2,"Birdy"));
        System.out.println(list.set(0,"Wheeler"));
        System.out.println(list.set(list.size()-1,"Jets"));
        System.out.println(list.set(list.size()+1,"Potato"));
        System.out.println(list.set(-1,"Gorilla"));
        System.out.println(list.set(2,null));
                
        // display the list at this point...
        System.out.println(list.toString());
        
        // create a second list and text clone method
        LinkedList<String> list2 = list.clone();
        
        // display the second list
        System.out.println(list2.toString());
        
        // test the equals method
        System.out.println("1==2 is " + list.equals(list2));
        
        // mutate the second list
        list2.set(2, "Random");
        
        // display both lists
        System.out.println(list.toString());
        System.out.println(list2.toString());
        
        // re-test the equals method
        System.out.println("1==2 is " + list.equals(list2));
        
        // make a third list, a clone of the second
        LinkedList<String> list3 = list2.clone();
        
        // output both lists        
        System.out.println("2 = " + list2.toString());
        System.out.println("3 = " + list3.toString());
        
        // test the remove front and remove back methods, testing all edges
        // and using a loop to continually remove unitl after both lists
        // are empty and beyond, this tests:
            // (1) list with two or more nodes
            // (2) list with one node
            // (3) list with no nodes (empty)             
        for (int i = 0; i < list.size()+1; i++) {            
            
            // test remove front
            System.out.println("2 = " + list2.removeFront());
            
            // test remove back
            System.out.println("3 = " + list3.removeBack());
            
            // output both lists
            System.out.println("2 = " + list2.toString());
            System.out.println("3 = " + list3.toString());
        }
        
        // test contains        
        System.out.println(list.toString());
        System.out.println("Jets is " + list.contains("Jets"));
        System.out.println("Flames is " + list.contains("Flames"));
        System.out.println("null is " + list.contains(null));
        
        // test add after
        System.out.println(list.toString());
        System.out.println(list.addAfter("Kings", 2));
        System.out.println(list.toString());
        System.out.println(list.addAfter("Canucks", 0));
        System.out.println(list.toString());
        System.out.println(list.addAfter("Knights", list.size()-1));
        System.out.println(list.toString());
        System.out.println(list.addAfter("Flyers", list.size()+1));
        System.out.println(list.toString());
        
        // test add before
        System.out.println(list.toString());
        System.out.println(list.addBefore("Oilers", 2));
        System.out.println(list.toString());
        System.out.println(list.addBefore("Red Wings", 0));
        System.out.println(list.toString());
        System.out.println(list.addBefore("Leafs", list.size()-1));
        System.out.println(list.toString());
        System.out.println(list.addBefore("Habs", list.size()+1));
        System.out.println(list.toString());
        
        // test remove an index
        LinkedList<String> list4 = list.clone();
        int min = -1;
        int max = list4.size() + 1;
        for (int i = max; i >= min; i--) {
            System.out.println(list4.remove(i));
            System.out.println(list4.toString());
        }
        
        // test first index and last index of searches
        list.addAfter("Wheeler", 6);
        list.addAfter("Wheeler", 2);
        list.addAfter("Wheeler", 8);
        System.out.println(list.toString()); 
        System.out.println(list.firstIndexOf("Wheeler"));
        System.out.println(list.firstIndexOf("Red Wings"));
        System.out.println(list.firstIndexOf("Knights"));
        System.out.println(list.firstIndexOf("Cats"));
        System.out.println(list.firstIndexOf(null));
        
        System.out.println(list.lastIndexOf("Wheeler"));
        System.out.println(list.lastIndexOf("Red Wings"));        
        System.out.println(list.lastIndexOf("Knights"));        
        System.out.println(list.lastIndexOf("Cats"));
        System.out.println(list.lastIndexOf(null));
        
        
        
        
        
        ///////////////////////////////////////////////////
        // MORE TESTING TO COME....
        ///////////////////////////////////////////////////
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("\nCollections Test completed!\n");
    }
    


}
