import java.util.Scanner;
public class Triangle {
    Scanner sc = new Scanner(System.in);

    public void printArea(){
        System.out.println("Give me a base: ");
        double base = sc.nextDouble();
        System.out.println("Give me a Height: ");
        double height = sc.nextDouble();
        double area = .5 * base * height;
        System.out.println("The area is: " + area);
        

    }


}
