
/** required package class namespace */
package testing.advancedclasses;

/**
 * HockeyPlayer.java - description here...
 *
 * @author Mr. Wachs (login: lawrence.wachs)
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
     * Default constructor for the class 
     */
    public HockeyPlayer() {

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
    public HockeyPlayer clone() {
        return this;
    }

    /**
     * 
     */
    @Override
    public void homeTeamScores() {
        homeScore++;
    }

    /**
     * 
     */
    @Override
    public void visitingTeamScores() {
        visitingScore++;
    }

    /**
     * 
     * @param number 
     */
    @Override
    public void endOfPeriod(int number) {
        System.out.println("End of period " + number +
                " and the score is " + homeScore +
                " for the " + homeTeam +
                " and " + visitingScore + 
                " for the " + visitingTeam);
    }

    /**
     * 
     * @param name 
     */
    @Override
    public void setOpponent(String name) {
        visitingTeam = name;
    }

    /**
     * 
     * @param name 
     */
    @Override
    public void setName(String name) {
        homeTeam = name;
    }

}
