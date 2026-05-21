/** Required package class namespace */
package project.database;
 
import collections.LinkedList;

/**
 * Database.java - description
 *
 * @author YOUR NAME
 * @since May 21, 2026, 9:03:38 AM
 */
public class Database 
{
    
    private static LinkedList<User> users = new LinkedList<>();

    public static boolean checkForUser(String username, String password) {
        User user = new User(username, password, 0);
        if (users.contains(user)) {
            return true;
        }
        return false;
    }

    public static void addNewUser(String username, String password) {
        User user = new User(username, password, 0);
        users.add(user);
    }
    
}