import java.awt.Graphics;
import javax.swing.JPanel;

import org.w3c.dom.events.MouseEvent;

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
    public int getTurn(){
        return turn;
    }

    public void computerPlay(){
        int spotRow = (int)(Math.random()*3);
        int spotColumn = (int)(Math.random()*3);
        boolean repeat =true;

        while(repeat){
            if(table[spotRow][spotColumn]==0){
                repeat = false;
                table[spotRow][spotColumn] = 2;
            }
            else{
                spotRow = (int)(Math.random()*3);
                spotColumn = (int)(Math.random()*3);
            }
        }
        System.out.println(spotRow + " "+ spotColumn);
        turn = 1;
    }
    
    // method inserts X or O piece
    public void insertXO(int x, int y){
        if (x >= 0 && x <= 100 && y >= 0 && y <= 100) {
            System.out.println("1");
            if(turn%2 == 1){
                table[0][0] = 1;
            }
            else{
                table[0][0] = 2;
            }
        }
        if (x >= 100 && x <= 200 && y >= 0 && y <= 100) {
            System.out.println("2");
            if(turn%2 == 1){
                table[0][1] = 1;
            }
            else{
                table[0][1] = 2;
            }
        }
        if (x >= 200 && x <= 300 && y >= 0 && y <= 100) {
            System.out.println("3");
            if(turn%2 == 1){
                table[0][2] = 1;
            }
            else{
                table[0][2] = 2;
            }
        }

        if (x >= 0 && x <= 100 && y >= 100 && y <= 200) {
            System.out.println("4");
            if(turn%2 == 1){
                table[1][0] = 1;
            }
            else{
                table[1][0] = 2;
            }
        }
        if (x >= 100 && x <= 200 && y >= 100 && y <= 200) {
            System.out.println("5");
            if(turn%2 == 1){
                table[1][1] = 1;
            }
            else{
                table[1][1] = 2;
            }
        }
        if (x >= 200 && x <= 300 && y >= 100 && y <= 200) {
            System.out.println("6");
            if(turn%2 == 1){
                table[1][2] = 1;
            }
            else{
                table[1][2] = 2;
            }
        }

        if (x >= 0 && x <= 100 && y >= 200 && y <= 300) {
            System.out.println("7");
            if(turn%2 == 1){
                table[2][0] = 1;
            }
            else{
                table[2][0] = 2;
            }
        }
        if (x >= 100 && x <= 200 && y >= 200 && y <= 300) {
            System.out.println("8");
            if(turn%2 == 1){
                table[2][1] = 1;
            }
            else{
                table[2][1] = 2;
            }
        }
        if (x >= 200 && x <= 300 && y >= 200 && y <= 300) {
            System.out.println("9");
            if(turn%2 == 1){
                table[2][2] = 1;
            }
            else{
                table[2][2] = 2;
            }
        }

        
        turn=2;
        
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

            //System.out.println();
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
    public void drawGrid(Graphics g){
        g.drawLine(100, 0, 100, 300);
        g.drawLine(200, 0, 200, 300);
        g.drawLine(0, 100, 300, 100);
        g.drawLine(0, 200, 300, 200);
        for(int row=0; row<table.length; row++){
            for(int column=0; column<table[row].length; column++){
                if(table[row][column] == 1){
                    g.drawString("X", 50+column*100, 50+row*100);
                }
                else if(table[row][column] == 2){
                    g.drawString("O", 50+column*100, 50+row*100);
                }
            }
        }
    }
    
}
