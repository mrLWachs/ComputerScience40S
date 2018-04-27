
package computerscience30s;

public class Person 
{

    // properties (things about it)
    
    String name;
    int age;
    boolean isMale;
    boolean isAlive;
    
    // methods (things it can do)
    
    Person() {
        // constructor method
        // called (invoked) when
        // the class is used to 
        // build a object
        name = "Jane Doe";
        age = 0;
        isAlive = true;
        isMale = false;
    }
    
    void die() {
        isAlive = false;
    }
    
    void talk() {
        if (isAlive == false) {
            System.out.println("Boooooo!");
        }
        else {
            System.out.println("My name is " +
                    name + " and my age is " +
                    age + " and if you are " +
                    "wondering if I am a male," +
                    " the answer is " + isMale);
        }
    }
    
    void birthday() {
        age++;
    }
    
}
