
/** required package class namespace */
package testing;

/** required imports */
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
    
    private final int    MAX    = 200;
    private final String DIVIDE = "\t= ";

    /**
     * Default constructor for the class, sets class properties
     */
    public CollectionsTest() {
        header("Collections started");
        
        Node<String> a = new Node<>();                  
        Node<String> b = new Node<>("Banana");
        Node<String> c = new Node<>("Carrot",a,b);
        Node<String> d = new Node<>("Donut",a,b);
        Node<String> e = new Node<>("Carrot",c,d);
        Node<String> f = new Node<>("Carrot");
        
        header("Testing node toString method");
        show("Node a",a);
        show("Node b",b);
        show("Node c",c);
        show("Node d",d);
        show("Node e",e);
        show("Node f",f);
                
        header("Testing node equals method");
        show("c == a",c.equals(a));
        show("c == b",c.equals(b));
        show("c == e",c.equals(e));
        show("c == f",c.equals(f));  
        
        header("Testing node clone method");
        Node g = f.clone();                             
        show("Original Node",f);
        show("Clone Node",g);
        
        // create Linked List object
        LinkedList<Integer> list = new LinkedList<>();
        
        header("Test isEmpty,size,toString method");
        show("Empty",list.isEmpty());
        show("Size",list.size());        
        show("String",list);
        
        header("Test add front method");
        show("null",list.addFront(null),list);
        show(99,list.addFront(99),list);
        show(88,list.addFront(88),list);
        show(77,list.addFront(77),list);
        
        header("Test add back method");
        show("null",list.addBack(null),list);
        show(66,list.addBack(66),list);
        show(55,list.addBack(55),list);
        show(44,list.addBack(44),list);
                
        // edge testing the get method (accessor)
        header("Test get method");
        show("Get(0)",list.get(0),list);
        show("Get(1)",list.get(1),list);
        show("Get(5)",list.get(5),list);
        show("Get(-3)",list.get(-3),list);
        show("Get(15)",list.get(15),list);
        
        // edge testing the set method (mutator)
        header("Test set method");
        show("Set(0,33)",list.set(0,33),list);
        show("Set(5,11)",list.set(5,11),list);
        show("Set(-3,98)",list.set(-3,98),list);
        show("Set(15,87)",list.set(15,87),list);
        show("Set(2,null)",list.set(2,null),list);
        
        LinkedList<Integer> list2 = new LinkedList<>();
        
        header("Test equals method");
        show("List1 == List2",list.equals(list2));
        
        header("Test clone method");
        list2 = list.clone();        
        show("Original",list);
        show("Clone   ",list2); 
        
        header("Test equals after clone method");
        show("List1 == List",list.equals(list2));
        
        header("Test front and back methods");
        show("Front",list.front(),list);
        show("Back",list.back(),list);
        
        header("Test finalize methods");
        list2.finalize();
        show("Front",list2.front(),list2);
        show("Back",list2.back(),list2);
        
        header("Test remove front method");        
        list2 = list.clone();
        show("Original\t",list);
        for (int i = 0; i < list.size()+1; i++) {
            show("Remove front",list2.removeFront(),list2);
        }
        
        header("Test remove back method");        
        list2 = list.clone();
        show("Original\t",list);
        for (int i = 0; i < list.size()+1; i++) {
            show("Remove back",list2.removeBack(),list2);
        }
        
        header("Test contains method"); 
        show("Contains",99,list.contains(99),list);
        show("Contains",33,list.contains(33),list);
        show("Contains",11,list.contains(11),list);
        show("Contains",76,list.contains(99),list);
        show("Contains","null",list.contains(null),list);
        
        header("Test add after method"); 
        show("Original\t\t",list);
        show("Add After(65,2)\t",list.addAfter(65,2),list);
        show("Add After(54,0)\t",list.addAfter(54,0),list);
        show("Add After(43,-1)",list.addAfter(43,-1),list);
        show("Add After(32,80)",list.addAfter(32,80),list);
        show("Add After(null,2)",list.addAfter(null,2),list);
                        
        header("Test add before method"); 
        show("Original\t\t\t",list);
        show("Add Before(21,2)\t",list.addBefore(21,2),list);
        show("Add Before(97,0)\t",list.addBefore(97,0),list);
        show("Add Before(86,-1)\t",list.addBefore(86,-1),list);
        show("Add Before(75,80)\t",list.addBefore(75,80),list);
        show("Add Before(null,2)\t",list.addBefore(null,2),list);
        
        header("Rebuild list with random #s 1 to 5");
        list.finalize();
        for (int i = 0; i < 20; i++) {
            list.add(((int)((5-1+1) * Math.random() + 1)));
        }
        show("New List",list);
        
        header("Test firstIndexOf, lastIndexOf methods");
        show("First Index Of (2)",list.firstIndexOf(2),list);
        show("Last  Index Of (2)",list.lastIndexOf(2),list);
        
        header("Test allIndices methods");
        int[] array1 = list.allIndices(2);
        int[] array2 = list.allIndices(1);
        int[] array3 = list.allIndices(6);
        show("AllIndices(2)",list,show(array1));
        show("AllIndices(1)",list,show(array2));
        show("AllIndices(6)",list,show(array3));
       
        header("Test remove, remove last, remove all methods");
        show("Original\t",list);
        show("Remove      (2)",list.remove(new Integer(2)),list);
        show("Remove Last (2)",list.removeLast(new Integer(2)),list);
        show("Remove All  (2)",list.removeAll(new Integer(2)),list);
        show("Remove      (6)",list.remove(new Integer(6)),list);
        show("Remove Last (6)",list.removeLast(new Integer(6)),list);
        show("Remove All  (6)",list.removeAll(new Integer(6)),list);
        
        header("Rebuild list, and create second list and "
                + "array with random #s 1 to 10");
        list.finalize();
        for (int i = 0; i < 20; i++) {
            list.add(((int)((10-1+1) * Math.random() + 1)));
        }
        LinkedList<Integer> list3 = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list3.add(((int)((10-1+1) * Math.random() + 1)));
        }
        Integer[] array = new Integer[5];
        for (int i = 0; i < 5; i++) {
            array[i] = new Integer((int)( (10-1+1) * Math.random() + 1));
        }
        show("New    List",list);
        show("Other List",list3);
        show("Array     ",show(array));
        
        header("Test contains all (with list and array) methods");
        show("Contains list ",list3,list.containsAll(list3),list);
        show("Contains array",show(array),list.containsAll(array),list);
                
        header("Test remove all (with list and array) methods");
        show("Remove List",list3,list.removeAll(list3),list);
        show("Remove Array",show(array),list.removeAll(array),list);
        
        header("Test add all (with list and array) methods");
        list.addAll(list3);
        show("Add List",list3,list);
        list.addAll(array);
        show("Add Array",show(array),list);        
        list.addAll(list3,3);
        show("Add List (3)",list3,list);
        list.addAll(array,3);
        show("Add Array (3)",show(array),list);
                
        header("Test sublist method");
        show("Sub List (2,8)",list.subList(2, 8),list);
        show("Sub List (-1,8)",list.subList(-1, 8),list);
        show("Sub List (2,80)",list.subList(2, 80),list);
        show("Sub List (5,3)",list.subList(5, 3),list);
        show("Sub List (2,2)",list.subList(2, 2),list);
                
        header("Test from array and from LinkedList methods");
        list.fromArray(array);
        show("From Array",show(array),list);
        list.fromLinkedList(list3);
        show("From List ",list3,list);
        
        header("Test To Array method");
        array = list.toArray(array);
        show("To Array",show(array),list);
        
        header("Test constructor (with array and LinkedList)");
        LinkedList<Integer> list4 = new LinkedList<>(array);
        LinkedList<Integer> list5 = new LinkedList<>(list3);
        show("LinkedList(array)",show(array),list4);
        show("LinkedList(list) ",list,list5);
                
        header("Collections complete");
    }
    
    /**
     * Outputs a line in header style of standard output with line breaks and
     * a drawn line of dots
     * 
     * @param text the text to put in the header line
     */
    public void header(String text) {
        text = "\n" + text;                             // add leading new line
        int length = text.length();                     // length of passed text
        for (int i = 0; i < (MAX - length); i++) {      // loop to max length
            text += ".";                                // add "dots"
        }
        text += "\n";                                   // add trailing new line
        show(text);                                     // output text
    }

    /**
     * Outputs a line to standard output with a divider between each 
     * parameter to space out the line for the output
     * 
     * @param first an object to add to the output line
     * @param second an object to add to the output line
     * @param third an object to add to the output line
     * @param fourth an object to add to the output line
     */
    public void show(Object first, Object second, Object third, 
                            Object fourth) {
        String text1 = "null";          // variable(s) for the output
        String text2 = "null";
        String text3 = "null";
        String text4 = "null";
        if (first  != null) text1 = first.toString();   // adjust for nulls
        if (second != null) text2 = second.toString();
        if (third  != null) text3 = third.toString();
        if (fourth != null) text4 = fourth.toString();      
        String text = text1 + DIVIDE + 
                      text2 + DIVIDE + 
                      text3 + DIVIDE + 
                      text4;                            // concatenate all text
        show(text);                                     // output text
    }
    
    /**
     * Outputs a line to standard output with a divider between each 
     * parameter to space out the line for the output
     * 
     * @param first an object to add to the output line
     * @param second an object to add to the output line
     * @param third an object to add to the output line
     */
    public void show(Object first, Object second, Object third) {
        String text1 = "null";          // variable(s) for the output
        String text2 = "null";
        String text3 = "null";
        if (first  != null) text1 = first.toString();   // adjust for nulls
        if (second != null) text2 = second.toString();
        if (third  != null) text3 = third.toString();      
        String text = text1 + DIVIDE + 
                      text2 + DIVIDE + 
                      text3;                            // concatenate all text
        show(text);                                     // output text
    }
    
    /**
     * Outputs a line to standard output with a divider between each 
     * parameter to space out the line for the output
     * 
     * @param first an object to add to the output line
     * @param second an object to add to the output line
     */
    public void show(Object first, Object second) {
        String text1 = "null";          // variable(s) for the output
        String text2 = "null";
        if (first  != null) text1 = first.toString();   // adjust for nulls
        if (second != null) text2 = second.toString();     
        String text = text1 + DIVIDE + 
                      text2;                            // concatenate all text
        show(text);                                     // output text
    }
    
    /**
     * Outputs a line to standard output with a divider between each 
     * parameter to space out the line for the output
     * 
     * @param first an object to add to the output line
     */
    public void show(Object first) {
        String text1 = "null";          // variable(s) for the output
        String text2 = "null";
        if (first  != null) text1 = first.toString();   // adjust for nulls    
        String text = text1;                            // concatenate all text
        System.out.println(text);                       // standard output
    }

    /**
     * Creates a formatted line of text for an array to use in outputs
     * 
     * @param array the array to format
     * @return a string of formatted text
     */
    public String show(int[] array) {
        if (array == null) return "null";           // adjust for null
        String text = "Array       [";              // start line
        for (int i = 0; i < array.length-1; i++) {  // traverse array
            text += array[i] + ",";                 // concatenate array content
        }
        return text + array[array.length-1] + "]";  // complete line
    }
    
    /**
     * Creates a formatted line of text for an array to use in outputs
     * 
     * @param array the array to format
     * @return a string of formatted text
     */
    public String show(Object[] array) {
        if (array == null) return "null";           // adjust for null
        String text = "Array       [";              // start line
        for (int i = 0; i < array.length-1; i++) {  // traverse array
            text += array[i] + ",";                 // concatenate array content
        }
        return text + array[array.length-1] + "]";  // complete line
    }
    
}