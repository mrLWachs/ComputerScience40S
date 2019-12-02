  
/** required package class namespace */
package computerscience30s;

/**
 * Person.java - represents a person. This is a class with properties (things 
 * about the class, adjectives, descriptors) and methods (things the class 
 * can do, verbs, actions). Classes can be created (instantiated) into 
 * objects (which are instances of that class).
 *
 * @author Mr. Wachs 
 * @since 03-May-2019 
 */
public class Person 
{
    
    // Properties: (things about it, adjectives, descriptors).................
    
    String  name;
    int     age;
    boolean isMale;
    boolean isAlive;    
    
    // Methods: (things it can do, verbs, actions)............................
  
    /**
     * Constructor method called (invoked) when the class is used to 
     * build a object, this is called the "default" constructor
     */
    public Person() {
        born();
    }    
    
    /**
     * Constructor (overloaded) sets class properties
     * 
     * @param newName the name for this person
     */
    public Person(String newName) {
        born();
        name = newName;
    }
    
    /**
     * Constructor method for the class, sets class properties
     * 
     * @param name the name for this person
     * @param age the age for this person
     * @param isMale the gender for this person
     */
    public Person(String name, int age, boolean isMale) {
        this.name   = name;
        this.age    = age;
        this.isMale = isMale;
        isAlive     = true;
    }
    
    /**
     * When a person is born, it sets the properties of this class to the 
     * starting values
     */
    void born() {
        isAlive = true;
        age     = 0;
        isMale  = false;
        name    = "Jane Doe";
    }
    
    /**
     * When a person dies
     */
    void die() {
        isAlive = false;
    }
    
    /**
     * A person talks (by outputting information to the screen)
     */
    void talk() {        
        if (isAlive) {
            System.out.println(name + " is " + age);
        }
        else {
            System.out.println("Boooo!");
        }        
    }
   
    /**
     * A person has a birthday (their age goes up by one)
     */
    void birthday() {
        age++;
    }

    /**
     * A person has many birthdays
     * 
     * @param times how many birthdays to have
     */
    void birthday(int times) {
        for (int i = 0; i < times; i++) {
            birthday();
        }
    }
    
}
