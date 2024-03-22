/** Required package class namespace */
package fun.sorting;

/*
 * Person - represents a person with a name, age, and IQ
 * 
 * @author Mr. Wachs
 * @since March 22, 2024
*/
public class Person
{
    
    /** The "shared" type to determine what to sort by */
    public static int sortType;
    
    /** Sort the list by names */
    public static final int BY_NAME = 1;
    /** Sort the list by ages */
    public static final int BY_AGE  = 2;
    /** Sort the list by IQ values */
    public static final int BY_IQ   = 3;
       
    /** The person's name */
    public String name;
    /** The person's age */
    public int age;
    /** The person's IQ */
    public double iq;
    
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param name the name for this person
     * @param age the age for this person
     * @param iq the IQ for this person
     */
    public Person(String name, int age, double iq) {
        this.name = name;
        this.age  = age;
        this.iq   = iq;
    }
    
    /**
     * Compares two objects lexicographically
     *
     * @param that the other object to be compared to
     * @return the value 0 if the argument string is equal to
     *          this object; a value less than 0 if this object
     *          is lexicographically less than the argument; and a
     *          value greater than 0 if this object is
     *          lexicographically greater than the argument
     */
    public int compareTo(Person that) {
        if (sortType == BY_NAME) {
            return this.name.compareTo(that.name);
        }
        else if (sortType == BY_AGE) {
            if (this.age > that.age) return  1;
            if (this.age < that.age) return -1;
        }
        else if (sortType == BY_IQ) {
            if (this.iq > that.iq) return  1;
            if (this.iq < that.iq) return -1;
        }
        return 0;
    }
    
    /**
     * String representation of this object
     * 
     * @return the string version of this object
     */
    @Override
    public String toString() {
        return name + "\t" + age + "\t" + iq;
    }
    
    /**
     * Returns a duplicate object using new memory
     * 
     * @return a clone of the object with new memory
     */
    @Override
    public Person clone() {
        return new Person(name,age,iq);
    }
    
}