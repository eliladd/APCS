//import 
import java.util.Scanner;
public class Runner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Animal aObj = new Animal();
        Animal aObj2 = new Animal();
        System.out.print("What is the animal? ");
        String str = sc.next();
        System.out.print("What is the animals age? ");
        int agevar = sc.nextInt();
        aObj.setVariables(str, agevar);
        aObj.printInfo();
        aObj2.setVariables("horse", 7);
        aObj2.printInfo();
    }
}
