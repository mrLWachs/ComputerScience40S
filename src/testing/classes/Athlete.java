
/** Required package class namespace */
package testing.classes;

 
/**
 * Athlete.java - represents a Athlete Husky HighSchool Student Person
 *
 * @author Mr. Wachs
 * @since 9-Nov-2022, 11:28:38 AM
 */
public class Athlete extends Husky implements PermissionForm, Hockey, ChessBoxing
{

    private boolean haveForm;           // Encapsulated properties (variables)
    private String  opponentName;
    private int     homeScore;
    private int     opponentScore;
    private boolean champion;
    
    private final boolean WE_WON  = true;   // Encapsulated constants
    private final boolean WE_LOST = false;
        
    
    /**
     * Constructor, set class properties
     * 
     * @param name
     * @param age
     */
    public Athlete(String name, int age) {
        super();
        super.name = name;
        super.setAge(age);
        opponentName  = "";
        homeScore     = 0;
        opponentScore = 0;
        haveForm      = false;
        champion      = WE_LOST;
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
    public void takePiece() {
    }

    @Override
    public void punch() {
    }

    @Override
    public void endOfRound(int round) {
    }
    
}