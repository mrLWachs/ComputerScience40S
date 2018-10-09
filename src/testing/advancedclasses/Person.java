/** required package class namespace */
package testing.advancedclasses;


/**
 * Person.java - represents a person
 *
 * @author Mr. Wachs 
 * @since 4-Oct-2018 
 */
public class Person 
{
    
    private String name;    // encapsulated property
    public int age;         // property
    
    /**
     * Default constructor for the class (constructor methods use the same 
     * name as the class and has NO return type - not even void)
     */
    public Person() {
        name = "Jane doe";
        age  = 0;
    }
    
    /**
     * Action method to have the person talk (outputs data on this person 
     * to the screen)
     */
    public void talk() {
        System.out.println("Person " + name + " is " + age);
    }

}