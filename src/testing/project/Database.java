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
 * Database.java - description
 *
 * @author Mr. Wachs
 * @since May 24, 2025
 */
public abstract class Database 
{

    private static LinkedList<User> users = new LinkedList<>();   

    
    /**
     * 
     * @param user
     * @return 
     */
    public static boolean isValid(User user) {
        for (int i = 0; i < Database.users.size(); i++) {
            User existing = Database.users.get(i);
            if (existing.equals(user)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 
     * @param user 
     */
    public static void add(User user) {
        users.add(user);
    }

    /**
     * 
     * @param usersList 
     */
    public static void addUsers(List usersList) {
        usersList.removeAll();
        for (int i = 0; i < Database.users.size(); i++) {
            User user = users.get(i);
            String text = user.username + ", " + user.password;
            usersList.add(text);
        }
    }

    /**
     * 
     * @param index 
     */
    public static void remove(int index) { 
        users.remove(index);
    }

    /**
     * 
     * @param index
     * @return 
     */
    public static User getUser(int index) {
        return users.get(index);
    }
    
    /**
     * 
     */
    public static void save() {
        try {
            FileWriter  writer  = new FileWriter("data.txt");
            PrintWriter printer = new PrintWriter(writer);
            for (int i = 0; i < Database.users.size(); i++) {
                User user = users.get(i);
                printer.println(user.username);
                printer.println(user.password);
            }
            printer.close();
        } 
        catch (IOException e) {
            System.out.println("File save error");
        }
    }

    /**
     * 
     */
    public static void open() {
        try {
            users.clear();
            FileReader     reader = new FileReader("data.txt");
            BufferedReader buffer = new BufferedReader(reader);
            String line = buffer.readLine();
            while (line != null) {
                String username = line;
                line = buffer.readLine();
                String password = line;
                User user = new User(username, password);
                users.add(user);
                line = buffer.readLine();
            }
            buffer.close();
        } 
        catch (IOException e) {
            System.out.println("File open error");
        }
    }
 
}