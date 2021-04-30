
/** Required package class namespace */
package testing.advancedclasses;

/**
 * Student.java - represents a student, reminder that "extends" causes
 * inheritance (or "is a") meaning this class gets all the properties and
 * methods of it's parent (super) class. The line below is called the 
 * "signature" line for this class. If we add the "modifier" word "extends" 
 * it causes inheritance and then the class it inherits from is typed next. 
 * This is a "is a" relationship, so a "Student is a Person", and this class  
 * inherits all properties and methods from the "parent" (super) class. The 
 * line below is called the "signature" line for this class. If we add the 
 * "modifier" word "extends" it causes inheritance and then the class it 
 * inherits from is typed next. This is a "is a" relationship, so a 
 * "Student is a Person", and this class inherits all properties and methods 
 * from the "parent" (super) class.
 * 
 * @author Mr. Wachs
 * @since April 2021
 */
public class Student extends Person
{

    public int studentNumber; // class property (and inherited other properties)
    
    private Book book;  // "has a" relationship (association or "usage")
    
        
    /**
     * Class constructor, it sets class properties. When a class has one or 
     * more parameter(s), it is no longer a default constructor.
     * 
     * If a class does not have any constructor methods, normally the compiler
     * (IDE, NetBeans, etc.) will write a "default" constructor for you (means
     * a constructor with no parameters) - HOWEVER, if you write a constructor
     * (any type) - then the compiler will NOT write one for you
     * 
     * @param name the name for this student
     * @param age the age for this student
     * @param studentNumber the student number for this student
     */
    public Student(String name, int age, int studentNumber) {
        super.name         = name;
        this.studentNumber = studentNumber;
        super.setAge(age);  // calling the mutator method for private property
    }
    
    /**
     * Method just for this class
     */
    public void study() {
        System.out.println("\tWorking hard!");
    }    
    
    /**
     * This is a "over-ride" method, this method will (when called)
     * run "instead of" the method that was inherited - because it
     * "over-rides" that other method 
     */
    @Override
    public void talk() {
        super.talk();           // First call method from super (parent) class
        System.out.println("\tStudent Number = " + studentNumber);
    }
    
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return super.toString() + " Student: number: " + studentNumber;
    }
    
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        Student that = (Student)object;
        if (this.studentNumber != that.studentNumber) return false;
        return super.equals(that);
    }
    
    /**
     * A deep clone, creates a duplicate object using new memory
     * 
     * @return a "clone" of the object using new memory
     */
    @Override
    public Student clone() {
        Student that = new Student(this.name, this.getAge(), 
                                   this.studentNumber);
        that.isAlive = this.isAlive;
        return that;
    }
        
}
