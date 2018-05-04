
package computerscience30s;


public class Husky extends Student
{

    private int pride;
    
    public Husky(String name, 
                 int age, 
                 boolean isMale, 
                 int grade) {
        super(name, age, isMale, grade);
        pride = 5;
    }
    
    public void pepRally() {
        pride += 2;
    }
    
    public void defeat() {
        pride -= 1;
    }
    
    @Override
    public void talk() {
        super.talk();
        System.out.println("....My "
                + "Husky pride is " +
                pride);
    }
    

}
