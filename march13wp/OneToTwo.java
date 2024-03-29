public class OneToTwo {
    private int[][] numMatrix;
    public OneToTwo(){
        numMatrix = new int[3][3];
    }
    public void print(){
        for(int i = 0; i<numMatrix.length;i++){
            for (int j = 0; j<numMatrix[i].length;j++){
                System.out.print(numMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    /*int count = 1;
        for(int i = 0; i<numMatrix.length;i++){
            for (int j = 0; j<numMatrix[i].length;j++){
                numMatrix[i][j] = num[count-1];
                count++;
            }
        } */
    public void insert(int[] num){
        int count = 0;
        for(int i = 0; i<numMatrix.length;i++){
            for (int j = 0; j<numMatrix[i].length;j++){
                numMatrix[i][j] = num[count];
                count++;
            }
        }
        
    }
}
