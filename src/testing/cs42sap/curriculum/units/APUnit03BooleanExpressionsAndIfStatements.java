
/** Required package class namespace */
package testing.cs42sap.curriculum.units;

/** Required API imports */
import io.Simulator;

 
/**
 * APUnit03BooleanExpressionsAndIfStatements.java - Algorithms are composed of
 * three building blocks: sequencing, selection, and iteration. This unit
 * focuses on selection, which is represented in a program by using conditional
 * statements. Conditional statements give the program the ability to decide
 * and respond appropriately and are a critical aspect of any nontrivial
 * computer program. In addition to learning the syntax and proper use of
 * conditional statements, students will build on the introduction of Boolean
 * variables by writing Boolean expressions with relational and logical
 * operators. The third building block of all algorithms is iteration, which
 * you will cover in Unit 4. Selection and iteration work together to solve
 * problems
 *
 * @author Mr. Wachs
 * @since June 2023
 */
public class APUnit03BooleanExpressionsAndIfStatements 
{

    /**
     * Default constructor, set class properties
     */
    public APUnit03BooleanExpressionsAndIfStatements() {
        Simulator.header("AP: Unit 3 (Boolean Expressions And If Statements) started...");
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.comment("3.1 Boolean Expressions");  
        // (3.1.1) Evaluate Boolean expressions that use relational operators 
        //         in program code
            // (3.1.1.1) Primitive values and reference values can be compared
            //           using relational operators (i.e., == and !=)
            // (3.1.1.2) Arithmetic expression values can be compared using 
            //           relational operators (i.e., <, >, <=, >=)
            // (3.1.1.3) An expression involving relational operators evaluates
            //           to a Boolean value
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("...");
        System.out.print("A Boolean (true/false) expression is a code ");
        System.out.println("statement most likely in a control structure ");
        System.out.print("like a conditional statement or loop control ");
        System.out.println("structure that evaluates to true or false to ");
        System.out.print("make decisions and control the flow of the ");
        System.out.println("program. The Boolean expression will require ");
        System.out.print("the use of relational operators like: < , > , ");
        System.out.println("<= , >= , == , and != those being: \"less ");
        System.out.print("than\", \"greater than\", \"less than or equal ");
        System.out.println("to\", \"greater than or equal to\", \"equal ");
        System.out.println("to\", and \"not equal to\".");
        System.out.println("...");
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.comment("3.2 if Statements and Control Flow");  
        // (3.2.1) Represent branching logical processes by using conditional 
        //         statements
            // (3.2.1.1) Conditional statements interrupt the sequential 
            //           execution of statements
            // (3.2.1.2) if statements affect the flow of control by executing
            //           different statements based on the value of a Boolean
            //           expression
            // (3.2.1.3) A one-way selection (if statement) is written when
            //           there is a set of statements to execute under a 
            //           certain condition. In this case, the body is executed
            //           only when the Boolean condition is true
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("...");
        System.out.print("A \"Conditional Statement\" is also known under ");
        System.out.println("other names like \"branching statement\", \"if ");
        System.out.print("statement\", \"one-way selection statement\", ");
        System.out.println("and \"control structure\". It uses the reserved ");
        System.out.print("keyword \"if\" along with round brackets which ");
        System.out.println("contain the Boolean expression, and curly ");
        System.out.print("brackets to contain the control block of all ");
        System.out.println("code you wish to be controlled by the ");
        System.out.print("conditional statement. Brackets are optional if ");
        System.out.println("the block is only one line, and you may also ");
        System.out.print("move thos lines up to the same line as the ");
        System.out.println("conditional statement. For example:");
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.comment("3.3 if-else Statements");  
        // (3.3.1) Represent branching logical processes by using conditional 
        //         statements
            // (3.3.1.1) A two-way selection is written when there are two 
            //           sets of statements— one to be executed when the 
            //           Boolean condition is true, and another set for when 
            //           the Boolean condition is false. In this case, the 
            //           body of the "if" is executed when the Boolean 
            //           condition is true, and the body of the "else" is 
            //           executed when the Boolean condition is false
        ////////////////////////////////////////////////////////////////////////
        
        
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.comment("3.4 else if Statements");  
        // (3.4.1) Represent branching logical processes by using conditional 
        //         statements
            // (3.4.1.1) A multi-way selection is written when there are a 
            //           series of conditions with different statements for 
            //           each condition. Multi-way selection is performed 
            //           using if-else-if statements such that exactly one 
            //           section of code is executed based on the first
            //           condition that evaluates to true
        ////////////////////////////////////////////////////////////////////////
        
        
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.comment("3.5 Compound Boolean Expressions");  
        // (3.5.1) Represent branching logical processes by using nested 
        //         conditional statements
            // (3.5.1.1) Nested if statements consist of if statements within
            //           if statements
        // (3.5.2) Evaluate compound Boolean expressions in program code
            // (3.5.2.1) Logical operators !(not), &&(and), and ||(or) are 
            //           used with Boolean values. This represents the order 
            //           these operators will be evaluated
            // (3.5.2.2) An expression involving logical operators evaluates 
            //           to a Boolean value
            // (3.5.2.3) When the result of a logical expression using && or
            //           || can be determined by evaluating only the first 
            //           Boolean operand, the second is not evaluated. This is
            //           known as short-circuited evaluation
        ////////////////////////////////////////////////////////////////////////
        
        
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.comment("3.6 Equivalent Boolean Expressions");  
        // (3.6.1) Compare and contrast equivalent Boolean expressions
            // (3.6.1.1) De Morgan’s Laws can be applied to Boolean expressions
            // (3.6.1.2) Truth tables can be used to prove Boolean identities
            // (3.6.1.3) Equivalent Boolean expressions will evaluate to the 
            //           same value in all cases
        ////////////////////////////////////////////////////////////////////////
        
        
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.comment("3.7 Comparing Objects");  
        // (3.7.1) Compare object references using Boolean expressions in 
        //         program code
            // (3.7.1.1) Two object references are considered aliases when 
            //           they both reference the same object
            // (3.7.1.2) Object reference values can be compared, using == 
            //           and !=, to identify aliases
            // (3.7.1.3) A reference value can be compared with null, using 
            //           == or !=, to determine if the reference actually 
            //           references an object
            // (3.7.1.4) Often classes have their own equals method, which can
            //           be used to determine whether two objects of the class 
            //           are equivalent
        ////////////////////////////////////////////////////////////////////////
        
        
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.header("AP: Unit 3 (Boolean Expressions And If Statements) completed!");
    }
     
}