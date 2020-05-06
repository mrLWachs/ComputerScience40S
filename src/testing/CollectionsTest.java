
/** required package class namespace */
package testing;

/** required imports */
import collections.LinkedList;
import collections.Node;

 
/**
 * CollectionsTest.java - tests the concepts learned in this unit
 *
 * @author Mr. Wachs
 * @since 6-May-2020, 1:05:12 PM
 */
public class CollectionsTest 
{

    /**
     * Default constructor, set class properties
     */
    public CollectionsTest() {
        comment("Collections test started");
        
        comment("Build node objects, test node constructors");
        Node<String> a = new Node<>();
        Node<String> b = new Node<>("Apples");
        Node<String> c = new Node<>("Oranges",a);
        Node<String> d = new Node<>("Bananas",c,b);
        
        comment("Test the overloaded toString method");
        System.out.println("Node a = " + a.toString());
        System.out.println("Node b = " + b.toString());
        System.out.println("Node c = " + c.toString());
        System.out.println("Node d = " + d.toString());
        
        comment("Test the equals method");
        System.out.println("a == b is " + a.equals(b));
        System.out.println("b == c is " + b.equals(c));
        System.out.println("c == d is " + c.equals(d));
        
        comment("Test clone method");
        Node<String> e = d.clone();
        System.out.println("Node e = " + e.toString());
        System.out.println("d == e is " + d.equals(e));
        
        comment("Test finalize method");
        e.finalize();
        System.out.println("Node e = " + e.toString());
        
        comment("Create a linked list");
        LinkedList<Integer> list1 = new LinkedList<>();
        
        comment("Test the size and is empty methods");
        System.out.println(list1.toString());
        System.out.println(list1.isEmpty());
        System.out.println(list1.size());
        
        comment("Create constants for creation");
        final int SIZE = 5;
        final double L = 0;
        final double H = 9;
               
        comment("Test addFront method");
        for (int i = 0; i < SIZE; i++) {
            int primitive = (int)((H - L + 1d)*Math.random() + L);
            Integer integer = new Integer(primitive);
            list1.addFront(integer);
            System.out.println("Size " + list1.size() +
                               " = "   + list1.toString());
        }
        
        comment("Test addBack method");
        for (int i = 0; i < SIZE; i++) {
            int primitive = (int)((H - L + 1d)*Math.random() + L);
            Integer integer = new Integer(primitive);
            list1.addBack(integer);
            System.out.println("Size " + list1.size() +
                               " = "   + list1.toString());
        }
        
        comment("Test finalize method");
        list1.finalize();
        System.out.println("Size " + list1.size() +
                           " = "   + list1.toString());
        
        
        comment("Collections test complete!");                  
    }
    
    /**
     * Outputs a string to output with color formatting and a line of dots
     * 
     * @param text the string to output
     */
    private void comment(String text) {
        final int LINE_MAX = 80;                    // max line length for dots
        int remaining = LINE_MAX - text.length();   // calculate remianing space 
        for (int i = 0; i < remaining; i++) {       // loop to add dots
            text += ".";                            // add dot
        }        
        final String RESET  = "\033[0m";            // constant for color reset
        final String COLOR  = "\033[0;32m";         // constant for color 
        System.out.println(COLOR + text + RESET);   // output with colors
    }
    
}
