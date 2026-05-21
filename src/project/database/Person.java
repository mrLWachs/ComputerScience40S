/** Required package class namespace */
package project.database;
 
/**
 * Person.java - description
 *
 * @author YOUR NAME
 * @since May 21, 2026, 9:03:20 AM
 */
public abstract class Person 
{
    private String name;
    private int age;
    // etc....
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public abstract String getPassword();
    public abstract void setPassword(String password);
        
}