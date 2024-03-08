public class Runner {
    public static void main(String[] args){
        int[][] array = new int[6][4];
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = (int)(Math.random() * (10 - 1 + 1) + 1);
            }
        }
        NumMatrix3 test = new NumMatrix3(array);
        test.print();
        System.out.println(test.sumRow(2));
    }
}
