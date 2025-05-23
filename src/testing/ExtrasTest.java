/** Required package class namespace */
package testing;
 
/** Required API imports */
import testing.project.LoginUI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;

/**
 * ExtrasTest.java - description
 *
 * @author Mr. Wachs
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
                
        ////////////////////////////////////////////////////////////////////////
        // LinkedList: this is an example if we used the LinkedList from 
        // java.util API (Application Programming Interface) instead of the  
        // Node and LinkedList classes we wrote...        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Testing the imported util LinkedList...");
        
        LinkedList<Double> importList = new LinkedList<>();
        // And the various methods in this imported list (many of which match 
        // the methods we wrote for our LinkedList class)...
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
        importList.element();     // Retrieves, but not remove, the head of list
        importList.equals(importList);                        // Deep comparison
        importList.get(0);                    // Accessor of the specified index
        importList.getFirst();         // Returns the first element in this list
        importList.getLast();           // Returns the last element in this list
        importList.indexOf(1.2); // Returns index of first occurrence of element
        importList.isEmpty(); // Returns true if collection contains no elements
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
        System.out.println("util.LinkedList: " + importList);
        
        ////////////////////////////////////////////////////////////////////////
        // ArrayList: is a hybrid between the LinkedList and the array. The 
        // advantage of ArrayList is faster random access due to direct 
        // indexing, making it more suitable for scenarios where quick element 
        // retrieval is critical. In contrast, LinkedList is advantageous for 
        // efficient insertions and deletions at any position within the list. 
        // The choice between them depends on your specific use case and 
        // performance requirements.
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Testing the imported util ArrayList...");
        
        ArrayList<Character> arrayList = new ArrayList<>();
        arrayList.add('a');            // Appends the element to the end of list
        arrayList.add(0, 'b');      // Inserts element at  position in this list
        arrayList.addAll(arrayList);      // Appends all elements to end of list
        arrayList.addAll(0, arrayList);            // Inserts into list at index
        arrayList.addFirst('c');                         // Add to front of list
        arrayList.addLast('d');                            // Add to end of list
        //arrayList.clear();                   // Removes all elements from list
        arrayList.clone();                                         // Clone list
        arrayList.contains('a');        // Returns true if list contains element
        arrayList.ensureCapacity(100);        // Increases capacity of ArrayList 
        arrayList.equals(arrayList);                          // Deep comparison
        arrayList.get(0);                     // Accessor of the specified index
        arrayList.getFirst();          // Returns the first element in this list
        arrayList.getLast();            // Returns the last element in this list
        arrayList.indexOf('b');  // Returns index of first occurrence of element
        arrayList.isEmpty();  // Returns true if collection contains no elements
        arrayList.lastIndexOf('a');      // Returns element's last index in list
        //arrayList.remove('a');       // Retrieves and removes the head of list
        arrayList.remove(0);    // Removes element at specified position in list
        //arrayList.removeAll(arrayList);       // Removes all of list from list
        arrayList.removeFirst();    // Retrieves / removes first element of list
        arrayList.retainAll(arrayList);      // Retains only those items in list
        arrayList.set(0, 'a');         // Replaces element at index with element
        arrayList.size();         // Returns the number of elements in this list
        arrayList.subList(0, 2);         // Returns list in list between indices
        //Character[] characterArray = (Character[])arrayList.toArray();
        arrayList.trimToSize();
        System.out.println("util.ArrayList: " + arrayList);
        
        ////////////////////////////////////////////////////////////////////////
        // Stack: represents a last-in-first-out (LIFO) stack of objects and is
        // an abstract data type that serves as a collection of elements with 
        // two main operations: Push, which adds an element to the collection, 
        // and Pop, which removes the most recently added element. You will 
        // notice a lot of methods carry over from the LinkedList (and other
        // methods seen in LinkedList and ArrayList are ommitted below)...
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Testing the imported util Stack...");
        
        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");
        stack.empty();
        stack.peek();
        stack.pop();
        stack.search("a");
        System.out.println("util.Stack: " + stack);
        
        ////////////////////////////////////////////////////////////////////////
        // NOTE: the Queue, Set, and Map are interfaces in the util API so you 
        // cannot instantiate them into classes, but you can use classes that 
        // implement those interfaces...
        //
        // NOTE: these are also complex data structures beyond the scope of this 
        // course, but hear are quick definitions and some same methods for
        // poterntial uses...
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Testing other util collections data structures...");
        
        ////////////////////////////////////////////////////////////////////////
        // Queue: an abstract data structure, somewhat similar to Stacks. 
        // Unlike stacks, a queue is open at both its ends. One end is always 
        // used to insert data (enqueue) and the other is used to remove data
        // (dequeue). Queue follows First-In-First-Out (FIFO) methodology, 
        // i.e. the data item stored first will be accessed first
        ////////////////////////////////////////////////////////////////////////
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);        
        queue.peek();
        queue.poll(); 
        System.out.println("util.PriorityQueue: " + queue);
        
        ////////////////////////////////////////////////////////////////////////
        // Set: is an unordered collection of objects in which duplicate 
        // values cannot be stored. A Hash Set is a form of Hash Table data 
        // structure that usually holds a large number of elements. Using a 
        // Hash Set we can search, add, and remove elements really fast. Hash
        // Sets are used for lookup, to check if an element is part of a set
        ////////////////////////////////////////////////////////////////////////
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");
        System.out.println("util.Set: " + set);
        
        // The set has many of the same methods as the other collection data 
        // structures but is used for faster checking if an item is in the set 
        // or not
        
        ////////////////////////////////////////////////////////////////////////
        // Map: is an object that maps keys to values. A map cannot contain 
        // duplicate keys: Each key can map to at most one value. the HashMap 
        // is a data structure that uses a hash table for storing key-value 
        // pairs
        ////////////////////////////////////////////////////////////////////////
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 100);
        map.put("b", 200);
        map.put("c", 300);
        map.put("d", 400);
        map.put("e", 500);        
        System.out.println("util.Map: " + map);        
        
        ////////////////////////////////////////////////////////////////////////
        //  
        ////////////////////////////////////////////////////////////////////////        
        LoginUI ui = new LoginUI();
                
        System.out.println("\nExtras testing complete!\n");
    }
     
}