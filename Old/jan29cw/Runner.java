public class Runner {
    public static void main(String[] args){
        Sort q = new Sort();
        System.out.println("Unsorted Array:");
        q.printArray();
        q.sortArray();
        System.out.println("sorted Array:");
        q.printArray();
    }
}
