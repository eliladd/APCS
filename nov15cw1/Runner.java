import java.util.Scanner;
public class Runner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ForEach test = new ForEach();
        int[] intArray;
        intArray  = new int[10];
        for (int i=0; i<10;i++){
            //System.out.println("x");
            intArray[i] = (int)Math.floor(Math.random() * (99 - 1 + 1) + 1);
        }
        test.printArray(intArray);
        System.out.println("give me a number: ");
        int number = sc.nextInt();
        if (test.search(number, intArray) == true){
            System.out.println("I found the number!");
        }
        else{
            System.out.println("I did not find the number!");
        }
        int largestnum = test.findLargest(intArray);
        System.out.println("the largest number is " + largestnum);
        String[] strArray = {"dog", "bird", "cat", "bear", "cow"};
        test.printArray(strArray);
        System.out.println("give me an animal name: ");
        String animal = sc.next();
        
        if (test.search(animal, strArray) == true){
            System.out.println("I found the animal!");
        }
        else{
            System.out.println("I did not find the animal!");
        }
        

    }
}
