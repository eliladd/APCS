import java.util.Scanner;
import java.lang.Math;

public class MathGame {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a Number: ");
    double num1 = scan.nextDouble();
    
    System.out.println("\nEnter a second number: ");
    double num2 = scan.nextDouble();

    System.out.println("\nEnter a third number: ");
    double num3 = scan.nextDouble();

    System.out.println("\nEnter a fourth number: ");
    double num4 = scan.nextDouble();

    System.out.println("\nEnter a fith number: ");
    double num5 = scan.nextDouble();

    double finalnum = num1 + num5 / (num4 * num2) - num3;
    System.out.println(num1 + " + " + num5 + " / ("+num4+" * "+num2+") - "+num3+": " + finalnum);  // Output user input
    System.out.println("Ok, that was boring, right? lets do something usefull!");

    System.out.println("give me a number to multiply: ");
    double num6 = scan.nextDouble();

    System.out.println("give me one more!: ");
    double num7 = scan.nextDouble();

    System.out.println("Ok, thanks!" + num6 +" + " + num7 + " = "+ (num6+num7)+ "!");

    System.out.println("What else should i do?");
    System.out.println("Aha!");
    System.out.println("What about this?");
    System.out.println("Lets find the hypotnuse of a triangle!");

    System.out.println("give me the shortest side: ");
    double num8 = scan.nextDouble();

    System.out.println("give me the 2nd shortest side: ");
    double num9 = scan.nextDouble();

    System.out.println("Ok, thanks! " + num8 +"^2 + " + num9 + "^2 = "+ ((num8*num8)+(num9*num9))+ "!");
    System.out.println("the square root of " + ((num8*num8)+(num9*num9)) + " is: "+ Math.sqrt((num8*num8)+(num9*num9)));
    System.out.println("Thanks for doing math with me! ");
    scan.close();

    }
}
