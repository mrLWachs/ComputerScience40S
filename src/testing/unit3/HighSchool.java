/** Required package class namespace */
package testing.unit3;

 
/**
 * HighSchool.java - represents a high school student person. Before creating
 * this class we altered the NetBeans template (Tools - Templates) for a 
 * Java class so that the toString(), clone(), and equals() methods are now 
 * always part of any new class we create (whether or not we choose to over-ride
 * those methods).
 * 
 * This class uses the modifier word "abstract" in the class signature line to
 * make this class an abstract class - meaning this class cannot be made into
 * an object (cannot be instantiated)
 *
 * @author Mr. Wachs
 * @since 6-May-2022, 3:11:12 PM
 */
public abstract class HighSchool extends Student
{

    /**
     * Default constructor, set class properties
     */
    public HighSchool() {
        
    }
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "HighSchool: " + super.toString();
    }
   
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
       
    /**
     * a Deep clone, creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public HighSchool clone() {
        return this;
    }
    
}