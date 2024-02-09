import java.util.ArrayList;
public class Runner {
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Henery", 34));
        students.add(new Student("Jose", 21));
        students.add(new Student("Carla", 21));
        students.add(new Student("nancy", 19));

        for(Student s : students){
            if(s.getAge() == 21){
                System.out.println(s.toString());
            }
            
        }
    }
}
