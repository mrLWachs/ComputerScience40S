
/** Required package class namespace */
package testing.cs42sap.curriculum.units;

/** Required API imports */
import io.Simulator;

 
/**
 * APUnit09Inheritance.java - Creating objects, calling methods on the objects
 * created, and being able to define a new data type by creating a class are
 * essential understandings before moving into this unit. One of the strongest
 * advantages of Java is the ability to categorize classes into hierarchies 
 * through inheritance. Certain existing classes can be extended to include 
 * new behaviors and attributes without altering existing code. These newly 
 * created classes are called subclasses. In this unit, students will learn 
 * how to recognize common attributes and behaviors that can be used in a 
 * superclass and will then create a hierarchy by writing subclasses to extend
 * a superclass. Recognizing and utilizing existing hierarchies will help 
 * students create more readable and maintainable programs.
 *
 * @author Mr. Wachs
 * @since 29-Jun-2023, 2:14:15 PM
 */
public class APUnit09Inheritance 
{

    /**
     * Default constructor, set class properties
     */
    public APUnit09Inheritance() {
        Simulator.header("AP: Unit 9 (Inheritance) started...");
        
        
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.comment("9.1 Creating Superclasses and Subclasses");  
        // (9.1.1) Create an inheritance relationship from a subclass to the 
        //         superclass
            // (9.1.1.1) A class hierarchy can be developed by putting common 
            //           attributes and behaviors of related classes into a 
            //           single class called a superclass
            // (9.1.1.2) Classes that extend a superclass, called subclasses,
            //           can draw upon the existing attributes and behaviors 
            //           of the superclass without repeating these in the code
            // (9.1.1.3) Extending a subclass from a superclass creates an 
            //           "is-a" relationship from the subclass to the superclass
            // (9.1.1.4) The keyword extends is used to establish an 
            //           inheritance relationship between a subclass and a 
            //           superclass. A class can extend only one superclass
        ////////////////////////////////////////////////////////////////////////
        
        
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.comment("9.2 Writing Constructors for Subclasses");  
        // (9.2.1) Create an inheritance relationship from a subclass to the 
        //         superclass
            // (9.2.1.1) Constructors are not inherited
            // (9.2.1.2) The superclass constructor can be called from the 
            //           first line of a subclass constructor by using the 
            //           keyword super and passing appropriate parameters
            // (9.2.1.3) The actual parameters passed in the call to the 
            //           superclass constructor provide values that the 
            //           constructor can use to initialize the object’s 
            //           instance variables
            // (9.2.1.4) When a subclass’s constructor does not explicitly 
            //           call a superclass’s constructor using super, Java 
            //           inserts a call to the superclass’s no-argument 
            //           constructor
            // (9.2.1.5) Regardless of whether the superclass constructor is 
            //           called implicitly or explicitly, the process of 
            //           calling superclass constructors continues until the 
            //           Object constructor is called. At this  point, all of 
            //           the constructors within the hierarchy execute 
            //           beginning with the Object constructor
        ////////////////////////////////////////////////////////////////////////
        
        
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.comment("9.3 Overriding Methods");  
        // (9.3.1) Create an inheritance relationship from a subclass to the 
        //         superclass
            // (9.3.1.1) Method overriding occurs when a public method in a 
            //           subclass has the same method signature as a public 
            //           method in the superclass
            // (9.3.1.2) Any method that is called must be defined within its
            //           own class or its superclass
            // (9.3.1.3) A subclass is usually designed to have modified 
            //           (overridden) or additional methods or instance 
            //           variables
            // (9.3.1.4) A subclass will inherit all public methods from the 
            //           superclass; these methods remain public in the subclass
        ////////////////////////////////////////////////////////////////////////
        
        
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.comment("9.4 super Keyword");  
        // (9.4.1) Create an inheritance relationship from a subclass to the superclass
            // (9.4.1.1) The keyword super can be used to call a superclass's 
            //           constructors and methods
            // (9.4.1.2) The superclass method can be called in a subclass by 
            //           using the keyword super with the method name and 
            //           passing appropriate parameters
        ////////////////////////////////////////////////////////////////////////
        
        
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.comment("9.5 Creating References Using Inheritance Hierarchies");  
        // (9.5.1) Define reference variables of a superclass to be assigned to
        //         an object of a subclass in the same hierarchy
            // (9.5.1.1) When a class S “is-a” class T, T is referred to as a 
            //           superclass, and S is referred to as a subclass
            // (9.5.1.2) If S is a subclass of T, then assigning an object of 
            //           type S to a reference of type T facilitates 
            //           polymorphism
            // (9.5.1.3) If S is a subclass of T, then a reference of type T 
            //           can be used to refer to an object of type T or S
            // (9.5.1.4) Declaring references of type T, when S is a subclass 
            //           of T, is useful in the following declarations: 
            //           (a) Formal method parameters, 
            //           (b) arrays — T[] var ArrayList<T> var
        ////////////////////////////////////////////////////////////////////////
        
        
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.comment("9.6 Polymorphism");  
        // (9.6.1) Call methods in an inheritance relationship
            // (9.6.1.1) Utilize the Object class through inheritance
            // (9.6.1.2) At compile time, methods in or inherited by the 
            //           declared type determine the correctness of a 
            //           non-static method call
            // (9.6.1.3) At run-time, the method in the actual object type is 
            //           executed for a non-static method call
        ////////////////////////////////////////////////////////////////////////
        
        
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.comment("9.7 Object Superclass");  
        // (9.7.1) Call Object class methods through inheritance
            // (9.7.1.1) The Object class is the superclass of all other 
            //           classes in Java
            // (9.7.1.2) The Object class is part of the java.lang package
            // (9.7.1.3) The following Object class methods and 
            //           constructors—including what they do and when they are
            //           used—are part of the Java Quick Reference: 
            //           (a) boolean equals(Object other), (b) String toString()
            // (9.7.1.4) Subclasses of Object often override the equals and 
            //           toString methods with classspecific implementations
        ////////////////////////////////////////////////////////////////////////
        
        
        
        Simulator.header("AP: Unit 9 (Inheritance) completed!");
    }
     
}