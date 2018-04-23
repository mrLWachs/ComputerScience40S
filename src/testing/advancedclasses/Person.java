
/** required package class namespace */
package testing.advancedclasses;

/**
 * Person.java - 
 *
 * @author Mr. Wachs 
 * @since Oct 4, 2017 
 * @instructor Mr. Wachs
 */
public class Person 
{

    /**
     * 
     */
    public String name;
    private int age; // encapsulated
    
    protected boolean isMale;
    
    /** 
     * Default constructor for the class 
     */
    public Person() {
        name = "Sam Some";
        age = 0;
        isMale = false;
    }
    
    /**
     * Overloaded constructor
     * 
     * @param name
     * @param age 
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.isMale = false;
    }
    
    /**
     * 
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
        if (!this.name.equalsIgnoreCase(person.name)) {
            return false;
        }
        if (this.isMale != person.isMale) {
            return false;
        }
        if (this.age != person.age) {
            return false;
        }        
        return true;
    }
        
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return name + " is " + age +
                " gender " + isMale;
    }
    
    /**
     * Creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Person clone() {
        Person person = new Person();        
        person.name = this.name;
        person.isMale = this.isMale;
        person.setAge(this.getAge());
        return person;
    }
    
    /**
     * 
     * @return 
     */
    public int getAge() {
        return age;
    }
    
    /**
     * 
     * @param age 
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    /**
     * 
     */
    public static void endTheWorld() {
        System.out.println("Boom!!!");
    }
    
    /**
     * 
     * @param food 
     */
    public void eat(Food food) {
        if (food.canCook()) {
            System.out.println("Cook and "
                    + "eat");
        }
        else {
            System.out.println("Eat raw");
        }
    }
    
}
