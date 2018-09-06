
/** required package class namespace */
package archive2018to2019.advancedclasses;

/**
 * Hockey.java - interface enforcing the rules of hockey
 *
 * @author Mr. Wachs 
 * @since Oct 4, 2017 
 * @instructor Mr. Wachs
 */
public interface Hockey extends Sports
{

    /**
     * The home team scores a goal
     */
    void homeTeamScores();
    
    /**
     * The visiting team scores a goal
     */
    void visitingTeamScores();
    
    /**
     * The passed period of hockey is over
     * @param number the period number
     */
    void endOfPeriod(int number);
    
}
