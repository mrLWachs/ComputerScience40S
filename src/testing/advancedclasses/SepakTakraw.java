
/** required package class namespace */
package testing.advancedclasses;


/**
 * SepakTakraw.java - interface enforcing the rules of sepak takraw
 *
 * @author Mr. Wachs
 * @since Oct. 31, 2019, 11:41:15 a.m.
 */
public interface SepakTakraw extends Sports
{
    
    /**
     * Does a back flip kick of the ball that may score a point
     * 
     * @param didIScore scored a point (true) or not (false)
     */
    void backFlipKick(boolean didIScore);
    
    /**
     * end of a set in the sepak takraw game
     * 
     * @param set the set number
     */
    void endOfSets(int set);
    
}
