
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
     * Mutator method to change the private property
     * 
     * @param name the property to mutate
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Accessor method of the private property
     * 
     * @return the property to "see"
     */
    public String getName() {
        return name;
    }
    
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Person: " + name + " is " + age + " and " + isMale;
    }
    
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        // shallow comparison would be: return true; 
        Person that = (Person)object;   // we cast object into other classes  
        if (this.isMale != that.isMale)   return false;
        if (this.age    != that.age)      return false;
        if (!this.name.equals(that.name)) return false;
        return true;
    }
        
    /**
     * a Deep clone, creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Person clone() {
        // shallow clone would be: return this;
        Person person = new Person();        
        person.age    = this.age;
        person.isMale = this.isMale;
        person.setName(this.getName());
        return person;
    }
    
}
