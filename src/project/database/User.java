/** Required package class namespace */
package project.database;
 
/**
 * User.java - represents a program user
 *
 * @author Mr. Wachs
 * @since May 2026
 */
public class User extends Person
{

    private String password;                   // Encapsulated password property
    
    
    /**
     * Class constructor sets class properties
     * 
     * @param username the User's username property
     * @param password the User's password property
     * @param age the User's age property (not used for this demo)
     */
    public User(String username, String password, int age) {
        super.setName(username);                             // Inherited method
        this.setPassword(password);                            // Mutator method
        // We are ignoring the age...
    }
    
    /**
     * Accessor method for the password property
     * 
     * @return the User's password property
     */
    @Override
    public String getPassword() {
        return password;
    }

    /**
     * Mutator method for the password property
     * 
     * @param password the password property to set
     */
    @Override
    public void setPassword(String password) {
        this.password = password;
    }
         
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return super.getName() + ", " + password;
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
        String username1 = this.getName();      // Retrieve (with accessors) the
        String username2 = that.getName();       // usernames and passwords from
        String password1 = this.password;                   // both User objects
        String password2 = that.password;
        if (username1.equals(username2) &&
            password1.equals(password2)) {           // Ensure both are the same
            return true;                                    // Valid equal users
        }        
        return false;                                         // Not equal users
    }

}