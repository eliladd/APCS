
public class ArrayQuiz {
    private int[] numArray;
    public ArrayQuiz(){
        numArray = new int[6];
        numArray[0] = 2;
        numArray[1] = 4;
        numArray[2] = 6;
        numArray[3] = 8;
        numArray[4] = 10;
        numArray[5] = 12;
    }
    public void printArray(){
        for(int i = 0; i < numArray.length;i++){
            System.out.print(numArray[i] + " ");
        }
        System.out.println();   
    }
    public int search(int num){
        for(int i = 0; i < numArray.length;i++){
            if(numArray[i]==num){
                return i;
            }
        }
        return -1;
    }
    public void scramble(){
        int temp, j;
        for (int i = 0; i<numArray.length; i++) {
            j = (int)(Math.random()*numArray.length);
            temp = numArray[j];
            numArray[j] = numArray[i];
            numArray[i] = temp;
        }
    }

    public void sort(){
        for (int i = 0; i < numArray.length - 1; i++){
            for (int j = 1; j < numArray.length - i; j++){
                if (numArray[j-1] > numArray[j]){
                    int temp = numArray[j-1];
                    numArray[j-1] = numArray[j];
                    numArray[j] = temp;
                }
            }
        }
    }
    //why does this not work?
    public void selectionSort(){
        for (int i = 0; i < numArray.length; i++){
            int minIndex = i;
            for (int j = i+1;j<numArray.length;j++){
                if (numArray[minIndex] > numArray[j]){
                    minIndex = 1;
                }
            }
            if(minIndex != i){
                int temp = numArray[minIndex];
                numArray[minIndex] = numArray[i];
                numArray[i] = temp;
            }
        }
    }
}
