
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
        
        // build some node objects, testing various constructors
        output("Testing Node code");
        
        // various node constructor methods
        Node<String> a = new Node<>();
        Node<String> b = new Node<>("Apples");
        Node<String> c = new Node<>("Oranges",a);
        Node<String> d = new Node<>("Bananas",c,b);
        
        // test the overloaded toString method
        output("test the overloaded toString method");
        output("Node a",a);
        output("Node b",b);
        output("Node c",c);
        output("Node d",d);
        
        // test the equals method
        output("test the equals method");
        output("a == b", a.equals(b));
        output("b == c", b.equals(c));
        output("c == d", c.equals(d));
        
        // test clone method
        output("test clone method");
        Node<String> e = d.clone();   
        output("Node d",d);
        output("Node e",e);
        output("e == d", e.equals(d));
        
        // test finalize method
        output("test finalize method");
        e.finalize();
        output("Node e",e);
        
        output("Testing LinkedList code");
        
        // create a linked list
        LinkedList<String> list1 = new LinkedList<>();
        
        // test the size and is empty methods
        output("test the size and is empty methods");
        output("Size", list1.size(), list1);
        output("Empty", list1.isEmpty(), list1);
        
        // test the over-ridden to string method
        output("test the over-ridden to string method");
        output(list1);
        
        // test the add front method 
        output("test the add front method");        
        output("add null",list1.addFront(null),list1);
        output("add Winnipeg",list1.addFront("Winnipeg"),list1);
        output("add Calgary",list1.addFront("Calgary"),list1);
        output("add Edmonton",list1.addFront("Edmonton"),list1);
        
        // test the add back method 
        output("test the add back method");
        output("add null",list1.addBack(null),list1);
        output("add Vancouver",list1.addBack("Vancouver"),list1);
        output("add Montreal",list1.addBack("Montreal"),list1);
        output("add Quebec",list1.addBack("Quebec"),list1);
        
        // re-test the size, is empty, and to string methods
        output("re-test size, is empty, to string methods");
        output("Size", list1.size(), list1);
        output("Empty", list1.isEmpty(), list1);
        
        // test the get method (accessor method), and test edges:
            // (1) testing typical index (within the list)
            // (2) the list edges (first and last index)
            // (3) beyond the edges (past first and last indices) 
        output("test the get method");
        int edge = list1.size()-1;
        output("get 2", list1.get(2), list1);
        output("get 0", list1.get(0), list1);
        output("get " + edge, list1.get(edge), list1);
        output("get " + (edge+2), list1.get(edge+2), list1);
        output("get -1", list1.get(-1), list1);
        
        // test the set method (mutator method), and test edges:
            // also test the second argument            
        output("test the set method");
        edge = list1.size()-1;
        output("set 2,Brandon", list1.set(2,"Brandon"), list1);
        output("set 0,Winnipeg", list1.set(0,"Winnipeg"), list1);
        output("set ",edge,",Portage", list1.set(edge,"Portage"), list1);
        output("set ",(edge+2),",Ottawa", list1.set(edge+2,"Ottawa"), list1);
        output("set -1,Victoria", list1.set(-1,"Victoria"), list1);
        output("set 2,null", list1.set(2,null), list1);                
        
        // create a second list and text clone method
        LinkedList<String> list2 = list1.clone();
        
        // display the original list and the second list
        output("display the original and second list");
        output("List 1", list1);
        output("List 2", list2);
        
        // test the equals method
        output("test the equals method");
        output("1 == 2", list1.equals(list2));
        
        // mutate the second list
        list2.set(2, "Random");
        
        // display both lists
        output("display both lists");
        System.out.println("List 1 = " + list1);
        System.out.println("List 2 = " + list2);
        
        // re-test the equals method
        System.out.println(line("re-test the equals method"));
        System.out.println("1 == 2 is " + list1.equals(list2));
        
        // make a third list, a clone of the second
        LinkedList<String> list3 = list2.clone();
        
        // output both lists        
        System.out.println(line("re-test clone, output both lists"));
        System.out.println("List 2 = " + list2);
        System.out.println("List 3 = " + list3);
        
        // test the remove front and remove back methods, testing all edges
        // and using a loop to continually remove unitl after both lists
        // are empty and beyond, this tests:
            // (1) list with two or more nodes
            // (2) list with one node
            // (3) list with no nodes (empty) 
        System.out.println(line("test the remove front and back methods"));
        for (int i = 0; i < list1.size()+1; i++) {   
            // test remove front
            System.out.println("List 2 = " + list2.removeFront());  
            System.out.println("List 2 = " + list2);
            // test remove back
            System.out.println("List 3 = " + list3.removeBack());
            System.out.println("List 3 = " + list3);
        }
        
        // test contains       
        System.out.println(line("test contains"));
        System.out.println(list1);
        System.out.println("Winnipeg = " + list1.contains("Winnipeg"));
        System.out.println("Tokoyo = " + list1.contains("Tokoyo"));
        System.out.println("null = " + list1.contains(null));
        
        // test add after
        System.out.println(line("test add after"));
        System.out.println(list1);
        System.out.println("Langley, 2 = " + list1.addAfter("Langley", 2));
        System.out.println(list1);
        System.out.println("Saskatoon, 0 = " + list1.addAfter("Saskatoon", 0));
        System.out.println(list1);
        System.out.println("Saskatoon, " + (list1.size()-1) + 
                " = " + list1.addAfter("Regina", list1.size()-1));
        System.out.println(list1);
        System.out.println("Halifax, " + (list1.size()+1) + 
                " = " + list1.addAfter("Halifax", list1.size()+1));
        System.out.println(list1);
        
        // test add before
        System.out.println(line("test add before"));
        System.out.println(list1);
        System.out.println("Nanaimo, 2 = " + list1.addBefore("Nanaimo", 2));
        System.out.println(list1);
        System.out.println("Duncan, 0 = " + list1.addBefore("Duncan", 0));
        System.out.println(list1);
        System.out.println("Fernie, " + (list1.size()-1) + 
                " = " + list1.addBefore("Fernie", list1.size()-1));
        System.out.println(list1);
        System.out.println("Kamloops, " + (list1.size()+1) + 
                " = " + list1.addBefore("Kamloops", list1.size()+1));
        System.out.println(list1);
        
        // test remove an index
        System.out.println(line("test remove an index"));
        LinkedList<String> list4 = list1.clone();
        int min = -1;
        int max = list4.size() + 1;
        for (int i = max; i >= min; i--) {
            System.out.println("Removing " + i + " = " + list4.remove(i));
            System.out.println(list4);
        }
        
        // test first index search
        System.out.println(line("test first index of search"));
        list1.addAfter("Winnipeg", 6);
        list1.addAfter("Winnipeg", 2);
        list1.addAfter("Winnipeg", 8);
        System.out.println(list1); 
        System.out.println("Winnipeg = " + list1.firstIndexOf("Winnipeg"));
        System.out.println(list1.front() + " = " + 
                list1.firstIndexOf(list1.front()));
        System.out.println(list1.back() + " = " + 
                list1.firstIndexOf(list1.back()));
        System.out.println("Tokoyo = " + list1.firstIndexOf("Tokoyo"));
        System.out.println("null = " + list1.firstIndexOf(null));
        
        // test last index search
        System.out.println(line("test last index of search"));
        System.out.println(list1); 
        System.out.println("Winnipeg = " + list1.lastIndexOf("Winnipeg"));
        System.out.println(list1.front() + " = " + 
                list1.lastIndexOf(list1.front()));        
        System.out.println(list1.back() + " = " + 
                list1.lastIndexOf(list1.back()));        
        System.out.println("Tokoyo = " + list1.lastIndexOf("Tokoyo"));
        System.out.println("null = " + list1.lastIndexOf(null));
        
        // test number of method
        System.out.println(line("test number of method"));
        System.out.println(list1);
        System.out.println("Winnipeg = " + list1.numberOf("Winnipeg"));
        System.out.println(list1.front() + " = " + 
                list1.numberOf(list1.front()));
        System.out.println(list1.back() + " = " + 
                list1.numberOf(list1.back()));
        System.out.println("Tokoyo = " + list1.numberOf("Tokoyo"));
        System.out.println("null = " + list1.numberOf(null));
        
        // test all indices 
        System.out.println(line("test all indices"));
        System.out.println(list1);
        int[] indices1 = list1.allIndices("Winnipeg");
        int[] indices2 = list1.allIndices("Tokoyo");
        int[] indices3 = list1.allIndices(null);
        Integer[] indices4 = convert(indices1);
        Integer[] indices5 = convert(indices2);
        Integer[] indices6 = convert(indices3);
        System.out.println(toString(indices4,"Winnipeg"));
        System.out.println(toString(indices5,"Tokoyo"));
        System.out.println(toString(indices6,"null"));
        
        // test remove and remove last
        System.out.println(line("test remove and remove last"));
        LinkedList<String> list5 = list1.clone();
        System.out.println(list5);
        System.out.println("Winnipeg remove = " + list5.remove("Winnipeg"));
        System.out.println(list5);
        System.out.println("Winnipeg remove last = " + list5.removeLast("Winnipeg"));
        System.out.println(list5);
        System.out.println("Tokoyo remove = " + list5.remove("Tokoyo"));
        System.out.println(list5);
        System.out.println("Tokoyo remove last = " + list5.removeLast("Tokoyo"));
        System.out.println(list5);
        
        // test remove all data
        System.out.println(line("test remove all data"));
        System.out.println(list5);
        System.out.println("Winnipeg remove all = " + list5.removeAll("Winnipeg"));
        System.out.println(list5);
        System.out.println("Tokoyo remove all = " + list5.removeAll("Tokoyo"));
        System.out.println(list5);
        
        // test remove all array
        System.out.println(line("test remove all array"));
        LinkedList<String> list6 = list1.clone();
        System.out.println(list6);
        String[] array1 = {"Winnipeg","Tokoyo","Nanaimo"};
        String[] array2 = null;
        String[] array3 = new String[0];
        String output1 = toString(array1, "array") + " = ";
        String output2 = toString(array2, "array") + " = ";
        String output3 = toString(array3, "array") + " = ";
        System.out.println(output1 + list6.removeAll(array1));
        System.out.println(list6);        
        System.out.println(output2 + list6.removeAll(array2));
        System.out.println(list6);        
        System.out.println(output3 + list6.removeAll(array3));
        System.out.println(list6);
        
        // test remove all list
        System.out.println(line("test remove all list"));
        LinkedList<String> list7 = list1.clone();
        LinkedList<String> list8 = new LinkedList<>();
        list8.add("Winnipeg");
        list8.add("Tokoyo");
        list8.add("Nanaimo");
        System.out.println(list8 + " = " + list7.removeAll(list8));
        System.out.println(list7);
        LinkedList<String> list9 = new LinkedList<>();
        System.out.println(list9 + " = " + list7.removeAll(list9));
        System.out.println(list7);
        
        // test clear
        System.out.println(line("test clear"));
        LinkedList<String> list10 = list1.clone();
        System.out.println(list10);
        list10.clear();
        System.out.println(list10);
                
        // test contains all array
        System.out.println(line("test contains all array"));
        LinkedList<String> list11 = list1.clone();
        System.out.println(list11);
        String[] array4 = {"Winnipeg","Tokoyo","Nanaimo"};
        String[] array5 = {"Winnipeg","Nanaimo"};
        String output4 = toString(array4, "array") + " = ";
        String output5 = toString(array5, "array") + " = ";
        System.out.println(output4 + list11.containsAll(array4));
        System.out.println(output5 + list11.containsAll(array5));
                
        // test contains all list
        System.out.println(line("test contains all list"));
        System.out.println(list11);
        LinkedList<String> list12 = new LinkedList<>();
        list12.add("Winnipeg");
        list12.add("Tokoyo");
        list12.add("Nanaimo");
        System.out.println(list12 + " = " + list11.containsAll(list12));
        list12.clear();
        list12.add("Winnipeg");
        list12.add("Nanaimo");
        System.out.println(list12 + " = " + list11.containsAll(list12));
                
        // test add all list
        System.out.println(line("test add all list"));
        LinkedList<String> list13 = new LinkedList<>();
        System.out.println(list13);
        list13.addAll(list12);
        System.out.println(list13);
        list13.addAll(list1);
        System.out.println(list13);
                
        // test add all list at index
        System.out.println(line("test add all list at index"));
        list13.clear();
        System.out.println(list13);
        list13.addAll(list12,1);
        System.out.println(list13);
        list13.addAll(list12);
        System.out.println(list13);
        list13.addAll(list1,0);
        System.out.println(list13);
        
        // test add all array
        System.out.println(line("test add all array"));
        LinkedList<String> list14 = new LinkedList<>();
        System.out.println(list14);
        list14.addAll(array4);
        System.out.println(list14);
        list14.addAll(array5);
        System.out.println(list14);
        
        // test add all array at index
        System.out.println(line("test add all array at index"));
        list14.clear();
        System.out.println(list14);
        list14.addAll(array4,1);
        System.out.println(list14);
        list14.addAll(array4);
        System.out.println(list14);
        list14.addAll(array5,0);
        System.out.println(list14);
        
        // test sub list
        System.out.println(line("test sub list"));
        System.out.println(list1);
        LinkedList<String> list15 = list1.subList(2, 5);
        System.out.println(list15);
        LinkedList<String> list16 = list1.subList(2, 2);
        System.out.println(list16);
        LinkedList<String> list17 = list1.subList(3, 2);
        System.out.println(list17);
                
        // test from array
        System.out.println(line("test from array"));
        LinkedList<String> list18 = new LinkedList<>();
        LinkedList<String> list19 = new LinkedList<>();
        LinkedList<String> list20 = new LinkedList<>();        
        list18.fromArray(array1);        
        list19.fromArray(array2);        
        list20.fromArray(array3);
        System.out.println(list18);
        System.out.println(list19);
        System.out.println(list20);        
        
        // test from list
        System.out.println(line("test from list"));
        LinkedList<String> list21 = new LinkedList<>();
        LinkedList<String> list22 = new LinkedList<>();        
        list21.fromLinkedList(list18);
        list22.fromLinkedList(list19); 
        System.out.println(list21);
        System.out.println(list22);
        
        // test to array
        System.out.println(line("test to array"));
        System.out.println(list1);
        String[] array6 = new String[0];
        String[] array7 = new String[0];        
        array6 = list1.toArray(array6);
        array7 = list22.toArray(array6);
        String output6 = toString(array6, "array");
        String output7 = toString(array7, "array");
        System.out.println(output6);
        System.out.println(output7);        
        
        // test constructor with array
        System.out.println(line("test constructor with array"));
        String[] array8 = null;
        LinkedList<String> list23 = new LinkedList<>(array6);
        LinkedList<String> list24 = new LinkedList<>(array7);
        LinkedList<String> list25 = new LinkedList<>(array7);
        System.out.println(list23);
        System.out.println(list24);
        System.out.println(list25);
        
        // test constructor with list
        System.out.println(line("test constructor with list"));
        LinkedList<String> list26 = new LinkedList<>(list23);
        LinkedList<String> list27 = new LinkedList<>(list24);
        System.out.println(list26);
        System.out.println(list27);
        
        System.out.println("\nCollections Test completed!\n");
    }

    /**
     * Creates a line for output
     * 
     * @return a dotted line
     */
    private String line(String text) {
        final String RESET = "\033[0m"; 
        final String BLUE  = "\033[0;34m";
        int stop = 200-text.length();
        text = text.toUpperCase();        
        for (int i = 0; i < stop; i++) {
            text += ".";
        }
        return "\n" + BLUE + text + RESET + "\n";
    }

    /**
     * Outputs an array to the screen 
     * 
     * @param array the array to output
     * @param data the name of the data 
     */
    private <T> String toString(T[] array, String data) {
        data = data + ": [";
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
    
    private void output(String a) {
        System.out.println(line(a));
    }
    
    private <T> void output(String a, T item) {
        System.out.println(a + "\t = " + item.toString());
    }
    
    private void output(LinkedList list) {
        System.out.println(list.toString());
    }
     
    private <T> void output(String a, T item, LinkedList list) {
        if (item == null) item = (T)new String("null");
        final int MAX = 10;
        String text = item.toString();
        if (text.length() < MAX) {
            int difference = MAX - text.length();
            for (int i = 0; i < difference; i++) {
                text += " ";
            }
        }
        System.out.println(a + "\t = " + text + "\t -> " +  list.toString());
    }

    private <T> void output(String a, int b, String c, T d, 
            LinkedList<String> list) {
        String text = a + b + c;
        output(text,d,list);
    }
    
}
