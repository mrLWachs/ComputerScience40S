/** Required package class namespace */
package testing.extras.storage;

/** Required API imports */
import collections.LinkedList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import testing.extras.tools.Dialogs;


 
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
        System.out.println("\nPermanent Storage test starting...\n");
        
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
        
        // Let's save and open a file again, but this time involve the user
        // who will give us the name (first, middle, and last) of the file to 
        // save/open to/from - using a dialog box...
        
        // We could use something like a standard input dialog, but lots
        // of potential errors could occur...
        // fileName = JOptionPane.showInputDialog("Enter the name of the file");
        
        // Other simple options include...
        // Scanner scanner = new Scanner(System.in);
        // fileName = scanner.nextLine();
        
        // Or we could build a GUI and use a textbox, but instead, we will use
        // something new that is already built for this. We will also use the 
        // "File" class (imported) object to work with the files...
        
        JFileChooser chooser = new JFileChooser();     // The File Chooser class
        chooser.showSaveDialog(null);                     // The save dialog box
        File file = chooser.getSelectedFile();         // Get the file from user
        if (file == null) {                    // Make sure they selected a file
            System.out.println("Enter proper file name");
        }
        else {
            if (file.exists()) {               // User selected an existing file
                System.out.println("You would overwrite an existing file");
            }
            else {                       // No file exists, so we will create it
                try {
                    FileWriter  write   = new FileWriter(file);       // Connect
                    PrintWriter printer = new PrintWriter(write);     // Connect
                    printer.print(word);                           // Write word
                    printer.close();                         // Close connection
                } catch (IOException e) { }                
            }
        }
        // And now open it...
        chooser.showOpenDialog(null);                     // The open dialog box 
        try {
            FileReader     read   = new FileReader(chooser.getSelectedFile());
            BufferedReader buffer = new BufferedReader(read);
            System.out.println("Read from file: " + buffer.readLine());
            buffer.close();                                  // Close connection
        } catch (IOException e) { }
        
        // The File class (that we imported above) has a lot of interesting /
        // potentially "dangerous" methods like those seen in this reference:
        // https://bit.ly/3Db5Lan
        
        // What if I wanted to save more complex "things" other than primitive 
        // data type, arrays ---- instead things like class data (a custom
        // class I create, like "Athlete") or LinkedList, etc. Also, what if 
        // I wanted to create a "class" or "abstract class", "interface", a
        // "API" that could be resusable for saving/opening "things" in other
        // programs... (like Santa, Wachs will provide)
        
        Dialogs dialog = new Dialogs();                  // Create a open dialog 
        FileHandler handler = new FileHandler(dialog);  // Create a file handler
        File newFile = dialog.saveFile(null);          // Get the file from user
        handler.save(anotherPoem, newFile);         // Save object to file
        // Now read the linked list object from the file into a new list
        LinkedList<String> theLastPoem = handler.openList(newFile);        
        System.out.println("LinkedList read from a file was: " + theLastPoem);
               
        // For objects not defined ("generic") they will need to implement
        // the java "Serializable" interface so they can be saved to a special
        // type of files like that. For example, I will remake the "Person" 
        // class (but remove some methods and comments) from our Advanced 
        // Classes unit in this package and add that "implements" modification  
        // to the class signature line. Then I can save that object to a file...
        Person person = new Person("Savy Person", 30, "file");  // Create Person
        File lastFile = dialog.saveFile(null);                      // Get file
        handler.saveObject(person, lastFile);      // Save Person object to file
        // Open the file and get the Person object (with casting)
        Person newPerson = (Person)handler.openObject(lastFile);
        newPerson.talk();               // Call talk method of new Person object
        
        // This could even be extended into saving an entire LinkedList of class
        // objects to a file. We could add the "implements" modification to our
        // existing LinkedList class (and Node class) to make this work, or we 
        // could import the LinkedList from java.util (which already has it
        // implemented)...
        java.util.LinkedList<Person> people = new java.util.LinkedList<>();
        for (int i = 0; i < 100; i++) {        // Add 100 Person objects to list
            people.add(new Person("i", i, "person"));
        }
        handler.saveObject(people, lastFile);      // Save list of object to file
        // Now open (with casting) the list of Person objects and output
        people = (java.util.LinkedList<Person>)handler.openObject(lastFile);
        System.out.println(people);
        
        System.out.println("\nPermanent Storage test complete!\n");
    }
    
}