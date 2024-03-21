
package fun.sorting;


public class Person
{
    
    public static int sortType;
    
    public static final int BY_NAME = 1;
    public static final int BY_AGE  = 2;
    public static final int BY_IQ   = 3;
       
    
    public String name;
    public int age;
    public double iq;
    
    public Person(String name, int age, double iq) {
        this.name = name;
        this.age  = age;
        this.iq  = iq;
    }
    
    public int compareTo(Person that) {
        if (sortType == BY_NAME) {
            return this.name.compareTo(that.name);
        }
        else if (sortType == BY_AGE) {
            if (this.age >  that.age) return 1;
            if (this.age <  that.age) return -1;
        }
        else if (sortType == BY_IQ) {
            if (this.iq >  that.iq) return 1;
            if (this.iq <  that.iq) return -1;
        }
        return 0;
    }
    
    public String toString() {
        return name + "\t" + age + "\t" + iq;
    }
    
}