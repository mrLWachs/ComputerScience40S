
/** Required package class namespace */
package finalproject;
 

/**
 * User.java - this class represents a user for our mock final project
 * 
 * @author Mr. Wachs
 * @since January 2026
 */
public class User 
{

    private String name;             // Encapsulated name property of this class
    private String password;     // Encapsulated password property of this class
    
    
    /**
     * Default constructor, set class properties
     * 
     * @param name the name for this user
     * @param password the password for this user
     */
    public User(String name, String password) {
        this.name     = name;      // Set passed parameter to the class property
        this.password = password;  // Set passed parameter to the class property
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
        User that = (User)object;             // Cast parameter into User object
        if (this.name.equalsIgnoreCase(that.name) &&
            this.password.equalsIgnoreCase(that.password)) { 
            // Compare both string properties, they must both match 
            return true;
        }
        return false;                                 // Properties do not match
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