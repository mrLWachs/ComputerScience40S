
/** required package class namespace */
package testing.advancedclasses;

 
/**
 * Person.java - represents a person, remember that classes are composed of
 * properties (things about it, descriptors, adjectives) and methods (things
 * it can do, actions, verbs) and we instantiate (create an instance of) the
 * class to create an object
 *
 * @author Mr. Wachs
 * @since Feb. 28, 2020, 2:02:58 p.m.
 */
public class Person 
{

    // PROPERTIES (below)...................................................
    
    private String name;    // encapsulated property
    public int age;
    
    /** Protected property representing the person's gender */
    protected boolean isMale;
    
    
    // METHODS (below)......................................................
    
    /**
     * Default constructor, set class properties
     */
    public Person() {
        name   = "jane doe";
        age    = 0;
        isMale = false;
    }
    
    /**
     * Class constructor sets class properties to parameter values
     * 
     * @param name the name for this person
     * @param age the age for this person
     * @param isMale the gender for this person
     */
    public Person(String name, int age, boolean isMale) {
        this.name   = name;
        this.age    = age;
        this.isMale = isMale;
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
        return name + "," + age + "," + isMale;
    }
    
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     * "shallow" comparison would be: "return true;" and a "deeper" comparison 
     * would be to first turn (cast) the object into a person and then compare 
     * ALL the properties of "this" person with ALL the properties of the 
     * other person object (which we will call "that")
     * 
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        Person that = (Person)object; 
        if (this.age    != that.age)      return false;
        if (this.isMale != that.isMale)   return false;
        if (!this.name.equals(that.name)) return false; 
        return true;
    }
    
    /**
     * A Deep clone, creates a duplicate object using new memory
     * A shallow clone would be: "return this;" and a deeper clone is shown
     * below...
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Person clone() {
        Person person = new Person();
        person.name   = this.name;
        person.age    = this.age;
        person.isMale = this.isMale;
        return person;
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
    
}
