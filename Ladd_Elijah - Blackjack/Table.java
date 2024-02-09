
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Table extends JPanel implements ActionListener{
    private Card[] deck;
    private String[] suits = {"Heart", "Diamond", "Club", "Spade"};
    private String[] name = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    private int[] rank = {11,2,3,4,5,6,7,8,9,10,10,10,10};
    JButton hit, stand, playAgain;
    private int points = 20;
    int red = 0, green = 0, blue = 0;
	//create a color
	Color background = new Color(red, green, blue);
    Font font = new Font("Bauhaus 93", Font.PLAIN, 25);
    public Table(){
        //Create a deck of cards
        deck = new Card[52];
        for(int k = 0; k < 52; k++){
            for(int i = 0; i < name.length;i++){
                for (int j = 0; j < suits.length; j++){
                    deck[k] = new Card(suits[j], name[i], rank[i]);
                }
            }
        }
        //set up buttons
		hit = new JButton("Hit");
        stand = new JButton("Stand");
        playAgain = new JButton("Play Again");

        setLayout(null);

        //set the position and size of buttons
        hit.setBounds(50, 350, 200, 50);
        stand.setBounds(150, 400, 200, 50);
        playAgain.setBounds(250, 450, 200, 50);
        hit.setFont(font);
        stand.setFont(font);
        playAgain.setFont(font);
        add(hit);
        add(stand);
        add(playAgain);
        setFocusable(true);	
        hit.addActionListener(this);
        stand.addActionListener(this);
        playAgain.addActionListener(this);

    }
    public Dimension getPreferredSize(){
		//Sets the size of the panel
		return new Dimension(800,600);
	}
    public void paintComponent(Graphics g){
		super.paintComponent(g);
        g.setFont(font);
        //gradeint background
        for(int i = 800; i > 0; i-=5){
			g.setColor(background);
			
			if (red < 255 && green < 255 && blue < 255){
				g.setColor(background);
				red += 1;
				green += 1;
				blue += 1;
				System.out.println(red+" " +green+" " +blue+ " i= "+i);
				g.fillRect(0, 0, 800, i);
				background = new Color(red, green, blue);
			}
		}
        red = 0;
		green = 0;
		blue = 0;
		background = new Color(red, green, blue);
        //draw the buttons

		
	
	}
    public void actionPerformed(ActionEvent e) {
        /* 
		if (e.getSource() == firstName) {
			
		}
        */
		repaint();

	}
}
