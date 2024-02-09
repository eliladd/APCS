import java.util.Scanner;
public class Runner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scramble scramObj = new Scramble();
        int[] numArr = new int[6];
        for(int i = 0; i < numArr.length; i++){
            numArr[i] = (int)(Math.random() * 10 + 1);
        }
        scramObj.printArray(numArr);
        scramObj.scramble(numArr);
        scramObj.printArray(numArr);
        System.out.print("Enter a number to search for: ");
        int num = sc.nextInt();
        System.out.println();
        System.out.println("the number is at " + scramObj.search(num, numArr));
        scramObj.printArray(numArr);
        String[] strArr = {"cat", "dog", "fish", "bird", "turtle", "snake"};
        scramObj.printArray(strArr);
        scramObj.scramble(strArr);
        scramObj.printArray(strArr);
    }
}
