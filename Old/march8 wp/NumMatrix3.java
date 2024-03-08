public class NumMatrix3 {
    private int[][] numMatrix;
    public NumMatrix3(int[][] array){
        numMatrix = array;
        
    }
    public void print(){
        for(int i = 0; i < numMatrix.length; i++){
            for(int j = 0; j < numMatrix[i].length; j++){
                System.out.print(numMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public int sumRow(int row){
        int total = 0;
        for(int i = 0; i < numMatrix[row].length;i++){
            total += numMatrix[row][i];
        }
        return total;
    }
}
