public class Runner {
    public static void main(String[] args){
        int row = (int)Math.floor(Math.random() * (10 - 1 + 1) + 1);
        System.out.println(row);
        int col = (int)Math.floor(Math.random() * (10 - 1 + 1) + 1);
        System.out.println(col);
        Table draw = new Table(row, col);
        draw.printDrawBox();
    }
}
