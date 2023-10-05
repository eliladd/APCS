import java.util.Scanner;
public class Circle {
    Scanner sc = new Scanner(System.in);
    private double pi = 3.14;
    private double radious = 0;

    public void setRadious(){
        System.out.println("Give me the Radious: ");
        radious = sc.nextDouble();
    }
    public void printArea(){
        double area = radious * radious * pi;
        System.out.println("The area is: " + area);
        
    }


}
