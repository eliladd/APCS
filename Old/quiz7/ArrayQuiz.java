
public class ArrayQuiz {
    private int numArray[];
    public ArrayQuiz(int num){
        //set array to size thats passed in and set it with numbers 1-10
        numArray = new int[num];
        for (int i=0;i<numArray.length;i++){
            numArray[i] = (int) (Math.random() * 10) + 1;
        }
    }
    public void print(){
        //Print the array using a for-each loop
        for (int i : numArray){
            System.out.print(i + " ");
        }
    }
    public int getNum(int num){
        //return the number at the index of num
        return numArray[num];
    }
    public int getLargest(){
        int large = 0;
        for(int i = 0; i<numArray.length;i++){
            if (numArray[i] > large){
                large = numArray[i];
            }
        }
        return large;
    }
}
