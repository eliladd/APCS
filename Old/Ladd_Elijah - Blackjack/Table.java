
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
    private Card[] hand;
    private String[] suits = {"Heart", "Diamond", "Club", "Spade"};
    private String[] name = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    private int[] rank = {11,2,3,4,5,6,7,8,9,10,10,10,10};
    JButton hit, stand, playAgain;
    private int points = 20, drawnCards = 0;
    int red = 0, green = 0, blue = 0;
    int total = 0;
    boolean clickable = true;
	//create a color
	Color background = new Color(red, green, blue);
    Font font = new Font("Bauhaus 93", Font.PLAIN, 25);
    public Table(){
        //Create a deck of cards
        deck = new Card[52];
        points--;
        for(int i = 0; i < name.length;i++){
            for (int j = 0; j < suits.length; j++){
                deck[4* i + j] = new Card(suits[j], name[i], rank[i]);
            }
        }
        //shuffle the deck
        for (int i = 0; i < deck.length; i++){
            int r = (int)(Math.random() * deck.length);
            Card temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
        //deal the cards
        hand = new Card[11];
        hand[0] = deck[drawnCards++];
        hand[1] = deck[drawnCards++];
        
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
				
				g.fillRect(0, 0, 800, i);
				background = new Color(red, green, blue);
			}
		}
        red = 0;
		green = 0;
		blue = 0;
		background = new Color(red, green, blue);
        //draw current cards in hand
        for (int i = 0; i < drawnCards; i++){
            g.setColor(Color.white);
            g.fillRect(50 + 100 * i, 50, 100, 150);
            g.setColor(Color.black);
            g.drawRect(50 + 100 * i, 50, 100, 150);
            g.drawString(hand[i].getName(), 50 + 100 * i, 80);
            g.drawString("\n of \n", 50 + 100 * i, 110);
            g.drawString(hand[i].getSuit(), 50 + 100 * i, 140);
        }
        //draw current points
        g.setColor(Color.white);
        g.fillRect(50, 250, 120, 50);
        g.setColor(Color.black);
        g.drawRect(50, 250, 120, 50);
        g.drawString("Points: " + points, 55, 280);
        //draw total value of hand
        g.setColor(Color.white);
        g.fillRect(200, 250, 120, 50);
        g.setColor(Color.black);
        g.drawRect(200, 250, 120, 50);
        //calcualte total
        total = 0;
        for (int i = 0; i < drawnCards; i++){
            total += hand[i].getRank();
        }
        int v = 30;
        g.drawString("Total: " + total, 205, 280);
        g.drawString("16 - 1 point", 350,200+v);
        g.drawString("17 - 1 point", 350,220+v);
        g.drawString("18 - 2 points", 350,240+v);
        g.drawString("19 - 2 points", 350,260+v);
        g.drawString("20 - 3 points", 350,280+v);
        g.drawString("21 - 5 points", 350,300+v);
        //if total is over 21, print bust
        if (total > 21){
            
            g.setColor(Color.white);
            g.fillRect(500, 250, 200, 100);
            g.setColor(Color.black);
            g.drawRect(500, 250, 200, 100);
            //large font
            g.setFont(new Font("Bauhaus 93", Font.PLAIN, 50));
            g.drawString("Bust!", 520, 320);
            clickable = false;
            g.setFont(font);
            g.drawString("click play again to play again!", 450, 400);
        }

		
	
	}
    public void actionPerformed(ActionEvent e) {
        
		if (e.getSource() == hit) {
            if(clickable){
                hand[drawnCards++] = deck[drawnCards];
            }
            
		}
        if (e.getSource() == stand) {
            if(clickable){
                if (total == 16){
                    points++;
                }
                else if (total == 17){
                    points++;
                }
                else if (total == 18){
                    points += 2;
                }
                else if (total == 19){
                    points += 2;
                }
                else if (total == 20){
                    points += 3;
                }
                else if (total == 21){
                    points += 5;
                }
                clickable = false;
            }
            
            
        }
        if (e.getSource() == playAgain) {
            //reset game
            for (int i = 0; i < deck.length; i++){
                int r = (int)(Math.random() * deck.length);
                Card temp = deck[i];
                deck[i] = deck[r];
                deck[r] = temp;
            }
            drawnCards = 0;
            hand = new Card[11];
            hand[0] = deck[drawnCards++];
            hand[1] = deck[drawnCards++];
            points--;
            clickable = true;
        }
    repaint();
	}
}
