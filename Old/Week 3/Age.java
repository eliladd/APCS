import java.util.Scanner;

public class Age {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("When were you born? ");
        int bYear = scan.nextInt();
        int age = 2023 - bYear;
        System.out.println("\nyou are " + age + " years old!");
        scan.close();

    }
}
