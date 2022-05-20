/** Required package class namespace */
package testing.unit3;

 
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
 * @since 9-May-2022, 3:24:21 PM
 */
public class Athlete extends Husky implements Hockey, Football, PermissionForm
{

    private boolean haveForm;                       // Encapsulated properties
    private String  opponentName;
    private int     homeScore;
    private int     opponentScore;
    
    /**
     * Default constructor, set class properties
     */
    public Athlete() {
        super();
        opponentName  = "";
        haveForm      = false;
        homeScore     = 0;
        opponentScore = 0;
    }
    
    /**
     * Constructor (overloaded method) sets class properties
     * 
     * @param name the name for this Athlete   
     * @param age the age for this Athlete  
     */
    public Athlete(String name, int age) {
        super();
        super.name = name;
        super.setAge(age);
        opponentName  = "";
        haveForm      = false;
        homeScore     = 0;
        opponentScore = 0;
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
        System.out.println(name + " has scored a goal");
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
        output += " and the score " + homeScore;
        output += " for the "       + super.name;
        output += " and "           + opponentScore;
        output += " for the  "      + opponentName;
        System.out.println(output);
    }

    /**
     * Mutator method, setting the name of the player
     * 
     * @param name of the home team
     */
    @Override
    public void setName(String name) {
        super.name = name;
    }

    /**
     * Mutator method, setting the name of the opponent
     * 
     * @param name of the opponent team
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
        if (homeScore > opponentScore) {
            System.out.println(super.name + " wins!");
            return true;
        }
        else {
            System.out.println(opponentName + " wins!");
            return false;
        }
    }

    /**
     * A team scoring a point
     * 
     * @param name the name of the team who scored
     * @param points the number of points scored
     */
    @Override
    public void score(String name, int points) {
        if (points >= 7) System.out.println(name + " has scored a touchdown");
        if (points >= 3) System.out.println(name + " has scored a field goal");
        if (points >= 1) System.out.println(name + " has scored a safety");
        if (name.equals(opponentName)) opponentScore += points;
        if (name.equals(super.name))   homeScore += points;
    }

    /**
     * The quarter period of football is over
	 *
     * @param quarter the quarter number
     */
    @Override
    public void endOfQuarter(int quarter) {
        String output = "End of quarter " + quarter;
        output += " and the score " + homeScore;
        output += " for the "       + super.name;
        output += " and "           + opponentScore;
        output += " for the  "      + opponentName;
        System.out.println(output);
    }

    /**
     * Signing the permission form
     */
    @Override
    public void sign() {
        System.out.println(super.name + " has signed the form");
        haveForm = PermissionForm.SIGNED;
    }

    /**
     * Determines if the form has been signed or not
     * 
     * @return has been signed (true), or not (false)
     */
    @Override
    public boolean didYouGetItSigned() {
        return haveForm;
    }
    
}