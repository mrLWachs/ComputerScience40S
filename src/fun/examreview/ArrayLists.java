/** Required package class namespace */
package fun.examreview;
 
/** Required API imports */
import java.util.ArrayList;
import testing.Tester;
import utility.io.Simulator;


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
        
        Simulator.comment("Learn about ArrayList");
    
        // Create (declare) an ArrayList by importing the ArrayList
        // class from the core "java.util" API
        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.println("...");
        
        int size = list.size();
        System.out.println("Method to get the size of the ArrayList...");
        
        System.out.println("...");
        
        System.out.println("size = " + size);
       
        System.out.println("...");
        
        System.out.print("Method to add values dynamically into the");
        System.out.print("ArrayList. Note that it will always append the ");
        System.out.println("item to the end of the ArrayList");
        
        System.out.println("...");
        
        boolean success = list.add(20);
        System.out.println("Operation add() success was " + success);
        System.out.println("ArrayList is now " + list.toString());
        
        System.out.println("...");
        
        System.out.println("Repeating the add operation...");
        for (int i = 0; i < 5; i++) {
            int value = i * 10 + 30;
            success = list.add(value);
            System.out.println("Add(" + value + "): " + success + 
                               " ArrayList: " + list.toString());
        }
        System.out.println("...");
        
        System.out.print("Variation on add() with another parameter to ");
        System.out.print("indicate an index value (which will add the value ");
        System.out.print("and shift all the preceeding values after the ");
        System.out.println("index over");
        
        System.out.println("...");
        
        list.add(3, 99);
        System.out.println("Add(3,99): ArrayList: " + list.toString());
        list.add(0, 99);
        System.out.println("Add(0,99): ArrayList: " + list.toString());
        list.add(list.size(), 99);
        System.out.println("Add(list.size(),99): ArrayList: " + list.toString());
        
        System.out.println("...");
        
        System.out.print("The get(index) accessor method like array[index] ");
        System.out.println("retrieves the value at the passed index");
        
        System.out.println("...");
        
        System.out.println("get(3) = " + list.get(3));
        System.out.println("get(0) = " + list.get(0));
        System.out.println("get(list.size()-1) = " + list.get(list.size()-1));
        
        System.out.println("...");
        
        System.out.print("The set(index,value) mutator method like ");
        System.out.print("array[index] = value; retrieves the value at ");
        System.out.print("the passed index and returns the previous value");
        System.out.println("at that index");
        
        System.out.println("...");
        
        System.out.println("set(3,1) previously was " + list.set(3,1) + 
                           " list is now " + list.toString());
        System.out.println("set(0,1) previously was " + list.set(0,1) + 
                           " list is now " + list.toString());
        System.out.println("set(list.size()-1,1) previously was " + 
                           list.set(list.size()-1,1) + 
                           " list is now " + list.toString());
        
        System.out.println("...");
        
        System.out.print("The remove(index) method removes the index value ");
        System.out.print("from the ArrayList and adjusts the list to now ");
        System.out.print("have one less element. It also returns the item ");
        System.out.println("it removes");
        
        System.out.println("...");
        
        System.out.println("list.remove(2) removed " + list.remove(2) + 
                           " list is now " + list.toString() );
        System.out.println("list.remove(0) removed " + list.remove(0) + 
                           " list is now " + list.toString() );
        System.out.println("list.remove(list.size()-1) removed " + 
                           list.remove(list.size()-1) + 
                           " list is now " + list.toString() );
        
        System.out.println("...");
        
        System.out.println("Traversing an ArrayList with an enhanced for loop");
        for (Integer integer : list) {
            System.out.println("ArrayList integer = " + integer.toString());
        }
        
        System.out.println("...");
        
        System.out.println("All array operations: ");
        System.out.println(" - declaring:  int a[] = new int[5];");
        System.out.println(" - mutating:   a[2] = 5;");
        System.out.println(" - accessing:  int x = a[2];");
        System.out.println(" - traversing: for (int i = 0; i < a.length; i++)");
        System.out.print("Can also be performed with ArrayList but as a ");
        System.out.println("dynamic data structure:");
        System.out.println(" - declaring:  ArrayList<Integer> a = new ArrayList<>();");
        System.out.println(" - mutating:   a.set(2,5);");
        System.out.println(" - accessing:  int x = a.get(2);");
        System.out.println(" - traversing: for (int i = 0; i < a.size(); i++)");  
        System.out.println("           or: for (Integer integer : list)");
    }
     
}