
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
        System.out.println("d == e is " + d.equals(e));
        
        comment("Create a linked list");
        LinkedList<Integer> list1 = new LinkedList<>();
        
        comment("Test the size and is empty methods");
        System.out.println(list1.toString());
        System.out.println(list1.isEmpty());
        System.out.println(list1.size());
        
        comment("Create constants for testing");
        final int SIZE = 5;
        final double L = 0;
        final double H = 9;
        comment("Create variables for testing");
        Integer data;
        int index;
                       
        comment("Test addFront method");
        for (int i = 0; i < SIZE; i++) {
            data = new Integer((int)((H-L+1d)*Math.random()+L));
            list1.addFront(data);
            System.out.println("Size " + list1.size() +
                               " = "   + list1.toString());
        }
        
        comment("Test addBack method");
        for (int i = 0; i < SIZE; i++) {
            data = new Integer((int)((H-L+1d)*Math.random()+L));
            list1.addBack(data);
            System.out.println("Size " + list1.size() +
                               " = "   + list1.toString());
        }
                
        comment("Test get method");
        for (int i = 0-1; i < list1.size()+1; i++) {
            data = list1.get(i);
            System.out.println("Get (" + i + ") = " + data);
        }
                
        comment("Test set method");
        for (int i = 0-1; i < list1.size()+1; i++) {
            data = new Integer(i);
            System.out.println("Set (" + i + ") to " + data +
                               " -> " + list1.set(i, data) +
                               " -> " + list1.toString());
        }
                
        comment("Test clone method");
        LinkedList<Integer> list2 = list1.clone();
        System.out.println(list1.toString());
        System.out.println(list2.toString());
        
        comment("Test equals method");
        System.out.println("list1 == list2 -> " + list1.equals(list2));
        
        comment("Test finalize method");
        list2.finalize();
        System.out.println(list1.toString());
        System.out.println(list2.toString());
        
        comment("Test equals method");
        System.out.println("list1 == list2 -> " + list1.equals(list2));

        comment("Cloning list 2 again");
        list2 = list1.clone();
        
        comment("Test addBefore method");
        
        comment("List before adding");
        System.out.println(list1.toString());
        
        comment("Testing inside edges");
        data  = 0;
        index = 0;
        System.out.println("addBefore(" + data + "," + index + 
                           ") -> " + list1.addBefore(data,index) + 
                           " -> "  + list1.toString());
        
        data  = 0;
        index = list1.size()-1;
        System.out.println("addBefore(" + data + "," + index + 
                           ") -> " + list1.addBefore(data,index) + 
                           " -> "  + list1.toString());
                
        comment("Testing outside edges");
        data  = 0;
        index = -1;
        System.out.println("addBefore(" + data + "," + index + 
                           ") -> " + list1.addBefore(data,index) + 
                           " -> "  + list1.toString());
        
        data  = 0;
        index = list1.size();
        System.out.println("addBefore(" + data + "," + index + 
                           ") -> " + list1.addBefore(data,index) + 
                           " -> "  + list1.toString());
                
        comment("Testing random insertion points");
        for (int i = 0; i < SIZE; i++) {
            data  = new Integer((int)((H-L+1d)*Math.random()+L));
            index = (int)(((list2.size()-1)-0d+1d)*Math.random()+0d);
            System.out.println("addBefore(" + data + "," + index + 
                               ") -> " + list1.addBefore(data,index) + 
                               " -> "  + list1.toString());
        }
        
        comment("Test addAfter method");
        
        comment("List before adding");
        System.out.println(list2.toString());
        
        comment("Testing inside edges");
        data  = 0;
        index = 0;
        System.out.println("addAfter(" + data + "," + index + 
                           ") -> " + list2.addAfter(data,index) + 
                           " -> "  + list2.toString());
        
        data  = 0;
        index = list2.size()-1;
        System.out.println("addAfter(" + data + "," + index + 
                           ") -> " + list2.addAfter(data,index) + 
                           " -> "  + list2.toString());
                
        comment("Testing outside edges");
        data  = 0;
        index = -1;
        System.out.println("addAfter(" + data + "," + index + 
                           ") -> " + list2.addAfter(data,index) + 
                           " -> "  + list2.toString());
        
        data  = 0;
        index = list2.size();
        System.out.println("addAfter(" + data + "," + index + 
                           ") -> " + list2.addAfter(data,index) + 
                           " -> "  + list2.toString());
         
        comment("Testing random insertion points");
        for (int i = 0; i < SIZE; i++) {
            data  = new Integer((int)((H-L+1d)*Math.random()+L));
            index = (int)(((list2.size()-1)-0d+1d)*Math.random()+0d);
            System.out.println("addAfter(" + data + "," + index + 
                               ") -> " + list2.addAfter(data,index) + 
                               " -> "  + list2.toString());
        }
        
        comment("Create a third empty list");
        LinkedList<Integer> list3 = new LinkedList<>();
        comment("Create a fourth list with 1 item");
        LinkedList<Integer> list4 = new LinkedList<>();
        list4.add(9);
        
        comment("Test front and back");
        System.out.println("List 1 front -> " + list1.front() +
                           " -> " + list1.toString());
        System.out.println("List 1 back  -> " + list1.back() +
                           " -> " + list1.toString());
        System.out.println("List 3 front -> " + list3.front() +
                           " -> " + list3.toString());
        System.out.println("List 3 back  -> " + list3.back() +
                           " -> " + list3.toString());
        System.out.println("List 4 front -> " + list4.front() +
                           " -> " + list4.toString());
        System.out.println("List 4 back  -> " + list4.back() +
                           " -> " + list4.toString());
        
        comment("Test remove front method"); 
        System.out.println(list2.toString());
        int end = list2.size();
        for (int i = 0; i <= end; i++) {
            System.out.println("Remove front -> " + list2.removeFront() +
                    " -> " + list2.toString());
        }
        
        comment("Clone list 1 onto list2");
        list2 = list1.clone();
        
        comment("Test remove back method");
        System.out.println(list2.toString());
        end = list2.size();
        for (int i = 0; i <= end; i++) {
            System.out.println("Remove back -> " + list2.removeBack() +
                    " -> " + list2.toString());
        }
        
        comment("Clone list 1 onto list2");
        list2 = list1.clone();
        
        comment("Test Remove index");
        System.out.println(list2.toString());
        
        comment("Test remove edges first");
        System.out.println("Remove index(" + 0 + ") -> " +
                           list2.remove(0) + " -> " + 
                           list2.toString());
        System.out.println("Remove index(" + (list2.size()-1) + ") -> " +
                           list2.remove(list2.size()-1) + " -> " + 
                           list2.toString());
        
        comment("Test random remove indices");
        end = list2.size();
        for (int i = 0; i <= end; i++) {
            index = (int)(((list2.size()-1)-0d+1d)*Math.random()+0d);
            System.out.println("Remove index(" + index + ") -> " +
                    list2.remove(index) + " -> " + list2.toString());
        }
        
        
        
        
        
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
