
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
     * @param name the name for this Athlete   
     * @param age the age for this Athlete  
     */
    public Athlete(String name, int age) {
        super();                    // Call super-constructor
        setName(name);              // Internal (encapsulated) mutator method
        super.setAge(age);          // Super-class mutator method
        opponentName  = "";         // Set encapsulated properties to defaults
        homeScore     = 0;
        opponentScore = 0;
        haveForm      = false;
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
        output += " and the score is " + homeScore;
        output += " for the "          + super.name;
        output += " and "              + opponentScore;
        output += " for the "          + opponentName;
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
            return WE_WON;
        }
        else {
            System.out.println(opponentName + " wins!");
            return WE_LOST;
        }
    }

    /**
     * A team scoring a piece
     * 
     * @param name the name of the team who took a piece
     */
    @Override
    public void takePiece(String name) {
        System.out.println(name + " has taken a piece");
    }

    /**
     * A team scoring a punch
     * 
     * @param name the name of the team who punched
     */
    @Override
    public void punch(String name) {
        System.out.println(name + " has punched");
        if (name.equals(opponentName)) opponentScore+=10;
        if (name.equals(super.name))   homeScore+=10; 
    }

    /**
     * The passed round of Chess Boxing is over
	 *
     * @param round the round number
     */
    @Override
    public void endOfRound(int round) {
        String output = "End of round " + round;
        output += " and the score is " + homeScore;
        output += " for the "          + super.name;
        output += " and "              + opponentScore;
        output += " for the "          + opponentName;
        System.out.println(output);
    }
    
}