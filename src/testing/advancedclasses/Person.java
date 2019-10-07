
/** required package class namespace */
package testing.advancedclasses;

 
/**
 * Person.java - represents a person, remember that classes are composed of
 * properties (things about it, descriptors, adjectives) and methods (things
 * it can do, actions, verbs) and we instantiate (create an instance of) the
 * class to create an object
 *
 * @author Mr. Wachs 
 * @since 09-Mar-2019 
 * @instructor Mr. Wachs
 */
public class Person 
{

    // PROPERTIES (below)...................................................
    
    /** The name of this person object */
    private String name;                        // encapsulated property
    public int age;     

    /** Protected property representing the person's gender */
    protected boolean isMale;
    
    
    // METHODS (below)......................................................
    
    /**
     * Default constructor for the class (default constructors have no
     * parameters)
     */
    public Person() {
        name   = "jane doe";
        age    = 0;        
        isMale = false;
    }
    
    /**
     * Outputs data on this person to the screen
     */
    public void talk() {
        System.out.println(this.toString());
    } 
    
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return name + " is " + age;
    }
    
    /**
     * comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        Person that = (Person)object;   // we cast object into other classes  
        if (this.age    != that.age)    return false;   // public property
        if (this.isMale != that.isMale) return false;   // protected property
        // Name????
        return true;
    }
        
}
