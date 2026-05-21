/** Required package class namespace */
package project.database;
 
/**
 * Person.java - represents a person (like a profile for a game or for a 
 * database of people signed up for a service) and various properties (some 
 * seen in this example, but other potentials like email, phone number, etc.)
 *
 * @author Mr. Wachs
 * @since May 2026
 */
public abstract class Person 
{
    
    private String name;                           // Encapsulated name property
    private int age;                 // For this example we will be ignoring age
    
    
    /**
     * Accessor method for the name property
     * 
     * @return the person's name property
     */
    public String getName() {
        return name;
    }
    
    /**
     * Mutator method for the name property
     * 
     * @param name the name property to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Abstract accessor method for the password property for children of this 
     * class
     * 
     * @return the password property child classes will enforce
     */
    public abstract String getPassword();
    
    /**
     * Abstract mutator method for the password property for children of this 
     * class
     * 
     * @param password the password to set that child classes will enforce
     */
    public abstract void setPassword(String password);
        
}