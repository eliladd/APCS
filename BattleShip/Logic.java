import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;

public class Logic {
    private Player pOne; // Declare pOne outside of the constructor
    private Player pTwo; // Declare pTwo outside of the constructor
    int turn, phase;
    boolean gameOver = false;

    public Logic() {
        pOne = new Player(); // Initialize pOne in the constructor
        pTwo = new Player(); // Initialize pTwo in the constructor
        phase = 0;
        
    }
    public void setPhase(int p) {
        phase = p;
    }
    public int getPhase() {
        return phase;
    } 
    public void draw(Graphics g) {
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
}
