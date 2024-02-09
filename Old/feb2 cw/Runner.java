public class Runner {
    public static void main(String[] args){
        ArrList test = new ArrList();
        test.print();
        int largest = test.searchLargest();
        System.out.println("Largest: " + largest);
        test.searchAndReplace(largest);
        test.print();
        test.searchAndRemove(1000);
        test.print();
        //System.out.println("scramble");
        test.scramble();
        test.print();
    }
    



}
