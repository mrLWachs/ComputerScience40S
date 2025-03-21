/** Required package class namespace */
package testing.classes;


/*
 * Person - description
 * 
 * @author Mr. Wachs
 * @since Mar 17, 2025
*/
public class Person
{

    // Properties: (things about it, adjectives, descriptors, variables, arrays)
    
    public String name;    
    private int age;
    public String gender;
    private boolean alive;
    
    // Methods: (things it can do, verbs, actions, return, parameter(s))........
    
    public void born() {
        name   = "unidentifed";
        age    = 0;
        gender = "unidentifed";
        alive  = true;
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