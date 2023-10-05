import java.util.Scanner;

public class TriviaGame {
    public static void main(String[] args){
        int score = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("What color is the sky? ");
        String answer1 = sc.next();
        if(answer1.equals("blue") ){
            System.out.println("good job");
            score = score + 1;
        }
        else{
            System.out.println("Sorry, wrong answer");
        }
        sc.nextLine();
        System.out.print("waht is the coders full name? ");
        String answer2 = sc.nextLine();
        if(answer2.equals("Elijah Koretsky Ladd") ){
            System.out.println("good job");
            score = score + 1;
        }
        else{
            System.out.println("Sorry, wrong answer");
        }
        //sc.nextLine();
        System.out.print("Whats my favorite color?? ");
        String answer3 = sc.next();
        if(answer3.equals("blue") ){
            System.out.println("good job");
            score = score + 1;
        }
        else{
            System.out.println(" Sorry, wrong answer");
        }
        sc.nextLine();
        System.out.print("What does AP stand for?");
        String answer4 = sc.nextLine();
        if(answer4.equals("Advanced Placement") ){
            System.out.println("good job");
            score = score + 1;
        }
        else{
            System.out.println("Sorry, wrong answer");
        }
        //sc.nextLine();
        System.out.print("what color is water?");
        String answer5 = sc.nextLine();
        if(answer5.equals("blue") ){
            System.out.println("good job");
            score = score + 1;
        }
        else{
            System.out.println("Sorry, wrong answer");
        }
        System.out.println("you got a score of " + score + "/5!");
    }
}
