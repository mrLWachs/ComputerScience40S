/** Required package class namespace */
package testing.classes;


/*
 * Teacher - represents a Teacher. This class uses inheritance to inherit
 * the properties and methods from the Person class. This class also 
 * "associates" with the Student class by making a reference to them within 
 * the class. This is sometimes simplified as a "has a" relationship.
 * 
 * @author Mr. Wachs
 * @since Nov 3, 2026
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
    private final int MAX;                  // Constant for the maximum students
    
    
    /**
     * Constructor, set class properties to the parameters
     * 
     * @param name the name for this Teacher
     */
    public Teacher(String name) {
        super(name, 57, "teacher");   // 1st Construct a "Person" (parent class)
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
    
    public void add(Student student) {
        count++;
    }
    
    public void teach() {
        
    }

}