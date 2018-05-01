
/** required package class namespace */
package computerscience30s;

/**
 * Person.java - represents a person. This is a class with properties (things 
 * about the class, adjectives, descriptors) and methods (things the class 
 * can do, verbs, actions). Classes can be created (instantiated) into 
 * objects (which are instances of that class).
 *
 * @author Mr. Wachs 
 * @since May 1, 2018 
 * @instructor Mr. Wachs
 */
public class Person 
{

    // Properties: (things about it, adjectives, descriptors)
    
    public String name;
    private int age; //encapsualted
    public boolean isMale;
    private boolean isAlive;
    
    // Methods: (things it can do, verbs, actions)
    
    /**
     * Constructor method called (invoked) when the class is used to 
     * build a object
     */
    public Person() {
        name    = "Jane Doe";
        age     = 0;
        isAlive = true;
        isMale  = false;
    }
    
    /**
     * Constructor (overloaded) sets class properties
     * 
     * @param newName the new name to assign
     */
    public Person(String newName) {
        name    = newName;
        age     = 0;
        isAlive = true;
        isMale  = false;
    }
    
    /**
     * Constructor (overloaded) sets class properties
     * 
     * @param name the new name to assign
     * @param age the new age to assign
     * @param isMale the new gender to assign
     * @param isAlive the new living/dead to assign
     */
    public Person(String name,
                  int age,
                  boolean isMale,
                  boolean isAlive) {
        this.name    = name;
        this.age     = age;
        this.isAlive = isAlive;
        this.isMale  = isMale;
    }
    
    /**
     * Sets the person to be dead
     */
    public void die() {
        isAlive = false;
    }
    
    /**
     * Outputs "talk" information about this object to the screen
     */
    public void talk() {
        if (isAlive == false) {
            System.out.println("Boooooo!");
        }
        else {
            System.out.println("My name is " + name + 
                               " and my age is " + age + 
                               " and if you are wondering if I am a male," +
                               " the answer is " + isMale);
        }
    }
    
    /**
     * Advances this person's age by one year
     */
    public void birthday() {
        age++;
    }
    
    /**
     * Advances this person's age by a number of years
     * 
     * @param times the number of years to advance
     */
    public void birthday(int times) {
        for (int i = 0; i < times; i++) {
            birthday();
        }
    }
        
}
