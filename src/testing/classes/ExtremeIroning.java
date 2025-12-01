/** Required package class namespace */
package testing.classes;
 
/**
 * ExtremeIroning.java - enforcing "the rules" of Extreme Ironing (and sports)
 *
 * @author Mr. Wachs
 * @since Dec 1, 2025, 8:57:14 AM
 */
public interface ExtremeIroning extends Sports
{
    boolean isBoardValid(int inches);
    void setLocation(String description);
}
