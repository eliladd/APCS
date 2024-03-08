public class NumMatrix2 {
    private int[][] matrix;
    int rows, columns, count;

    public NumMatrix2(int row, int column){
        rows = row;
        columns = column;

        count = 1;
        int[][] matrix = new int[row][column];
        for (int i = 0; i <= row;i++){
            for (int x = 0; x<= column; x++){
                matrix[row-1][column-1] = count;
                count++;
            }
        }
    }
    public void print(){
        for (int i = 0; i <= rows;i++){
            for (int x = 0; x<= columns; x++){
                System.out.print(matrix[i-1][x-1] + "\t");
                count++;
            }
        }
    }
    public void printReverse(){
        for (int i = rows; i >= 0;i--){
            for (int x = columns; x>= 0; x--){
                System.out.print(matrix[i-1][x-1] + "\t");
                count++;
            }
        }
    }
    public int getValue(int row, int collumn){
        return matrix[row][collumn];
    }
}
