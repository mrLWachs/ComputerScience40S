
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

    int studentNumber; // property of this class (also inherited properties)
    
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
        super.age          = age;
        this.studentNumber = studentNumber;
    }
    
    /**
     * Method just for this class (it also inherited the talk method)
     */
    public void study() {
        System.out.println("working hard");
    }    
    
}
