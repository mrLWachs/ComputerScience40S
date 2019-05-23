
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
        
        Node<String> a = new Node<>();                  
        Node<String> b = new Node<>("Banana");
        Node<String> c = new Node<>("Carrot",a,b);
        Node<String> d = new Node<>("Donut",a,b);
        Node<String> e = new Node<>("Carrot",c,d);
        Node<String> f = new Node<>("Carrot");
        
        header("Testing node toString method");
        output("Node a",a);
        output("Node b",b);
        output("Node c",c);
        output("Node d",d);
        output("Node e",e);
        output("Node f",f);
                
        header("Testing node equals method");
        output("c == a",c.equals(a));
        output("c == b",c.equals(b));
        output("c == e",c.equals(e));
        output("c == f",c.equals(f));  
        
        header("Testing node clone method");
        Node g = f.clone();                             
        output("Original Node",f);
        output("Clone Node",g);
        
        // create Linked List object
        LinkedList<Integer> list = new LinkedList<>();
        
        header("Test isEmpty,size,toString method");
        output("Empty",list.isEmpty());
        output("Size",list.size());        
        output("String",list);
        
        header("Test add front method");
        output("null",list.addFront(null),list);
        output(99,list.addFront(99),list);
        output(88,list.addFront(88),list);
        output(77,list.addFront(77),list);
        
        header("Test add back method");
        output("null",list.addBack(null),list);
        output(66,list.addBack(66),list);
        output(55,list.addBack(55),list);
        output(44,list.addBack(44),list);
                
        // edge testing the get method (accessor)
        header("Test get method");
        output("Get(0)",list.get(0),list);
        output("Get(1)",list.get(1),list);
        output("Get(5)",list.get(5),list);
        output("Get(-3)",list.get(-3),list);
        output("Get(15)",list.get(15),list);
        
        // edge testing the set method (mutator)
        header("Test set method");
        output("Set(0,33)",list.set(0,33),list);
        output("Set(5,11)",list.set(5,11),list);
        output("Set(-3,98)",list.set(-3,98),list);
        output("Set(15,87)",list.set(15,87),list);
        output("Set(2,null)",list.set(2,null),list);
        
        LinkedList<Integer> list2 = new LinkedList<>();
        
        header("Test equals method");
        output("List1 == List2",list.equals(list2));
        
        header("Test clone method");
        list2 = list.clone();        
        output("Original",list);
        output("Clone   ",list2); 
        header("Test equals after clone method");
        output("List1 == List",list.equals(list2));
        
        header("Test front and back methods");
        output("Front",list.front(),list);
        output("Back",list.back(),list);
        header("Test finalize methods");
        list2.finalize();
        output("Front",list2.front(),list2);
        output("Back",list2.back(),list2);
        
        header("Test remove front method");        
        list2 = list.clone();
        output("Original\t",list);
        for (int i = 0; i < list.size()+1; i++) {
            output("Remove front",list2.removeFront(),list2);
        }
        
        header("Test remove back method");        
        list2 = list.clone();
        output("Original\t",list);
        for (int i = 0; i < list.size()+1; i++) {
            output("Remove back",list2.removeBack(),list2);
        }
        
        header("Test contains method"); 
        output("Contains",99,list.contains(99),list);
        output("Contains",33,list.contains(33),list);
        output("Contains",11,list.contains(11),list);
        output("Contains",76,list.contains(99),list);
        output("Contains","null",list.contains(null),list);
        
        header("Test add after method"); 
        output("Original\t\t",list);
        output("Add After(65,2)\t",list.addAfter(65,2),list);
        output("Add After(54,0)\t",list.addAfter(54,0),list);
        output("Add After(43,-1)",list.addAfter(43,-1),list);
        output("Add After(32,80)",list.addAfter(32,80),list);
        output("Add After(null,2)",list.addAfter(null,2),list);
                        
        header("Test add before method"); 
        output("Original\t\t\t",list);
        output("Add Before(21,2)\t",list.addBefore(21,2),list);
        output("Add Before(97,0)\t",list.addBefore(97,0),list);
        output("Add Before(86,-1)\t",list.addBefore(86,-1),list);
        output("Add Before(75,80)\t",list.addBefore(75,80),list);
        output("Add Before(null,2)\t",list.addBefore(null,2),list);
        
        header("Rebuild list with random #s 1 to 5");
        list.finalize();
        for (int i = 0; i < 20; i++) {
            list.add(((int)((5-1+1) * Math.random() + 1)));
        }
        output("New List",list);
        
        header("Test firstIndexOf, lastIndexOf methods");
        output("First Index Of (2)",list.firstIndexOf(2),list);
        output("Last  Index Of (2)",list.lastIndexOf(2),list);
        
        header("Test allIndices methods");
        int[] array1 = list.allIndices(2);
        int[] array2 = list.allIndices(1);
        int[] array3 = list.allIndices(6);
        output("AllIndices(2)",list,toString(array1));
        output("AllIndices(1)",list,toString(array2));
        output("AllIndices(6)",list,toString(array3));
       
        header("Test remove, remove last, remove all methods");
        output("Original\t",list);
        output("Remove      (2)",list.remove(new Integer(2)),list);
        output("Remove Last (2)",list.removeLast(new Integer(2)),list);
        output("Remove All  (2)",list.removeAll(new Integer(2)),list);
        output("Remove      (6)",list.remove(new Integer(6)),list);
        output("Remove Last (6)",list.removeLast(new Integer(6)),list);
        output("Remove All  (6)",list.removeAll(new Integer(6)),list);
        
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
        output("New    List",list);
        output("Delete List",list3);
        output("Delete Array",toString(array));
        
        header("Test remove list, remove array methods");
        output("Remove List",list.removeAll(list3),list);
        output("Remove Array",list.removeAll(array),list);
        
        header("Rebuild list with random #s 1 to 100");
        list.finalize();
        for (int i = 0; i < 20; i++) {
            list.add(((int)((100-1+1) * Math.random() + 1)));
        }
        output("New List",list);
        
        
        
        System.out.println("\nCollections complete!\n");
    }

    private void header(String text) {
        final int MAX = 200;
        text = "\n" + text;
        int length = text.length();
        for (int i = 0; i < (MAX - length); i++) {
            text += ".";
        }
        text += "\n";
        output(text);
    }
    
    private void output(Object first, Object second,  
                        Object third, Object fourth,
                        Object fifth, Object sixth) {
        final String DIVIDE = "\t= ";
        String text1 = "null";
        String text2 = "null";
        String text3 = "null";
        String text4 = "null";
        String text5 = "null";
        String text6 = "null";
        if (first  != null) text1 = first.toString();
        if (second != null) text2 = second.toString();
        if (third  != null) text3 = third.toString();
        if (fourth != null) text4 = fourth.toString();
        if (fifth  != null) text5 = fifth.toString();
        if (sixth  != null) text6 = sixth.toString();        
        String text = text1  + DIVIDE + 
                      text2 + DIVIDE + 
                      text3 + DIVIDE + 
                      text4 + DIVIDE +
                      text5 + DIVIDE +
                      text6; 
        output(text);        
    }
    
    private void output(Object first, Object second,  
                        Object third, Object fourth,
                        Object fifth) {
        final String DIVIDE = "\t= ";
        String text1 = "null";
        String text2 = "null";
        String text3 = "null";
        String text4 = "null";
        String text5 = "null";
        if (first  != null) text1 = first.toString();
        if (second != null) text2 = second.toString();
        if (third  != null) text3 = third.toString();
        if (fourth != null) text4 = fourth.toString();
        if (fifth  != null) text5 = fifth.toString();        
        String text = text1  + DIVIDE + 
                      text2 + DIVIDE + 
                      text3 + DIVIDE + 
                      text4 + DIVIDE +
                      text5; 
        output(text);        
    }
    
    private void output(Object first, Object second,  
                        Object third, Object fourth) {
        final String DIVIDE = "\t= ";
        String text1 = "null";
        String text2 = "null";
        String text3 = "null";
        String text4 = "null";
        if (first  != null) text1 = first.toString();
        if (second != null) text2 = second.toString();
        if (third  != null) text3 = third.toString();
        if (fourth != null) text4 = fourth.toString();      
        String text = text1  + DIVIDE + 
                      text2 + DIVIDE + 
                      text3 + DIVIDE + 
                      text4; 
        output(text);        
    }
    
    private void output(Object first, Object second,  
                        Object third) {
        final String DIVIDE = "\t= ";
        String text1 = "null";
        String text2 = "null";
        String text3 = "null";
        if (first  != null) text1 = first.toString();
        if (second != null) text2 = second.toString();
        if (third  != null) text3 = third.toString();      
        String text = text1  + DIVIDE + 
                      text2 + DIVIDE + 
                      text3; 
        output(text);        
    }
    
    private void output(Object first, Object second) {
        final String DIVIDE = "\t= ";
        String text1 = "null";
        String text2 = "null";
        if (first  != null) text1 = first.toString();
        if (second != null) text2 = second.toString();     
        String text = text1  + DIVIDE + 
                      text2; 
        output(text);        
    }
    
    private void output(Object first) {
        String text1 = "null";
        if (first  != null) text1 = first.toString();    
        String text = text1; 
        System.out.println(text);        
    }

    private String toString(int[] array) {
        if (array == null) return "null";
        String text = "Array [";
        for (int i = 0; i < array.length-1; i++) {
            text += array[i] + ",";
        }
        return text + array[array.length-1] + "]";
    }
    
    private String toString(Object[] array) {
        if (array == null) return "null";
        String text = "Array [";
        for (int i = 0; i < array.length-1; i++) {
            text += array[i] + ",";
        }
        return text + array[array.length-1] + "]";
    }
    
}
