import java.util.Scanner;

public class Geography {
    public void go(){

        //initializing variables

        Scanner sc = new Scanner(System.in);
        String q1;
        String q2;
        String q3;
        String q4;
        String q5;
        String q6;
        String q7;
        String q8;
        String q9;
        
        String a1;
        String a2;
        String a3;
        String a4;
        String a5;
        String a6;
        String a7;
        String a8;
        String a9;
        
        String r1;
        String r2;
        String r3;
        String r4;
        String r5;
        String r6;
        String r7;
        String r8;
        String r9;

        //assigning variables

        q1 = "Where is the Eiffel Tower? ";
        q2 = "What is the largest continent? ";
        q3 = "Where is the Statue of Librity?";
        q4 = "What is the biggest contry? ";
        q5 = "What is the smallest state in the USA? ";
        q6 = "What is the Smallest contry? ";
        q7 = "What is the coldest sea on Earth?";
        q8 = "What is the oldest active volcano on Earth? ";
        q9 = "What is the Smallest Ocean? ";
        a1 = "Paris";
        a2 = "Asia";
        a3 = "New York";
        a4 = "Russia";
        a5 = "Rhode Island";
        a6 = "Vatican";
        a7 = "White Sea";
        a8 = "Mount Etna";
        a9 = "Arctic Ocean";
        int score = 0;

        //medium starting questions

        System.out.print(q4);
        r4 = sc.nextLine();
        if (r4.equals(a4)){
            System.out.println("Correct!");
            score ++;
        }
        else{
            System.out.println("Wrong!");
        }
        System.out.print(q5);
        r5 = sc.nextLine();
        if (r5.equals(a5)){
            System.out.println("Correct!");
            score ++;
        }
        else{
            System.out.println("Wrong!");
        }
        System.out.print(q6);
        r6 = sc.nextLine();
        if (r6.equals(a6)){
            System.out.println("Correct!");
            score ++;
        }
        else{
            System.out.println("Wrong!");
        }
        if (score == 3){
            //hard Questions
            System.out.print(q7);
            r7 = sc.nextLine();
            if (r7.equals(a7)){
                System.out.println("Correct!");
                score ++;
            }
            else{
                System.out.println("Wrong!");
            }
            System.out.print(q8);
            r8 = sc.nextLine();
            if (r8.equals(a8)){
                System.out.println("Correct!");
                score ++;
            }
            else{
                System.out.println("Wrong!");
            }
            System.out.print(q9);
            r9 = sc.nextLine();
            if (r9.equals(a9)){
                System.out.println("Correct!");
                score ++;
            }
            else{
                System.out.println("Wrong!");
            }
        }
        else{
            //easy questions
            System.out.print(q1);
            r1 = sc.nextLine();
            if (r1.equals(a1)){
                System.out.println("Correct!");
                score ++;
            }
            else{
                System.out.println("Wrong!");
            }
            System.out.print(q2);
            r2 = sc.nextLine();
            if (r2.equals(a2)){
                System.out.println("Correct!");
                score ++;
            }
            else{
                System.out.println("Wrong!");
            }
            System.out.print(q3);
            r3 = sc.nextLine();
            if (r3.equals(a3)){
                System.out.println("Correct!");
                score ++;
            }
            else{
                System.out.println("Wrong!");
            }
        }
        //print score
        if (score == 3){
            System.out.println("Your score is a D");
        }
        else if (score == 4){
            System.out.println("Your score is a C");
        }
        else if (score == 5){
            System.out.println("Your score is a B");
        }
        else if (score == 6){
            System.out.println("Your score is a A! good job!");
        }
        else{
            System.out.println("Your score is a F ):");
        }
        sc.close();
    }
}