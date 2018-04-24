
/** required package class namespace */
package testing.advancedclasses;

/**
 * HuskyAthlete.java - represents a husky athlete
 *
 * @author Mr. Wachs 
 * @since Oct 4, 2017 
 * @instructor Mr. Wachs
 */
public class HuskyAthlete extends Husky implements Hockey, Chess, 
        PermissionForm 
{
    
    private HockeyPlayer hockeyPlayer;
    private boolean wonChess;
    private boolean hasPermission;    

    /**
     * Class constructor sets class properties
     * 
     * @param name the name of this HuskyAthlete 
     * @param age the age of this HuskyAthlete 
     * @param studentNumber the student number of this HuskyAthlete
     * @param isMale the gender of this HuskyAthlete
     */
    public HuskyAthlete(String name, int age, int studentNumber, 
                        boolean isMale) {
        super(name, age, studentNumber, isMale);
        wonChess = false;
        hockeyPlayer = new HockeyPlayer();
        hasPermission = false;
    }

    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return super.toString();
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
    public HuskyAthlete clone() {
        return this;
    }

    /**
     * The home team scores a goal
     */
    @Override
    public void homeTeamScores() {
        hockeyPlayer.homeTeamScores();
    }

    /**
     * The visiting team scores a goal
     */
    @Override
    public void visitingTeamScores() {
        hockeyPlayer.visitingTeamScores();
    }

    /**
     * The passed period of hockey is over
     * @param number the period number
     */
    @Override
    public void endOfPeriod(int number) {
        hockeyPlayer.endOfPeriod(number);
    }

    /**
     * Mutator setting the name of the opponent
     * @param name the name of this opponent
     */
    @Override
    public void setOpponent(String name) {
        hockeyPlayer.setOpponent(name);
    }

    /**
     * Mutator setting the name of the player
     * @param name the name of this player
     */
    @Override
    public void setName(String name) {
        hockeyPlayer.setName(name);
    }

    /**
     * The opponent makes a move
     */
    @Override
    public void opponentMove() {
        wonChess = false;
    }

    /**
     * The player makes a move
     */
    @Override
    public void move() {
        wonChess = true;
    }

    /**
     * The game of chess is over
     */
    @Override
    public void endOfGame() {
        if (hasBeenSigned()) {
            if (wonChess) System.out.println("Chess master");
            else          System.out.println("Newby");
        }
        else {
            System.out.println("Bad student, get it signed!");
        }
    }

    /**
     * Signing the permission form
     */
    @Override
    public void sign() {
        hasPermission = PermissionForm.IS_SIGNED;
    }

    /**
     * Determines if the form has been signed or not
     * 
     * @return has been signed (true), or not (false)
     */
    @Override
    public boolean hasBeenSigned() {
        return hasPermission;
    }

}
