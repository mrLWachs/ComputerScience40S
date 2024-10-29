/** Required package class namespace */
package testing.classes;


/*
 * Student.java - represents a student, reminder that "extends" causes
 * inheritance (or "is a") meaning this class gets all the properties and
 * methods of it's parent (super) class. The line below is called the 
 * "signature" line for this class. If we add the "modifier" word "extends" 
 * it causes inheritance and then the class it inherits from is typed next. 
 * This is a "is a" relationship, so a "Student is a Person", and this class  
 * inherits all properties and methods from the "parent" (super) class. 
 *
 * @author Mr. Wachs
 * @since Oct 7, 2024
*/
public class Student extends Person
{

    /**
     * Represents a book object (this object "has a" relationship (association)
     * or "usage" with the student class
     */
    public Book book;
    
    private int number;     // Class properties (and inherited other properties)  
    private double gpa;     // Encapsulated property
        
    /**
     * "static" property: the modifier word "static" simply means "shared" 
     * meaning that ALL objects of this class share this ONE instance of this
     * variable
     */
    public static int total;
    
    
    /**
     * Default constructor, set class properties (including a call to the 
     * "super-constructor" from the parent class to set all of its properties 
     * as well)
     */
    public Student() {
        super();
        // The keyword "super" refers to the "super-class" or "parent" class
        // in this case that is the Person class - by adding the round brackets
        // we make a call to the super constructor           
        gpa    = 0.0;
        number = 1;
        book   = new Book();  
        // Change ("mutate") the static ("shared") property ("global variable")
        total++;
    }
       
    /**
     * Constructor for the class, sets class properties
     * 
     * @param name the name for this student
     * @param age the age for this student
     * @param gender the gender for this student
     * @param number the student number for this student
     */
    public Student(String name, int age, String gender, int number) {
        // Use the super constructor in the parent class (Person) to modify
        // (change) the encapsulated (private) properties on that super class
        // this sets all the properties of the parent (Person) object that 
        // the child (Student) cannot set
        super(name,age,gender);
        // Now set the properties of "this" (the Student) class...
        this.gpa    = 0.0;
        this.number = number;
        this.book   = new Book();
        total++;
    }
    
    /**
     * Cramming is intense studying
     */
    public void cram() {
        for (int i = 0; i < 10; i++) {
            study();
        }
        secret();   // We call a private, encapsulated, helper, utility method
    }
    
    /**
     * Slacking off lowers this student's average
     */
    public void slackoff() {
        gpa -= 0.3;
    }
    
    /**
     * Studying raises this student's average
     */
    public void study() {
        gpa += 0.3;
    }
    
    /**
     * This "secret" method is a private, encapsulated method. These types of 
     * methods are sometimes called "helper" or "utility" methods as they can
     * only be called by other methods inside this class
     */
    private void secret() {
        gpa *= 1.0001;
    }
    
    /**
     * Talk is an "over-ride" (not overload) method means it when called will 
     * run its code and not the code from the method it inherited. The "comment"
     * the light bulb suggested "@Override" is a signal to NetBeans that 
     * a method over-ride is taking place - this is also seen in NetBeans with 
     * a target-like circle
     */
    @Override
    public void talk() {
        super.talk();                           // Invoking super class method
        System.out.println("I am a student");
        System.out.println("\tNumber: " + number);
        System.out.println("\tGPA:    " + gpa);
    }
    
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
    
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     * 
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        Student that = (Student)object;     // Cast our object as a Student
        // Potentially we could have a "casting" error here (seen later)
        // Compare the objects using the parent method
        if (super.equals(that) == false) return false;
        // Now check the Student properties (that we determine relevant)
        if (that.gpa != this.gpa) return false;
        // finally they are equal
        return true;
    }    
    
    /**
     * a Deep clone, creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Student clone() {        
        // Created a new Student object using new memory
        Student that = new Student();
        // Start copying over all the properties (from this class)
        that.number = this.number;
        that.gpa    = this.gpa;
        that.book   = this.book;
        // Now also clone (copy) properties from the super class (Person)
        // We tried this, but got a casting error...        
        // that = (Student)super.clone();
        
        // Instead, we tried the code below, but the encapsulated property 
        // (gender) causes an issue...
        that.age  = this.age;
        that.name = this.name;
        // that.gender = this.gender;
        that.alive = this.alive;         
        // Return the completed new object (our clone)
        return that;
    }
            
}