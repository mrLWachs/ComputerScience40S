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
    private String name;
    public int age;                             // encapsulated property
    
    /** Protected property representing the person's gender */
    protected boolean isMale;
    
    public static int total;
    
    // METHODS (below)......................................................
    
    /**
     * Default constructor for the class (default constructors have no
     * parameters)
     */
    public Person() {
        name   = "Jane Doe";
        age    = 0;
        isMale = false;
        total++;
    }
    
    /**
     * Outputs data on this person to the screen
     */
    public void talk() {
        System.out.println(this.toString());
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
        if (this.name.equals(that.name)) {
            if (this.isMale == that.isMale) {
                if (this.age == that.age) {
                    return true;
                }
            }
        }
        return false;
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
     * NetBeans Tip: We once again went into Tools -> Templates and opened the
     * Java class template and added the following:
     * 
     *   /**
     *   * ${name}.java - 
     *   *
     *   * @author Mr. Wachs 
     *   * @since ${date} 
     *   /
     *  public class ${name} 
     *  {
     *
     *      /**
     *       * Default constructor for the class, sets class properties
     *       /
     *      public ${name}() {
     *
     *      }
     *
     *      /**
     *       * String representation of this object
     *       *
     *       * @return The object represented as a String
     *       /
     *      @Override
     *      public String toString() {
     *          return "${name} " + super.toString();
     *      }
     *
     *      /**
     *       * Determines if two objects are "equal" in this context
     *       *
     *       * @param object the object to compare to
     *       * @return the objects are "equal" (true) or not (false)
     *       /
     *      @Override
     *      public boolean equals(Object object) {
     *          return super.equals(object);
     *      }
     *
     *      /**
     *       * Creates a duplicate object using new memory
     *       *
     *       * @return a "clone" of the object using new memory
     *       /
     *      @Override
     *      public ${name} clone() {
     *          return this;
     *      }
     *
     *  }
     * 
     */
    
}