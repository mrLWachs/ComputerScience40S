/** Required package class namespace */
package project.database;
 
/**
 * User.java - 
 *
 * @author Mr. Wachs
 * @since May 2026
 */
public class User extends Person
{

    private String password;
    
    
    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }
    
    public User(String username, String password, int age) {
        super.setName(username);
        this.setPassword(password);
        // ignoring the age...
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
        User that = (User)object;
        String username1 = this.getName();
        String username2 = that.getName();
        String password1 = this.password;
        String password2 = that.password;
        if (username1.equals(username2) &&
            password1.equals(password2)) {
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