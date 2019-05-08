
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
    
    public String name;             // encapsualted properties marked
    private int age;                // as private are "hidden" data
    public boolean isMale;          // only available inside the class
    private boolean isAlive; 
    
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
     * When a person is born
     */
    private void born() {
        isAlive = true;
        name = "Jane Doe";
        age = 0;
        isMale = false;
    }
    
    /**
     * A person talks (by outputting information to the screen)
     */
    public void talk() {
        if (isAlive == false) {
            System.out.println("Boooo!!!");
        }
        else {
            System.out.println(name + " is " + age + " years old, and if you "
                    + "are wondering if I am a male, the answer is " + isMale);
        }
    }
    
    /**
     * A person has a birthday (their age goes up by one)
     */
    public void birthday() {
        age++;
    }
    
    /**
     * A person has many birthdays
     * 
     * @param times how many birthdays to have
     */
    public void birthday(int times) {
        for (int i = 0; i < times; i++) {
            birthday();
        }
    }
    
    /**
     * When a person dies
     */
    public void die() {
        isAlive = false;
    }
       
}
