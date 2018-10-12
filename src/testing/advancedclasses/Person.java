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
    
    private   String  name;             // encapsulated property
    public    int     age;              // public property    
    protected boolean isMale;           // property available to child classes
    
    /**
     * Default constructor for the class (constructor methods use the same 
     * name as the class and has NO return type - not even void)
     */
    public Person() {
        name   = "Jane doe";
        age    = 0;
        isMale = false;
    }
    
    /**
     * Action method to have the person talk (outputs data on this person 
     * to the screen)
     */
    public void talk() {
        System.out.println(this.toString());;
    }
    
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Person " + name + 
               " is " + age +
               " and is a male is " + isMale;
    }
        
    /**
     * Determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        Person person = (Person)object; 
        if (person.isMale != this.isMale)  return false;
        if (person.name.equals(this.name)) return false;
        // check age?
        
        return true;
    }
    
}