import java.awt.Color;
import java.awt.Graphics;

public class Player {
    //2d array of the player's ships
    private int[][] playerShips = new int[10][10];
    //2d array of the player's intel
    private int[][] playerIntel = new int[10][10];
    //constructor
    public Player() {
        //initialize the player's ships and intel
        for (int x = 0; x < 10; x+=1) {
            for (int y = 0; y < 10; y+=1) {
                playerShips[x][y] = 0;
                playerIntel[x][y] = 0;
            }
        }
    }
    //get the player's ships
    public int[][] getPlayerShips() {
        return playerShips;
    }
    //get the player's intel
    public int[][] getPlayerIntel() {
        return playerIntel;
    }
    public void drawBoard(Graphics g) {
        //draw the board
        g.setColor(Color.gray);
        g.fillRect(200, 200, 1520, 680);
        //draw the grid
        g.setColor(Color.darkGray);
        //draw the player ship board
        for (int x = 0; x < 10; x+=1) {
            for (int y = 0; y <10; y+=1) {
                g.fillOval(250+ x*62,250 + y*62, 20, 20);
                if(playerShips[x][y] == 1){
                    g.setColor(Color.green);
                    g.fillOval(250+ x*62,250 + y*62, 20, 20);
                    g.setColor(Color.darkGray);
                }
            }
        }
        //draw the enemy ship board
        for (int x = 0; x < 10; x+=1) {
            for (int y = 0; y <10; y+=1) {
                g.fillOval(1050+ x*62,250 + y*62, 20, 20);
            }
        }
        //write the player and enemy labels
        //set size of text
        g.setFont(g.getFont().deriveFont(30.0f));
        g.setColor(Color.white);
        g.drawString("your ships", 250, 200);
        g.drawString("your intel", 1050, 200);
    }
    //place a ship
    public void placeShip(Ship ship) {
        //get the ship's x and y
        int x = ship.getX();
        int y = ship.getY();
        //get the ship's length
        int length = ship.getLength();
        //get the ship's rotation
        boolean rotate = ship.getRotate();
        //if the ship is not rotated
        if (!rotate) {
            //place the ship
            for (int i = 0; i < length; i+=1) {
                playerShips[x+i][y] = 1;
            }
        }
        //if the ship is rotated
        else {
            //place the ship
            for (int i = 0; i < length; i+=1) {
                playerShips[x][y+i] = 1;
            }
        }
    }
    //resive hits
    public boolean receiveHit(int x, int y) {
        //if the player has a ship at the location
        if (playerShips[x][y] == 1) {
            //set the player's intel to 1
            playerIntel[x][y] = 1;
            //check if ship is destroyed
            return true;
        }
        //if the player does not have a ship at the location
        else {
            //set the player's intel to 2
            playerIntel[x][y] = 0;
            return false;
        }
    }
}