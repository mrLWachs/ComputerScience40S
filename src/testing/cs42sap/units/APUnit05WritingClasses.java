
/** Required package class namespace */
package testing.cs42sap.units;

/** Required API imports */
import utility.io.Simulator;
import utility.io.System;
 
 
/**
 * APUnit05WritingClasses.java - This unit will pull together information from 
 * all previous units to create new, user-defined reference data types in the 
 * form of classes. The ability to accurately model real-world entities in a 
 * computer program is a large part of what makes computer science so 
 * powerful. This unit focuses on identifying appropriate behaviors and 
 * attributes of real-world entities and organizing these into classes. 
 * Students will build on what they learn in this unit to represent 
 * relationships between classes through hierarchies, which appear in Unit 9. 
 * The creation of computer programs can have extensive impacts on societies, 
 * economies, and cultures. The legal and ethical concerns that come with 
 * programs and the  responsibilities of programmers are also addressed in 
 * this unit.
 *
 * @author Mr. Wachs
 * @since 29-Jun-2023, 2:14:04 PM
 */
public class APUnit05WritingClasses 
{

    /**
     * Default constructor, set class properties
     * 
     * @param shouldRun determines if this test should run (true) or not (false)
     */
    public APUnit05WritingClasses(boolean shouldRun) {
        if (!shouldRun) {
            Simulator.note("AP: Unit 5 (Writing Classes) not running");
            return;
        }
        
        Simulator.title("AP: Unit 5 (Writing Classes)");
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.header("5.1 Anatomy of a Class");  
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
        
        System.out.print("The properties (attributes) and methods (actions) ");
        System.out.println("of a class can be defined in terms of ");
        System.out.print("visibility. This means that the keywords ");
        System.out.println("\"public\" and \"private\" can be used as a ");
        System.out.print("modifier in the front of a method signature or at ");
        System.out.println("the front of a property declaration line ");
        System.out.print("to define the encapsulation level. The public ");
        System.out.println("keyword means the property can be accessed (and ");
        System.out.print("modified) both inside the class and from other ");
        System.out.println("classes outside the class. In terms of methods ");
        System.out.print("it means the method can be called within the ");
        System.out.println("class (by other methods) and outside the class ");
        System.out.print("from other classes using the dot \".\" ");
        System.out.println("operator. Classes and constructor methods are ");
        System.out.print("designated public. The concept of \"encapsulation\" ");
        System.out.println("is used to make certain data and actions ");
        System.out.print("private and protect them from outside classes and ");
        System.out.println("perhaps only allow access through accessor ");
        System.out.println("and modifier (\"getter\" and \"setter\") methods.");
        
        // Class example private/public properties and methods
        // class Apple {            
        //     public int number;
        //     private double price;            
        //     public void eat() {
        //         // logic here
        //     }            
        //     private void spoil() {
        //         // logic here
        //     }            
        // }
        
        Simulator.comment("Class example private/public properties and methods");
        Simulator.code("class Apple { ");
        Simulator.code("    public int number;");
        Simulator.code("    private double price;");
        Simulator.code("    public void eat() {");
        Simulator.code("        // logic here");
        Simulator.code("    }");
        Simulator.code("    private void spoil() {");
        Simulator.code("        // logic here");
        Simulator.code("    }");
        Simulator.code("}");
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.header("5.2 Constructors");  
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
                
        System.out.print("A constructor method is a special method defined ");
        System.out.println("in a class that is called when a class is ");
        System.out.print("instantiated into an instance (or \"object\") of ");
        System.out.println("that class. The constructor method has to have ");
        System.out.print("the exact same name as the class (including ");
        System.out.println("letter case) and no return type (not even the ");
        System.out.print("word void). Constructors are usually used to set ");
        System.out.println("the initial (or \"default\") values for the ");
        System.out.print("class properties. This can be said to be setting ");
        System.out.println("the \"state\" of the object. If any of the ");
        System.out.print("properties (attributes) are another class level ");
        System.out.println("instance variable (not a primitive type), ");
        System.out.print("then this class is said to have a \"has-a\" ");
        System.out.println("relationship with that class. This can also be ");
        System.out.print("called \"association\" or \"composition\" ");
        System.out.println("between the classes. Constructors can have ");
        System.out.print("parameters passed to the class that can be used ");
        System.out.println("in setting the initial state. When no ");
        System.out.print("constructor is written, Java provides a ");
        System.out.println("no-argument constructor, and the instance ");
        System.out.println("variables are set to default values.");
        
        // Class example association and constructors
        // class Basket {            
        //     public Apple apple;            
        //     public Basket() {
        //         // logic here
        //     }            
        //     public Basket(Apple apple) {
        //         // logic here
        //     }            
        // }
        
        Simulator.comment("Class example association and constructors");
        Simulator.code("class Basket {");
        Simulator.code("    public Apple apple;");
        Simulator.code("    public Basket() {");
        Simulator.code("        // logic here");
        Simulator.code("    }");
        Simulator.code("    public Basket(Apple apple) {");
        Simulator.code("        // logic here");
        Simulator.code("    }");
        Simulator.code("}");        
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.header("5.2 Documentation with Comments");  
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
        
        System.out.println("...");
        
        Simulator.comment("");
        Simulator.code("");
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.header("5.4 Accessor Methods");  
        // (5.4.1) Define behaviors of an object through non-void methods 
        //         without parameters written in a class
            // (5.4.1.1) An accessor method allows other objects to obtain the
            //           value of instance variables or static variables
            // (5.4.1.2) A non-void method returns a single value. Its header 
            //           includes the return type in place of the keyword void
            // (5.4.1.3) In non-void methods, a return expression compatible 
            //           with the return type is evaluated, and a copy of that
            //           value is returned. This is referred to as "return by
            //           value." 
            // (5.4.1.4) When the return expression is a reference to an 
            //           object, a copy of that reference is returned, not a 
            //           copy of the object
            // (5.4.1.5) The return keyword is used to return the flow of 
            //           control to the point immediately following where the
            //           method or constructor was called
            // (5.4.1.6) The toString method is an overridden method that is 
            //           included in classes to provide a description of a 
            //           specific object. It generally includes what values 
            //           are stored in the instance data of the object
            // (5.4.1.7) If System.out.print or System.out. println is passed
            //           an object, that object’s toString method is called, 
            //           and the returned string is printed
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("...");
        
        Simulator.comment("");
        Simulator.code("");
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.header("5.5 Mutator Methods");  
        // (5.5.1) Define behaviors of an object through void methods with or 
        //         without parameters written in a class
            // (5.5.1.1) A void method does not return a value. Its header 
            //           contains the keyword void before the method name
            // (5.5.1.2) A mutator (modifier) method is often a void method 
            //           that changes the values of instance variables or 
            //           static variables
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("...");
        
        Simulator.comment("");
        Simulator.code("");
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.header("5.6 Writing Methods");  
        // (5.6.1) Define behaviors of an object through non-void methods 
        //         with parameters written in a class
            // (5.6.1.1) Methods can only access the private data and methods 
            //           of a parameter that is a reference to an object when
            //           the parameter is the same type as the method’s 
            //           enclosing class
            // (5.6.1.2) Non-void methods with parameters receive values 
            //           through parameters, use those values, and return a 
            //           computed value of the specified type
            // (5.6.1.3) It is good programming practice to not modify mutable
            //           objects that are passed as parameters unless required
            //           in the specification
            // (5.6.1.4) When an actual parameter is a primitive value, the 
            //           formal parameter is initialized with a copy of that 
            //           value. Changes to the formal parameter have no effect
            //           on the corresponding actual parameter
            // (5.6.1.5) When an actual parameter is a reference to an object,
            //           the formal parameter is initialized with a copy of 
            //           that reference, not a copy of the object. If the 
            //           reference is to a mutable object, the method or 
            //           constructor can use this reference to alter the state
            //           of the object
            // (5.6.1.6) Passing a reference parameter results in the formal 
            //           parameter and the actual parameter being aliases. 
            //           They both refer to the same object
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("...");
        
        Simulator.comment("");
        Simulator.code("");
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.header("5.7 Static Variables and Methods");  
        // (5.7.1) Define behaviors of a class through static methods
            // (5.7.1.1) Static methods are associated with the class, not 
            //           objects of the class
            // (5.7.1.2) Static methods include the keyword static in the 
            //           header before the method name
            // (5.7.1.3) Static methods cannot access or change the values of 
            //           instance variables
            // (5.7.1.4) Static methods can access or change the values of 
            //           static variables
            // (5.7.1.5) Static methods do not have a this reference and are 
            //           unable to use the class’s instance variables or call
            //           non-static methods
        // (5.7.2) Define the static variables that belong to the class
            // (5.7.2.1) Static variables belong to the class, with all objects
            //           of a class sharing a single static variable
            // (5.7.2.2) Static variables can be designated as either public
            //           or private and are designated with the static keyword
            //           before the variable type
            // (5.7.2.3) Static variables are used with the class name and the
            //           dot operator, since they are associated with a class,
            //           not objects of a class
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("...");
        
        Simulator.comment("");
        Simulator.code("");
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.header("5.8 Scope and Access");  
        // (5.8.1) Explain where variables can be used in the program code
            // (5.8.1.1) Local variables can be declared in the body of 
            //           constructors and methods. These variables may only be
            //           used within the constructor or method and cannot be 
            //           declared to be public or private
            // (5.8.1.2) When there is a local variable with the same name as
            //           an instance variable, the variable name will refer to
            //           the local variable instead of the instance variable
            // (5.8.1.3) Formal parameters and variables declared in a method
            //           or constructor can only be used within that method or 
            //           constructor
            // (5.8.1.4) Through method decomposition, a programmer breaks 
            //           down a large problem into smaller subproblems by 
            //           creating methods to solve each individual subproblem
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("...");
        
        Simulator.comment("");
        Simulator.code("");
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.header("5.9 this Keyword");  
        // (5.9.1) Evaluate object reference expressions that use the keyword
        //         this
            // (5.9.1.1) Within a non-static method or a constructor, the 
            //           keyword this is a reference to the current object 
            //           the object whose method or constructor is being called
            // (5.9.1.2) The keyword this can be used to pass the current 
            //           object as an actual parameter in a method call
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("...");
        
        Simulator.comment("");
        Simulator.code("");
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.header("5.10 Ethical and Social Implications of Computing Systems");  
        // (5.10.1) Explain the ethical and social implications of computing 
        //          systems
            // (5.10.1.1) System reliability is limited. Programmers should 
            //            make an effort to maximize system reliability
            // (5.10.1.2) Legal issues and intellectual property concerns 
            //            arise when creating programs
            // (5.10.1.3) The creation of programs has impacts on society, 
            //            economies, and culture. These impacts can be 
            //            beneficial and/or harmful
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("...");
        
        Simulator.comment("");
        Simulator.code("");
        
        ////////////////////////////////////////////////////////////////////////
    }
     
}