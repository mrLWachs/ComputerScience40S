
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
        
        // output node objects
        System.out.println("\nTesting node toString method...\n");
        System.out.println("Node a\t= " + a.toString());               
        System.out.println("Node b\t= " + b.toString());
        System.out.println("Node c\t= " + c.toString());
        System.out.println("Node d\t= " + d.toString());
        System.out.println("Node e\t= " + e.toString());
        System.out.println("Node f\t= " + f.toString());
                
        // test equals
        System.out.println("\nTesting node equals method...\n");
        System.out.println("c == a \t= " + c.equals(a));   
        System.out.println("c == b \t= " + c.equals(b));   
        System.out.println("c == e \t= " + c.equals(e));   
        System.out.println("c == f \t= " + c.equals(f));   
        
        System.out.println("\nTesting node clone method...\n");
        Node g = f.clone();                             // test clone
        System.out.println("Original Node \t= " + f.toString());
        System.out.println("Clone Node    \t= " + g.toString());
        
        // create Linked List object
        LinkedList<Integer> list = new LinkedList<>();
        
        // testing isEmpty, size, and toString
        System.out.println("\nTest LinkedList isEmpty,size,"
                + "toString method...\n");
        System.out.println("Empty  \t= " + list.isEmpty());
        System.out.println("Size   \t= " + list.size());        
        System.out.println("String \t= " + list.toString());
        
        // testing add to the front
        System.out.println("\nTest LinkedList add front method...\n");
        System.out.println("null to Front \t= " + list.addFront(null));
        System.out.println(17 + " to Front \t= " + list.addFront(17));
        System.out.println(26 + " to Front \t= " + list.addFront(26));
        System.out.println(59 + " to Front \t= " + list.addFront(59));
        System.out.println(list.toString());
        
        // testing add to the back
        System.out.println("\nTest LinkedList add back method...\n");
        System.out.println("null to Back \t= " + list.addBack(null));
        System.out.println(45 + " to Back \t= " + list.addBack(45));
        System.out.println(99 + " to Back \t= " + list.addBack(99));
        System.out.println(12 + " to Back \t= " + list.addBack(12));
        System.out.println(list.toString());
        
        // edge testing the get method (accessor)
        System.out.println("\nTest LinkedList get method...\n");
        System.out.println(list.toString());
        System.out.println("Get(" + 0 + ")\t= " + list.get(0));
        System.out.println("Get(" + 1 + ")\t= " + list.get(1));
        System.out.println("Get(" + 5 + ")\t= " + list.get(5));
        System.out.println("Get(" + -3 + ")\t= " + list.get(-3));
        System.out.println("Get(" + 15 + ")\t= " + list.get(15));
        
        // edge testing the set method (mutator)
        System.out.println("\nTest LinkedList set method...\n");
        System.out.println(list.toString());
        System.out.println("Set(" + 0 + "," + 97 + ")\t= " + list.set(0,97));
        System.out.println("Set(" + 1 + "," + 65 + ")\t= " + list.set(1,65));
        System.out.println("Set(" + 5 + "," + 15 + ")\t= " + list.set(5,15));
        System.out.println("Set(" + -3 + "," + 45 + ")\t= " + list.set(-3,45));
        System.out.println("Set(" + 15 + "," + 93 + ")\t= " + list.set(15,93));
        System.out.println("Set(" + 2 + ",null)\t= " + list.set(2,null));
        System.out.println(list.toString());
        
        // created a new list
        LinkedList<Integer> list2 = new LinkedList<>();
        
        // test the equals method
        System.out.println("\nTest LinkedList equals method...\n");
        System.out.println("List1 == List2 \t= " + list.equals(list2));
        
        // test clone method
        System.out.println("\nTest LinkedList clone method...\n");
        list2 = list.clone();        
        System.out.println("Original \t= " + list.toString());
        System.out.println("Clone    \t= " + list2.toString()); 
        System.out.println("\nTest LinkedList equals after clone method...\n");
        System.out.println("List1 == List2 \t= " + list.equals(list2));
        
        // test front and back
        System.out.println("\nTest LinkedList front and back methods...\n");
        System.out.println(list.toString());
        System.out.println("Front \t= " + list.front());
        System.out.println("Front \t= " + list.back());
        System.out.println("\nTest LinkedList finalize methods...\n");
        list2.finalize();
        System.out.println(list.toString());
        System.out.println("Front \t= " + list.front());
        System.out.println("Back \t= " + list.back());
        
        // test remove front
        System.out.println("\nTest LinkedList remove front method...\n");        
        list2 = list.clone();
        System.out.println("\t\t\t= " + list.toString());
        for (int i = 0; i < list.size()+1; i++) {
            System.out.println("Remove front = " + list2.removeFront() + 
                    "\t= " + list2.toString());
        }
        
        // test remove back
        System.out.println("\nTest LinkedList remove back method...\n");        
        list2 = list.clone();
        System.out.println("\t\t\t= " + list.toString());
        for (int i = 0; i < list.size()+1; i++) {
            System.out.println("Remove back = " + list2.removeBack()+ 
                    "\t= " + list2.toString());
        }
        
        // test contains method
        System.out.println("\nTest LinkedList contains method...\n"); 
        System.out.println(list);
        System.out.println("Contains " + 12 + "\t= " + list.contains(12));
        System.out.println("Contains " + 65 + "\t= " + list.contains(65));
        System.out.println("Contains " + 97 + "\t= " + list.contains(97));
        System.out.println("Contains " + 15 + "\t= " + list.contains(15));
        System.out.println("Contains " + 65 + "\t= " + list2.contains(65));
        
        // test add after
        System.out.println("\nTest LinkedList add after method...\n"); 
        System.out.println("\t\t\t= " + list.toString());
        System.out.println(list.addAfter(49,2) + "\t= Add(" + 49 + "," + 2 + 
                           ")\t= " + list.toString());
        System.out.println(list.addAfter(49,0) + "\t= Add(" + 49 + "," + 0 + 
                           ")\t= " + list.toString());
        System.out.println(list.addAfter(49,list.size()-1) + "\t= Add(" + 
                          49 + "," + (list.size()-1) + 
                           ")\t= " + list.toString());
        System.out.println(list.addAfter(49,list.size()+1) + "\t= Add(" + 
                          49 + "," + (list.size()+1) + 
                           ")\t= " + list.toString());
        System.out.println(list.addAfter(null,2) + "\t= Add(null," + 2 + 
                           ")\t= " + list.toString());
                
        // test add before
        System.out.println("\nTest LinkedList add before method...\n"); 
        System.out.println("\t\t\t= " + list.toString());
        System.out.println(list.addBefore(49,2) + "\t= Add(" + 49 + "," + 2 + 
                           ")\t= " + list.toString());
        System.out.println(list.addBefore(49,0) + "\t= Add(" + 49 + "," + 0 + 
                           ")\t= " + list.toString());
        System.out.println(list.addBefore(49,list.size()-1) + "\t= Add(" + 
                          49 + "," + (list.size()-1) + 
                           ")\t= " + list.toString());
        System.out.println(list.addBefore(49,list.size()+1) + "\t= Add(" + 
                          49 + "," + (list.size()+1) + 
                           ")\t= " + list.toString());
        System.out.println(list.addBefore(null,2) + "\t= Add(null," + 2 + 
                           ")\t= " + list.toString());
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("\nCollections complete!\n");
    }

}
