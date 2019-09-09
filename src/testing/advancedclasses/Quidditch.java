
/** required package class namespace */
package testing.advancedclasses;


/**
 * Quidditch - interface enforcing the rules of quidditch
 *
 * @author Mr. Wachs 
 * @since 12-Apr-2019 
 */
public interface Quidditch extends Sports
{

    /**
     * Did this wizard catch a snitch or not (to end the match)
     * 
     * @return they did catch it (true) or not (false)
     */
    boolean catchSnitch();
    
}