

/** required package class namespace */
package testing.advancedclasses;

 
/**
 * Person.java - description
 *
 * @author Mr. Wachs
 * @since Feb. 28, 2020, 9:56:22 a.m.
 */
public class Person 
{

    // PROPERTIES (below)...................................................
    
    
    private String name;    // encapsulated property
    public int age;
    
    
    /**
     * Default constructor, set class properties
     */
    public Person() {
        name = "jane doe";
        age  = 0;
    }

    public void talk() {
        System.out.println(name + " is " + age);
    }
    

}
