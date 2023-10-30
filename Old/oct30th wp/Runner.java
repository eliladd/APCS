import java.util.Scanner;
public class Runner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int g1 = sc.nextInt();
        int g2 = sc.nextInt();
        int g3 = sc.nextInt();
        Grade grader = new Grade(g1,g2,g3);
        boolean passed = grader.checkPass();
        if (passed == true){
            System.out.println("you passed!");
        }
        else{
            System.out.println("you failed!");
        }
    }
    
}
