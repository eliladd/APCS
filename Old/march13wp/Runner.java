public class Runner {
    public static void main(String[] args){
        int[] array = new int[]{ 1,2,3,4,5,6,7,8,9};
        OneToTwo test = new OneToTwo();
        test.print();
        test.insert(array);
        test.print();

    }
}
