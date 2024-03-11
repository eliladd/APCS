package Old.Quiz10;
public class Runner {
    public static void main(String[] args){
        int[][] myArr = new int[4][5];
        //fill MyArr with random numbers
        for(int i = 0; i < myArr.length; i++){
            for(int j = 0; j < myArr[i].length; j++){
                myArr[i][j] = (int)(Math.random() * 10);
            }
        }
        
        
        Array2D quiz10 = new Array2D(myArr);
        quiz10.print();
        quiz10.searchReplace(5, -5);
        quiz10.print();
        System.out.println("the sum of column 4 is " + quiz10.sumColumn(4));
    }
}
