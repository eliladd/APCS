public class Runner {
    public static void main(String[] args){
        ArrayQuiz quiz = new ArrayQuiz();
        quiz.printArray();
        System.out.println("Search: " + quiz.search(6));
        quiz.scramble();
        System.out.println("Scramble: ");
        quiz.printArray();
        quiz.sort();
        System.out.println("Sort: ");
        quiz.printArray();
    }
}
