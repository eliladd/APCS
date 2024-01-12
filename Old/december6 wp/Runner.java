import java.lang.reflect.Array;

public class Runner {
    public static void main(String[] args) {
        ArrayTest thing = new ArrayTest(5);
        thing.print();
        System.out.println("the average is: " + thing.average());
        System.out.println("the index of the smallest value is: " + thing.getIndexOfSmallest());
    }
}
