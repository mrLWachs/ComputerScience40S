/** Required package class namespace */
package testing.project;

/** Required API imports */
import collections.LinkedList;
import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

 
/**
 * Database.java - an abstract class to manage a LinkedList representing a 
 * database of users using static methods
 *
 * @author Mr. Wachs
 * @since May 24, 2025
 */
public abstract class Database 
{

    private static LinkedList<User> users = new LinkedList<>();   

    
    /**
     * Searches the database list to see if the passed user is in the list or not
     * 
     * @param user the user to search for
     * @return the user is in the list (true) or not (false)
     */
    public static boolean isValid(User user) {
        for (int i = 0; i < users.size(); i++) {                // Traverse list
            User existing = users.get(i);                            // Get user
            if (existing.equals(user)) {            // Compare to user parameter
                return true;                                  // User is in list
            }
        }
        return false;                                     // User is not in list
    }

    /**
     * Add the passed user object to the database list
     * 
     * @param user the user object to add to the database
     */
    public static void add(User user) {
        users.add(user);
    }

    /**
     * Populate the passed listbox control with all user in the database
     * 
     * @param usersList the listbox UI control
     */
    public static void addUsers(List usersList) {
        usersList.removeAll();                 // Clear existing listbox control
        for (int i = 0; i < users.size(); i++) {                // Traverse list
            User user = users.get(i);                         // Get user object
            String text = user.username + ", " + user.password;      // Get data
            usersList.add(text);                       // Add to listbox control
        }
    }

    /**
     * Remove the passed user object's index from the database list
     * 
     * @param index the index value to remove from the list
     */
    public static void remove(int index) { 
        users.remove(index);
    }

    /**
     * Retrieves the user object from the list
     * 
     * @param index the index value to get from the list
     * @return a User object
     */
    public static User getUser(int index) {
        return users.get(index);
    }
    
    /**
     * Saves the database linked list to a permanent file
     */
    public static void save() {
        try {                                               // Error catch block
            FileWriter  writer  = new FileWriter("data.txt"); // File connection
            PrintWriter printer = new PrintWriter(writer);    // Objects
            for (int i = 0; i < users.size(); i++) {            // Traverse list
                User user = users.get(i);                     // Get User object
                printer.println(user.username);             // Save data to file
                printer.println(user.password);
            }
            printer.close();                         // Close connection to file
        } 
        catch (IOException e) {           // File saving input/output (IO) error
            System.out.println("File save error");
        }
    }

    /**
     * Opens the database from a permanent file into the linked list
     */
    public static void open() {
        if (users.isEmpty() == false) return;    // When list is not empty, exit
        try {                                               // Error catch block
            users.clear();                                // Clear existing list
            FileReader     reader = new FileReader("data.txt");   // File 
            BufferedReader buffer = new BufferedReader(reader);   // connection
            String line = buffer.readLine();            // Read a line from file
            while (line != null) {                   // Loop while lines to read
                String username = line;                   // Convert to username
                line = buffer.readLine();            // Read next line from file
                String password = line;                   // Convert to password
                User user = new User(username, password);  // Create User object
                users.add(user);                      // Add User object to list
                line = buffer.readLine();         // Read in next line from file
            }
            buffer.close();                          // Close connection to file
        } 
        catch (IOException e) {          // File opening input/output (IO) error
            System.out.println("File open error");
        }
    }
 
}