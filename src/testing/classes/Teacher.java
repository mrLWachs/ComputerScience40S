
/** Required package class namespace */
package testing.classes;


/*
 * Teacher - represents a Teacher. This class uses inheritance to inherit
 * the properties and methods from the Person class. This class also 
 * "associates" with the Student class by making a reference to them within 
 * the class. This is sometimes simplified as a "has a" relationship.
 * 
 * @author Mr. Wachs
 * @since Oct 15, 2025
*/
public class Teacher extends Person
{
    
    /**
     * Arrays: an array is a "group of variables", or a "collection of data", 
     * or a "data structure". It allows you to store data in a collection so
     * that you can work with it as a group. The square brackets "[  ]" in code
     * indicate we are using an array. Arrays are technically "advanced" data 
     * types, as they are more complicated than variables (which are "simple" 
     * or "primitive" data types). Array names are usually "plural" words. 
     * When arrays are first created, they are empty. This array will be an 
     * array of student objects, so the teacher "has a" association with these 
     * objects, or it is "composed of" (composition) student objects stored in 
     * the array.
     */
    public Student[] students;
    
    private int count;                     // How many students this teacher has
    private final int MAX;                 // Constant for the maximum students
    
    
    /**
     * Constructor, set class properties to the parameters
     * 
     * NOTE: if you write a class and do not write any constructor methods,
     * then the code will "write one for you" (like our Book class) - BUT if 
     * you write a constructor WITH parameter(s) then the code will NOT write 
     * you a default constructor (but you could still write one)
     * 
     * @param name the name for this Teacher
     */
    public Teacher(String name) {
        // First, construct a "Person" (the parent class)
        super(name, 56, "teacher");
        // We also have to initialize (give the properties starting values)
        // the specific properties ("global variables")
        count = 0;
        MAX   = 100;
        // When creating (declaring) arrays, you use the "new" keyword, you use
        // the square brackets "[ ]" and the size of the array is stated when
        // it is declared as arrays are locked into that maximum size  
        students = new Student[MAX];
        // Note: an array of primitive data types (e.g. int, double, char, 
        // boolean) will be initialized to simple values (like 0, false, etc.)
        // but arrays of class level data (like this array of "Student" objects)
        // are initialized to "null" values  
    }
    
    /**
     * Another example of a method over-ride which over-rides the talk method
     * of the Person class (the parent class of Teacher)
     */
    @Override
    public void talk() {
        System.out.println(name + " the teacher is talking...");
        System.out.println("Please quiet down, and now every student needs");
        System.out.println("to tell me about themselves...");
        // To access an entire array we use a "for" loop, and the ".length"
        // feature that is built into all arrays
        for (int i = 0; i < students.length; i++) {
            // By using the name of the array and then the square brackets 
            // "[ ]" and placing the index number (or the variable i) in those
            // square brackets it allows us to "access" (or use) that element 
            // (spot) of the array            
            if (students[i] != null) {                  // Array spot not a null
                // With arrays of "objects" (meaning not primitive data types, 
                // but "class" level data types) all indices (plural of "index")
                // in the array are initially set to "null"
                students[i].study();                    // Make this spot study
                students[i].talk();
            }
        }
    }
    
    /**
     * Adds a new Student object (instance) to this Teacher object's array of 
     * Student objects
     * 
     * @param student the student object to add
     */
    public void add(Student student) {
        // Add the passed student (parameter) into the array at the first 
        // available "slot" (or spot, index, element, location) - this is
        // done by using the square brackets "[ ]" and placing the index 
        // number in the brackets. Remember, arrays start the indexing at 
        // zero and the last index is always one less than the size 
        students[count] = student;  // Parameter is assigned to property
        count++;                    // Move to the next index (for next time)
        // We have to watch for "out of bounds" error (exception)
        if (count >= MAX) count = 0;
    }
    
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Teacher: " + super.toString();
    }
   
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        // This will be a much "deeper" equals analysis
        
        // (1) First: cast into a Teacher object
        Teacher that = (Teacher)object;
        
        // (2) Then: compare the properties we decide are important
        if (!this.name.equals(that.name))     return false;
        if (!this.gender.equals(that.gender)) return false;
        
        // NOTE: we cannot compare properties that are encapsulated (that are 
        // marked private) like these internal and inherited properties.........  
        
        // if (this.MAX   != that.MAX)   return false;  // Teacher properties
        // if (this.count != that.count) return false;
        // if (this.age   != that.age)   return false;  // Inherited properties
        // if (this.alive != that.alive) return false;
        
        // NOTE: we could also go much "deeper" by also comparing the two
        // Student object arrays in both Teacher objects by looping through
        // the two arrays and using the "equals()" method of each Student
        // object stored in each array - but we will ignore that comparison        
        
        // (3) Finally: return equal (true) if passes all the tests above
        return true;
    }
       
    /**
     * a Deep clone, creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Teacher clone() {
        // A much "deeper" clone, create a "new" Teacher object in memory
        // AND copies over the properties of the original into the clone
        Teacher that = new Teacher(this.name);
        // Start copying over the properties (from the "super" class "Person")
        // that I want to (as I am in charge of what to clone) and am able to
        // (as some of the properties are "private" or "encapsulated")
        that.gender = this.gender;
        // For the "students" array property, we will loop through the array 
        // and clone all the students
        for (int i = 0; i < MAX; i++) {                        // Traverse array
            if (this.students[i] != null) {                        // Check spot
                that.students[i] = this.students[i].clone();    // Clone student
            }
        }
        return that;                             // Return cloned Teacher object
    }
    
    /**
     * A "protected" method, means this method can be called inside this class
     * (like a private/utility method), BUT it can also be called by classes 
     * related to this one through inheritance (bot not association)
     */
    protected void yelling() {
        System.out.println("Ahhhhhhh!!!!!");
    }
    
    
}
