import java.util.Scanner;
public class Trivia {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Math math = new Math();
        Geography geography = new Geography();
        System.out.println("Would you like to Study Math(1) or geography(2)?");
        int type = sc.nextInt();
        if (type == 1){
            math.go();
        }
        else if (type == 2){
            geography.go();
        }
        else{
            System.out.println("Thats not an option!");
        }

    }
}