/** Required package class namespace */
package project.database;
 
/**
 * Person.java - description
 *
 * @author Mr. Wachs
 * @since May 2026
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