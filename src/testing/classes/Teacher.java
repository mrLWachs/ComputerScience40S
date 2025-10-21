
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
    
    
    
    public Teacher(String name) {
        
    }

}
