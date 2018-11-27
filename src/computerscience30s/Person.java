
/** required package class namespace */
package computerscience30s;


/**
 * Person.java - represents a person. This is a class with properties (things 
 * about the class, adjectives, descriptors) and methods (things the class 
 * can do, verbs, actions). Classes can be created (instantiated) into 
 * objects (which are instances of that class).
 *
 * @author Mr. Wachs 
 * @since 19-Nov-2018 
 */
public class Person 
{
    
    // Properties: (things about it, adjectives, descriptors).................
    
    public String name;
    private int age;                        // encapsualted properties marked
    public boolean isMale;                  // as private are "hidden" data
    private boolean isAlive;                // only available inside the class
    
    // Methods: (things it can do, verbs, actions)............................
    
    /**
     * Constructor method called (invoked) when the class is used to 
     * build a object, this is called the "default" constructor
     */
    public Person() {
        born();
        isMale = false;
        name   = "Jane Doe";
    }
    
    /**
     * Constructor (overloaded) sets class properties
     * 
     * @param nameForThePerson the name for this person
     */
    public Person(String nameForThePerson) {
        born();
        isMale = false;
        name   = nameForThePerson;
    }
    
    /**
     * Constructor method for the class, sets class properties
     * 
     * @param name the name for this person
     * @param age the age for this person
     * @param isMale the gender for this person
     */
    public Person(String name, int age, boolean isMale) {
        isAlive     = true;
        this.name   = name;     // keyword this refers to the class property
        this.age    = age;
        this.isMale = isMale;
    }
    
    /**
     * When a person is born
     */
    public void born() {
        isAlive = true;
        age     = 0;
    }
    
    /**
     * When a person dies
     */
    public void die() {
        isAlive = false;
    }
    
    /**
     * A person talks (by outputting information to the screen)
     */
    public void talk() {
        if (isAlive) {
            System.out.println(name + " is " + age + " and if you are "
                    + "wondering if I am male, the answer is " + isMale);
        }
        else {
            System.out.println("Booooooo!");
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
     * A way to change genders
     */
    public void identify() {
        if (isMale == true) {
            isMale = false;
        }
        else if (isMale == false) {
            isMale = true;
        }
    }
    
}
