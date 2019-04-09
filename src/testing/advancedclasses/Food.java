

package testing.advancedclasses;


public abstract class Food 
{
    
    protected int taste;
    public static final String[] GROUPS =
    {
        "grains",
        "fruits and veggies",
        "meats",
        "dairy"
    };
    private int group;
    
    public Food(int group) {
        taste = 0;      
        this.group = group;
    }
    
    public void rot() {
        System.out.println("Stinks!");
    }

    
    
}
