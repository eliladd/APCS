import java.util.Scanner;

public class Math {
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

        q1 = "What is the volume of a cube with a length and width of 7 and a height of 12? ";
        q2 = "What is the area of the triangle with a base of 5 and a height of 4? ";
        q3 = "Calculate the area of a rectangle with a length of 10 units and a width of 4 units. ";
        q4 = "What is the area of a circle with a radious of 7? ";
        q5 = "A car travels at a speed of 60 miles per hour. How far will it travel in 2.5 hours? ";
        q6 = "What is the circumference of a circle with the radious of 3? ";
        q7 = "Solve the following system of equations for x:\r\n" + //
                "2x + y = 8\r\n" + //
                "x - 2y = 3";
        q8 = "What is the volume of a cylinder with a radious of 23 and a height of 5.5? ";
        q9 = "what is 4325 times 8743? (no calculator)";
        a1 = "599==88";
        a2 = "10";
        a3 = "40";
        a4 = "153.94";
        a5 = "150";
        a6 = "18.85";
        a7 = "3.8";
        a8 = "9140.46";
        a9 = "37813475";
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