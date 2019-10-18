
/** required package class namespace */
package testing.advancedclasses;

 
/**
 * Student.java - represents a student, reminder that "extends" causes
 * inheritance (or "is a") meaning this class gets all the properties and
 * methods of it's parent (super) class
 *
 * @author Mr. Wachs
 * @since 09-Mar-2019
 * @instructor Mr. Wachs
 */
public class Student extends Person
{
    
    private int studentNumber;                      // encapsulated property
    
    /** Static property that counts the total number of student objects */
    public static int totalStudents;
            
    
    /**
     * Class constructor sets class properties, when a constructor has a 
     * parameter, it is no longer a default constructor. If you have no 
     * default, usually one is written for you, EXCEPT if you write a 
     * non-default constructor, it will not!
     * 
     * @param studentNumber the student number of this student
     */
    public Student(int studentNumber) {
        super();                                // call to super constructor
        this.studentNumber = studentNumber;     // set property from parameter
        super.isMale = true;      // child class can modify protected property
        totalStudents++;
    }
    
    /**
     * Class constructor sets class properties to parameter values
     * 
     * @param name the name for this student
     * @param age the age for this student
     * @param isMale the gender for this student
     * @param studentNumber the student number for this student
     */
    public Student(String name, int age, boolean isMale, int studentNumber) {
        super(name,age,isMale);                 // call to super constructor
        this.studentNumber = studentNumber;     // set property from parameter
        totalStudents++;
    }
    
    /**
     * Outputs data on this student to the screen
     */
    @Override
    public void talk() {
        System.out.println(this.toString());
    }

    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Student: " + super.toString() +
                " with student number " + studentNumber;
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
        if (!super.equals(that))                      return false;        
        if (this.studentNumber != that.studentNumber) return false;        
        return true;
    }
        
    /**
     * a Deep clone, creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Student clone() {
        Student that = new Student(this.studentNumber);
        that.age     = this.age;
        that.isMale  = this.isMale;
        that.setName(this.getName());
        return that;
    }    
    
}

// NOTE: change to the template for Java Class is recommended, to do this, 
//       select Tools -> Templates, scroll down and click on the plus "+"
//       sign next to Java and then "Java Class" then "Open in Editior"
//       and change to the code below (but uncomment it first using the 
//       NetBeans button just below the code tab):

//<#assign licenseFirst = "/*">
//<#assign licensePrefix = " * ">
//<#assign licenseLast = " */">
//<#include "${project.licensePath}">
//
///** required package class namespace */
//<#if package?? && package != "">
//package ${package};
//
//</#if>
// 
///**
// * ${name}.java - description
// *
// * @author Mr. Wachs
// * @since ${date}, ${time}
// */
//public class ${name} 
//{
//
//    /**
//     * Default constructor, set class properties
//     */
//    public ${name}() {
//        
//    }
//
//    /**
//     * String representation of this object
//     *
//     * @return The object represented as a String
//     */
//    @Override
//    public String toString() {
//        return "${name}: " + super.toString();
//    }
//    
//    /**
//     * Deep comparison, determines if two objects are "equal" in this context
//     *
//     * @param object the object to compare to
//     * @return the objects are "equal" (true) or not (false)
//     */
//    @Override
//    public boolean equals(Object object) {
//        return super.equals(object);
//    }
//        
//    /**
//     * a Deep clone, creates a duplicate object using new memory
//     *
//     * @return a "clone" of the object using new memory
//     */
//    @Override
//    public ${name} clone() {
//        return this;
//    }
//
//}

