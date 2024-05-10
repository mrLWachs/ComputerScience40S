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
 * @author YOUR NAME
 * @since Apr 29, 2024
 */
public class Athlete extends Husky implements Hockey, Headis, PermissionForm
{
        
    private boolean haveForm;       // Encapsulated properties (variables)
    private String opponentName;
    private int homeScore;
    private int opponentScore;
    private boolean champion;
    
    private final boolean WE_WON  = true;    // Encapsulated constants
    private final boolean WE_LOST = false;
    
    
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
        opponentName  = "";         // Even protected properties
        opponentScore = 0;
        homeScore     = 0;
        haveForm      = PermissionForm.NOT_SIGNED;  // Using interface property
        champion      = WE_LOST;
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
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Athlete: " + super.toString();
    }
   
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
       
    /**
     * a Deep clone, creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Athlete clone() {
        return this;
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
        output += " for the "            + super.name;
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
     * A team scoring a point
     * 
     * @param name the name of the team who scored
     */
    @Override
    public void point(String name) {
        System.out.println(name + " has got a point");
        if (name.equals(opponentName)) opponentScore++;
        if (name.equals(super.name))   homeScore++;
    }

    /**
     * The game of headis is over
     */
    @Override
    public void endGame() {
        String output = "End of game ";
        output += " and the score is "   + homeScore;
        output += " for the "            + super.name;
        output += " and "                + opponentScore;
        output += " for the "            + opponentName;
        System.out.println(output);
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
