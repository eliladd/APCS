//imports scanner
import java.util.Scanner;
public class Runner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Creating the object
        NestedLoops nested = new NestedLoops();
        //Calling drawFilledBox
        nested.drawFilledBox();
        //Asking the user how long and tall the box should be
        System.out.print("How long do you want your box to be?: ");
        int length = sc.nextInt();
        System.out.println();
        System.out.print("How tall do you want your box to be?: ");
        int height = sc.nextInt();
        System.out.println();
        //Calling drawFilledBox with the user parameters
        nested.drawFilledBox(length, height);
        //draws multiplicaiton table
        nested.drawMultiChart();
        //Asking the user for the height of triangle and printing out drawTriangle
        System.out.println("Enter the height of the triangle: ");
        int tallness = sc.nextInt();
        nested.drawTriangle(tallness);
    }
}
