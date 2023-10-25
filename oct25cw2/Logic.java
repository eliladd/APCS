import java.util.Scanner;
public class Logic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean stoprun = false;
        int points = 20;
        while (stoprun == false){
            int num1 = (int)(Math.random()*5+1);
            int num2 = (int)(Math.random()*5+1);
            if (num1 == 5 && num2 ==5){
                System.out.println("you win 10 points");
                points += 10;
            }
            else if (num1 == num2){
                System.out.println("you win 3 points");
                points += 3;
            }
            else if ((num1 > 3 && num2 < 3) || (num1 < 3 && num2 > 3) ){
                System.out.println("you win 1 point");
                points += 1;
            }
            else{
                System.out.println("you lose 1 point");
                points--;
            }
            System.out.println("You have " + points + " points");
            System.out.println("Do you want to keep playing?");
            String keepPlay = sc.nextLine();
            if (keepPlay.equals("no")){
                stoprun = true;
            }

        }
    }
}
