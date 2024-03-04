import java.util.Scanner;
public class Runner {
    public static void main(String[] args){
        Game game = new Game();
        boolean play = true;
        int winner = 0;
        Scanner sc = new Scanner(System.in);
        while(play){
            game.printTable();
            System.out.print("Enter row:");
            int row = sc.nextInt();
            System.out.print("Enter column:");
            int column = sc.nextInt();
            game.insertXO(row, column);
            //game.printTable();
            if(game.checkTicTacToe() == 1){
                System.out.println("player x wins!");
                play = false;
            }
            else if(game.checkTicTacToe() == 2){
                System.out.println("player o wins!");
                play = false;
            }
            else if(game.checkFull() == true){
                System.out.println("Tie!");
                play = false;
            }
            
        }
        
    }
}
