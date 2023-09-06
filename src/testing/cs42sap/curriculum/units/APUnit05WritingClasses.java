
/** Required package class namespace */
package testing.cs42sap.curriculum.units;

/** Required API imports */
import io.Simulator;

 
/**
 * APUnit05WritingClasses.java - description
 *
 * @author Mr. Wachs
 * @since 29-Jun-2023, 2:14:04 PM
 */
public class APUnit05WritingClasses 
{

    /**
     * Default constructor, set class properties
     */
    public APUnit05WritingClasses() {
        Simulator.header("AP: Unit 5 (Writing Classes) started...");
        
        
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.comment("5.1 Anatomy of a Class");  
        // (5.1.1) Designate access and visibility constraints to classes, 
        //         data, constructors, and methods
            // (5.1.1.1) The keywords public and private affect the access of
            //           classes, data,  constructors, and methods
            // (5.1.1.2) The keyword private restricts access to the 
            //           declaring class, while the keyword public allows 
            //           access from classes outside the declaring class
            // (5.1.1.3) Classes are designated public
            // (5.1.1.4) Access to attributes should be kept internal to the
            //           class. Therefore, instance variables are designated 
            //           as private
            // (5.1.1.5) Constructors are designated public
            // (5.1.1.6) Access to behaviors can be internal or external to 
            //           the class. Therefore, methods can be designated as 
            //           either public or private
        // (5.1.2) Designate private visibility of instance variables to 
        //         encapsulate the attributes of an object
            // (5.1.2.1) Data encapsulation is a technique in which the 
            //           implementation details of a class are kept hidden
            //           from the user
            // (5.1.2.2) When designing a class, programmers make decisions 
            //           about what data to make accessible and modifiable 
            //           from an external class. Data can be either accessible
            //           or modifiable, or it can be both or neithe
            // (5.1.2.3) Instance variables are encapsulated by using the 
            //           private access modifier
            // (5.1.2.4) The provided accessor and mutator methods in a class
            //           allow client code to use and modify data
        ////////////////////////////////////////////////////////////////////////
        
        
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.comment("5.2 Constructors");  
        // (5.2.1) Define instance variables for the attributes to be 
        //         initialized through the constructors of a class
            // (5.2.1.1) An object’s state refers to its attributes and their 
            //           values at a given time and is defined by instance 
            //           variables belonging to the object. This creates a 
            //           "has-a" relationship between the object and its 
            //           instance variables
            // (5.2.1.2) Constructors are used to set the initial state of an 
            //           object, which should include initial values for all 
            //           instance variables
            // (5.2.1.3) Constructor parameters are local variables to the 
            //           constructor and provide data to initialize instance 
            //           variables
            // (5.2.1.4) When a mutable object is a constructor parameter, the
            //           instance variable should be initialized with a copy 
            //           of the referenced object. In this way, the instance 
            //           variable is not an alias of the original object, and 
            //           methods are prevented from modifying the state of the
            //           original object
            // (5.2.1.5) When no constructor is written, Java provides a 
            //           no-argument constructor, and the instance variables 
            //           are set to default values
        ////////////////////////////////////////////////////////////////////////
                
        
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.comment("5.2 Documentation with Comments");  
        // (5.3.1) Describe the functionality and use of program code through 
        //         comments
            // (5.3.1.1) Comments are ignored by the compiler and are not 
            //           executed when the program is run
            // (5.3.1.2) Three types of comments in Java include /* */, which 
            //           generates a block of comments, //, which generates a 
            //           comment on one line, and /** */, which are Javadoc 
            //           comments and are used to create API documentation
            // (5.3.1.3) A precondition is a condition that must be true just 
            //           prior to the execution of a section of program code 
            //           in order for the method to behave as expected. There 
            //           is no expectation that the method will check to 
            //           ensure preconditions are satisfied
            // (5.3.1.4) A postcondition is a condition that must always be 
            //           true after the execution of a section of program 
            //           code. Postconditions describe the outcome of the 
            //           execution in terms of what is being returned or the 
            //           state of an object
            // (5.3.1.5) Programmers write method code to satisfy the 
            //           postconditions when preconditions are met          
        ////////////////////////////////////////////////////////////////////////
        
        
        
        Simulator.header("AP: Unit 5 (Writing Classes) completed!");
    }
     
}