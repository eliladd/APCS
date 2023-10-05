import java.util.Scanner;
public class Runner{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Zoo zoo = new Zoo();
        zoo.printInfo();
        zoo.updateAge(7);
        zoo.printInfo();
        System.out.println("What type of animal?");
        String type = sc.next();
        System.out.println("How old is it?");
        int age = sc.nextInt();
        System.out.println("Whats its name?");
        String name = sc.next();
        Zoo zoo1 = new Zoo(type, age, name);
        zoo1.printInfo();
        sc.close();
    }
}