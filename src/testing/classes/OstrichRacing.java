
/** Required package class namespace */
package testing.classes;

 
/**
 * OstrichRacing.java - enforcing "the rules" of ostrich racing (and sports)
 *
 * @author Mr. Wachs
 * @since Nov 29, 2023, 10:47:03 a.m.
 */
public interface OstrichRacing extends Sports
{
    
    /**
     * Determines if the rider stayed on the ostrich or not
     * 
     * @return they stayed on (true) or fell off (false)
     */
    boolean didRiderStayMounted();
    
    /**
     * Sets the length for the race
     * 
     * @param meters the length of the racing track in meters
     */
    void lengthOfTrack(int meters);

}
