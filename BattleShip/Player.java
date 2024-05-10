package BattleShip;

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
    //resive hits
    public playerIntel receiveHit(int x, int y) {
        //if the player has a ship at the location
        if (playerShips[x][y] == 1) {
            //set the player's intel to 1
            playerIntel[x][y] = 1;
        }
        //if the player does not have a ship at the location
        else {
            //set the player's intel to 2
            playerIntel[x][y] = 2;
        }
    }
}
