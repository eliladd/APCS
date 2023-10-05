import java.util.Scanner;
public class Runner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while (num != 12){
            //this is a comment
            num++;
            System.out.println(num);
        }
        num = 39;
        while (num != 20){
            System.out.println(num);
            num--;
        }
        num = 2;
        System.out.println(num);
        while (num != 20){
            
            num ++;
            num ++;
            System.out.println(num);
        }
        num = 15;
        while (num != -10){
            
            num -= 5;
            System.out.println(num);
        }
        System.out.print("Give me a number greater then 1: ");
        num = sc.nextInt();
        
        while (num != 1){
            System.out.println(num);
            num --;
            System.out.println("num is" + num);

        }
        System.out.println("Give me a number greater then 20");
        int target = sc.nextInt();
        System.out.println("Give me a number to count by");
        int counter = sc.nextInt();
        num = 0;
        while (target >= num){
            System.out.println(num);
            num += counter;
        }

    }    
}
