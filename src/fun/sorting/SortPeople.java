/** Required package class namespace */
package fun.sorting;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
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
        
        final int MAX = 2000;
        ArrayList<Person> people = new ArrayList<>();
        for (int i = 0; i < MAX; i++) {
            people.add(new Person(getName(),getAge(),getIQ()));
        }
        Person.sortType = Person.BY_NAME;
        sort(people);
        output(people);
        
        System.out.println("...............................");
        
        Person.sortType = Person.BY_AGE;
        sort(people);
        output(people);
        
        System.out.println("...............................");
        
        Person.sortType = Person.BY_IQ;
        sort(people);
        output(people);
    }
    
    public String getName() {
        ArrayList<String> names = getNames();
        if (names != null) {
            double low  = 0d;
            double high = (double)(names.size()-1);
            int index = (int)random(low,high);
            return names.get(index);
        }
        return null;
    }

    private int getAge() {
        return (int)random(1d, 120d);
    }

    private double getIQ() {
        return random(0.0,4.0);
    }
    
    private void output(ArrayList<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    private void sort(ArrayList<Person> list) {
        if (list == null) return;                   // error check
        boolean sorted = true;                      // flag to stop or not
        for (int i = list.size()-1; i >= 0; i--) {  // traverse list
            sorted = true;                          // assume sorted
            for (int j = 0; j < i; j++) {           // traverse again
                Person item1 = list.get(j);  
                Person item2 = list.get(j+1);
                if (item1.compareTo(item2) > 0) {   // out of order
                    sorted = false;                 // flag no sorted
                    list.set(j, item2);             // swap positions
                    list.set(j+1, item1);
                } 
            }
            if (sorted) return;                     // return early
        }
    }
    
    private double random(double low, double high) {
        double seed   = Math.random();              // Create random seed value
        double L      = (double)low;                // Cast low boundry
        double H      = (double)high;               // Cast high boundry
        double value  = (H - L + 1) * seed + L;     // Apply formula
        return value;                              // return final value     
    }
    
    private ArrayList<String> getNames() {
        try {           
            URL url = getClass().getResource("/fun/sorting/names.txt");
            URI uri = url.toURI();
            File fileToOpen = new File(uri);
            FileReader     stream = new FileReader(fileToOpen);
            BufferedReader file   = new BufferedReader(stream);
            ArrayList<String> names = new ArrayList<>();
            String line = file.readLine();
            while (line != null) {
                names.add(line);
                line = file.readLine();
            }
            file.close();
            return names;
        }
        catch (NullPointerException error) {
            System.out.println("Null: " + error.toString());
        }
        catch (IOException error) {
            System.out.println("File open: " + error.toString());
        } 
        catch (URISyntaxException error) {
            System.out.println("File open: " + error.toString());
        }
        return null;
    }

}