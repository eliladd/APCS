public class Runner {
    public static void main(String[] args){
        //instanceate quiz6 as q1 and q2
        Quiz6 q1 = new Quiz6(96, 95);
        Quiz6 q2 = new Quiz6(90, 75);
        //return getGrade and set to variable
        String grade1 = q1.getGrade1();
        System.out.println("you earned an " + grade1);
        String grade2 = q1.getGrade2();
        System.out.println("you earned an " + grade2);
        String grade3 = q2.getGrade1();
        System.out.println("you earned an " + grade3);
        String grade4 = q2.getGrade2();
        System.out.println("you earned an " + grade4);
    }
}
