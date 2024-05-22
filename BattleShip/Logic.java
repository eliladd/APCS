import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Logic  extends JPanel{
    private Player pOne; // Declare pOne outside of the constructor
    private Player pTwo; // Declare pTwo outside of the constructor
    int turn, phase;
    boolean gameOver = false;
    private Dot[][] dotList;
    

    public Logic() {
        pOne = new Player(); // Initialize pOne in the constructor
        pTwo = new Player(); // Initialize pTwo in the constructor
        phase = 0;
        dotList = new Dot[10][10];
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                dotList[i][j] = new Dot((i*60)+230, (j*60)+230, 255, 255, 255, 20);
            }
        }

    }
    public void setPhase(int p) {
        phase = p;
    }
    public int getPhase() {
        return phase;
    } 
    public void draw(Graphics g, JButton carrier,JButton battleship,JButton cruiser,JButton submarine,JButton destroyer,JButton rotate,JButton place, JTextField placex,JTextField placey) {
        g.setFont(new Font("TimesRoman", Font.PLAIN, 20)); 
        switch (phase) {
            case 0:
                //draw instructions
                g.setColor(Color.gray);
                g.fillRect(200, 200, 1520, 680);
                g.setColor(Color.white);
                g.drawString("welcome to BattleShip!", 400, 300);
                g.drawString("to go to the next screen, click the spacebar!", 400, 325);
                break;
            case 1:
                //setup for player one
                g.setColor(Color.gray);
                g.fillRect(200, 200, 1520, 680);
                g.setColor(Color.white);
                g.drawString("it is now time for player one setup. make sure player 2 is not looking", 900, 300);
                g.drawString("then place your peice by selecting the ship with the button", 900, 320);
                g.drawString("then clicking on the orentation button, then the location on the screen!", 900, 340);
                g.setColor(Color.darkGray);
                for(int i = 0; i < dotList.length; i++){
                    for(int j = 0; j < dotList[i].length; j++){
                        dotList[i][j].drawMe(g);
                    }
                }
                //draw buttons for placing ships
                carrier.setVisible(true);
                battleship.setVisible(true);
                cruiser.setVisible(true);
                submarine.setVisible(true);
                destroyer.setVisible(true);
                rotate.setVisible(true);
                place.setVisible(true);
                placex.setVisible(true);
                placey.setVisible(true);
                break;
            case 2:
                //setup for player two
                break;
            case 3:
                //player one's turn
                pOne.drawBoard(g);
                break;
            case 4:
                //player two's turn
                pTwo.drawBoard(g);
                break;
            default:
                break;
        }
    }
    public void click(int x, int y){
        System.out.println("click at " + x + " " + y + "case: "+phase);
        switch (phase) {
            case 0:
                
            case 1:
                //place the ship
                //check what dot the player clicked on
                for(int i = 0; i < dotList.length; i++){
                    for(int j = 0; j < dotList[i].length; j++){
                        if(x > dotList[i][j].getX() && x < dotList[i][j].getX() + dotList[i][j].getSize() && y > dotList[i][j].getY() && y < dotList[i][j].getY() + dotList[i][j].getSize()){
                            dotList[i][j].changeColor(100,100,100);
                            System.out.println("Square " + i + " " + j + " changed color to " + 10 + " " + 10 + " " + 10);
                        }
                    }
                }
            case 2:
                //place the ship
                break;
            case 3:
                //player one's turn
                break;
            case 4:
                //player two's turn
                break;
            default:
                break;
        }
    }
}
