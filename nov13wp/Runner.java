public class Runner {
    public static void main(String[] args){
        ArrayTest test = new ArrayTest(5);
        test.print();
        System.out.println();
        int numsum = test.getSum();
        System.out.println("the sum is: " + numsum);
    }
}
