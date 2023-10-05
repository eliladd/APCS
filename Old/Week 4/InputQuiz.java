import java.util.Scanner;

public class InputQuiz{
    public static void main(String[] args){
    //initializing scanner and variables
        Scanner sc = new Scanner(System.in) ;       
    String name;
    double pi = 3.14;
    double radius;
    //asking for name and saving it
    System.out.print("What is your name? ");
    name = sc.nextLine();
    System.out.println();
    System.out.println("Hello " + name + ", this program will calculate the area and circumference of a circle.");
    //asking for radius
    System.out.print("What is the radius? ");
    radius = sc.nextDouble();
    System.out.println("The value of pi is " + pi + " and the value of the radius is " + radius);
    //calculating area and circumfrence
    double area = pi * radius * radius;
    System.out.println("Area: " + area);
    double circumference = 2 * pi * radius;
    System.out.println("circumference: " + circumference);
    sc.close();


    }
}