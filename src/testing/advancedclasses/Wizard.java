/*
 *  Mr. Wachs' classes - Java Computer Science learning file Wizzard.java
 *  for project ComputerScience40S on 22-Mar-2019 at 2:18:17 PM by lawrence.wachs
 */


/** required package class namespace */
package testing.advancedclasses;



/**
 * Wizard.java - 
 *
 * @author Mr. Wachs 
 * @since 22-Mar-2019 
 */
public class Wizard 
{

    /**
     * Default constructor for the class, sets class properties
     */
    public Wizard() {
        
    }

    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Wizzard " + super.toString();
    }
        
    /**
     * Determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    /**
     * Creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Wizard clone() {
        return this;
    }

}
