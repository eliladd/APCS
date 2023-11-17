public class Table {
    private int row, col;
    public Table(int aRow, int aCol){
        row = aRow;
        col = aCol;
    }
    public void printDrawBox(){
        for (int i = 1; i <= row; i++){
            for (int y = 1; y <= col; y++){
                System.out.print("X");
            }
                System.out.println();
        }
    }
}
