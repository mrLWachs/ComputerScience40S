/** Required package class namespace */
package testing.extras.storage;

/** Required API imports */
import java.io.Serializable;


/*
 * Person - represents ("models") a person. 
 * 
 * @author Mr. Wachs
 * @since December 2024
*/
public class Person implements Serializable
{
    
    public String name;
    public int age;
    private String gender;
    protected boolean alive;

    public Person(String name, int age, String gender) {
        this.name   = name;
        this.age    = age;
        this.gender = gender; 
        alive       = true;
    }

    public void talk() {
        if (alive) {
            System.out.println(name + " is " + age + " identifes as " + gender);
        }
        else {
            System.out.println("Boooooo!");
        }
    }
  
}

