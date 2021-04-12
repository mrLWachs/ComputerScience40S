
/** Required package class namespace */
package testing.advancedclasses;


/**
 * Student.java - The line below is called the "signature" line for this class.
 * If we add the "modifier" word "extends" it causes inheritance and then the 
 * class it inherits from is typed next. This is a "is a" relationship, so a 
 * "Student is a Person", and this class inherits all properties and methods 
 * from the "parent" (super) class.
 * 
 * @author Mr. Wachs
 * @since April 2021
 */
public class Student extends Person
{

    int studentNumber;
    
    
    // If a class does not have any constructor 
    // methods, normally the compiler (IDE, NetBeans, etc.)
    // will write a "default" constructor for you (means
    // a constructor with no parameters) - HOWEVER, if you 
    // write a constructor (any type) - then the compiler
    // will NOT write one for you
    
    public Student(String name, int age, int studentNumber) {
        super.name = name;
        super.age  = age;
        this.studentNumber = studentNumber;
    }
    
    
}
