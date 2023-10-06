import java.util.Scanner;
public class Runner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Give me a number greater then 1: ");
        int num = sc.nextInt();
        int finalnum = 0;
        while (num >= 1){
            finalnum += num;
            num--;
        }
        System.out.println(finalnum);
    }
}
