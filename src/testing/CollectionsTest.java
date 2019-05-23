
/** required package class namespace */
package testing;

/** required imports */
import collections.LinkedList;
import collections.Node;
import tools.Output;


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
        Output.header("Collections started");
        
        Node<String> a = new Node<>();                  
        Node<String> b = new Node<>("Banana");
        Node<String> c = new Node<>("Carrot",a,b);
        Node<String> d = new Node<>("Donut",a,b);
        Node<String> e = new Node<>("Carrot",c,d);
        Node<String> f = new Node<>("Carrot");
        
        Output.header("Testing node toString method");
        Output.show("Node a",a);
        Output.show("Node b",b);
        Output.show("Node c",c);
        Output.show("Node d",d);
        Output.show("Node e",e);
        Output.show("Node f",f);
                
        Output.header("Testing node equals method");
        Output.show("c == a",c.equals(a));
        Output.show("c == b",c.equals(b));
        Output.show("c == e",c.equals(e));
        Output.show("c == f",c.equals(f));  
        
        Output.header("Testing node clone method");
        Node g = f.clone();                             
        Output.show("Original Node",f);
        Output.show("Clone Node",g);
        
        // create Linked List object
        LinkedList<Integer> list = new LinkedList<>();
        
        Output.header("Test isEmpty,size,toString method");
        Output.show("Empty",list.isEmpty());
        Output.show("Size",list.size());        
        Output.show("String",list);
        
        Output.header("Test add front method");
        Output.show("null",list.addFront(null),list);
        Output.show(99,list.addFront(99),list);
        Output.show(88,list.addFront(88),list);
        Output.show(77,list.addFront(77),list);
        
        Output.header("Test add back method");
        Output.show("null",list.addBack(null),list);
        Output.show(66,list.addBack(66),list);
        Output.show(55,list.addBack(55),list);
        Output.show(44,list.addBack(44),list);
                
        // edge testing the get method (accessor)
        Output.header("Test get method");
        Output.show("Get(0)",list.get(0),list);
        Output.show("Get(1)",list.get(1),list);
        Output.show("Get(5)",list.get(5),list);
        Output.show("Get(-3)",list.get(-3),list);
        Output.show("Get(15)",list.get(15),list);
        
        // edge testing the set method (mutator)
        Output.header("Test set method");
        Output.show("Set(0,33)",list.set(0,33),list);
        Output.show("Set(5,11)",list.set(5,11),list);
        Output.show("Set(-3,98)",list.set(-3,98),list);
        Output.show("Set(15,87)",list.set(15,87),list);
        Output.show("Set(2,null)",list.set(2,null),list);
        
        LinkedList<Integer> list2 = new LinkedList<>();
        
        Output.header("Test equals method");
        Output.show("List1 == List2",list.equals(list2));
        
        Output.header("Test clone method");
        list2 = list.clone();        
        Output.show("Original",list);
        Output.show("Clone   ",list2); 
        
        Output.header("Test equals after clone method");
        Output.show("List1 == List",list.equals(list2));
        
        Output.header("Test front and back methods");
        Output.show("Front",list.front(),list);
        Output.show("Back",list.back(),list);
        
        Output.header("Test finalize methods");
        list2.finalize();
        Output.show("Front",list2.front(),list2);
        Output.show("Back",list2.back(),list2);
        
        Output.header("Test remove front method");        
        list2 = list.clone();
        Output.show("Original\t",list);
        for (int i = 0; i < list.size()+1; i++) {
            Output.show("Remove front",list2.removeFront(),list2);
        }
        
        Output.header("Test remove back method");        
        list2 = list.clone();
        Output.show("Original\t",list);
        for (int i = 0; i < list.size()+1; i++) {
            Output.show("Remove back",list2.removeBack(),list2);
        }
        
        Output.header("Test contains method"); 
        Output.show("Contains",99,list.contains(99),list);
        Output.show("Contains",33,list.contains(33),list);
        Output.show("Contains",11,list.contains(11),list);
        Output.show("Contains",76,list.contains(99),list);
        Output.show("Contains","null",list.contains(null),list);
        
        Output.header("Test add after method"); 
        Output.show("Original\t\t",list);
        Output.show("Add After(65,2)\t",list.addAfter(65,2),list);
        Output.show("Add After(54,0)\t",list.addAfter(54,0),list);
        Output.show("Add After(43,-1)",list.addAfter(43,-1),list);
        Output.show("Add After(32,80)",list.addAfter(32,80),list);
        Output.show("Add After(null,2)",list.addAfter(null,2),list);
                        
        Output.header("Test add before method"); 
        Output.show("Original\t\t\t",list);
        Output.show("Add Before(21,2)\t",list.addBefore(21,2),list);
        Output.show("Add Before(97,0)\t",list.addBefore(97,0),list);
        Output.show("Add Before(86,-1)\t",list.addBefore(86,-1),list);
        Output.show("Add Before(75,80)\t",list.addBefore(75,80),list);
        Output.show("Add Before(null,2)\t",list.addBefore(null,2),list);
        
        Output.header("Rebuild list with random #s 1 to 5");
        list.finalize();
        for (int i = 0; i < 20; i++) {
            list.add(((int)((5-1+1) * Math.random() + 1)));
        }
        Output.show("New List",list);
        
        Output.header("Test firstIndexOf, lastIndexOf methods");
        Output.show("First Index Of (2)",list.firstIndexOf(2),list);
        Output.show("Last  Index Of (2)",list.lastIndexOf(2),list);
        
        Output.header("Test allIndices methods");
        int[] array1 = list.allIndices(2);
        int[] array2 = list.allIndices(1);
        int[] array3 = list.allIndices(6);
        Output.show("AllIndices(2)",list,Output.show(array1));
        Output.show("AllIndices(1)",list,Output.show(array2));
        Output.show("AllIndices(6)",list,Output.show(array3));
       
        Output.header("Test remove, remove last, remove all methods");
        Output.show("Original\t",list);
        Output.show("Remove      (2)",list.remove(new Integer(2)),list);
        Output.show("Remove Last (2)",list.removeLast(new Integer(2)),list);
        Output.show("Remove All  (2)",list.removeAll(new Integer(2)),list);
        Output.show("Remove      (6)",list.remove(new Integer(6)),list);
        Output.show("Remove Last (6)",list.removeLast(new Integer(6)),list);
        Output.show("Remove All  (6)",list.removeAll(new Integer(6)),list);
        
        Output.header("Rebuild list, and create second list and "
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
        Output.show("New    List",list);
        Output.show("Other List",list3);
        Output.show("Array     ",Output.show(array));
        
        Output.header("Test contains all (with list and array) methods");
        Output.show("Contains list ",list3,list.containsAll(list3),list);
        Output.show("Contains array",Output.show(array),list.containsAll(array),list);
                
        Output.header("Test remove all (with list and array) methods");
        Output.show("Remove List",list3,list.removeAll(list3),list);
        Output.show("Remove Array",Output.show(array),list.removeAll(array),list);
        
        Output.header("Test add all (with list and array) methods");
        list.addAll(list3);
        Output.show("Add List",list3,list);
        list.addAll(array);
        Output.show("Add Array",Output.show(array),list);        
        list.addAll(list3,3);
        Output.show("Add List (3)",list3,list);
        list.addAll(array,3);
        Output.show("Add Array (3)",Output.show(array),list);
                
        Output.header("Test sublist method");
        Output.show("Sub List (2,8)",list.subList(2, 8),list);
        Output.show("Sub List (-1,8)",list.subList(-1, 8),list);
        Output.show("Sub List (2,80)",list.subList(2, 80),list);
        Output.show("Sub List (5,3)",list.subList(5, 3),list);
        Output.show("Sub List (2,2)",list.subList(2, 2),list);
                
        Output.header("Test from array and from LinkedList methods");
        list.fromArray(array);
        Output.show("From Array",Output.show(array),list);
        list.fromLinkedList(list3);
        Output.show("From List ",list3,list);
        
        Output.header("Test To Array method");
        array = list.toArray(array);
        Output.show("To Array",Output.show(array),list);
        
        Output.header("Test constructor (with array and LinkedList)");
        LinkedList<Integer> list4 = new LinkedList<>(array);
        LinkedList<Integer> list5 = new LinkedList<>(list3);
        Output.show("LinkedList(array)",Output.show(array),list4);
        Output.show("LinkedList(list) ",list,list5);
                
        Output.header("Collections complete");
    }

}
