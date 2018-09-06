
/** required package class namespace */
package archive2018to2019.advancedclasses;

/**
 * Person.java - represents a person
 *
 * @author Mr. Wachs 
 * @since Oct 4, 2017 
 * @instructor Mr. Wachs
 */
public class Person 
{

    /**
     * The name of this person object
     */
    public String name;
    private int age;                        // encapsulated property
    
    /**
     * Protected property representing the person's gender
     */
    protected boolean isMale;
    
    /** 
     * Default constructor for the class 
     */
    public Person() {
        name   = "Sam Some";
        age    = 0;
        isMale = false;
    }
    
    /**
     * Overloaded constructor sets class properties
     * 
     * @param name the name of this person object
     * @param age the age of this person object
     */
    public Person(String name, int age) {
        this.name   = name;
        this.age    = age;
        this.isMale = false;
    }
    
    /**
     * Outputs data on this person to the screen
     */
    public void talk() {
        System.out.println(name + " is " + age);
    }
     
    /**
     * Determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        Person person = (Person)object;        
        if (!this.name.equalsIgnoreCase(person.name)) return false;
        if (this.isMale != person.isMale)             return false;
        if (this.age != person.age)                   return false;    
        return true;
    }
        
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return name + " is " + age + " gender " + isMale;
    }
    
    /**
     * Creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Person clone() {
        Person person = new Person();        
        person.name   = this.name;
        person.isMale = this.isMale;
        person.setAge(this.getAge());
        return person;
    }
    
    /**
     * Accessor method gets the private age property
     * 
     * @return 
     */
    public int getAge() {
        return age;
    }
    
    /**
     * Mutator method sets the private age property to a new value
     * 
     * @param age the new age to set to
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    /**
     * Static method outputs the end of the world
     */
    public static void endTheWorld() {
        System.out.println("Boom!!!");
    }
    
    /**
     * Eats the passed food by outputting to the screen
     * 
     * @param food the abstract food object to eat
     */
    public void eat(Food food) {
        if (food.canCook()) System.out.println("Cook and eat");
        else                System.out.println("Eat raw");
    }
    
}
