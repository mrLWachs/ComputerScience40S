
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
    
    String name;
    int age;       
    boolean isMale; 
    boolean isAlive; 
    
    // Methods: (things it can do, verbs, actions)............................
     
    /**
     * Constructor method
     */
    Person() {
        born();
    }    
    
    Person(String newName) {
        born();
        name = newName;
    }
    
    Person(String name, 
           int age, 
           boolean isMale) {
        this.name   = name;
        this.age    = age;
        this.isMale = isMale;
        isAlive     = true;
    }
    
    
    
    /**
     * When a person is born
     */
    void born() {
        isAlive = true;
        name = "Jane Doe";
        age = 0;
        isMale = false;
    }
    
    /**
     * A person talks (by outputting information to the screen)
     */
    void talk() {
        if (isAlive == false) {
            System.out.println("Boooo!!!");
        }
        else {
            System.out.println(name + " is " +
                    age + " years old, "
                    + "and if you are wondering"
                    + " if I am a male, the"
                    + " answer is " + isMale);
        }
    }
    
    /**
     * A person has a birthday (their age goes up by one)
     */
    void birthday() {
        age++;
    }
    
    /**
     * When a person dies
     */
    void die() {
        isAlive = false;
    }
       
}
