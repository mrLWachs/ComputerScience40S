/** Required package class namespace */
package testing.extras.storage;

/** Required API imports */
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
                
        // Let's create a proper file NAME to save our data TO and then read
        // that same data FROM (we will "Hard code" this file name")
        
        // Let's create a proper file NAME.....................................
        String first    = "C:\\temp\\";   // File "Path" (e.g. "c:/my docs...")
        String middle   = "data";         // File name (e.g. "essay")
        String last     = ".txt";         // File extention (e.g. ".doc" ".txt")
        String fileName = first + middle + last;     // Full Name (concatinated)
                
        // Write ONE piece of data (the word) to that permanent file............   
        
        // In order for file saving/opening to take place, an "error trap"
        // or "error handling" has to take place (try catch block)
        // Writing data (saving) to a permanent file
        try {
            // Opening the "try" block (means "try this code"), this is the 
            // "trap" we set to "try" some code, and if an error occurs (of 
            // the type we are catching for) we "catch" that error and the  
            // program keeps running.......................................... 
            
            // Create instance (object) of the classes needed and connect the 
            // 2 classes with the file name we just made........................
            FileWriter  writer  = new FileWriter(fileName);   // First object
            PrintWriter printer = new PrintWriter(writer);
            // Now write to the file............................................
            printer.print(word);        // Call class method to write to file..   
            // Sever (disconnect) from the file.................................
            printer.close();                                // Close connection           
        }
        catch(IOException error) {
            // Open the "catch" block, so if an error occurs in the "try" block
            // of the type we defined (divide by zero..) the program will 
            // not shut down, instead it will jump (branch) to this block (the 
            // catch block).................................................... 
            System.out.println("IO error in saving...");
        }
        
        // Now open the files (for the one with one line)...................... 
        
        // Reading data (opening) from a permanent file
        try {
            // Use of similar classes form similar APIs to read from files as 
            // we used to write to files
            FileReader     reader = new FileReader(fileName);       // Connect.....
            BufferedReader buffer = new BufferedReader(reader); // Connect..... 
            word = buffer.readLine();                           // Read line...
            buffer.close();                                     // Close connect           
        }
        catch(IOException error) {
            System.out.println("IO error in opening...");
        }
        
        // Test to see....
        System.out.println("I can see " + word);
        
        // Do it again with the array (multiple lines)......................... 
        
        // Write multiple "lines" (the array)
        try {
            
            FileWriter  writer  = new FileWriter(fileName);    // Link file
            PrintWriter printer = new PrintWriter(writer); // and writer
            // Use the enhanced for loop - which you can read as...
            // "for every line in poem"
            for (String line : poem) {  // Enhanced loop through array..  
                printer.println(line);      // Writing one array index..
            }
            printer.close();            // Sever (close) file connection           
        }
        catch (IOException error) {                          // Catch error.....
            System.out.println("File save error");           // Message user....
        }
        
        // Read multiple "lines" (the array)
        try {
            FileReader     reader = new FileReader(fileName);    // Connect.....
            BufferedReader buffer = new BufferedReader(reader); // Connect.....            
            String line = buffer.readLine();                    // Read line...       
            while (line != null) {                  // Loop until no inputs left
                System.out.println("This line read was: " + line); // Output....
                line = buffer.readLine();                        // Read again..
            }
            buffer.close();                                     // Close connect  
        } 
        catch (IOException error) {                          // Catch error.....
            System.out.println("File open error");           // Message user....
        }
                
    }
    
}