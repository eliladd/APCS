import java.util.Scanner;
public class Runner {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        System.out.println("What is your name? ");
        String name = sc.nextLine();
        System.out.println("What is your age? ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("What is your favorite subject?(History, Math, Science) ");
        String subject = sc.nextLine();
        System.out.println("What is your favorite hobby?(Running, Painting)? ");
        String hobby = sc.nextLine();
        System.out.println("What is your favorite food?(Sushi, Pizza)? ");
        String food = sc.nextLine();
        Profile profile = new Profile(name, age, subject, hobby, food);
        profile.printinfo();
        System.out.println("do you want to try again?(y/n) ");
        String again = sc.nextLine();
        if (again.equals("n")){
            running = false;
        }
        while(running){
            System.out.println("What is your name? ");
             name = sc.nextLine();
            System.out.println("What is your age? ");
             age = sc.nextInt();
             sc.nextLine();
            System.out.println("What is your favorite subject?(History, Math, Science) ");
             subject = sc.nextLine();
            System.out.println("What is your favorite hobby?(Running, Painting)? ");
             hobby = sc.nextLine();
            System.out.println("What is your favorite food?(Sushi, Pizza)? ");
             food = sc.nextLine();
            profile.printinfo();
            
            profile.updateProfile(name, age, subject, hobby, food);
            System.out.println("do you want to try again?(y/n) ");
            again = sc.nextLine();
            if (again.equals("n")){
                running = false;
            }
        }
        
        
    }
}
