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
        
        ////////////////////////////////////////////////////////////////////////
        comment("Node Test constructors");
        Node<String> a = new Node<>();
        Node<String> b = new Node<>("Apples");
        Node<String> c = new Node<>("Oranges",a);
        Node<String> d = new Node<>("Bananas",c,b);
        
        ////////////////////////////////////////////////////////////////////////
        comment("Node Test the overloaded toString method");        
        output("Node a",a);
        output("Node b",b);
        output("Node c",c);
        output("Node d",d);
        
        ////////////////////////////////////////////////////////////////////////
        comment("Node Test the equals method");
        output("a == b",a.equals(b));
        output("b == c",b.equals(c));
        output("c == d",c.equals(d));
        
        ////////////////////////////////////////////////////////////////////////
        comment("Node Test clone method");
        Node<String> e = d.clone();
        output("Node e",e);
        output("d == e",d.equals(e));
             
        ////////////////////////////////////////////////////////////////////////
        comment("Node Test finalize method");
        e.finalize();
        output("Node e",e);
        output("d == e",d.equals(e));
        
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
    
    /**
     * Turns the array into a string for output
     * 
     * @param a the array to convert
     * @return a string representation of the array contents
     */
    private String array(Integer[] a) {
        if (a == null)     return "null";           // check for null array
        if (a.length == 0) return "[]";             // check for empty array
        String text = "[";                          // create text start
        for (int i = 0; i < a.length - 1; i++) {    // traverse array
            text += a[i] + ",";                     // add content
        }
        return text + a[a.length-1] + "]";          // return with array end
    }

    /**
     * Turns the array into a string for output
     * 
     * @param a the array to convert
     * @return a string representation of the array contents
     */
    private String array(int[] a) {
        if (a == null)     return "null";           // check for null array
        if (a.length == 0) return "[]";             // check for empty array
        String text = "[";                          // create text start
        for (int i = 0; i < a.length - 1; i++) {    // traverse array
            text += a[i] + ",";                     // add content
        }
        return text + a[a.length-1] + "]";          // return with array end
    }
  
    /**
     * Random value created in a range
     * 
     * @param low the lowest possible number
     * @param high the highest possible number
     * @return random number between low and high
     */
    private Integer random(double low, double high) {
        return new Integer((int)((high-low+1d)*Math.random()+low));
    }
    
    /**
     * Random value between 0 and the size of the list
     * 
     * @param list the linked list to use
     * @return random value between 0 and the size of the list
     */
    private int random(LinkedList<Integer> list) {
        return 0; //(int)(((list.size()-1)-0d+1d)*Math.random()+0d);
    }
    /**
     * Creates a linked list of a set size filled with random values
     * 
     * @param size the size of the list to make
     * @param low the lowest possible number
     * @param high the highest possible number
     * @return a linked list filled with random values
     */
    private LinkedList<Integer> randomList(int size, double low, double high) {
        LinkedList<Integer> list = new LinkedList<>();      // create list
        for (int i = 0; i < size; i++) {                    // traverse to size
//            list.add(random(low,high));                     // add random value
        }
        return list;                                        // send back list
    }

    /**
     * Outputs test values 
     * 
     * @param a an output object
     */
    private void output(Object a) {
        String text = "";
        if (a == null) text += "null";
        else text += a.toString();
        System.out.println(text);        
    }
    
    /**
     * Outputs test values 
     * 
     * @param a an output object
     * @param b an output object
     */
    private void output(Object a, Object b) {
        String text = "";
        if (a == null) text += "null";
        else text += a.toString();
        text += " -> ";
        if (b == null) text += "null";
        else text += b.toString();
        System.out.println(text);        
    }
    
    /**
     * Outputs test values 
     * 
     * @param a an output object
     * @param b an output object
     * @param c an output object
     */
    private void output(Object a, Object b, Object c) {
        String text = "";
        if (a == null) text += "null";
        else text += a.toString();
        text += " -> ";
        if (b == null) text += "null";
        else text += b.toString();
        text += " -> ";
        if (c == null) text += "null";
        else text += c.toString();        
        System.out.println(text);        
    }

    /**
     * Outputs test values 
     * 
     * @param a an output object
     * @param b an output object
     * @param c an output object
     * @param d an output object
     */
    private void output(Object a, Object b, Object c, Object d) {
        String text = "";
        if (a == null) text += "null";
        else text += a.toString();
        text += " -> ";
        if (b == null) text += "null";
        else text += b.toString();
        text += " -> ";
        if (c == null) text += "null";
        else text += c.toString();    
        text += " -> ";
        if (d == null) text += "null";
        else text += d.toString(); 
        System.out.println(text);        
    }
    
    /**
     * Outputs test values 
     * 
     * @param a an output object
     * @param b an output object
     * @param c an output object
     * @param d an output object
     * @param e an output object
     */
    private void output(Object a, Object b, Object c, Object d, Object e) {
        String text = "";
        if (a == null) text += "null";
        else text += a.toString();
        text += " -> ";
        if (b == null) text += "null";
        else text += b.toString();
        text += " -> ";
        if (c == null) text += "null";
        else text += c.toString();    
        text += " -> ";
        if (d == null) text += "null";
        else text += d.toString(); 
        text += " -> ";
        if (e == null) text += "null";
        else text += e.toString(); 
        System.out.println(text);        
    }
    
}