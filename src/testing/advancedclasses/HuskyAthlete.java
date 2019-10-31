
/** required package class namespace */
package testing.advancedclasses;

 
/**
 * HuskyAthlete.java - represents a athlete Husky student person. 
 * This class not only inherits from another class (Husky) and all the classes
 * that super class inherited from (Student, Person) all the properties and
 * methods. It also implements ("follows the rules of...") the four interfaces
 * forcing this class to implement (over-ride) the method signatures defined
 * in those interfaces.
 *
 * @author Mr. Wachs
 * @since Oct. 31, 2019, 12:17:54 p.m.
 */
public class HuskyAthlete extends Husky implements Football, WiiBoxing, 
        SepakTakraw, PermissionForm
{

    private boolean haveForm;
    private String opponent;
    private int score;
    private int oppScore;
    
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param name the name for this student
     * @param age the age for this student
     * @param isMale the gender for this student
     * @param studentNumber the student number for this student
     */
    public HuskyAthlete(String name, int age, 
                        boolean isMale, int studentNumber) {
        super(name, age, isMale, studentNumber);
        haveForm = PermissionForm.NOT_SIGNED;
        opponent = "";
        score    = 0;
        oppScore = 0;
    }

    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "HuskyAthlete: " + super.toString();
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
    public HuskyAthlete clone() {
        return this;
    }

    /**
     * A team scoring some amount of points 
     * 
     * @param points the amount of points scored
     * @param name the name of the team who scored
     */
    @Override
    public void score(int points, String name) {
        System.out.println(points + " scored by " + name);
        if (name.equals(super.getName())) score    += points;
        if (name.equals(opponent))        oppScore += points;        
    }

    /**
     * End of this quarter of football
     * 
     * @param quarter the quarter ending
     */
    @Override
    public void endOfQuarter(int quarter) {
        String output = "End of quarter "    + quarter;
        output       += " and the score is " + score;
        output       += " for the "          + super.getName();
        output       += " and "              + oppScore;
        output       += " for the "          + opponent;
        System.out.println(output);
    }

    /**
     * Mutator setting the name of the opponent
     * 
     * @param name the name of this opponent
     */
    @Override
    public void setOpponent(String name) {
        opponent = name;
    }

    /**
     * Determines if the sports game is over (with a winner)
     * 
     * @return there was a winner (true) or not (false)
     */
    @Override
    public boolean didIWin() {
        if (score > oppScore) {
            System.out.println(super.getName() + " wins!");
            return true;
        }
        else {
            System.out.println(super.getName() + " loses, and " +
                    opponent + " wins");
            return false;
        }
    }

    /**
     * Punches an opponent
     * 
     * @param name the name of the player punching
     */
    @Override
    public void punch(String name) {
        System.out.println(name + " punches " + opponent);
        if (name.equals(super.getName())) score++;
        if (name.equals(opponent))        oppScore++;
    }

    /**
     * Blocks a punch from the opponent
     * 
     * @param name the name of the player blocking
     */
    @Override
    public void block(String name) {
        System.out.println(name + " blocks " + opponent);
        if (name.equals(super.getName())) oppScore--;
        if (name.equals(opponent))        score--;
    }

    /**
     * Does a back flip kick of the ball that may score a point
     * 
     * @param didIScore scored a point (true) or not (false)
     */
    @Override
    public void backFlipKick(boolean didIScore) {
        if (didIScore) {
            System.out.println(super.getName() + " back flips and scores");
            score++;
        }
        else {
            System.out.println(super.getName() + " back flips");
        }
    }

    /**
     * end of a set in the sepak takraw game
     * 
     * @param set the set number
     */
    @Override
    public void endOfSets(int set) {
        String output = "End of set "        + set;
        output       += " and the score is " + score;
        output       += " for the "          + super.getName();
        output       += " and "              + oppScore;
        output       += " for the "          + opponent;
        System.out.println(output);
    }

    /**
     * Signing the permission form
     */
    @Override
    public void sign() {
        System.out.println(super.getName() + " signed the permission form");
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
