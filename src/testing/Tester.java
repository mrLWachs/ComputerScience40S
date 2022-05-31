
/** Required package class namespace */
package testing;

 
/**
 * Tester.java - the unit testing class that drives the various unit tests
 *
 * @author Mr. Wachs
 * @since 25-Feb-2022, 3:05:03 PM
 */
public class Tester 
{
    
    /**
     * Class constructor method - constructor methods run when the class is 
     * "created" and turned into an "object" or "instance". This is also 
     * described as when the class is "instantiated". Constructor methods are 
     * special methods that have NO return type (not even "void") and have the
     * same name as the class (including a capital letter). Constructors that 
     * have no parameters are called "default constructors", and you can have
     * multiple constructor methods in one class (the constructor can be 
     * overloaded).
     */
    public Tester() {
        System.out.println("Mr. Wachs Computer Science 40S testing started...");
        RecursionTest       unit1 = new RecursionTest();
        AdvancedClassesTest unit2 = new AdvancedClassesTest();
        CollectionsTest     unit3 = new CollectionsTest();    
        System.out.println("Mr. Wachs Computer Science 40S testing complete!");
    }
    
}