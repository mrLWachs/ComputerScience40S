

/** required package class namespace */
package testing.advancedclasses;



/**
 * SoccerPlayer.java - 
 *
 * @author Mr. Wachs 
 * @since 12-Apr-2019 
 */
public class SoccerPlayer extends Person implements Soccer
{

    /**
     * Default constructor for the class, sets class properties
     */
    public SoccerPlayer() {
        
    }

    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "SoccerPlayer " + super.toString();
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
    public SoccerPlayer clone() {
        return this;
    }

    @Override
    public void goal(String name) {
    }

    @Override
    public void endOfHalf(boolean first) {
    }

    @Override
    public void setOpponent(String name) {
    }

    @Override
    public boolean didIWin() {
        return false;
    }

}
