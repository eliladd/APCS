import java.util.Scanner;
public class BuildSentence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Give me a verb: ");
        String verb = sc.next();
        System.out.print("Give me a singular noun: ");
        String noun = sc.next();
        String sentence = "The " + noun + " " + verb + "s";
        System.out.print(sentence);
        sc.close();
    }    
}
