
/** required package class namespace */
package computerscience30s;


/**
 * Person.java - defines what it is to be a person
 *
 * @author Mr. Wachs 
 * @since 19-Nov-2018 
 */
public class Person 
{
    
    // Properties: ------------------------------------------------------------
    
    String name;
    int age;
    boolean isAlive;
    boolean isMale;
        
    // Methods: ---------------------------------------------------------------
    
    /**
     * Constructor method for th class, sets class properties to default values
     */
    Person() {
        born();
        isMale = false;
        name = "Jane Doe";
    }
    
    /**
     * When a person is born
     */
    void born() {
        isAlive = true;
        age = 0;
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
        System.out.println(name + 
                " is " + age +
                " if you are wondering"
              + " if I am a male, "
              + "the answer is " + isMale);
    }
    
    /**
     * A person has a birthday (their age goes up by one)
     */
    void birthday() {
        age++;
    }
        
}
