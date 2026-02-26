/** Required package class namespace */
package testing;


/*
 * Tester -  tests the concepts learned in all the units. 
 *
 * This Java file suggests the word "Test" as will the other Java files for 
 * upcoming units - this hints at a higher level Computer Science topic that 
 * we are not studying in detail (and won't be assessed on) but is a topic if 
 * you are moving forward in Computer Science studies:
 * 
 * "Unit Testing" is a Computer Science topic and is defined as: Unit testing 
 * is the process of isolating and verifying the smallest testable parts of 
 * an application, typically individual functions or methods - to ensure each 
 * piece of logic behaves exactly as intended. By identifying bugs at this 
 * level early in development, it serves as a safety net that simplifies 
 * debugging and provides the  confidence needed to refactor code without 
 * introducing regressions. See: https://en.wikipedia.org/wiki/Unit_testing
 * 
 * When testing, think of three scenarios:
 *  (1) Typical case: The "simple complient user" that does what they are told
 *  (2) Edge cases:   Test more than one "case", where users "push" the edge(s)
 *  (3) Beyond cases: "Beyond the edge" or "bad" users, trying to break things
 * 
 * @author Mr. Wachs
 * @since Feb 23, 2026
*/
public class Tester
{

    /**
     * Default constructor method, sets class properties
     */
    public Tester() {
        System.out.println("Start testing...");
        
        RecursionTest unit1 = new RecursionTest();
        // Later we will add code here for unit 2 and 3...
        
        System.out.println("Completed testing!");
    }
    
}