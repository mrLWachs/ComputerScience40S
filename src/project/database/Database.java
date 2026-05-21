/** Required package class namespace */
package project.database;
 
/** Required API imports */
import collections.LinkedList;


/**
 * Database.java - class to manage the database of User class objects. Including
 * checking the database to see if the user is in the database, and adding
 * new users to the database. This class also has the potential to do other
 * things a potential program like this would do like:
 * 
 *  - Deleting users from the database
 *  - Changing information of a user (mutator/setter) in the database
 *  - Retrieving information of a user (accessor/getter) in the database
 *  - Saving the database of users to a permanent file (non volatile data)
 *  - Opening the permanent file and loading the users into the database
 *  - Sorting users (alphabetically by one or more fields)
 *
 * @author Mr. Wachs
 * @since May 2026
 */
public class Database 
{
    
    /** 
     * ADT (dynamic data structure) from our CS40S collections unit to store
     * all the User class objects dynamically
     */
    private static LinkedList<User> users = new LinkedList<>();

    
    /**
     * Checks the database to see if the passed user data formed into "User"
     * object is in the existing database with the same username and password
     * 
     * @param username the user to check's username
     * @param password the user to check's password
     * @return the user is in the database (true) or not (false)
     */
    public static boolean checkForUser(String username, String password) {
        User user = new User(username, password, 0);     // Build temporary user
        if (users.contains(user)) {                // LinkedList method to check
            return true;                                     // User in database
        }
        return false;                                    // User not in database
    }

    /**
     * Adds the passed user data formed into "User" into the database of all 
     * users
     * 
     * @param username the new user's username
     * @param password the new user's password
     */
    public static void addNewUser(String username, String password) {
        User user = new User(username, password, 0);    // Build new User object
        users.add(user);                             // LinkedList method to add
    }
    
}