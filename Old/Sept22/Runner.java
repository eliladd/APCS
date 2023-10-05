import java.util.Scanner;
public class Runner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Rect  obj1 = new Rect();
        obj1.calcArea();
        Rect  obj2 = new Rect(5, 2);
        obj2.calcArea();
        obj2.calcArea(6, 2);


    }
}
