
/** Required package class namespace */
package testing.advancedclasses;

 
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
 * @since 8-Nov-2021, 11:31:12 AM
 */
public class Athlete extends Husky implements Hockey, AmongUs, PermissionForm
{
    
    private boolean haveForm;                       // Encapsulated properties
    private String  opponentName;
    private int     homeScore;
    private int     opponentScore;
    private boolean suss;
    
    private final boolean WE_WON = true;           // Encapsulated constants
    private final boolean WE_LOST = false;
        

    /**
     * Constructor sets class properties
     * 
     * @param name the name for this Athlete   
     * @param age the age for this Athlete  
     */
    public Athlete(String name, int age) {
        super();
        super.name = name;
        this.setAge(age);
        opponentName = "";
        haveForm     = false;
        homeScore    = opponentScore = 0;
        suss         = WE_LOST;
    }
     
    /**
     * Default Constructor sets class properties
     */
    public Athlete() {
        super();
        opponentName = "";
        haveForm     = false;
        homeScore    = opponentScore = 0;
        suss         = WE_LOST;
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

    /**
     * A team scoring a point
     * 
     * @param name the name of the team who scored
     */
    @Override
    public void score(String name) {
        System.out.println(name + " has scored a goal");
        if (name.equals(opponentName)) opponentScore++;
        if (name.equals(super.name))   homeScore++;
    }

    /**
     * The passed period of hockey is over
	 *
     * @param period the period number
     */
    @Override
    public void endOfPeriod(int period) {
        String output = "End of period " + period;
        output += " and the score is "   + homeScore;
        output += " for the "            + super.name;
        output += " and "                + opponentScore;
        output += " for the "            + opponentName;
        System.out.println(output);
    }

    /**
     * Mutator method, setting the name of the player
     * 
     * @param name 
     */
    @Override
    public void setName(String name) {
        super.name = name;
    }

    /**
     * Mutator setting the name of the opponent
     * 
     * @param name the name of this opponent
     */
    @Override
    public void setOpponent(String name) {
        opponentName = name;
    }

    /**
     * Determines if the sports game is over (with a winner)
     * 
     * @return there was a winner (true) or not (false)
     */
    @Override
    public boolean didIWin() {
        if (homeScore >= opponentScore) {
            System.out.println(super.name + " wins!");
            return true;
        }
        else {
            System.out.println(opponentName + " wins!");
            return false;
        }
    }

    /**
     * Call a meeting to end the game
     * 
     * @param name the name of the team calling the meeting
     * @return the game is over (true) or not (false)
     */
    @Override
    public boolean callMeeting(String name) {
        System.out.println(name + " has won!");
        if (suss == WE_WON) return true;
        else                return false;
    }

    /**
     * Asks a question to an opponent
     * 
     * @return the answer to the question
     */
    @Override
    public String askQuestion() {
        suss = WE_LOST;
        return super.name + " has asked a question...";
    }

    /**
     * Find a body in the game 
     * 
     * @param whoFoundTheBody the person looking
     * @return the name of the body
     */
    @Override
    public String findBody(String whoFoundTheBody) {
        suss = WE_WON;
        System.out.println(whoFoundTheBody + " has found a body");        
        return whoFoundTheBody + " has found a body";
    }

    /**
     * Signing the permission form
     */
    @Override
    public void sign() {
        System.out.println(super.name + " has got it signed!");
        haveForm = PermissionForm.SIGNED;
    }

    /**
     * Determines if the form has been signed or not
     * 
     * @return has been signed (true), or not (false)
     */
    @Override
    public boolean haveYouGotItSigned() {
        return haveForm;
    }
    
}