//the diffrence between a do while and a while is that a do while run the code, and then checks for a condition, and a while loop with check first before running the code
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("What number would you like to factorial? ");
        int num = sc.nextInt();
        int startnum = num;
        int finalnum = 1;
        while (num != 0){
            finalnum *= num;
            num--;
        }
        System.out.println("the factorial for the number " + startnum + "is: " + finalnum);
        
        System.out.print("WITH A DO WHILE: ");
        System.out.print("What number would you like to factorial? ");
        num = sc.nextInt();
         startnum = num;
         finalnum = 1;
        do{
            finalnum *= num;
            num--;
        }while (num != 0);
        System.out.println("the factorial for the number " + startnum + "is: " + finalnum);

    }    
}
