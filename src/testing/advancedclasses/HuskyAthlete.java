
/** required package class namespace */
package testing.advancedclasses;

/**
 * HuskyAthlete.java - 
 *
 * @author Mr. Wachs 
 * @since Oct 4, 2017 
 * @instructor Mr. Wachs
 */
public class HuskyAthlete extends Husky 
        implements Hockey, Chess, PermissionForm 
{
    
    private HockeyPlayer hockeyPlayer;
    private boolean wonChess;
    private boolean hasPermission;    

    /**
     * 
     * @param name
     * @param age
     * @param studentNumber
     * @param isMale 
     */
    public HuskyAthlete(String name, 
                        int age, 
                        int studentNumber, 
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
     * 
     */
    @Override
    public void homeTeamScores() {
        hockeyPlayer.homeTeamScores();
    }

    /**
     * 
     */
    @Override
    public void visitingTeamScores() {
        hockeyPlayer.visitingTeamScores();
    }

    /**
     * 
     * @param number 
     */
    @Override
    public void endOfPeriod(int number) {
        hockeyPlayer.endOfPeriod(number);
    }

    /**
     * 
     * @param name 
     */
    @Override
    public void setOpponent(String name) {
        hockeyPlayer.setOpponent(name);
    }

    /**
     * 
     * @param name 
     */
    @Override
    public void setName(String name) {
        hockeyPlayer.setName(name);
    }

    /**
     * 
     */
    @Override
    public void opponentMove() {
        wonChess = false;
    }

    /**
     * 
     */
    @Override
    public void move() {
        wonChess = true;
    }

    /**
     * 
     */
    @Override
    public void endOfGame() {
        if (hasBeenSigned()) {
            if (wonChess) {
                System.out.println("Chess master");
            }
            else {
                System.out.println("Newby");
            }
        }
        else {
            System.out.println("Bad student, get it signed!");
        }
    }

    /**
     * 
     */
    @Override
    public void sign() {
        hasPermission = PermissionForm.IS_SIGNED;
    }

    /**
     * 
     * @return 
     */
    @Override
    public boolean hasBeenSigned() {
        return hasPermission;
    }

}
