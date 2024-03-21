/** Required package class namespace */
package fun.sorting;

import java.util.ArrayList;


/**
 * SortPeople - description
 * 
 * @author YOUR NAME
 * @since Mar 21, 2024
*/
public class SortPeople
{

    /**
     * Default constructor, set class properties
     * 
     * @param shouldRun determines if this test should run (true) or not (false)
     */
    public SortPeople(boolean shouldRun) {
        if (!shouldRun) {
            return;
        }       
        final int MAX = 100;
        ArrayList<Person> people = new ArrayList<>();
        for (int i = 0; i < MAX; i++) {
            people.add(new Person(getName(),getAge()));
        }
        output(people);
        Person.byName = true;
        sort(people);
        output(people);
    }
    
    public static String getName() {
        return "Nicey Persony";
    }

    private static int getAge() {
        return (int)(120d * Math.random() + 1d);
    }

    private static void output(ArrayList<Person> people) {
        System.out.println(people.toString());
    }

    private static void sort(ArrayList<Person> people) {
        // To do...
    }

}