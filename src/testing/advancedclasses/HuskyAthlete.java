
/** required package class namespace */
package testing.advancedclasses;

 
/**
 * HuskyAthlete.java - represents a athlete Husky student person. 
 * This class not only inherits from another class (Husky) and all the classes
 * that super class inherited from (Student, Person) all the properties and
 * methods. It also implements ("follows the rules of...") the four interfaces
 * forcing this class to implement (over-ride) the method signatures defined
 * in those interfaces.
 *
 * @author Mr. Wachs
 * @since 22-Apr-2020, 1:42:56 PM
 */
public class HuskyAthlete extends Husky implements PermissionForm, Hockey, Football
{

    public HuskyAthlete(int studentNumber) {
        super(studentNumber);
    }


     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "HuskyAthlete: " + super.toString();
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
    public HuskyAthlete clone() {
        return this;
    }

    /**
     * Signing the permission form
     */
    @Override
    public void sign() {
    }

    /**
     * Determines if the form has been signed or not
     * 
     * @return has been signed (true), or not (false)
     */
    @Override
    public boolean haveYouGotItSigned() {
        return false;
    }

    /**
     * A team scored a goal for 1 point 
     * 
     * @param name the name of the team who scored
     */
    @Override
    public void goal(String name) {
    }

    /**
     * End of this period of hockey
     * 
     * @param period the period ending
     */
    @Override
    public void endOfPeriod(int period) {
    }

    /**
     * Mutator setting the name of the opponent
     * 
     * @param name the name of this opponent
     */
    @Override
    public void setOpponent(String name) {
    }

    /**
     * Determines if the sports game is over (with a winner)
     * 
     * @return there was a winner (true) or not (false)
     */
    @Override
    public boolean didIWin() {
        return false;
    }

    /**
     * A team scoring some amount of points 
     * 
     * @param points the amount of points scored
     * @param name the name of the team who scored
     */
    @Override
    public void score(int points, String name) {
    }

    /**
     * End of this quarter of football
     * 
     * @param quarter the quarter ending
     */
    @Override
    public void endOfQuarter(int quarter) {
    }
    
}
