import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("What number would you like to factorial? ");
        int num = sc.nextInt();
        int finalnum = 1;
        while (num != 0){
            finalnum *= num;
            num--;
        }
        System.out.println(finalnum);

    }    
}
