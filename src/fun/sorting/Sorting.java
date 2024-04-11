/** Required package class namespace */
package fun.sorting;

/** Required API imports */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import testing.Tester;
import utility.io.Simulator;
import utility.io.System;

/**
 * Sorting - a specific example to start learning sorting algorithms
 * 
 * @author Mr. Wachs
 * @since March 22, 2024
*/
public class Sorting
{
    
    // An ADT list of potential names to choose from
    private ArrayList<String> names;

    /**
     * Default constructor, set class properties
     * 
     * @param state the run state of this code module
     */
    public Sorting(int state) {
        if (state == Tester.DO_NOT_RUN) {
            return;
        }
        
        Simulator.comment("Learn about sorting");
        
        // Create a maximum number of people for our list object
        // Let's try 38.25 million people (38,250,000) which 
        // is approximately the current population of Canada
        final int MAX = 38250000;
        
        // Create the ADT list to store the data
        ArrayList<Person> people = new ArrayList<>();
        
        // Fill the ArrayList ADT with all the potential names
        getNames();
        
        // Traverse the list adding randomly instantiated Person objects
        for (int i = 0; i < MAX; i++) {
            people.add(new Person(getName(),getAge(),getIQ()));
        }
        
        System.out.println("Sort by Name...............................");        
        Person.sortType = Person.BY_NAME;   // Set the sorting type
        sort(people);                       // Sort the list
        output(people);                     // Display the sorted list
        
        System.out.println("Sort by Age...............................");   
        Person.sortType = Person.BY_AGE;    // Set the sorting type
        sort(people);                       // Sort the list
        output(people);                     // Display the sorted list
        
        System.out.println("Sort by IQ...............................");        
        Person.sortType = Person.BY_IQ;     // Set the sorting type
        sort(people);                       // Sort the list
        output(people);                     // Display the sorted list
    }
    
    /**
     * Gets a randomly picked name for the large list of potential names
     * 
     * @return a randomly picked name from the list
     */
    public String getName() {
        if (names != null) {
            double low   = 0d;
            double high  = (double)(names.size()-1);
            int    index = (int)random(low,high);
            return names.get(index);
        }
        return null;
    }

    /**
     * Accessor method to generate a random age
     * 
     * @return a random age between 1 and 120
     */
    private int getAge() {
        return (int)random(1d, 120d);
    }

    /**
     * Accessor method to generate a random IQ
     * 
     * @return a random IQ between 1.0 and 4.0
     */
    private double getIQ() {
        return random(0.0,4.0);
    }
    
    /**
     * Display the list of names on screen
     * 
     * @param people the ADT list of people
     */
    private void output(ArrayList<Person> people) {
        System.out.println("Here are the first 5 people in the list...");
        for (int i = 0; i < 5; i++) {
            System.out.println(i + ": \t" + people.get(i));
        }
        System.out.println("Here are the last 5 people in the list...");
        int end = people.size();
        int start = end - 5;
        for (int i = start; i < end; i++) {
            System.out.println(i + ": \t" + people.get(i));
        }
    }

    /**
     * The sorting of the list of people
     * 
     * @param list the ADT list of people
     */
    private void sort(ArrayList<Person> list) {
        // There are many types of sort algorithms you can investigate,
        // the most intuitive one most people think of is known as the 
        // "selection sort" algorithm. In which you search a list for the 
        // smallest item, move it to a new list, and continue until all items
        // fromt he original list are moved to a new list. However, the 
        // "bubble sort" is the easiest algorithm to write.
        
        // A Basic "bubble sort" algorithm below:
        // int a[] = { 3,5,7,2,9,1,8 };
        // for (int i = 0; i < a.length; i++) {
        //     for (int j = 0; j < a.length-1; j++) {
        //         if (a[j] > a[j+1]) {
        //             int temp = a[j];
        //             a[j]     = a[j+1];
        //             a[j+1]   = temp;
        //         }
        //     }
        // }
        
        // Here is a more "optimized" version of the bubble sort
        // for (int i = list.size()-1; i > 0; i--) {            
        //     boolean didISwap = false;            
        //     // Travel through the list...
        //     for (int j = 0; j < i; j++) {
        //         Person p1 = list.get(j);
        //         Person p2 = list.get(j + 1);
        //         // Check if the value is greater than 
        //         // the next value
        //         if (p1.compareTo(p2) > 0) {
        //             didISwap = true;
        //             // Swap them
        //             Person p3 = p1.clone();
        //             p1 = new Person(p2.name, p2.age, p2.iq);
        //             p2 = new Person(p3.name, p3.age, p3.iq);
        //             // Update the list
        //             list.set(j, p1);
        //             list.set(j + 1, p2);
        //         }
        //     }            
        //     // check if no swaps took place
        //     if (didISwap == false) {
        //         return;
        //     }
        // }
        // // Do it again (as many times as things in the list)
        
        
        // And here is a "fancier" sort algorithm known as the "quick sort"
        // algorithm that uses wrapper methods and recursion to sort the list
        if (list == null) return;                       // error check
        recursiveQuick(list,0,list.size()-1);        
    }
    
    
    /**
     * Recursive implementation of a quick sort algorithm 
     * 
     * @param list the ArrayList to sort
     * @param front the marker for the front partition
     * @param back the marker for the back partition 
     */
    private void recursiveQuick(ArrayList<Person> list, int front, int back) {
        if (back <= front) return;
        else {
            int pivot = partition(list,front,back);
            recursiveQuick(list,front,pivot-1);
            recursiveQuick(list,pivot+1,back);
        }
    }
    
    /**
     * Partitions the list into S1 and S2 and separates
     * 
     * @param list the ArrayList to partition
     * @param front the marker for the front partition
     * @param back the marker for the back partition 
     * @return the position of the partition in the list
     */
    private int partition(ArrayList<Person> list, int front, int back) {
        Person pivot = list.get(front);
        while (back > front) {
            while (back > front && list.get(back).compareTo(pivot) > 0)
                back--;
            if (back == front) break;
            list.set(front,list.get(back));
            front++;            
            while (back > front && list.get(front).compareTo(pivot) < 0)
                front++;
            if (back == front) break;
            list.set(back,list.get(front));
            back--;
        }
        list.set(front,pivot);
        return front; 
    }
    
    /**
     * Random number generator in a range
     * 
     * @param low the lowest possible number in the range
     * @param high the highest possible number in the range
     * @return a random double in the range
     */
    private double random(double low, double high) {
        return (high - low + 1d) * Math.random() + low;
    }
    
    /**
     * Reads the data file containing a large list of potential names and 
     * reads the list into a global ADT list data structure
     */
    private void getNames() {
        try {    
            names = new ArrayList<>();
            final String   DATA       = "/fun/sorting/names.txt";
            URL            url        = getClass().getResource(DATA);
            URI            uri        = url.toURI();
            File           fileToOpen = new File(uri);
            FileReader     stream     = new FileReader(fileToOpen);
            BufferedReader file       = new BufferedReader(stream);
            String         line       = file.readLine();
            while (line != null) {
                names.add(line);
                line = file.readLine();
            }
            file.close();
        }
        catch (NullPointerException error) {
            System.out.println("Null: " + error.toString());
        }
        catch (IOException | URISyntaxException error) {
            System.out.println("File open: " + error.toString());
        }
    }

}