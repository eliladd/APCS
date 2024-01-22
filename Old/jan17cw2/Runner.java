public class Runner {
    public static void main(String[] args){
        ArrayTest test = new ArrayTest();
        test.printNumArray();
        test.printStringArray();
        test.swapNumArray(0, 9);
        test.printNumArray();
        test.swapStringArray(1, 2);
        test.printStringArray();
        test.searchString("snake");
        test.searchString("elephant");

    }
}
