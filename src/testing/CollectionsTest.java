
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
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Create constants for testing");
        final double L    = 0;
        final double H    = 9;
        final int    SIZE = ((int)(H / 2)) + 1;
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Create variables for testing");
        Integer data;
        int index, end;
        int[] indices;
        boolean result;
            
        ////////////////////////////////////////////////////////////////////////    
        comment("LinkedList Test constructor");
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        LinkedList<Integer> list3 = new LinkedList<>();
        LinkedList<Integer> list4 = new LinkedList<>();
        LinkedList<Integer> list5 = new LinkedList<>();
        LinkedList<Integer> list6 = new LinkedList<>();
        LinkedList<Integer> list7 = new LinkedList<>();
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Test size and isEmpty methods");
        output("toString",list1.toString());
        output("isEmpty",list1.isEmpty());
        output("size",list1.size());
              
        ////////////////////////////////////////////////////////////////////////    
        comment("LinkedList Test addFront method");
        output(list1);
        for (int i = 0; i < SIZE; i++) {
            data   = random(L,H);
            result = list1.addFront(data);
            output("addFront",result,list1);
        }
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Test addBack method");
        output(list1);
        for (int i = 0; i < SIZE; i++) {
            data   = random(L,H);
            result = list1.addBack(data);
            output("addBack",result,list1);
        }
              
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Test get method");
        for (int i = 0-1; i < list1.size()+1; i++) {
            data = list1.get(i);
            output("Get",i,data,list1);
        }
               
        //////////////////////////////////////////////////////////////////////// 
        comment("LinkedList Test set method");
        for (int i = 0-1; i < list1.size()+1; i++) {
            data   = new Integer(i);
            result = list1.set(i, data);
            output("Set",i,data,result,list1);
        }
                
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Test clone method");
        list2 = list1.clone();
        output("clone",list1);
        output("clone",list2);
                
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Test equals method");
        output("list1 == list2",list1.equals(list2));
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Test finalize method");
        list2.finalize();
        output(list1);
        output("finalize",list2);
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Test equals method");
        result = list1.equals(list2);
        output("list1 == list2",result);

        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList randomizing list");
        list1 = randomList(SIZE, L, H);
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Test addBefore method");
        output(list1);
        
        data   = random(L, H);
        index  = 0;
        result = list1.addBefore(data,index);
        output("addBefore edge",data,index,result,list1);
        
        data   = random(L, H);
        index  = list1.size()-1;
        result = list1.addBefore(data,index);
        output("addBefore edge",data,index,result,list1);
                
        data   = random(L, H);
        index  = -1;
        result = list1.addBefore(data,index);
        output("addBefore edge",data,index,result,list1);
        
        data   = random(L, H);
        index  = list1.size();
        result = list1.addBefore(data,index);
        output("addBefore edge",data,index,result,list1);
                
        for (int i = 0; i < SIZE; i++) {
            data   = random(L, H);
            index  = random(list1);
            result = list1.addBefore(data,index);
            output("addBefore random",data,index,result,list1);
        }
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Test addAfter method");
        output(list1);
        
        data   = random(L, H);
        index  = 0;
        result = list1.addAfter(data,index);
        output("addAfter edge",data,index,result,list1);
        
        data   = random(L, H);
        index  = list1.size()-1;
        result = list1.addAfter(data,index);
        output("addAfter edge",data,index,result,list1);
                
        data   = random(L, H);
        index  = -1;
        result = list1.addAfter(data,index);
        output("addAfter edge",data,index,result,list1);
        
        data   = random(L, H);
        index  = list1.size();
        result = list1.addAfter(data,index);
        output("addAfter edge",data,index,result,list1);
                
        for (int i = 0; i < SIZE; i++) {
            data   = random(L, H);
            index  = random(list1);   
            result = list1.addAfter(data,index);
            output("addAfter random",data,index,result,list1);
        }
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList empty list 2 and a list 3 with 1 item");
        list2 = new LinkedList<>();
        list3 = new LinkedList<>();        
        list3.add(9);
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Test front and back");                
        output("List 1 front",list1.front(),list1);
        output("List 1 back",list1.back(),list1);
        output("List 2 front",list2.front(),list2);
        output("List 2 back",list2.back(),list2);
        output("List 3 front",list3.front(),list3);
        output("List 3 back",list3.back(),list3);
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList cloning list 1 onto list 2");
        list2 = list1.clone();
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Test removeFront method"); 
        output(list2);
        end = list2.size();
        for (int i = 0; i <= end; i++) {
            output("removeFront",list2.removeFront(),list2);
        }
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Clone list 1 onto list2");
        list2 = list1.clone();
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Test removeBack method");
        output(list2);
        end = list2.size();
        for (int i = 0; i <= end; i++) {
            output("removeBack",list2.removeBack(),list2);
        }
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Clone list 1 onto list2");
        list2 = list1.clone();
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Test remove index");   
        output(list2);
        output("remove edge",0,list2.remove(0),list2);
        end = end - 1;
        output("remove edge",end,list2.remove(end),list2);
        end = list2.size();
        for (int i = 0; i <= end; i++) {
            index = random(list2);
            output("remove random",index,list2.remove(index),list2);
        }
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Test firstIndexOf method");
        data = list1.front();
        output("firstIndexOf",data,list1.firstIndexOf(data),list1);
        data = list1.back();
        output("firstIndexOf",data,list1.firstIndexOf(data),list1);        
        data = random(L, H);
        output("firstIndexOf",data,list1.firstIndexOf(data),list1);  
        data = ((int)H + 1);
        output("firstIndexOf",data,list1.firstIndexOf(data),list1);
            
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Test lastIndexOf method");
        data = list1.front();
        output("lastIndexOf",data,list1.lastIndexOf(data),list1);
        data = list1.back();
        output("lastIndexOf",data,list1.lastIndexOf(data),list1);        
        data = random(L, H);
        output("lastIndexOf",data,list1.lastIndexOf(data),list1); 
        data = ((int)H + 1);
        output("lastIndexOf",data,list1.lastIndexOf(data),list1);
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Test numberOf method");
        data = list1.front();
        output("numberOf",data,list1.numberOf(data),list1);
        data = list1.back();
        output("numberOf",data,list1.numberOf(data),list1);
        data = random(L, H);
        output("numberOf",data,list1.numberOf(data),list1);
        data = ((int)H + 1);
        output("numberOf",data,list1.numberOf(data),list1);
                
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Test contains method");
        data  = list1.front();
        output("contains",data,list1.contains(data),list1);
        data  = list1.back();
        output("contains",data,list1.contains(data),list1);
        data = random(L, H);
        output("contains",data,list1.contains(data),list1);
        data = ((int)H + 1);
        output("contains",data,list1.contains(data),list1);
                
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Test allIndices method");        
        data    = list1.front();
        indices = list1.allIndices(data);
        output("allIndices",data,array(indices),list1);
        
        data    = list1.back();
        indices = list1.allIndices(data);
        output("allIndices",data,array(indices),list1);
        
        data    = random(L, H);
        indices = list1.allIndices(data);
        output("allIndices",data,array(indices),list1);
        
        data    = ((int)H + 1);
        indices = list1.allIndices(data);
        output("allIndices",data,array(indices),list1);
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Copy list 1 onto list 2");
        list2 = list1.clone();
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Test remove(data) method");
        output(list2);
        data = list2.front();
        output("remove(data)",data,list2.remove(data),list2);
        data = list2.back();
        output("remove(data)",data,list2.remove(data),list2);
        data = random(L, H);
        output("remove(data)",data,list2.remove(data),list2);
        data = ((int)H + 1);
        output("remove(data)",data,list2.remove(data),list2);
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Test removeLast(data) method");
        output(list2);
        data = list2.front();
        output("removeLast(data)",data,list2.removeLast(data),list2);
        data = list2.back();
        output("removeLast(data)",data,list2.removeLast(data),list2);
        data = random(L, H);
        output("removeLast(data)",data,list2.removeLast(data),list2);
        data = ((int)H + 1);
        output("removeLast(data)",data,list2.removeLast(data),list2);
                
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Copy list 1 onto list 2");
        list2 = list1.clone();
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Test removeAll(data) method");
        output(list2);
        data = list2.front();
        output("removeAll(data)",data,list2.removeAll(data),list2);
        
        data  = list2.back();
        output("removeAll(data)",data,list2.removeAll(data),list2);
        
        data  = ((int)H + 1);
        output("removeAll(data)",data,list2.removeAll(data),list2);
        
        for (int i = (int)L; i <= (int)H; i++) {
            data = i;
            output("removeAll(data)",data,list2.removeAll(data),list2);
        }
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Copy list 1 onto list 2");
        list2 = list1.clone();
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Test removeAll(array) method");
        output(list2);
        
        Integer[] items1 = { list2.front() };
        output("removeAll(array)",array(items1),list2.removeAll(items1),list2);
                
        Integer[] items2 = { list2.front(), list2.back() };
        output("removeAll(array)",array(items2),list2.removeAll(items2),list2);
        
        Integer[] items3 = { ((int)H+1), ((int)H+2), ((int)L-1) };
        output("removeAll(array)",array(items3),list2.removeAll(items3),list2);
        
        Integer[] items4 = new Integer[(int)H];
        for (int i = 0; i < items4.length; i++) items4[i] = i;
        output("removeAll(array)",array(items4),list2.removeAll(items4),list2);
        
        Integer[] items5 = null;
        output("removeAll(array)",array(items5),list2.removeAll(items5),list2);
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Copy list 1 onto list 2");
        list2 = list1.clone();
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Test fromArray method");                
        list3.fromArray(items1);
        list4.fromArray(items2);
        list5.fromArray(items3);
        list6.fromArray(items4);
        list7.fromArray(items5);        
        output("fromArray",array(items1),list3);
        output("fromArray",array(items2),list4);
        output("fromArray",array(items3),list5);
        output("fromArray",array(items4),list6);
        output("fromArray",array(items5),list7);
                        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Copy list 1 onto list 2");
        list2 = list1.clone();
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Test removeAll(list) method");
        output(list2);
        output("removeAll(list)",list3,list2.removeAll(list3),list2);
        output("removeAll(list)",list4,list2.removeAll(list4),list2);
        output("removeAll(list)",list5,list2.removeAll(list5),list2);
        output("removeAll(list)",list6,list2.removeAll(list6),list2);
        output("removeAll(list)",list7,list2.removeAll(list7),list2);
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Copy list 1 onto list 2");
        list2 = list1.clone();
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Test clear method");
        output(list2);
        list2.clear();
        output(list2);
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Copy list 1 onto list 2");
        list2 = list1.clone();
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Test containsAll(array) method");
        output(list2);        
        Integer[] items6  = { list2.front() };
        Integer[] items7  = { list2.front(), list2.back() };
        Integer[] items8  = { ((int)H+1), ((int)H+2), ((int)L-1) };
        Integer[] items9  = new Integer[(int)H+1];
        for (int i = (int)L; i <= (int)H; i++) items9[i] = i;
        Integer[] items10 = null;        
        result = list2.containsAll(items6);        
        output("containsAll(array)",array(items6),result,list2);
        result = list2.containsAll(items7);
        output("containsAll(array)",array(items7),result,list2);
        result = list2.containsAll(items8);
        output("containsAll(array)",array(items8),result,list2);
        result = list2.containsAll(items9);
        output("containsAll(array)",array(items9),result,list2);
        result = list2.containsAll(items10);
        output("containsAll(array)",array(items10),result,list2);
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Using fromArray again");
        list3.fromArray(items6);
        list4.fromArray(items7);
        list5.fromArray(items8);
        list6.fromArray(items9);
        list7.fromArray(items10);
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Test containsAll(list) method");
        output(list2);
        result = list2.containsAll(list3);        
        output("containsAll(list)",list3,result,list2);
        result = list2.containsAll(list4);        
        output("containsAll(list)",list4,result,list2);
        result = list2.containsAll(list5);        
        output("containsAll(list)",list5,result,list2);
        result = list2.containsAll(list6);        
        output("containsAll(list)",list6,result,list2);
        result = list2.containsAll(list7);        
        output("containsAll(list)",list7,result,list2);
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Copy list 1 onto list 2");
        list2 = list1.clone();
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Test addAll(array) method");
        output(list2);        
        list2.addAll(items6);
        output("addAll(array)",array(items6),list2);
        list2.addAll(items7);
        output("addAll(array)",array(items7),list2);
        list2.addAll(items10);
        output("addAll(array)",array(items10),list2);
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Copy list 1 onto list 2");
        list2 = list1.clone();
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Test addAll(list) method");
        output(list2);        
        list2.addAll(list3);
        output("addAll(list)",list3,list2);
        list2.addAll(list4);
        output("addAll(list)",list4,list2);
        list2.addAll(list7);
        output("addAll(list)",list7,list2);
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList New list created");
        list2 = randomList(SIZE,L,H);
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Test addAll(array,int) method");
        output(list2);         
        index = -1;
        list2.addAll(items7,index);
        output("addAll(array,int)",index,array(items7),list2);        
        index = list2.size();
        list2.addAll(items7,index);
        output("addAll(array,int)",index,array(items7),list2);
        index = 0;
        list2.addAll(items7,index);
        output("addAll(array,int)",index,array(items7),list2);        
        index = list2.size()/2;
        list2.addAll(items7,index);
        output("addAll(array,int)",index,array(items7),list2);
        index = list2.size()-1;
        list2.addAll(items7,index);
        output("addAll(array,int)",index,array(items7),list2);
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList New list created");
        list2 = randomList(SIZE,L,H);
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Test addAll(list,int) method");
        output(list2);         
        index = -1;
        list2.addAll(list4,index);
        output("addAll(list,int)",index,list4,list2);        
        index = list2.size();
        list2.addAll(list4,index);
        output("addAll(list,int)",index,list4,list2);
        index = 0;
        list2.addAll(list4,index);
        output("addAll(list,int)",index,list4,list2);        
        index = list2.size()/2;
        list2.addAll(list4,index);
        output("addAll(list,int)",index,list4,list2);
        index = list2.size()-1;
        list2.addAll(list4,index);
        output("addAll(list,int)",index,list4,list2);
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Creating empty list 1");
        list1.clear();
        output(list1);
        comment("LinkedList Creating 1 node list 2");
        list2 = randomList(1, L, H);
        output(list2);
        comment("LinkedList Creating 2 node list 3");
        list3 = randomList(2, L, H);
        output(list3);
        comment("LinkedList Creating 3 node list 4");
        list4 = randomList(3, L, H);
        output(list4);
        comment("LinkedList Creating large list 5");
        list5 = randomList(SIZE, L, H);
        output(list5);
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Test subList method");
        index = 0;
        for (int i = 0; i < SIZE; i++) {            
            list6 = list1.subList(i, index);
            output("1 subList",i,index,list1,list6);
            list6 = list2.subList(i, index);
            output("2 subList",i,index,list2,list6);
            list6 = list3.subList(i, index);
            output("3 subList",i,index,list3,list6);
            list6 = list4.subList(i, index);
            output("4 subList",i,index,list4,list6);
            list6 = list5.subList(i, index);
            output("5 subList",i,index,list5,list6);
            index += 2;
        }
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Test fromLinkedList method");
        list6 = new LinkedList<>();
        list6.fromLinkedList(list1);
        output("fromLinkedList",list1,list6);
        list6.fromLinkedList(list2);
        output("fromLinkedList",list2,list6);
        list6.fromLinkedList(list3);
        output("fromLinkedList",list3,list6);
        list6.fromLinkedList(list4);
        output("fromLinkedList",list4,list6);
        list6.fromLinkedList(list5);
        output("fromLinkedList",list5,list6);
        
        ////////////////////////////////////////////////////////////////////////
        comment("LinkedList Test toArray method");
        items1 = list1.toArray(items1);
        output("toArray",list1,array(items1));
        items2 = list2.toArray(items2);
        output("toArray",list2,array(items2));
        items3 = list3.toArray(items3);
        output("toArray",list3,array(items3));
        items4 = list4.toArray(items4);
        output("toArray",list4,array(items4));        
        
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
        return (int)(((list.size()-1)-0d+1d)*Math.random()+0d);
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
            list.add(random(low,high));                     // add random value
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