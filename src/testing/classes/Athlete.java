/** Required package class namespace */
package testing.classes;
 
/**
 * Athlete.java - represents a Athlete Husky HighSchool Student Person. Using 
 * the keyword 'implements' in the class signature line, means this class 
 * "follows the rules" of that interface. This will force the programmer to
 * 'implement' (write) the abstract methods the were 'suggested' in that
 * interface. This can be done in NetBeans with the light bulb. You can 
 * implement ("follow the rules of") MULTIPLE interfaces (this cannot be done
 * with classes - one class can only inherit/extends from one other class). To
 * do multiple implementation, use a comma between interfaces.
 *
 * @author Mr. Wachs
 * @since Oct 24, 2024, 11:55:32 a.m.
 */
public class Athlete extends Husky implements Hockey, PermissionForm
{

    /**
     * Default constructor, set class properties
     */
    public Athlete() {
        
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
        return false;
    }

    @Override
    public void sign() {
    }

    @Override
    public boolean haveYouGotItSigned() {
        return false;
    }
     
}