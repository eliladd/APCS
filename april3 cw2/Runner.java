public class Runner {
    public static void main(String[] args) {
        int[] ary = {3, 5, 6, 8, 10, 13, 14};
        BinarySearch search = new BinarySearch();
        search.resetPass();
        System.out.println(search.binarySearch(ary, 5,0,6));
        System.out.println("it took " + search.getPass()+ " passes");
        search.resetPass();
        System.out.println(search.binarySearch(ary, 14,0,6));
        System.out.println("it took " + search.getPass()+ " passes");
        search.resetPass();
        System.out.println(search.binarySearch(ary, 99,0,6));
        System.out.println("it took " + search.getPass()+ " passes");
    }
}
