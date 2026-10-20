/** Required package class namespace */
package testing.classes;


/*
 * Person - represents ("models") a person. This is a class with (some 
 * "things" or "properties" about the class - also known as adjectives, or 
 * descriptors) and methods (things it can "do" or "verbs" or "actions"). 
 * Classes can be created (instantiated) into objects (which are instances of 
 * that class).
 * 
 * @author Mr. Wachs
 * @since Oct 13, 2026
*/
public class Person
{
    
    // Properties: things about it, adjectives, descriptors, variables, arrays..
    // =========================================================================

    /**
     * Properties that use the "modifier" word "public" can be accessed and
     * changed outside of this class by another class "using" this class
     */
    public String name;
    
    public String gender;
    
    /**
     * Properties that use the "modifier" keyword "private" will "encapsulate"
     * this property.this means that this property (or method) can only be 
     * accessed (read or changed) by the class itself (inside the class like
     * a "private room") by other methods inside the class. Class outside of
     * this one that are "communicating" or "using" this class can NOT access
     * this. This is the concept of encapsulation. So we have "encapsulated" 
     * these properties (aka fields, variables/global variables)
     */ 
    private int age;
    
    private boolean alive;

    
    // Methods: things it can do, verbs, actions, return, parameter(s)..........
    // =========================================================================
    
    /**
     * A "private" method (also sometimes called a "utility" or "helper" method)
     * can only be called by other methods inside this class - not by any other
     * classes
     */
    private void born() {
        name   = "unidentified";
        age    = 0;
        alive  = true;
        gender = "unidentified";        
    }
    
    public void die() {
        alive = false;
    }
    
    public void birthday() {
        age++;
    }
    
    public void talk() {
        if (alive) {
            System.out.println(name + " is " + age + " identifes " + gender);
        }
        else {
            System.out.println("Boooooo!");
        }
    }
    
}