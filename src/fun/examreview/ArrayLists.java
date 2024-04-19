/** Required package class namespace */
package fun.examreview;
 
/** Required API imports */
import java.util.ArrayList;
import testing.Tester;
import utility.io.Simulator;
import utility.io.System;


/**
 * ArrayLists.java - student requested review of the ArrayList concepts as 
 * needed for the AP exam (from the AP Computer Science curriculum)
 *
 * @author Mr. Wachs
 * @since April 16, 2024
 */
public class ArrayLists 
{
    
    /**
     * Default constructor, set class properties
     * 
     * @param state the run state of this code module
     */
    public ArrayLists(int state) {
        if (state == Tester.DO_NOT_RUN) {
            return;
        }
        
        Simulator.comment("Start Learning about ArrayList...");
    
        System.out.println(".................................................");
        
        System.out.println("Create (declare) an ArrayList by importing the ");
        System.out.println("ArrayList class from the core 'java.util' API");
        
        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.println(".................................................");
        
        int size = list.size();
        System.out.println("Method to get the size of the ArrayList...");
        System.out.println("(note: with arrays, they use '.length' instead)\n");
                
        System.out.println("size = " + size);
       
        System.out.println(".................................................");
        
        System.out.println("Method to add values dynamically into the");
        System.out.println("ArrayList. Note that it will always append the ");
        System.out.println("item to the end of the ArrayList\n");
        
        boolean success = list.add(20);
        System.out.println("Operation add() success was " + success);
        System.out.println("ArrayList is now " + list.toString());
        
        System.out.println(".................................................");
        
        System.out.println("Repeating the add operation...\n");
        for (int i = 0; i < 5; i++) {
            int value = i * 10 + 30;
            success = list.add(value);
            System.out.println("Add(" + value + "): " + success + 
                               " ArrayList: " + list.toString());
        }
        
        System.out.println(".................................................");
        
        System.out.println("Variation on add() with another parameter to ");
        System.out.println("indicate an index value (which will add the value ");
        System.out.println("and shift all the preceeding values after the ");
        System.out.println("index over)\n");
                
        list.add(3, 99);
        System.out.println("Add(3,99): ArrayList: " + list.toString());
        list.add(0, 99);
        System.out.println("Add(0,99): ArrayList: " + list.toString());
        list.add(list.size(), 99);
        System.out.println("Add(list.size(),99): ArrayList: " + list.toString());
        
        System.out.println(".................................................");
        
        System.out.println("The get(index) accessor method like  ");
        System.out.println("int value = array[index]; which retrieves the value");
        System.out.println("at the passed index\n");
                
        System.out.println("get(3) = " + list.get(3));
        System.out.println("get(0) = " + list.get(0));
        System.out.println("get(list.size()-1) = " + list.get(list.size()-1));
        
        System.out.println(".................................................");
        
        System.out.println("The set(index,value) mutator method like ");
        System.out.println("array[index] = value; mutates (changes) the value ");
        System.out.println("at the passed index and returns the previous value ");
        System.out.println("at that index\n");
        
        System.out.println("set(3,1) previously was " + list.set(3,1) + 
                           " list is now " + list.toString());
        System.out.println("set(0,1) previously was " + list.set(0,1) + 
                           " list is now " + list.toString());
        System.out.println("set(list.size()-1,1) previously was " + 
                           list.set(list.size()-1,1) + 
                           " list is now " + list.toString());
        
        System.out.println(".................................................");
        
        System.out.println("The remove(index) method removes the index value ");
        System.out.println("from the ArrayList and adjusts the list to now ");
        System.out.println("have one less element. It also returns the item ");
        System.out.println("it removes\n");
                
        System.out.println("list.remove(2) removed " + list.remove(2) + 
                           " list is now " + list.toString() );
        System.out.println("list.remove(0) removed " + list.remove(0) + 
                           " list is now " + list.toString() );
        System.out.println("list.remove(list.size()-1) removed " + 
                           list.remove(list.size()-1) + 
                           " list is now " + list.toString() );
        
        System.out.println(".................................................");
        
        System.out.println("Traversing an ArrayList with a standard for loop ");
        System.out.println("and an enhanced for loop\n");
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println("for ArrayList = " + list.get(i));
        }
        
        for (Integer integer : list) {
            System.out.println("enhanced for ArrayList = " + integer.toString());
        }
        
        System.out.println(".................................................");
        
        System.out.println("All array operations: \n");
        System.out.println(" - declaring:  int a[] = new int[5];");
        System.out.println(" - mutating:   a[2] = 5;");
        System.out.println(" - accessing:  int x = a[2];");
        System.out.println(" - traversing: for (int i = 0; i < a.length; i++)");
        System.out.println("\nCan also be performed with ArrayList but as a ");
        System.out.println("dynamic data structure:\n");
        System.out.println(" - declaring:  ArrayList<Integer> a = new ArrayList<>();");
        System.out.println(" - mutating:   a.set(2,5);");
        System.out.println(" - accessing:  int x = a.get(2);");
        System.out.println(" - traversing: for (int i = 0; i < a.size(); i++)");  
        System.out.println("           or: for (Integer integer : list)");
        
        Simulator.comment("Completed Learning about ArrayList!");
    }
     
}