/** Required package class namespace */
package computerscience30s;


/**
 * Teacher.java - represents a Teacher. This class uses inheritance to inherit
 * the properties and methods from the Person class. This class also 
 * "associates" with the Student class by making a reference to them within 
 * the class. This is sometimes simplified as a "has a" relationship.
 *
 * @author Mr. Wachs
 * @since 5-May-2022, 10:10:33 AM
 */
public class Teacher extends Person
{

    /**
     * An array of student objects, so the teacher has a association with these
     * objects (or a "has a" relationship) - it is "composed of" (composition)
     * student objects - reminder arrays are declared (created) with square
     * brackets "[ ]" and the style of naming arrays is to use a plural word
     */
    public Student[] students;
    
    /**
     * Constructor for the class sets class properties
     * 
     * @param name the name for this Teacher
     */
    public Teacher(String name) {
        // Set (or construct) the properties of the parent class
        super(name, 52, "teacher");
		
        // When declaring / creating (intitializing) an array you use the
        // keyword "new" and you use the square brackets "[ ]" and the size
        // of the array is stated inside those brackets when it is declared
        // This locks the array to that size (that is the maximum number of
        // elements in that array). The array is indexed so each "spot" (or
        // index) has an index number that starts at index 0 and goes up to
        // the length - 1 as the last index 
        students = new Student[100];
    }
    
    /**
     * Talking overrides the same talk method of the parent class
     * and outputs additional information to the screen
     */
    @Override
    public void talk() {
        super.talk();
		
        System.out.println("\tHere are my students...");
		
        // To access an entire array we will travel (or "traverse", or "visit
        // every spot/index" in the array) through using a "for" loop, and
        // the ".length" feature of arrays...  
        for (int i = 0; i < students.length; i++) {
			
            // Since this array is an array of "class" objects (not primitve
            // data types like "int") we have to watch out for "empty" spots
            // or "null" spots
            if (students[i] != null) {
                students[i].talk();
            }
        }
    }
    
}