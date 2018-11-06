
/** required package class namespace */
package testing.advancedclasses;


/**
 * Athlete.java - represents an athlete husky computer science high school 
 * student person
 *
 * @author Mr. Wachs 
 * @since 5-Nov-2018 
 */
public class Athlete extends Husky implements Soccer, War, PermissionForm
{
    
    private String homeName;
    private String opponentName;
    private int homeScore;
    private int opponentScore;
    private boolean havePermission;
    private int userCards;
    private int opponentCards;
        
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param name the name for this object
     * @param age the age for this object
     * @param isMale the gender for this object
     * @param studentNumber the student number for this object
     */
    public Athlete(String name, int age, boolean isMale, int studentNumber) {
        super(name, age, isMale, studentNumber);
        userCards      = 52 / 2;
        opponentCards  = 52 / 2;
        havePermission = PermissionForm.NOT_SIGNED;
    }

    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Athlete " + super.toString();
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
    public Athlete clone() {
        return this;
    }

    /**
     * The home team scores a goal
     */
    @Override
    public void homeGoal() {
        homeScore++;
    }

    /**
     * The visiting team scores a goal
     */
    @Override
    public void visitingGoal() {
        opponentScore++;
    }

    /**
     * The end of a half of soccer
     */
    @Override
    public void endHalf() {
        System.out.println("End of the half, the score is " + homeScore + 
                           " for the " + homeName + " and " + opponentScore + 
                           " for the " + opponentName);
    }

    /**
     * Determines the name of the winning team
     * 
     * @return the winning team name
     */
    @Override
    public String winner() {
        if (homeScore > opponentScore) return homeName;
        else                           return opponentName;
    }

    /**
     * Mutator setting the name of the player
     * 
     * @param name the name of this player
     */
    @Override
    public void setHome(String name) {
        homeName = name;
    }

    /**
     * Mutator setting the name of the opponent
     * 
     * @param name the name of this opponent
     */
    @Override
    public void setVisiting(String name) {
        opponentName = name;
    }

    /**
     * The user plays a card in the game
     */
    @Override
    public void userPlaysCard() {
        userCards--;
    }

    /**
     * The opponent plays a card in the game
     */    
    @Override
    public void opponentPlaysCard() {
        opponentCards--;
    }

    /**
     * Determine if the user won or not
     * 
     * @return user wins (true) or not (false)
     */
    @Override
    public boolean didUserWin() {
        if (userCards > opponentCards) return true;
        else                           return false;
    }

    /**
     * Signing the permission form
     */
    @Override
    public void sign() {
        havePermission = PermissionForm.SIGNED;
    }

    /**
     * Determines if the form is signed or not
     * 
     * @return for is signed or not
     */
    @Override
    public boolean hasBeenSigned() {
        return havePermission;
    }

}
