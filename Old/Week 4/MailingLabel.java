import java.util.Scanner;

public class MailingLabel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = sc.next();
        sc.nextLine();
        System.out.print("What is your Street Adress? ");
        String streetAdress = sc.nextLine();
        //sc.nextLine();
        System.out.print("What is your City and State? ");
        String cityState = sc.nextLine();
        //sc.nextLine();
        System.out.print("What is your zip code? ");
        int zip = sc.nextInt();
        sc.nextLine();
        System.out.print(name + "\t\t\t" + name + "\n");
        System.out.print(streetAdress + "\t\t" + streetAdress + "\n");
        System.out.print(cityState + " "+ zip + "\t" + cityState + " "+ zip + "\n");
        //System.out.print(zip + "\t\t\t" + zip);
        sc.close();
    }
}
