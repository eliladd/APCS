import java.util.Scanner;

public class QuizPractice {
    public static void main(String[] args){
        double legnth;
        double width;
        double area;
        String polyName;
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the length? ");
        legnth = sc.nextDouble();
        System.out.print("What is the width? ");
        width = sc.nextDouble();
        area = legnth * width;
        System.out.println("Area = Length * Width = " + area);
        sc.nextLine();
        System.out.print("What shape is this? ");
        polyName = sc.nextLine();
        if (polyName.equals("Square")){
            System.out.println("Correct!");
        }
        else{
            System.out.println("Incorrect!");
        }
        sc.close();

    }
}
