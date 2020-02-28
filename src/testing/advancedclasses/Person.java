

/** required package class namespace */
package testing.advancedclasses;

 
/**
 * Person.java - description
 *
 * @author Mr. Wachs
 * @since Feb. 28, 2020, 2:02:58 p.m.
 */
public class Person 
{

    // PROPERTIES (below)...................................................
    
    private String name;    // encapsulated property
    public int age;
    
    // METHODS (below)......................................................
    
    /**
     * Default constructor, set class properties
     */
    public Person() {
        name = "jane doe";
        age = 0;
    }
    
    public void talk() {
        System.out.println(name + " is " + age);
    }

    
}
