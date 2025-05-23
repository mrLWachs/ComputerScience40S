/** Required package class namespace */
package testing;
 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 * ExtrasTest.java - description
 *
 * @author YOUR NAME
 * @since May 23, 2025, 8:51:07 a.m.
 */
public class ExtrasTest 
{

    /**
     * Default constructor, set class properties
     */
    public ExtrasTest() {
        System.out.println("\nExtras testing begins...\n");
        
        ////////////////////////////////////////////////////////////////////////
        // Normally, professional programmers do not create a Linked List class, 
        // because a Linked List ADT is already available to programmers to 
        // import from something called the Collections framework which Java 
        // defines this as "The Java collections framework (JCF) is a set of 
        // classes and interfaces that implement commonly reusable collection
        // data structures". This description now has meaning  with your
        // experience, and the experience of creating a Linked List of our own 
        // will give you better insight into using and understanding this ADT. 
        // Although it is called a "framework" it is really a library of code 
        // you can use to import various ADTs for working with collections of
        // generic data. Some of the ADTs it gives programmers are:
        //   * List (including LinkedList and ArrayList)
        //   * Stack (studied in A.P. Computer Science)
        //   * Queue (including PriorityQueue, studied in A.P. Computer Science)
        //   * Set (including HashSet, or hash table)
        //   * Map (including variations of TreeMap)
        
        ////////////////////////////////////////////////////////////////////////
        
        // If we used the LinkedList from java.util API (Application Programming
        // Interface) instead of the Node and LinkedList classes we wrote...
        
        System.out.println("\nTesting the imported util LinkedList.........\n");
        
        LinkedList<Double> importList = new LinkedList<>();
        // And the various methods in this imported list (many of which match 
        // the methods we wrote for our LinedList class)...
        importList.add(1.2);           // Appends the element to the end of list
        importList.add(0, 2.3);     // Inserts element at  position in this list
        importList.addAll(importList);    // Appends all elements to end of list
        importList.addAll(0, importList);          // Inserts into list at index
        importList.addFirst(3.4);                        // Add to front of list
        importList.addLast(4.5);                           // Add to end of list
        importList.clone();                                        // Clone list
        //importList.clear();                  // Removes all elements from list
        importList.contains(1.2);       // Returns true if list contains element
        importList.containsAll(importList);          // true if has all elements
        importList.descendingIterator();       // Gets iterator in reverse order
        importList.element();     // Retrieves, but not remove, the head of list
        importList.equals(importList);                        // Deep comparison
        importList.get(0);                    // Accessor of the specified index
        importList.getFirst();         // Returns the first element in this list
        importList.getLast();           // Returns the last element in this list
        importList.indexOf(1.2); // Returns index of first occurrence of element
        importList.isEmpty(); // Returns true if collection contains no elements
        importList.iterator();           // Returns iterator of elements in list
        importList.lastIndexOf(1.2);     // Returns element's last index in list
        importList.offer(5.6);         // Adds the specified element as the tail
        importList.offerFirst(6.7);      // Inserts element at the front of list
        importList.offerLast(7.8);        // Inserts element at the back of list
        importList.peek();        // Retrieves, but not remove, the head of list
        importList.peekFirst();   // Retrieves, but not remove, the head of list
        importList.peekLast();    // Retrieves, but not remove, the tail of list
        importList.poll();             // Retrieves and removes the head of list
        importList.pollFirst();     // Retrieves / removes first element of list
        importList.pollLast();       // Retrieves / removes last element of list
        importList.pop();           // Retrieves / removes first element of list
        importList.push(8.9);                // Inserts element at front of list
        importList.remove();           // Retrieves and removes the head of list
        importList.remove(1.2); // Removes first occurrence of element from list
        importList.remove(0);   // Removes element at specified position in list
        //importList.removeAll(importList);     // Removes all of list from list
        importList.removeFirst();   // Retrieves / removes first element of list
        importList.removeFirstOccurrence(7.8);   // Remove first value from list
        importList.removeLast();     // Retrieves / removes last element of list
        importList.removeLastOccurrence(6.7);     // Remove last value from list
        importList.retainAll(importList);              // Retains list from list
        importList.reversed();     // Returns reverse-ordered view of collection
        importList.set(0, 7.8);        // Replaces element at index with element
        importList.size();        // Returns the number of elements in this list
        importList.subList(2,4);         // Returns list in list between indices
        //Double[] doubleArray = (Double[]) importList.toArray();     // Convert
        importList.toString();          // Returns string representation of list
        
        ArrayList<Character> arrayList = new ArrayList<>();
        arrayList.add(new Character('a'));    // Appends element to end of list
        arrayList.add(new Character('b'));
        arrayList.add(new Character('c'));
        arrayList.add(new Character('d'));
        arrayList.add(new Character('e'));        
        System.out.println("Imported ArrayList:\t" + arrayList.toString());
        System.out.println("Using the enhanced for loop with this object...");
        for (Character character : arrayList) {       // Using enhanced for loop
            System.out.print(character.toString() + " ");
        }
        System.out.println("");
        System.out.println("Using an iterator object...");
        Iterator i = arrayList.iterator();            // Another looping option
        while(i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        System.out.println("");
        ////////////////////////////////////////////////////////////////////////
        
        ////////////////////////////////////////////////////////////////////////
        Stack<String> stack = new Stack<>();
        stack.empty();
        stack.push("a");
        stack.peek();
        stack.pop();
        stack.search("a");
        
        
        
        
        
        
        System.out.println("\nExtras testing complete!\n");
    }
     
}