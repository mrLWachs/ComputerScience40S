
package computerscience30s;


public class Teacher extends Person
{

    private String room;
    
    public Student[] students;
    
    
    public Teacher(String name,
                   int age,
                   boolean isMale,
                   String room) {
        super(name,age,isMale,true);
        this.room = room;
        students = new Student[200];
    }
    
    public void teach() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                students[i].study();
            }
        }
    }
    
    @Override
    public void talk() {
        super.talk();
        System.out.println("....I teach " +
                students.length + " students:");
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                students[i].talk();
            }
        }        
    }
    
    

}
