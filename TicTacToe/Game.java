public class Game {
    // instance variables
    private int turn;
    private int[][] table;
    int s = -1;
    
    //constructor sets up variables
    public Game(){
        table = new int[3][3];
        turn = 1;
        s= -1;
    }
    
    // method inserts X or O piece
    public void insertXO(int row, int column){
        row--;
        column--;
        if(row < 3 && column < 3){
            if(table[row][column] == 0){
                if(turn%2 == 1){
                    table[row][column] = 1;
                }
                else{
                    table[row][column] = 2;
                }
            }
        }
        
        turn++;
        
    }
    
    //method checks if table is full
    public boolean checkFull(){
        boolean full = true;
        for(int row=0; row<table.length; row++){
            for(int column=0; column<table[row].length; column++){
                if(table[row][column] == 0){
                    full = false;
                }
            }

            System.out.println();
        }     

        return full;
    }

    //method checktictactoe
    public int checkTicTacToe(){
        if (table[1+s][1+s]==table[1+s][2+s] && table[1+s][1+s]==table[1+s][3+s]){
            return table[1+s][1+s];
        }
        else if (table[2+s][1+s]==table[2+s][2+s] && table[2+s][1+s]==table[2+s][3+s]){
            return table[2+s][1+s];
        }
        else if (table[3+s][1+s]==table[3+s][2+s] && table[3+s][1+s]==table[3+s][3+s]){
            return table[3+s][1+s];
        }
        else if (table[1+s][1+s]==table[2+s][1+s] && table[1+s][1+s]==table[3+s][1+s]){
            return table[1+s][1+s];
        }
        else if (table[1+s][2+s]==table[2+s][2+s] && table[1+s][2+s]==table[3+s][2+s]){
            return table[1+s][2+s];
        }
        else if (table[1+s][3+s]==table[2+s][3+s] && table[1+s][3+s]==table[3+s][3+s]){
            return table[1+s][3+s];
        }
        else if (table[1+s][1+s]==table[2+s][2+s] && table[1+s][1+s]==table[3+s][3+s]){
            return table[1+s][1+s];
        }
        else if (table[1+s][3+s]==table[2+s][2+s] && table[1+s][3+s]==table[3+s][1+s]){
            return table[1+s][3+s];
        }
        else{
            return 0;
        }
    }
    //method print table
    public void printTable(){
        for(int row=0; row<table.length; row++){
            for(int column=0; column<table[row].length; column++){
                if(table[row][column] == 0){
                    System.out.print("*");
                }
                else if(table[row][column] == 1){
                    System.out.print("X");
                }
                else{
                    System.out.print("O");
                }
            }
            System.out.println();
        }
    }

    


    
}
