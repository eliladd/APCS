public class Runner {
    public static void main(String[] args){
        //instantiate an ArrayQuiz with a size of 8
        ArrayQuiz quiz = new ArrayQuiz(8);
        quiz.print();
        System.out.println();
        System.out.println("The element at index location 4 is: " + quiz.getNum(4));
        System.out.println("The largest element in the array is: " + quiz.getLargest());

    }
}
