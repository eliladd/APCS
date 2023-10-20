public class Runner {
    public static void main(String[] args) {
        Count count = new Count(50);

        int sum5 = count.getSum(5);
        System.out.println("The sum of the numbers from 0 to 50, counting by 5 is: " + sum5);

        int sum9 = count.getSum(9);
        System.out.println("The sum of the numbers from 0 to 50, counting by 9 is: " + sum9);
    }
}