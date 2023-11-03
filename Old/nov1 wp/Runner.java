public class Runner {
    public static void main(String[] args){
        ForTest test = new ForTest();
        test.printNums(5, 20);
        System.out.println("Factorial: ");
        System.out.println(test.getFactorial(5));
    }
}
