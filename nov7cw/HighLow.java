import java.util.Scanner;
public class HighLow {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, guesses = 0, guess = 0 ;
        boolean playing = true;
        String playagain;
        while (playing){
            num = (int)Math.floor(Math.random() * (100 - 1 + 1) + 1);
            while (guess != num){
                guesses++;
                System.out.print("Guess: ");
                guess = sc.nextInt();
                if (guess == num){
                    System.out.println("You got it in " + guesses + " guesses!");
                    System.out.println("Are you going to play again?(y/n) ");
                    playagain = sc.next();
                    if (playagain.equals("y")){
                        guesses = 0;
                    }
                    else{
                        playing = false;
                    }
                }
                else{
                    if (guess > num){
                        System.out.println("the number is lower then " + guess); 
                        System.out.println("guesses: " + guesses); 
                    }
                    else{
                        System.out.println("the number is higher then " + guess); 
                        System.out.println("guesses: " + guesses); 
                    }
                }
            }

        }
    }
}
