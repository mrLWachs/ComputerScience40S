/** Required package class namespace */
package finalproject;
 
/**
 * User.java - description
 *
 * @author YOUR NAME
 * @since Jan 7, 2026, 8:57:57 AM
 */
public class User 
{

    private String name;
    private String password;
    
    
    /**
     * Default constructor, set class properties
     * 
     * @param name
     * @param password
     */
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "User: " + name + " Password: " + password;
    }
   
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        User that = (User)object;
        if (this.name.equalsIgnoreCase(that.name) &&
            this.password.equalsIgnoreCase(that.password)) {
            return true;
        }
        return false;
    }
       
    /**
     * a Deep clone, creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public User clone() {
        return this;
    }
    
}