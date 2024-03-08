public class Array2DInt {
    private int[][] intArray;
    //Instantiates intArray  using the two integers passed in as the number of rows and columns. Fill the array with random integers, 1-10 inclusive.  Use Math.random().
    public Array2DInt(int num1, int num2) {
        intArray = new int[num1][num2];
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                intArray[i][j] = (int) (Math.random() * 10) + 1;
            }
        }
    }
    public void printInts(){
        for(int[] row : intArray){
            for( int num : row ){
               System.out.print( num + "");
            }
            System.out.println();
         }
    }
    public void findLargest(){
        int largeNum = intArray[0][0];
        int numRow = 0, numCollum = 0;
        for(int[] row : intArray){
            numRow++;
            for( int num : row ){
                numCollum++;
               if (num > largeNum){
                largeNum = num;
               }
            }
        }
        System.out.println("The largest number is "+largeNum+" found at row "+numRow+" and column "+numCollum);
    }
}
