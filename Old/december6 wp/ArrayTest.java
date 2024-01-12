public class ArrayTest {
    private int numArray[];
    public ArrayTest(int size) {
        numArray = new int[size];
        for(int i = 0; i<numArray.length; i++){
			int x = (int)Math.floor(Math.random() * (9 - 0 + 1) + 0);
			numArray[i] = x;
		}
    }
    public void print(){
        //print the array on one line, when done, print a new line
        for(int i = 0; i<numArray.length; i++){
            System.out.print(numArray[i]+ " ");
        }
        System.out.println();
    }
    public double average(){
        //return the average of the values in the array
        double sum = 0;
        for(int i = 0; i<numArray.length; i++){
            sum += numArray[i];
        }
        return (sum/numArray.length);
    }
    public int getIndexOfSmallest(){
        //return the index of the smallest value in the array
        int smallest = numArray[0];
        int index = 0;
        for(int i = 0; i<numArray.length; i++){
            if(numArray[i]<smallest){
                smallest = numArray[i];
                index = i;
            }
        }
        return index;
    }
}
