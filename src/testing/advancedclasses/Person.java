/** required package class namespace */
package testing.advancedclasses;


/**
 * Person.java - represents a person
 *
 * @author Mr. Wachs 
 * @since 4-Oct-2018 
 */
public class Person 
{
    
    private   String  name;             // encapsulated property
    public    int     age;              // public property    
    protected boolean isMale;           // property available to child classes
    
    /**
     * Default constructor for the class (constructor methods use the same 
     * name as the class and has NO return type - not even void)
     */
    public Person() {
        name   = "Jane doe";
        age    = 0;
        isMale = false;
    }
    
    /**
     * Class constructor, sets class properties
     * 
     * @param name the name of this person
     * @param age the age of this person
     * @param isMale the gender of this person
     */
    public Person(String name, int age, boolean isMale) {
        this.name   = name;
        this.age    = age;
        this.isMale = isMale;        
    }
        
    /**
     * Action method to have the person talk (outputs data on this person 
     * to the screen)
     */
    public void talk() {
        System.out.println(this.toString());;
    }
            
    /**
     * Accessor method to "see" the name
     * 
     * @return the private property
     */
    public String getName() {
        return name;
    }
    
    /**
     * Mutator method to "change" the name
     * 
     * @param name to mutate the private property
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Person " + name + " is " + age + " and is a male is " + isMale;
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
        if (person.isMale != this.isMale)  return false;
        if (person.age != this.age)        return false;
        if (!person.getName().equals(this.getName()))
            return false;
        return true;
    }
    
    /**
     * Creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Person clone() {
        Person person = new Person();
        person.age    = this.age;
        person.isMale = this.isMale;
        person.setName(this.getName());
        return person;
    }
    
    /**
     * Ends the world
     */
    public static void endTheWorld() {
        System.out.println("Booom!!!!");
    }
    
    /**
     * How a person can consume food
     * 
     * @param food the abstract food item to consume
     */
    public void consume(Food food) {
        if (food.shouldCook()) {
            food.eat();
        }
        else {
            food.spoil();
        }
    }
                
}