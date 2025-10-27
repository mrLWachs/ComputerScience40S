
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
            students[i].talk();
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

}
