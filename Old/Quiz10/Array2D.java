package Old.Quiz10;
public class Array2D {
    private int[][] numArr;
    public Array2D(int[][] array){
        numArr = array;
    }
    //prints the 2D array
    public void print(){
        for( int i = 0; i < numArr.length; i++){
            for( int j = 0; j < numArr[i].length; j++){
                System.out.print(numArr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
    //searches for a number and replaces it with another number
    public void searchReplace(int search, int replace){
        for( int i = 0; i < numArr.length; i++){
            for( int j = 0; j < numArr[i].length; j++){
                if(numArr[i][j]==search){
                    numArr[i][j] = replace;
                }
                
            }
            
        }
    }
    //returns the sum of a column
    public int sumColumn(int column){
        int total = 0;
        for( int j = 0; j < numArr.length; j++){
            total += numArr[j][column];
        }
        return total;
    }
}

