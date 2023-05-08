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
 * @since 13-Apr-2023, 2:05:34 PM
 */
public class Athlete extends Husky implements PermissionForm, Hockey, 
        SlapFighting, ExtremeIroning
{

    private boolean haveForm;       // Encapsulated properties (variables)
    private String  opponentName;
    private int     homeScore;
    private int     opponentScore;
    private boolean champion;
    
    private final boolean WE_WON  = true;    // Encapsulated constants
    private final boolean WE_LOST = false;
    
    
    /**
     * Constructor, set class properties
     */
    public Athlete(String name, int age) {
        super();                    // Call super-constructor
        setName(name);              // Mutator method
        super.age     = age;        // Internal (encapsulated), protected
        opponentName  = "";
        homeScore     = 0;
        opponentScore = 0;
        haveForm      = PermissionForm.NOT_SIGNED;  // Use the shared constant
        champion      = WE_LOST;
    }
    
    /**
     * Default constructor, set class properties
     */
    public Athlete() {
        // To have one class constructor call another class constructor, use
        // the keyword "this" with round brackets 
        this("Jock",15);
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
    public void slap(String slapper, String slapie) {
    }

    @Override
    public boolean isKnockedOut() {
    }

    @Override
    public boolean metRequirements(int boardLength, int boardWidth) {
    }

    @Override
    public String judge() {
    }
    
}