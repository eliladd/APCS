import java.util.ArrayList;
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
public class Table extends JPanel implements ActionListener {


    private ArrayList<Card> deck;
    private ArrayList<Card> playerCards;
    private ArrayList<Card> dealerCards;


    JButton hit, stand, playAgain;

    int red = 0, green = 0, blue = 0, total;
	//create a color
	Color background = new Color(red, green, blue);
    Font font = new Font("Bauhaus 93", Font.PLAIN, 20);

    private String[] suits = {"Heart", "Diamond", "Club", "Spade"};
    private String[] name = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    private int[] rank = {11,2,3,4,5,6,7,8,9,10,10,10,10};
    
	public Table() {
        //initialize x and y
        deck = new ArrayList<Card>();
        playerCards = new ArrayList<Card>();
        dealerCards = new ArrayList<Card>();
                //create Deck
        for(int i = 0; i < name.length;i++){
            for (int j = 0; j < suits.length; j++){
                deck.add(new Card(suits[j], name[i], rank[i])); 
            }
        }
        //shuffle the deck arraylist
        for (int i = 0; i < deck.size(); i++){
            int r = (int)(Math.random() * deck.size());
            Card temp = deck.get(i);
            deck.set(i, deck.get(r));
            deck.set(r, temp);
        }


        //shuffle

        //deal cards to the player
        playerCards.add(deck.get(0));
        deck.remove(0);
        playerCards.add(deck.get(0));
        deck.remove(0);
        //deal cards to the dealer
        dealerCards.add(deck.get(0));
        deck.remove(0);
        dealerCards.add(deck.get(0));
        deck.remove(0);

        //set up the buttons
        setLayout(null);
        hit = new JButton("Hit");
        stand = new JButton("Stand");
        playAgain = new JButton("Play Again");

        
        //add the buttons
        hit.setBounds(50, 500, 200, 50);
        stand.setBounds(250, 500, 200, 50);
        playAgain.setBounds(450, 500, 200, 50);
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
	@Override
	public Dimension getPreferredSize() {
		//Sets the size of the panel
		return new Dimension(800,600);
	}
    @Override
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
		//getWidth() and getHeight() are Dimension methods
		
        //draw current cards in hand
        int xIncriment = 0, yIncriment = 275;
        for (int i = 0; i < playerCards.size(); i++){
            g.setColor(Color.white);
            g.fillRect(50 + 100 * i, 50+yIncriment, 100, 150);
            g.setColor(Color.black);
            g.drawRect(50 + 100 * i, 50+yIncriment, 100, 150);
            g.drawString(playerCards.get(i).getName(), 60 + 100 * i, 80+yIncriment);
            g.drawString("\n of \n", 60 + 100 * i, 110+yIncriment);
            g.drawString(playerCards.get(i).getSuit(), 60 + 100 * i, 140+yIncriment);
        }
        //draw the hidden card in dealers hand
        g.setColor(Color.white);
        g.fillRect(100, 50, 100, 150);
        g.setColor(Color.black);
        g.drawRect(100, 50, 100, 150);
        g.drawString("card", 110, 80);
        g.drawString("", 110, 110);
        g.drawString("hidden", 110, 140);
        //draw cards in dealers hand
        for (int i = 1; i < dealerCards.size(); i++){
            g.setColor(Color.white);
            g.fillRect(110 + 100 * i, 50, 100, 150);
            g.setColor(Color.black);
            g.drawRect(110 + 100 * i, 50, 100, 150);
            g.drawString(dealerCards.get(i).getName(), 120 + 100 * i, 80);
            g.drawString("\n of \n", 120 + 100 * i, 110);
            g.drawString(dealerCards.get(i).getSuit(), 120 + 100 * i, 140);
        }
        g.setColor(Color.white);
        g.fillRect(200, 250, 120, 50);
        g.setColor(Color.black);
        g.drawRect(200, 250, 120, 50);
        //calcualte total
        total = 0;
        for (int i = 0; i < playerCards.size(); i++){
            total += playerCards.get(i).getRank();
        }
        int v = 30;
        g.drawString("Total: " + total, 205, 280);
	}
	


	public void shuffle(){
		//write code to shuffle your deck
	}

	public void actionPerformed(ActionEvent e) {
        if(e.getSource() == hit){
            if ( total >= 21){
                System.out.println(total);
            }
            else{
                playerCards.add(deck.get(0));
                deck.remove(0);
            }
            
        }
        if(e.getSource() == stand){
            //write code to end the player's turn
        }
        repaint();
	}

}