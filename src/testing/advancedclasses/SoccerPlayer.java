
/** required package class namespace */
package testing.advancedclasses;

 
/**
 * SoccerPlayer.java - represents a soccer player
 *
 * @author Mr. Wachs 
 * @since 12-Apr-2019 
 */
public class SoccerPlayer extends Person implements Soccer
{

    private String teamName;
    private String opponentName;
    private int goals;
    private int opponentGoals;
    
    /**
     * Default constructor for the class, sets class properties
     */
    public SoccerPlayer(String teamName) {
        this.teamName = teamName;
        goals = opponentGoals = 0;
    }

    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "SoccerPlayer " + super.toString();
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
    public SoccerPlayer clone() {
        return this;
    }

    /**
     * A team scores a goal
     * 
     * @param name the name of the team that scored
     */
    @Override
    public void goal(String name) {
        if (name.equals(teamName)) {
            goals++;
        }
        else {
            opponentGoals++;
        }
    }

    /**
     * End of a half of the soccer game
     * 
     * @param first is the first half (true) or second (false)
     */
    @Override
    public void endOfHalf(boolean first) {
        if (first) {
            System.out.println("End of first "
                    + "half, score is " +
                    goals + " for " + teamName +
                    " and " + opponentGoals +
                    " for " + opponentName);
        }
        else {
            if (didIWin()) {
                System.out.println("We win!");
            }
            else {
                System.out.println("We lost!");
            }
        }
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
        if (goals > opponentGoals) {
            return true;
        }
        else {
            return false;
        }
    }

}
