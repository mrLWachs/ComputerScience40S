/** Required package class namespace */
package testing.extras.storage;

import collections.LinkedList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

 
/**
 * StorageTest.java - a bonus example of permanent storage. Further resources 
 * for this topic can be found here:
 *      - Lecture on topic: https://bit.ly/3ZPKpIF
 *      - Older Example: https://bit.ly/3Db5Lan
 *      - Sample Assignment: https://bit.ly/41MDJMT
 *      - Review sheet: https://bit.ly/3Db5Lan
 *
 * @author Mr. Wachs
 * @since December 2024
 */
public class StorageTest 
{

    /**
     * Default constructor method
     */
    public StorageTest() {
        // First, we need some data to save...        
        String word = "Santa";        
        String[] poem = {
            "Santa pulls up in his sleigh, no cap",
            "Dripped out in red, got that holiday snap",
            "Cookies on deck, he's a vibe, no stress",
            "Sliding through chimneys like, 'Y'all are blessed",
            "Big man stays lit-pure Xmas flex"            
        };        
        LinkedList<String> anotherPoem = new LinkedList<>(poem);
        // In order for file saving/opening to take place, an "error trap"
        // or "error handling" has to take place (try catch block)
        
        // "Hard code" a file to save to...
        String first  = "c:\\temp\\";
        String middle = "data";
        String last   = ".txt";
        String fileName = first + middle + last;
        
        // Writing data (saving) to a permanent file
        try {
            FileWriter  writer  = new FileWriter(fileName);
            PrintWriter printer = new PrintWriter(writer);
            printer.print(word);
            printer.close();            
        }
        catch(IOException error) {
            System.out.println("IO error in saving...");
        }
        
        // Reading data (opening) from a permanent file
        try {
            FileReader     reader = new FileReader(fileName);
            BufferedReader buffer = new BufferedReader(reader);
            word = buffer.readLine();
            buffer.close();            
        }
        catch(IOException error) {
            System.out.println("IO error in opening...");
        }
        
        // Test to see....
        System.out.println("I can see " + word);
        
        // Multiple "lines"
        try {
            FileWriter  writer  = new FileWriter(fileName);
            PrintWriter printer = new PrintWriter(writer);
            for (int i = 0; i < poem.length; i++) {
                printer.println(poem[i]);
            }
            printer.close();            
        }
        catch(IOException error) {
            System.out.println("IO error in saving...");
        }
        // And reading the array
        try {
            FileReader     reader = new FileReader(fileName);
            BufferedReader buffer = new BufferedReader(reader);
            String line = buffer.readLine();
            while (line != null) {
                line = buffer.readLine();
                System.out.println("Line read: " + line);
            }
            buffer.close();            
        }
        catch(IOException error) {
            System.out.println("IO error in opening...");
        }
        
    }
    
}