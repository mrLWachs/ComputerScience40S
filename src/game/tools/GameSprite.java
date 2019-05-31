/*
 *  Mr. Wachs' classes - Java Computer Science learning file GameSprite.java
 *  for project ComputerScience30S on 31-May-2019 at 1:23:11 PM by lawrence.wachs
 */


/** required package class namespace */
package game.tools;



/**
 * GameSprite.java - 
 *
 * @author Mr. Wachs 
 * @since 31-May-2019 
 */
public class GameSprite 
{

    /**
     * Default constructor for the class, sets class properties
     */
    public GameSprite() {
        
    }

    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "GameSprite " + super.toString();
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
    public GameSprite clone() {
        return this;
    }

}
