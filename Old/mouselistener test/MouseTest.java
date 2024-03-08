import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class MouseTest extends JPanel implements MouseListener {

    private String notificationText;

    public MouseTest() {
        notificationText = "";
        addMouseListener(this);
    }

    public Dimension getPreferredSize() {
        //Sets the size of the panel
        return new Dimension(800, 400);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //draw background
        g.setColor(Color.white);
        g.fillRect(0, 0, 800, 400);

        //Draw Box
        Color Brown = new Color(139, 69, 19);
        g.setColor(Brown);
        g.fillRect(50, 50, 100, 100);

        //Draw Text
        Font font = new Font("Arial", Font.PLAIN, 20);
        g.setFont(font);
        g.setColor(Color.red);
        g.drawString(notificationText, 50, 200);
    }


    //INCLUDE ALL METHODS OF MOUSELISTENER REGARDLESS IF  
    //YOU USE THEM OR NOT IN ORDER FOR MOUSELISTENER TO WORK!!!!
    public void mousePressed(MouseEvent e) {

        //Print location of x and y
        System.out.println("X: " + e.getX() + ", Y: " + e.getY());

        //Check if mouse pressed position is in the brown box
        if (e.getX() >= 50 && e.getX() <= 150 && e.getY() >= 50 && e.getY() <= 150) {
            notificationText = "You clicked on the brown box";
        } else {
            notificationText = "";
        }

        repaint();
    }

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {
        //Print location of x and y
        System.out.println("X: " + e.getX() + ", Y: " + e.getY());

        //Check if mouse pressed position is in the brown box
        if (e.getX() >= 50 && e.getX() <= 150 && e.getY() >= 50 && e.getY() <= 150) {
            notificationText = "You entered in the brown box";
            System.out.println("qibg");
        } else {
            notificationText = "";
        }

        repaint();
    }

    public void mouseExited(MouseEvent e) {
        //Print location of x and y
        System.out.println("X: " + e.getX() + ", Y: " + e.getY());

        //Check if mouse pressed position is in the brown box
        if (e.getX() >= 50 && e.getX() <= 150 && e.getY() >= 50 && e.getY() <= 150) {
            notificationText = "You exited the brown box";
        } else {
            notificationText = "";
        }

        repaint();
    }

    public void mouseClicked(MouseEvent e) {}



}
