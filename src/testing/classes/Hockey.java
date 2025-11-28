/** Required package class namespace */
package testing.classes;


/**
 * Hockey.java - enforcing "the rules" of hockey (and sports). Interfaces can
 * inherit from other interfaces ("can follow the rules of other rules"). This
 * is like classes inheriting from other classes.
 *
 * @author Mr. Wachs
 * @since Nov 28, 2025, 9:21:45 AM
 */
public interface Hockey extends Sports
{
    void score(String name);
    void endOfPeriod(int period);
}
