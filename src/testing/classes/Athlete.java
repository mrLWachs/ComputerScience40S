/** Required package class namespace */
package testing.classes;
 
/**
 * Athlete.java - represents a Athlete Husky HighSchool Student Person. Using 
 * the keyword 'implements' in the class signature line, means this class 
 * "follows the rules" of that interface(s). This will force the programmer to
 * 'implement' (write) the abstract methods the were 'suggested' in that
 * interface. This can be done in NetBeans with the light bulb. You can 
 * implement ("follow the rules of") MULTIPLE interfaces (this cannot be done
 * with classes - one class can only inherit/extends from ONE other class). To
 * do multiple implementation, use a comma between interfaces.
 *
 * @author Mr. Wachs
 * @since Apr 16, 2026, 9:12:33 AM
 */
public class Athlete extends Husky implements PermissionForm, Hockey,
        CheeseRolling, PotatoSackRacing
{

    private boolean haveForm;             // Encapsulated properties (variables)
    private String opponentName;
    private int homeScore;
    private int opponentScore;
    private boolean champion;
    
    private final boolean WE_WON  = true;              // Encapsulated constants
    private final boolean WE_LOST = false;
        
    
    /**
     * Default constructor, set class properties
     */
    public Athlete() {
        
    }

    @Override
    public void sign() {
    }

    @Override
    public boolean haveYouGotItSigned() {
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
    public void roll() {
    }

    @Override
    public void eat(boolean didTheyThrowUp) {
    }

    @Override
    public void hop(int inches) {
    }

    @Override
    public void suitUp(String sack) {
    }
    
}