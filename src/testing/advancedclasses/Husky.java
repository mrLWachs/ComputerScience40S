
/** required package class namespace */
package testing.advancedclasses;


/**
 * Husky.java - represents a Husky high school student person
 *
 * @author Mr. Wachs 
 * @since 16-Apr-2019 
 */
public class Husky extends HighSchoolStudent 
        implements PermissionForm, Soccer, Hockey
{

    private boolean haveForm;
    private String opponent;
    private int score;
    private int oppScore;
        
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param name
     * @param age
     * @param isMale
     * @param studentNumber 
     */
    public Husky(String name, int age,
            boolean isMale, int studentNumber) {
        super(studentNumber);
        super.setName(name);
        super.age = age;
        super.isMale = isMale;
    }

    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Husky " + super.toString();
    }
        
    /**
     * Determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    /**
     * Creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Husky clone() {
        return this;
    }

    /**
     * Signing the permission form
     */
    @Override
    public void sign() {
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

    /**
     * A team scores a goal
     * 
     * @param name the name of the team that scored
     */
    @Override
    public void goal(String name) {
        if (name.equals(getName())) {
            score++;
        }
        else {
            oppScore++;
        }
    }

    /**
     * End of a half of the soccer game
     * 
     * @param first is the first half (true) or second (false)
     */
    @Override
    public void endOfHalf(boolean first) {
        System.out.println("To do...");
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
        if (score > oppScore) return true;
        else                  return false;
    }

    /**
     * The passed period of hockey is over
     * 
     * @param period the period number
     */
    @Override
    public void endOfPeriod(int period) {
        System.out.println("To do...");
    }

}
