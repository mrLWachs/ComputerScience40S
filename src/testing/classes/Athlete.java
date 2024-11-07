/** Required package class namespace */
package testing.classes;
 
/**
 * Athlete.java - represents a Athlete Husky HighSchool Student Person. Using 
 * the keyword 'implements' in the class signature line, means this class 
 * "follows the rules" of that interface. This will force the programmer to
 * 'implement' (write) the abstract methods the were 'suggested' in that
 * interface. This can be done in NetBeans with the light bulb. You can 
 * implement ("follow the rules of") MULTIPLE interfaces (this cannot be done
 * with classes - one class can only inherit/extends from one other class). To
 * do multiple implementation, use a comma between interfaces.
 *
 * @author Mr. Wachs
 * @since Oct 24, 2024, 11:55:32 a.m.
 */
public class Athlete extends Husky implements Hockey, PermissionForm
{
    
    private boolean haveForm;       // Encapsulated properties (variables)
    private String opponentName;
    private int homeScore;
    private int opponentScore;
    
    public boolean champion;
    
    public final boolean WE_WON  = true;   // Constants
    public final boolean WE_LOST = false;
    

    /**
     * Constructor, set class properties
     * 
     * @param name the name for this athlete
     * @param age the age for this athlete
     */
    public Athlete(String name, int age) {
        super();                    // Call super-constructor
        setName(name);              // Calling the mutator method
        super.age     = age;        // Modifying (mutating or changing) property
        opponentName  = "";
        opponentScore = 0;
        homeScore     = 0;
        champion      = WE_LOST;
        haveForm      = PermissionForm.NOT_SIGNED;  // Using interface property
    }
    
    /**
     * Default constructor, set class properties
     */
    public Athlete() {
        // To have one constructor method call another class constructor method,
        // you use the keyword "this" with round brackets
        this("Jock",15);
    }

    /**
     * A team scoring a point
     * 
     * @param name the name of the team who scored
     */
    @Override
    public void score(String name) {
        System.out.println(name + " has scored");
        if (name.equals(opponentName)) opponentScore++;
        if (name.equals(super.name))   homeScore++;
    }
    
    /**
     * The passed period of hockey is over
     *
     * @param period the period number
     */
    @Override
    public void endOfPeriod(int period) {
        String output = "End of period " + period;
        output += " and the score is "   + homeScore;
        output += " for the "            + this.name;
        output += " and "                + opponentScore;
        output += " for the "            + opponentName;
        System.out.println(output);
    }

    /**
     * Mutator method, setting the name of the player
     * 
     * @param name setting the name of the player
     */
    @Override
    public void setName(String name) {
        super.name = name;
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
        if (champion) {
            System.out.println(super.name + " is champion!");
            return WE_WON;
        }
        else if (homeScore >= opponentScore) {
            System.out.println(super.name + " wins!");
            return WE_WON;
        }
        else {
            System.out.println(opponentName + " wins!");
            return WE_LOST;
        }        
    }

    /**
     * Signing the permission form
     */
    @Override
    public void sign() {
        System.out.println(super.name + " has signed the form!");
        haveForm = PermissionForm.SIGNED;
    }

    /**
     * Determines if the form has been signed or not (technically this is a  
     * accessor method)
     * 
     * @return has been signed (true), or not (false)
     */
    @Override
    public boolean haveYouGotItSigned() {
        return haveForm;
    }
     
}