
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
        output("Collections Test started");        
        ///////////////////////////////////////////////////////////////////////
        // build some node objects, testing various constructors
        output("Testing Node code");        
        ///////////////////////////////////////////////////////////////////////
        // various node constructor methods
        Node<String> a = new Node<>();
        Node<String> b = new Node<>("Apples");
        Node<String> c = new Node<>("Oranges",a);
        Node<String> d = new Node<>("Bananas",c,b);
        ///////////////////////////////////////////////////////////////////////
        output("test the overloaded toString method");
        output("Node a",a);
        output("Node b",b);
        output("Node c",c);
        output("Node d",d);
        ///////////////////////////////////////////////////////////////////////
        output("test the equals method");
        output("a == b", a.equals(b));
        output("b == c", b.equals(c));
        output("c == d", c.equals(d));
        ///////////////////////////////////////////////////////////////////////
        output("test clone method");
        Node<String> e = d.clone();   
        output("Node d",d);
        output("Node e",e);
        output("e == d", e.equals(d));
        ///////////////////////////////////////////////////////////////////////
        output("test finalize method");
        e.finalize();
        output("Node e",e);        
        ///////////////////////////////////////////////////////////////////////
        output("Testing LinkedList code");        
        ///////////////////////////////////////////////////////////////////////
        // create a linked list
        LinkedList<String> list1 = new LinkedList<>();
        ///////////////////////////////////////////////////////////////////////
        output("test the size and is empty methods");
        output("Size", list1.size(), list1);
        output("Empty", list1.isEmpty(), list1);
        ///////////////////////////////////////////////////////////////////////
        output("test the over-ridden to string method");
        output("toString",list1);
        ///////////////////////////////////////////////////////////////////////
        output("test the add front method");        
        output("add null",list1.addFront(null),list1);
        output("add Winnipeg",list1.addFront("Winnipeg"),list1);
        output("add Calgary",list1.addFront("Calgary"),list1);
        output("add Edmonton",list1.addFront("Edmonton"),list1);
        ///////////////////////////////////////////////////////////////////////
        output("test the add back method");
        output("add null",list1.addBack(null),list1);
        output("add Vancouver",list1.addBack("Vancouver"),list1);
        output("add Montreal",list1.addBack("Montreal"),list1);
        output("add Quebec",list1.addBack("Quebec"),list1);
        ///////////////////////////////////////////////////////////////////////
        output("re-test size, is empty, to string methods");
        output("Size", list1.size(), list1);
        output("Empty", list1.isEmpty(), list1);        
        ///////////////////////////////////////////////////////////////////////
        // test the get method (accessor method), and test edges:
            // (1) testing typical index (within the list)
            // (2) the list edges (first and last index)
            // (3) beyond the edges (past first and last indices) 
        output("test the get method");
        int edge = list1.size()-1;
        output("get",2,list1.get(2),list1);
        output("get",0,list1.get(0),list1);
        output("get",edge,list1.get(edge),list1);
        output("get",(edge*2),list1.get(edge*2),list1);
        output("get",-1,list1.get(-1),list1);        
        ///////////////////////////////////////////////////////////////////////
        // test the set method (mutator method), and test edges:
            // also test the second argument            
        output("test the set method");
        edge = list1.size()-1;
        output("set",2,"Brandon",list1.set(2,"Brandon"),list1);
        output("set",0,"Winnipeg",list1.set(0,"Winnipeg"),list1);
        output("set",edge,"Portage",list1.set(edge,"Portage"),list1);
        output("set",(edge*2),"Ottawa",list1.set(edge*2,"Ottawa"),list1);
        output("set",-1,"Victoria",list1.set(-1,"Victoria"),list1);
        output("set",2,"null",list1.set(2,null),list1);  
        ///////////////////////////////////////////////////////////////////////
        // create a second list and text clone method
        LinkedList<String> list2 = list1.clone();
        ///////////////////////////////////////////////////////////////////////
        output("display the original and second list");
        output("List 1", list1);
        output("List 2", list2);
        ///////////////////////////////////////////////////////////////////////
        output("test the equals method");
        output("1 == 2", list1.equals(list2));        
        ///////////////////////////////////////////////////////////////////////
        // mutate the second list
        list2.set(2, "Toronto");
        ///////////////////////////////////////////////////////////////////////
        output("display both lists");
        output("List 1",list1);
        output("List 2",list2);        
        ///////////////////////////////////////////////////////////////////////
        output("re-test the equals method");
        output("1 == 2,",list1.equals(list2));        
        ///////////////////////////////////////////////////////////////////////
        // make a third list, a clone of the second
        LinkedList<String> list3 = list2.clone();
        /////////////////////////////////////////////////////////////////////// 
        output("re-test clone, output both lists");
        output("List 2",list2);
        output("List 3",list3);
        ///////////////////////////////////////////////////////////////////////
        // test the remove front and remove back methods, testing all edges
        // and using a loop to continually remove unitl after both lists
        // are empty and beyond, this tests:
            // (1) list with two or more nodes
            // (2) list with one node
            // (3) list with no nodes (empty) 
        output("test the remove front and back methods");
        for (int i = 0; i < list1.size()+1; i++) {   
            // test remove front
            output("Front 2",list2.removeFront(),list2);
            // test remove back
            output("Back  3",list3.removeBack(),list3);
        }
        ///////////////////////////////////////////////////////////////////////
        output("test contains");
        output("Winnipeg",list1.contains("Winnipeg"),list1);
        output("Tokoyo",list1.contains("Tokoyo"),list1);
        output("null",list1.contains(null),list1);
        ///////////////////////////////////////////////////////////////////////
        output("test add after");
        edge = list1.size()+1;
        output("Langley",2,list1.addAfter("Langley", 2),list1);  
        output("Saskatoon",0,list1.addAfter("Saskatoon", 0),list1);
        output("Regina",edge,list1.addAfter("Regina",edge),list1);
        output("Halifax",(edge*2),list1.addAfter("Halifax",edge*2),list1);
        ///////////////////////////////////////////////////////////////////////
        output("test add before");
        edge = list1.size()+1;
        output("Nanaimo",2,list1.addBefore("Nanaimo", 2),list1);
        output("Duncan",0,list1.addBefore("Duncan", 0),list1);
        output("Fernie",edge,list1.addBefore("Fernie",edge),list1);
        output("Kamloops",(edge*2),list1.addBefore("Kamloops",edge*2),list1);
        ///////////////////////////////////////////////////////////////////////
        output("test remove an index");
        LinkedList<String> list4 = list1.clone();
        int min = -1;
        int max = list4.size() + 1;
        for (int i = max; i >= min; i--) {
            output("Removing",i,list4.remove(i),list4);
        }
        ///////////////////////////////////////////////////////////////////////
        output("test first index of search");
        list1.addAfter("Winnipeg", 6);
        list1.addAfter("Winnipeg", 2);
        list1.addAfter("Winnipeg", 8);
        output("Winnipeg",list1.firstIndexOf("Winnipeg"),list1);
        output(list1.front(),list1.firstIndexOf(list1.front()),list1);
        output(list1.back(),list1.firstIndexOf(list1.back()),list1);
        output("Tokoyo",list1.firstIndexOf("Tokoyo"),list1);
        output("null",list1.firstIndexOf(null),list1);
        ///////////////////////////////////////////////////////////////////////
        output("test last index of search");
        output("Winnipeg",list1.lastIndexOf("Winnipeg"),list1);
        output(list1.front(),list1.lastIndexOf(list1.front()),list1);        
        output(list1.back(),list1.lastIndexOf(list1.back()),list1);        
        output("Tokoyo",list1.lastIndexOf("Tokoyo"),list1);
        output("null",list1.lastIndexOf(null),list1);        
        ///////////////////////////////////////////////////////////////////////
        output("test number of method");
        output("Winnipeg",list1.numberOf("Winnipeg"),list1);
        output(list1.front(),list1.numberOf(list1.front()),list1);
        output(list1.back(),list1.numberOf(list1.back()),list1);
        output("Tokoyo",list1.numberOf("Tokoyo"),list1);
        output("null",list1.numberOf(null),list1);
        ///////////////////////////////////////////////////////////////////////
        output("test all indices");
        int[] indices1 = list1.allIndices("Winnipeg");        
        int[] indices2 = list1.allIndices("Tokoyo");
        int[] indices3 = list1.allIndices(null);
        Integer[] indices4 = convert(indices1);
        Integer[] indices5 = convert(indices2);
        Integer[] indices6 = convert(indices3);
        output("Winnipeg",toString(indices4),list1);
        output("Tokoyo",toString(indices5),list1);
        output("null",toString(indices6),list1);
        ///////////////////////////////////////////////////////////////////////
        output("test remove and remove last");
        LinkedList<String> list5 = list1.clone();
        output("Winnipeg","remove",list5.remove("Winnipeg"),list5);
        output("Winnipeg","remove last",list5.removeLast("Winnipeg"),list5);
        output("Tokoyo","remove",list5.remove("Tokoyo"),list5);
        output("Tokoyo","remove last",list5.removeLast("Tokoyo"),list5);
        ///////////////////////////////////////////////////////////////////////
        output("test remove all data");
        output("Winnipeg","remove all",list5.removeAll("Winnipeg"),list5);
        output("Tokoyo","remove all",list5.removeAll("Tokoyo"),list5);
        ///////////////////////////////////////////////////////////////////////
        output("test remove all array");
        LinkedList<String> list6 = list1.clone();
        String[] array1 = {"Winnipeg","Tokoyo","Nanaimo"};
        String[] array2 = null;
        String[] array3 = new String[0];
        output("array 1",toString(array1),list6.removeAll(array1),list6);
        output("array 2",toString(array2),list6.removeAll(array2),list6);
        output("array 3",toString(array3),list6.removeAll(array3),list6);
        ///////////////////////////////////////////////////////////////////////
        output("test remove all list");
        LinkedList<String> list7 = list1.clone();
        LinkedList<String> list8 = new LinkedList<>();
        list8.add("Winnipeg");
        list8.add("Tokoyo");
        list8.add("Nanaimo");
        output("List 1",list8,list7.removeAll(list8),list7);
        LinkedList<String> list9 = new LinkedList<>();
        output("List 1",list9,list7.removeAll(list9),list7);
        ///////////////////////////////////////////////////////////////////////
        output("test clear");
        LinkedList<String> list10 = list1.clone();
        list10.clear();
        output("clear",list10);
        ///////////////////////////////////////////////////////////////////////
        output("test contains all array");
        LinkedList<String> list11 = list1.clone();
        String[] array4 = {"Winnipeg","Tokoyo","Nanaimo"};
        String[] array5 = {"Winnipeg","Nanaimo"};
        output("array 4",toString(array4),list11.containsAll(array4),list11);
        output("array 5",toString(array5),list11.containsAll(array5),list11);
        ///////////////////////////////////////////////////////////////////////
        output("test contains all list");
        LinkedList<String> list12 = new LinkedList<>();
        list12.add("Winnipeg");
        list12.add("Tokoyo");
        list12.add("Nanaimo");
        output("List 1",list12 ,list11.containsAll(list12),list11);
        list12.clear();
        list12.add("Winnipeg");
        list12.add("Nanaimo");
        output("List 2",list12,list11.containsAll(list12),list11);
        ///////////////////////////////////////////////////////////////////////
        output("test add all list");
        LinkedList<String> list13 = new LinkedList<>();
        list13.addAll(list12);
        output("add",list12,list13); 
        list13.addAll(list1);
        output("add",list1,list13); 
        ///////////////////////////////////////////////////////////////////////
        output("test add all list at index");
        list13.clear();
        list13.addAll(list12,1);
        output("add",1,list12,list13);
        list13.addAll(list12);
        list13.addAll(list1,0);
        output("add",0,list1,list13);
        ///////////////////////////////////////////////////////////////////////
        output("test add all array");
        LinkedList<String> list14 = new LinkedList<>();
        list14.addAll(array4);
        output("add",toString(array4),list14); 
        list14.addAll(array5);
        output("add",toString(array5),list14); 
        ///////////////////////////////////////////////////////////////////////
        output("test add all array at index");
        list14.clear();
        list14.addAll(array4,1);
        output("add",1,toString(array4),list14);
        list14.addAll(array4);
        list14.addAll(array5,0);
        output("add",0,toString(array5),list14);
        ///////////////////////////////////////////////////////////////////////
        output("test sub list");
        LinkedList<String> list15 = list1.subList(2, 5);
        output("sub list",2,5,list15,list1);
        LinkedList<String> list16 = list1.subList(2, 2);
        output("sub list",2,2,list16,list1);
        LinkedList<String> list17 = list1.subList(3, 2);
        output("sub list",3,2,list17,list1);
        ///////////////////////////////////////////////////////////////////////
        output("test from array");
        LinkedList<String> list18 = new LinkedList<>();
        LinkedList<String> list19 = new LinkedList<>();
        LinkedList<String> list20 = new LinkedList<>();        
        list18.fromArray(array1);        
        list19.fromArray(array2);        
        list20.fromArray(array3);
        output("from array",toString(array1),list18);
        output("from array",toString(array2),list19);
        output("from array",toString(array3),list20);  
        ///////////////////////////////////////////////////////////////////////
        output("test from list");
        LinkedList<String> list21 = new LinkedList<>();
        LinkedList<String> list22 = new LinkedList<>();        
        list21.fromLinkedList(list18);
        list22.fromLinkedList(list19);         
        output("from list",list18,list21);
        output("from list",list19,list22);
        ///////////////////////////////////////////////////////////////////////
        output("test to array");
        java.lang.System.out.println(list1);
        String[] array6 = new String[0];
        String[] array7 = new String[0];        
        array6 = list1.toArray(array6);
        array7 = list22.toArray(array7);
        output("to array",toString(array6),list1);
        output("to array",toString(array7),list22); 
        ///////////////////////////////////////////////////////////////////////
        output("test constructor with array");
        String[] array8 = null;
        LinkedList<String> list23 = new LinkedList<>(array6);
        LinkedList<String> list24 = new LinkedList<>(array7);
        LinkedList<String> list25 = new LinkedList<>(array7);
        output("array constructor",toString(array6),list23);
        output("array constructor",toString(array7),list24);
        output("array constructor",toString(array8),list25);
        ///////////////////////////////////////////////////////////////////////
        output("test constructor with list");
        LinkedList<String> list26 = new LinkedList<>(list23);
        LinkedList<String> list27 = new LinkedList<>(list24);
        output("list constructor",list23,list26);
        output("list constructor",list24,list27);
        ///////////////////////////////////////////////////////////////////////
        output("Collections Test completed!");
    }

    /**
     * Outputs an array to the screen 
     * 
     * @param array the array to output
     * @param data the name of the data 
     */
    private <T> String toString(T[] array) {
        String data = "[";
        if      (array == null)     data += "null] array";
        else if (array.length == 0) data += "]";
        else if (array.length == 1) data += array[0].toString() + "]";
        else {
            for (int i = 0; i < array.length-1; i++) {
                data += array[i].toString() + ",";
            }
            data += array[array.length-1] + "]";
        }
        return data;
    }
    
    /**
     * converts a primitive array into the array class 
     * 
     * @param array the primitive array
     * @return the array class array
     */
    private Integer[] convert(int[] array) {
        if (array != null) {
            Integer[] a = new Integer[array.length];
            for (int i = 0; i < array.length; i++) {
                a[i] = array[i];
            }
            return a;
        }
        return null;
    }
    
    /**
     * Outputs a string to output with formatting and a line of dots
     * 
     * @param a the string to output
     */
    private void output(String a) {
        final String RESET  = "\033[0m"; 
        final String BLUE   = "\033[0;34m";
        final int    LENGTH = 200;
        int stop = LENGTH - a.length();
        a = a.toUpperCase();        
        for (int i = 0; i < stop; i++) {
            a += ".";
        }
        System.out.println("\n" + BLUE + a + RESET + "\n");
    }
    
    /**
     * Outputs a variety of values
     * 
     * @param <T> the generic data type
     * @param a a string to display
     * @param b the generic data type
     */
    private <T> void output(String a, T b) {
        final String DELIMIT = "\t = ";
        String z = "", y = "";       
        if (a == null) z = new String("null");
        else           z = a.toString();
        if (b == null) y = new String("null");
        else           y = b.toString();
        z = pad(z);
        y = pad(y);
        System.out.println(z + DELIMIT + y);
    }

    /**
     * Outputs a variety of values
     * 
     * @param <T> the first generic data type
     * @param <U> the second generic data type
     * @param a a string to display
     * @param b the first generic data type
     * @param c the second generic data type
     */
    private <T,U> void output(String a, T b, U c) {
        final String DELIMIT = "\t = ";
        String z = "", y = "", x = "";        
        if (a == null) z = new String("null");
        else           z = a.toString();
        if (b == null) y = new String("null");
        else           y = b.toString();
        if (c == null) x = new String("null");
        else           x = c.toString();
        z = pad(z);
        y = pad(y);
        x = pad(x);
        System.out.println(z + DELIMIT + y + DELIMIT + x);
    }

    /**
     * Outputs a variety of values
     * 
     * @param <T> the first generic data type
     * @param <U> the second generic data type
     * @param <V> the third generic data type
     * @param a a string to display
     * @param b the first generic data type
     * @param c the second generic data type
     * @param d the third generic data type
     */
    private <T,U,V> void output(String a, T b, U c, V d) {
        final String DELIMIT = "\t = ";
        String z = "", y = "", x = "", w = "";   
        if (a == null) z = new String("null");
        else           z = a.toString();
        if (b == null) y = new String("null");
        else           y = b.toString();
        if (c == null) x = new String("null");
        else           x = c.toString();
        if (d == null) w = new String("null");
        else           w = d.toString();        
        z = pad(z);
        y = pad(y);
        x = pad(x);
        w = pad(w);
        System.out.println(z + DELIMIT + y + DELIMIT + x + DELIMIT + w);
    }
    
    /**
     * Outputs a variety of values
     * 
     * @param <T> the first generic data type
     * @param <U> the second generic data type
     * @param <V> the third generic data type
     * @param <W> the fourth generic data type
     * @param a a string to display
     * @param b the first generic data type
     * @param c the second generic data type
     * @param d the third generic data type
     * @param e the fourth generic data type 
     */
    private <T,U,V,W> void output(String a, T b, U c, V d, W e) {
        final String DELIMIT = "\t = ";
        String z = "", y = "", x = "", w = "", v = "";        
        if (a == null) z = new String("null");
        else           z = a.toString();
        if (b == null) y = new String("null");
        else           y = b.toString();
        if (c == null) x = new String("null");
        else           x = c.toString();
        if (d == null) w = new String("null");
        else           w = d.toString();     
        if (e == null) v = new String("null");
        else           v = e.toString();  
        z = pad(z);
        y = pad(y);
        x = pad(x);
        w = pad(w);
        v = pad(v);        
        System.out.println(z + DELIMIT + y + DELIMIT + 
                           x + DELIMIT + w + DELIMIT + v);    
    }
    
    /**
     * Adds extra spacing to "pad" the passed word
     * 
     * @param word the word to pad
     * @return a padded word
     */
    private String pad(String word) {
        if (word == null) word = "null";
        final int MAX = 20;
        String paddedWord = word.toString();
        if (paddedWord.length() < MAX) {
            int difference = MAX - paddedWord.length();
            for (int i = 0; i < difference; i++) {
                paddedWord += " ";
            }
        }
        return paddedWord;
    }    
    
}
