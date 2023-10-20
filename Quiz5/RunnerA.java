public class RunnerA {
    public static void main(String[] args){
        //instanceate class
        Quiz5 q = new Quiz5();

        //passes in 15, seperates line
        q.countDownBy3(15);
        System.out.println();

        //assigns return value and prints it
        int sumNum = q.getSummation(6);
        System.out.println(sumNum);
       
    }
}
