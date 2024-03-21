
package fun.sorting;


public class Person
{
    
    public static boolean byName;
    
    public String name;
    public int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age  = age;
    }
    
    public int compareTo(Person that) {
        if (byName) {
            return this.name.compareTo(that.name);
        }
        else {
            if (this.age >  that.age) return 1;
            if (this.age <  that.age) return -1;
        }
        return 0;
    }
    
    public String toString() {
        return name + " " + age;
    }
    
}