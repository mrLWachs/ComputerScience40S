/** Required package class namespace */
package testing.project;

 
/**
 * User.java - a class representing a program user with username and password
 *
 * @author Mr. Wachs
 * @since May 24, 2025
 */
public class User 
{
    
    /** The username property of this User object */
    public String username;
    
    /** The password property of this User object */
    public String password;
    
    /**
     * Default constructor, set class properties
     */
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return username + "\n" + password;
    }
    
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        User that = (User)object;            // Cast parameter into User object
        if (this.username.equals(that.username) &&
            this.password.equals(that.password)) {    // Compare both properties
            return true;                               // User objects are equal
        }
        return false;                              // User objects are not equal
    }
    
}