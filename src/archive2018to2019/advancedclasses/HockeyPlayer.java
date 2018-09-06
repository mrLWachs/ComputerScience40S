
/** required package class namespace */
package archive2018to2019.advancedclasses;

/**
 * HockeyPlayer.java - represents a hockey player
 *
 * @author Mr. Wachs 
 * @since Apr 13, 2018 
 * @instructor Mr. Wachs
 */
public class HockeyPlayer extends Person implements Hockey
{

    private String homeTeam;
    private String visitingTeam;
    private int homeScore;
    private int visitingScore;

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
    public HockeyPlayer clone() {
        return this;
    }

    /**
     * The home team scores a goal
     */
    @Override
    public void homeTeamScores() {
        homeScore++;
    }

    /**
     * The visiting team scores a goal
     */
    @Override
    public void visitingTeamScores() {
        visitingScore++;
    }

    /**
     * The passed period of hockey is over
     * @param number the period number
     */
    @Override
    public void endOfPeriod(int number) {
        System.out.println("End of period " + number + " and the score is " + 
                           homeScore + " for the " + homeTeam + " and " + 
                           visitingScore + " for the " + visitingTeam);
    }

    /**
     * Mutator setting the name of the opponent
     * @param name the name of this opponent
     */
    @Override
    public void setOpponent(String name) {
        visitingTeam = name;
    }

    /**
     * Mutator setting the name of the player
     * @param name the name of this player
     */
    @Override
    public void setName(String name) {
        homeTeam = name;
    }

}
