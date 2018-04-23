
/** required package class namespace */
package testing.advancedclasses;

/**
 * Hockey.java - 
 *
 * @author Mr. Wachs 
 * @since Oct 4, 2017 
 * @instructor Mr. Wachs
 */
public interface Hockey extends Sports
{

    /**
     * 
     */
    void homeTeamScores();
    
    /**
     * 
     */
    void visitingTeamScores();
    
    /**
     * 
     * @param number 
     */
    void endOfPeriod(int number);
    
}
