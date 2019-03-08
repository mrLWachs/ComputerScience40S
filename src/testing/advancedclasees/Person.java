
package testing.advancedclasees;


public class Person 
{

    private String name;
    public int age;
    
    public Person() {
        name = "Jane Doe";
        age = 0;
    }
    
    public void talk() {
        System.out.println(name + " = " + age);
    }
    
}
