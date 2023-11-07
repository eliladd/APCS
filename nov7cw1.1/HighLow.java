import java.util.Scanner;
public class HighLow {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, guesses = 0, guess = 0, max = 100, min = 1;
        boolean playing = true;
        String playagain, input;
        while (playing){
            guesses++;
            guess = (int)Math.floor(Math.random() * (max - min + 1) + min);
            System.out.print("My number is " + guess + "! Did i get that right(r), is it too high(h), or is it too low(l)? ");
            input = sc.next();
            if (input.equals("r")){
                System.out.println("Yay! i got it in " + guesses + " trys!");
                System.out.println("Do you want to play again? (y/n)");
                playagain = sc.next();
                if (playagain.equals("y")){
                    guesses = 0;
                }
                else{
                    System.out.println("Bye Bye! Lets play again soon!");
                    playing = false;
                }
            }
            else if (input.equals("h")){
                max = guess;
            }
            else if (input.equals("l")){
                min = guess;
            }
            else{
                break;
            }
            

        }
    }
}