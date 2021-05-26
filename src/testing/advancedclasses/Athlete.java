
/** Required package class namespace */
package testing.advancedclasses;

 
/**
 * Athlete.java - represents a athlete husky high school student person. Using 
 * the keyword 'implements' in the class signature line, means this class 
 * "follows the rules" of that interface. This will force the programmer to
 * 'implement' (write) the abstract methods the were 'suggested' in that
 * interface. This can be done in NetBeans with the light bulb. You can 
 * implement ("follow the rules of") MULTIPLE interfaces (this cannot be done
 * with classes - one class can only inherit/extends from one other class). To
 * do multiple implementation, use a comma between interfaces.
 *
 * @author Mr. Wachs
 * @since May 26, 2021, 11:11:53 a.m.
 */
public class Athlete extends Husky implements Hockey, Football, PermissionForm
{

    /**
     * Class constructor, sets the class properties
     * 
     * @param name the name for this Athlete Husky High School 
     * @param age the age for this Athlete Husky High School 
     * @param studentNumber the student number for this Athlete Husky HighSchool  
     */
    public Athlete(String name, int age, int studentNumber) {
        super(name, age, studentNumber);
    }
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Athlete: " + super.toString();
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
    public Athlete clone() {
        return this;
    }

    @Override
    public void score(String name) {
    }

    @Override
    public void endOfPeriod(int period) {
    }

    @Override
    public void setName(String name) {
    }

    @Override
    public void setOpponent(String name) {
    }

    @Override
    public boolean didIWin() {
    }

    @Override
    public void score(int points, String name) {
    }

    @Override
    public void endOfQuarter(int quarter) {
    }

    @Override
    public void sign() {
    }

    @Override
    public boolean haveYouGotItSigned() {
    }
    
}