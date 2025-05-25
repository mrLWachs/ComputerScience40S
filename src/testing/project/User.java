/** Required package class namespace */
package testing.project;

 
/**
 * User.java - description
 *
 * @author Mr. Wachs
 * @since May 24, 2025
 */
public class User 
{
    
    /** */
    public String username;
    
    /** */
    public String password;
    
    /**
     * Default constructor, set class properties
     */
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    /**
     * 
     * @return 
     */
    public String toString() {
        return username + "\n" + password;
    }
    
    /**
     * 
     * @param object
     * @return 
     */
    public boolean equals(Object object) {
        User that = (User)object;
        if (this.username.equals(that.username) &&
            this.password.equals(that.password)) {
            return true;
        }
        return false;
    }
    
}