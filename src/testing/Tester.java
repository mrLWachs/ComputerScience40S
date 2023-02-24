
/** Required package class namespace */
package testing;


/**
 * Tester.java - tests the concepts learned in all the units. It also 
 * introduces the concept of Unit testing. This is a larger concept in
 * Computer Science, but it basically a way of testing a unit (which tries to 
 * be the smallest piece of code that you can isolate). It relates to larger 
 * concepts like "TDD" (test driven development), "JUnit" (testing for the 
 * Java programming language), etc. More can be researched here:
 * https://en.wikipedia.org/wiki/Unit_testing
 * And it will come up more if you continue your studies in Computer Science 
 * beyond high school.
 *
 * @author Mr. Wachs
 * @since February 2023
 */
public class Tester 
{

    /**
     * Constructor method sets class properties (if we had any) - these special
     * methods use the exact same name as the class (including a capital 
     * letter to start) and NO return type (not even "void")
     */
    public Tester() {
        System.out.println("\nTesting started...\n");        
        RecursionTest unit1 = new RecursionTest();
        // Later we will add code here for unit 2 and 3...        
        System.out.println("\nTesting complete!\n");
    }
    
}
