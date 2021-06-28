
/** Required package class namespace */
package testing.advancedclasses;

 
/**
 * Athlete.java - represents a athlete husky high school student person. Using 
 * the keyword 'implements' in the class signature line, means this class 
 * "follows the rules" of that interface. This will force the programmer to
 * 'implement' (write) the abstract methods the were 'suggested' in that
 * interface. This can be done in NetBeans with the light bulb. You can 
 * implement ("follow the rules of") MULTIPLE interfaces (this cannot be done
 * with classes - one class can only inherit/extends from one other class). To
 * do multiple implementation, use a comma between interfaces.
 *
 * @author Mr. Wachs
 * @since May 26, 2021, 11:11:53 a.m.
 */
public class Athlete extends Husky implements Hockey, Football, PermissionForm
{
    
    private boolean haveForm;           // Encapsulated properties
    private String  opponentName;
    private int     homeScore;
    private int     opponentScore;
    

    /**
     * Class constructor, sets the class properties
     * 
     * @param name the name for this Athlete Husky  
     * @param age the age for this Athlete Husky 
     * @param studentNumber the student number for this Athlete Husky   
     */
    public Athlete(String name, int age, int studentNumber) {
        super(name, age, studentNumber);
        haveForm      = PermissionForm.NOT_SIGNED;  // Set properties to default
        opponentName  = "";
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
        if (name.endsWith(super.name)) homeScore++;
    }

    /**
     * The passed period of hockey is over
	 *
     * @param period the period number
     */
    @Override
    public void endOfPeriod(int period) {
        String output = "End of period "     + period;
        output       += " and the score is " + homeScore;
        output       += " for the "          + super.name;
        output       += " and "              + opponentScore;
        output       += " for the "          + opponentName;
        System.out.println(output);
    }

    /**
     * Mutator method, setting the name of the player
     * 
     * @param name 
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
        if (homeScore >= opponentScore) {
            System.out.println(super.name + " wins!");
            return true;
        }
        else {
            System.out.println(opponentName + " wins!");
            return false;
        }
    }

    /**
     * A team scoring some amount of points 
     * 
     * @param points the amount of points scored
     * @param name the name of the team who scored
     */
    @Override
    public void score(int points, String name) {
        System.out.println(name + " has scored " + points + " points");
        if (name.equals(opponentName)) opponentScore += points;
        if (name.endsWith(super.name)) homeScore     += points;
    }

    /**
     * End of this quarter of football
     * 
     * @param quarter the quarter ending
     */
    @Override
    public void endOfQuarter(int quarter) {
        String output = "End of quarter "    + quarter;
        output       += " and the score is " + homeScore;
        output       += " for the "          + super.name;
        output       += " and "              + opponentScore;
        output       += " for the "          + opponentName;
        System.out.println(output);
    }

    /**
     * Signing the permission form
     */
    @Override
    public void sign() {
        System.out.println(super.name + " has gotten it signed!");
        haveForm = PermissionForm.SIGNED;
    }

    /**
     * Determines if the form has been signed or not
     * 
     * @return has been signed (true), or not (false)
     */
    @Override
    public boolean haveYouGotItSigned() {
        return haveForm;
    }
    
}