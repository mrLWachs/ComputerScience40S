
/** Required package class namespace */
package testing.classes;


/*
 * Student - represents a student, reminder that "extends" causes
 * inheritance (or "is a") meaning this class gets all the properties and
 * methods of it's parent (super) class. The line below is called the 
 * "signature" line for this class. If we add the "modifier" word "extends" 
 * it causes inheritance and then the class it inherits from is typed next. 
 * This is a "is a" relationship, so a "Student is a Person", and this class  
 * inherits all properties and methods from the "parent" (super) class. The 
 * line below is called the "signature" line for this class. If we add the 
 * "modifier" word "extends" it causes inheritance and then the class it 
 * inherits from is typed next. This is a "is a" relationship, so a 
 * "Student is a Person", and this class inherits all properties and methods 
 * from the "parent" (super) class.
 *
 * @author Mr. Wachs 
 * @since 13-Oct-2022
*/
public class Student extends Person
{
    
    private int number;    
    private double gpa; // class properties (and inherited other properties)
    
    /**
     * Represents a book object (this object "has a" relationship (association)
     * or "usage" with the student class
     */
    public Book book;
    

    /**
     * Default constructor, set class properties
     */
    public Student() {
        super();
        gpa = 0;
        book = new Book();
    }
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param name the name for this student
     * @param age the age for this student
     * @param gender the gender for this student
     */
    public Student(String name, int age, String gender) {
        // Use the super constructor in the parent class (Person) to modify
        // (change) the encapsulated (private) properties on that super class
        // this sets all the propoerties of the parent (Person) object that 
        // the child (Student) cannot set
        super(name, age, gender);
        // Now set the properties of this class...
        gpa = 0.0;
        book = new Book();
        // Lets leave out student number...
        // We will come back!
    }
    
    /**
     * Cramming is intense studying
     */
    public void cram() {
        for (int i = 0; i < 10; i++) {
            study();
        }
        secret();
    }

    /**
     * Slacking off lowers this student's average
     */
    public void slackOff() {
        gpa -= 0.3;
    }
    
    /**
     * Studying raises this student's average
     */
    public void study() {
        gpa += 0.1;
    }
    
    /**
     * Talking overrides the same talk method of the parent class and outputs
     * additional information to the screen
     */
    @Override
    public void talk() {
        super.talk();                           // Invoking super class method
        System.out.println("I am a student");
        System.out.println("\tNumber: \t" + number);
        System.out.println("\tGPA: \t"    + gpa);        
    }
    
    /**
     * This "secret" method is a private, encapsulated method. These types of 
     * methods are sometimes called "helper" or "utility" methods as they can
     * only be called by other methods inside this class
     */
    private void secret() {
        gpa *= 1.0001;
    }
    
}