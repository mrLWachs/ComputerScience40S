/*
 *  Mr. Wachs' classes - Java Computer Science learning file GameCharacter.java
 *  for project ComputerScience30S on 31-May-2019 at 1:23:04 PM by lawrence.wachs
 */


/** required package class namespace */
package game.tools;



/**
 * GameCharacter.java - 
 *
 * @author Mr. Wachs 
 * @since 31-May-2019 
 */
public class GameCharacter 
{

    /**
     * Default constructor for the class, sets class properties
     */
    public GameCharacter() {
        
    }

    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "GameCharacter " + super.toString();
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
    public GameCharacter clone() {
        return this;
    }

}
