/** required package class namespace */
package testing.advancedclasses;

/**
 * Person.java - represents a person
 *
 * @author Mr. Wachs 
 * @since 09-Mar-2019 
 * @instructor Mr. Wachs
 */
public class Person 
{

    // PROPERTIES:
    
    /** The name of this person object */
    private String name;
    public int age;                             // encapsulated property
    
    /** Protected property representing the person's gender */
    protected boolean isMale;
    
    // METHODS:
    
    /**
     * Default constructor for the class (default constructors have no
     * parameters)
     */
    public Person() {
        name   = "Jane Doe";
        age    = 0;
        isMale = false;
    }
    
    /**
     * Outputs data on this person to the screen
     */
    public void talk() {
        System.out.print("Person: ");
        System.out.println(name + " is " + age + " and " + isMale);
    }    
   
}