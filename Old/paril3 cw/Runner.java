public class Runner {
    public static void main(String[] args) {
        MyMath math = new MyMath();
        math.countdown(5);
        math.countUp(10);
        System.out.print(math.factorial(5));
        System.out.println();
        System.out.print(math.summation(5));
    }
}
