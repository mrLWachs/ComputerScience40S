
/** Required package class namespace */
package testing;

import collections.LinkedList;
import collections.Node;
import java.util.Arrays;

 
/**
 * CollectionsTest.java - tests the concepts learned in this unit
 *
 * @author Mr. Wachs
 * @since 8-Dec-2021, 11:37:02 AM
 */
public class CollectionsTest 
{

    /**
     * Default constructor, set class properties
     */
    public CollectionsTest() {
        System.out.println("\nCollections Test started...\n");
        
        // Create some node objects...
        System.out.println("\nTesting constructors.........................\n");
        Node<String> a = new Node<>();
        Node<String> b = new Node<>("Meat");
        Node<String> c = new Node<>("Cheese",b);
        Node<String> d = new Node<>("Sauce",c,b);
        
        // Output my nodes...
        System.out.println("\nTesting toString()...........................\n");
        System.out.println("Node a = " + a.toString());
        System.out.println("Node b = " + b.toString());
        System.out.println("Node c = " + c.toString());
        System.out.println("Node d = " + d.toString());
        
        // Check if Nodes are equal...
        System.out.println("\nTesting equals().............................\n");
        System.out.println("Node a == b? -> " + a.equals(b));
        System.out.println("Node b == c? -> " + b.equals(c));
        System.out.println("Node a == a? -> " + a.equals(a));
        System.out.println("Node b == b? -> " + b.equals(b));
                
        // Clone a node...
        System.out.println("\nTesting clone()..............................\n");
        Node<String> e = a.clone();
        Node<String> f = b.clone();
        Node<String> g = c.clone();
        Node<String> h = d.clone();
        System.out.println("Node e = " + e.toString());
        System.out.println("Node f = " + f.toString());
        System.out.println("Node g = " + g.toString());
        System.out.println("Node h = " + h.toString());
        
        // Check if Nodes are equal...
        System.out.println("\nTesting equals().............................\n");
        System.out.println("Node a == b? -> " + a.equals(b));
        System.out.println("Node b == c? -> " + b.equals(c));
        System.out.println("Node c == d? -> " + c.equals(d));
        System.out.println("Node a == e? -> " + a.equals(e));
        System.out.println("Node b == f? -> " + b.equals(f));
        System.out.println("Node c == g? -> " + c.equals(g));
        System.out.println("Node d == h? -> " + d.equals(h));
        
        // finalize some nodes (wipe em out, "destroy" them, free up memory)
        System.out.println("\nTesting finalize()...........................\n");
        System.out.println("Node a = " + a.toString());
        System.out.println("Node b = " + b.toString());
        System.out.println("Node c = " + c.toString());
        System.out.println("Node d = " + d.toString());
        System.out.println("Node e = " + e.toString());
        System.out.println("Node f = " + f.toString());   
        System.out.println("Node g = " + g.toString());   
        System.out.println("Node h = " + h.toString());   
        a.finalize();
        b.finalize();
        c.finalize();
        d.finalize();
        e.finalize();
        f.finalize();  
        g.finalize();  
        h.finalize();  
        System.out.println("Node a = " + a.toString());
        System.out.println("Node b = " + b.toString());
        System.out.println("Node c = " + c.toString());
        System.out.println("Node d = " + d.toString());
        System.out.println("Node e = " + e.toString());
        System.out.println("Node f = " + f.toString());
        System.out.println("Node g = " + g.toString());
        System.out.println("Node h = " + h.toString());
        
        // Create a LinkedList to test the constructor
        System.out.println("\nTesting default LinkedList constructor.......\n");
        
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        
        // Test isEmpty method (before I add anything to the list)
        System.out.println("\nTesting isEmpty method.......................\n");        
        System.out.println("L1 empty? -> " + list1.isEmpty());
        
        // Test size method (before I add anything to the list)
        System.out.println("\nTesting size method..........................\n");        
        System.out.println("L1 size? -> " + list1.size());
        
        // Test toString method (before I add anything to the list)
        System.out.println("\nTesting toString method......................\n");        
        System.out.println(list1.toString());
        
        // More testing, explained in the outputs...
        
        System.out.println("\nTest addBack method..........................\n");        
        list1.addBack(5);
        list1.addBack(50);
        list1.addBack(500);
        list1.addBack(-5);
        list1.addBack(-50);        
        System.out.println(list1.toString());
        
        System.out.println("\nTest addFront method.........................\n");        
        list1.addFront(-60); 
        list1.addFront(-6);
        list1.addFront(600);
        list1.addFront(60);
        list1.addFront(6);
        System.out.println(list1.toString());
        
        System.out.println("\nTest get method..............................\n");
        for (int i = 0-1; i < list1.size()+1; i++) {
            Integer value = list1.get(i);
            System.out.println("Getting list " + i + " = " + value);
        }
        
        System.out.println("\nTest set method..............................\n");
        for (int i = 0-1; i < list1.size()+1; i++) {
            Integer value = new Integer(i+10);
            System.out.println("Setting list " + i + " to " + (i+10) + 
                    " result = " + list1.set(i,value) );
            System.out.println(list1.toString());
        }
        
        System.out.println("\nTest equals method...........................\n");
        System.out.println("List 1 = " + list1.toString());
        System.out.println("List 2 = " + list2.toString());
        System.out.println("List1 == List2 is " + list1.equals(list2));
        
        System.out.println("\nTest clone method............................\n");
        list2 = list1.clone();
        System.out.println("List 1 = " + list1.toString());
        System.out.println("List 2 = " + list2.toString());
        System.out.println("Re-testing equals...");
        System.out.println("List1 == List2 is " + list1.equals(list2));
        
        System.out.println("\nTest addAfter method.........................\n");
        int size = list1.size();
        for (int i = 0-1; i < size; i++) {
            int number = i + 100;
            Integer value = new Integer(number);
            System.out.println("Adding value \t"   + value                   + 
                               "\t after index \t" + i                       + 
                               "\t result = \t"    + list1.addAfter(value,i) + 
                               "\t"                + list1.toString());            
        }
        System.out.println("Test other edge case");
        size = list1.size()+1; 
        System.out.println("Adding value \t"   + 10                      + 
                           "\t after index \t" + size                    + 
                           "\t result = \t"    + list1.addAfter(10,size) + 
                           "\t"                + list1.toString());
        
        System.out.println("\nTest addBefore method........................\n");
        size = list1.size();
        for (int i = 0-1; i < size; i++) {
            int number = i + 100;
            Integer value = new Integer(number);
            System.out.println("Adding value \t"    + value                    + 
                               "\t before index \t" + i                        + 
                               "\t result = \t"     + list1.addBefore(value,i) + 
                               "\t"                 + list1.toString());            
        }
        System.out.println("Test other edge case");
        size = list1.size()+1; 
        System.out.println("Adding value \t"    + 10                       + 
                           "\t after before \t" + size                     + 
                           "\t result = \t"     + list1.addBefore(10,size) + 
                           "\t"                 + list1.toString());
        
        System.out.println("\nTest front and back methods..................\n");
        System.out.println("Front of list 1 = " + list1.front() + "\t" + list1);
        System.out.println("Front of list 2 = " + list2.front() + "\t" + list2);
        System.out.println("Back of list 1 = " + list1.back() + "\t" + list1);
        System.out.println("Back of list 2 = " + list2.back() + "\t" + list2);
        System.out.println("Clear out list 2");
        list2.clear();
        System.out.println("Front of list 2 = " + list2.front() + "\t" + list2);
        System.out.println("Back of list 2 = " + list2.back() + "\t" + list2);
        
        System.out.println("\nCloning list 2 from list 1");
        list2 = list1.clone();
                
        System.out.println("\nTest removeFront method......................\n");
        size = list1.size()+1;
        for (int i = 0; i < size; i++) {
            System.out.println(list1.toString());
            Integer value = list1.removeFront();
            System.out.println("Removing list 1 front = \t" + value);
        }
        
        System.out.println("\nCloning list 1 from list 2");
        list1 = list2.clone();
        
        System.out.println("\nTest removeBack method.......................\n");
        size = list2.size()+1;
        for (int i = 0; i < size; i++) {
            System.out.println(list2.toString());
            Integer value = list2.removeBack();
            System.out.println("Removing list 2 back = \t" + value);
        }
        
        System.out.println("\nCloning list 2 from list 1");
        list2 = list1.clone();
        
        System.out.println("\nTest remove method...........................\n");
        size = list2.size()+1;
        for (int i = size; i >= -1; i--) {
            System.out.println(list1.toString());
            Integer value = list1.remove(i);
            System.out.println("Removing from list 1 from index: \t" + i + 
                               "\t removed: \t" + value);
        }
        
        System.out.println("\nTest contains method.........................\n");
        System.out.println("List 1 (empty) contains 10 = " + 
                            list1.contains(10) + "\t" + list1);
        for (int i = 0; i < list2.size(); i++) {
            Integer value = list2.get(i);
            System.out.println("List 2 contains \t" + value + "\t" + 
                            list2.contains(value) + "\t" + list2);
        }
        System.out.println("List 2 contains \t" + 1000 + "\t" + 
                            list2.contains(1000) + "\t" + list2);
        
        list1.clear(); 
        list1.add(5); list1.add(6); list1.add(7);
        list1.add(8); 
        list1.add(5); list1.add(6); list1.add(7);
        list1.add(5); list1.add(6); list1.add(7);
        System.out.println("\nResetting list 1 to: " + list1);
        
        System.out.println("\nTest firstIndexOf and lastIndexOf methods....\n");
        System.out.println("First index of 5: \t" + list1.firstIndexOf(5));
        System.out.println("Last index of 5: \t" + list1.lastIndexOf(5));
        System.out.println("First index of 7: \t" + list1.firstIndexOf(7));
        System.out.println("Last index of 7: \t" + list1.lastIndexOf(7));
        System.out.println("First index of 8: \t" + list1.firstIndexOf(8));
        System.out.println("Last index of 8: \t" + list1.lastIndexOf(8));
        System.out.println("First index of 9: \t" + list1.firstIndexOf(9));
        System.out.println("Last index of 9: \t" + list1.lastIndexOf(9));
        
        System.out.println("\nTest numberOf method.........................\n");
        System.out.println(list1);
        System.out.println("Number of 5: \t" + list1.numberOf(5));
        System.out.println("Number of 8: \t" + list1.numberOf(8));
        System.out.println("Number of 9: \t" + list1.numberOf(9));
        
        System.out.println("\nTest allIndices method.......................\n");
        System.out.println(list1);
        int[] array1 = list1.allIndices(5);
        int[] array2 = list1.allIndices(8);
        int[] array3 = list1.allIndices(9);        
        System.out.println("Array from indices of 5: \t" + 
                Arrays.toString(array1));
        System.out.println("Array from indices of 8: \t" + 
                Arrays.toString(array2));
        System.out.println("Array from indices of 9: \t" + 
                Arrays.toString(array3));
        
        System.out.println("\nCloning list 2 from list 1");
        list2 = list1.clone();
        
        System.out.println("\nTest remove method...........................\n");
        System.out.println(list1);
        Integer data1 = new Integer(5);
        Integer data2 = new Integer(8);
        Integer data3 = new Integer(9);
        System.out.println("Removing 5: \t" + list1.remove(data1) + "\t" + 
                list1);
        System.out.println("Removing 8: \t" + list1.remove(data2) + "\t" + 
                list1);
        System.out.println("Removing 9: \t" + list1.remove(data3) + "\t" + 
                list1);
        
        System.out.println("\nTest removeLast method.......................\n");
        System.out.println(list1);
        data1 = new Integer(5);
        data2 = new Integer(8);
        data3 = new Integer(9);
        System.out.println("Removing 5: \t" + list1.removeLast(data1) + "\t" + 
                list1);
        System.out.println("Removing 8: \t" + list1.removeLast(data2) + "\t" + 
                list1);
        System.out.println("Removing 9: \t" + list1.removeLast(data3) + "\t" + 
                list1);
        
        System.out.println("\nTest removeAll method........................\n");
        System.out.println(list1);
        data1 = new Integer(5);
        data2 = new Integer(6);
        data3 = new Integer(9);
        System.out.println("Removing all 5: \t" + list1.removeAll(data1) +  
                "\t" + list1);
        System.out.println("Removing all 6: \t" + list1.removeAll(data2) +  
                "\t" + list1);
        System.out.println("Removing all 9: \t" + list1.removeAll(data3) +  
                "\t" + list1);
        
        System.out.println("\nCloning list 1 from list 2");
        list1 = list2.clone();
        
        System.out.println("\nTest removeAll array method..................\n");
        System.out.println(list2);
        int[] array4 = {5,6,9};
        Integer[] array5 = {5,6,9};
        System.out.println("Array: \t" + Arrays.toString(array4));
        list2.removeAll(array5);
        System.out.println("Removing all from array: " + list2);
        
        System.out.println("\nTest removeAll list method..................\n");
        System.out.println("List 1 \t" + list1);
        System.out.println("List 2 \t" + list2);
        list1.removeAll(list2);
        System.out.println("Removing all list 2 from list 1...");
        System.out.println("List 1 \t" + list1);
        System.out.println("List 2 \t" + list2);
                
        list1.clear(); 
        list1.add(5); list1.add(6); list1.add(7);
        list1.add(8); 
        list1.add(5); list1.add(6); list1.add(7);
        list1.add(5); list1.add(6); list1.add(7);
        list2 = list1.clone();
        System.out.println("\nResetting list 1 and 2 to: " + list1);
        
        System.out.println("\nTest containsAll array method................\n");
        System.out.println("List: \t" + list1 + 
                           " contains array: \t" + Arrays.toString(array4) + 
                           "\t is " + list1.containsAll(array5));
        int[] array7 = {5,6,7,8};
        Integer[] array8 = {5,6,7,8};
        System.out.println("List: \t" + list1 + 
                           " contains array: \t" + Arrays.toString(array7) + 
                           "\t is " + list1.containsAll(array8));
        
        System.out.println("\nTest containsAll list method.................\n");
        System.out.println("List: \t" + list1 + 
                           " contains list: \t" + list2 + 
                           "\t is " + list1.containsAll(list2));
        System.out.println("Alter list 2...");
        list2.removeBack();
        list2.removeFront();
        list2.remove(3);
        list2.add(45);
        System.out.println("List: \t" + list1 + 
                           " contains list: \t" + list2 + 
                           "\t is " + list1.containsAll(list2));
        
        System.out.println("\nTest addAll array method.....................\n");
        System.out.println(list2);
        list2.addAll(array8);
        System.out.println("Adding array: \t" + Arrays.toString(array7) + 
                           "\t now list \t" + list2);
        
        System.out.println("\nTest addAll list method......................\n");
        System.out.println(list2);
        list2.addAll(list1);
        System.out.println("Adding list: \t" + list1 + 
                           "\t now list \t" + list2);
                
        System.out.println("\nTest subList method..........................\n");
        System.out.println("List 1 = \t" + list1);
        list2 = list1.subList(3, 6);
        System.out.println("Pulling out sub-list from 3 to 6: \t" + list2);
        list2 = list1.subList(1, 1);
        System.out.println("Pulling out sub-list from 1 to 1: \t" + list2);
        list2 = list1.subList(2, 10);
        System.out.println("Pulling out sub-list from 2 to 10: \t" + list2);
        list2 = list1.subList(0, 9);
        System.out.println("Pulling out sub-list from 0 to 9: \t" + list2);
                
        System.out.println("\nTest fromArray method........................\n");
        System.out.println("Array is \t" + Arrays.toString(array7));
        list1.fromArray(array8);
        System.out.println("List is \t" + list1);
        
        System.out.println("\nTest fromLinkedList method...................\n");
        System.out.println("1st List is \t" + list1);
        list2.fromLinkedList(list1);
        System.out.println("2nd List is \t" + list2);
        
        System.out.println("\nTest toArray method..........................\n");
        Integer[] array9 = new Integer[1];
        array9 = list1.toArray(array9);
        System.out.println("List \t" + list1 + "\t into array \t" + 
                Arrays.toString(array9));
        
        System.out.println("\nCollections Test complete!\n");
    }
    
}