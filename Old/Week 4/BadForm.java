import java.util.Scanner;
public class BadForm{ 
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("I will calculate the area of a circle. Please provide a radius: ");
        double radius =keyboard.nextDouble();
        double pi = 3.14; 
        double area = pi * radius * radius;
        System.out.println("The area of this circle is " + area); 
        keyboard.close();
    }
}