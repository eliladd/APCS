package Old.Ladd_Elijah_blackjack;
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

    int red = 0, green = 0, blue = 0, total, dealerTotal, animatevar = 0, animatephase = 0, increaseSize = 0;
	//create a color
	Color background = new Color(red, green, blue);
    Font font = new Font("Bauhaus 93", Font.PLAIN, 20);
    private boolean clickable = true, ended = false, playerwin = false, dealerwin = false, tie = false, animationPlays = false;

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
        shuffle();

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

		//draw card deck
        g.setColor(Color.black);
        g.fillRect(30, 325, 100, 150);
        g.setColor(Color.white);
        g.drawRect(30, 325, 100, 150);

        if(animatephase == 2 || animatephase == 3){
            g.setColor(Color.white);
            g.fillRect(30+animatevar+increaseSize, 325, 100-animatevar, 150);
            g.setColor(Color.black);
            g.drawRect(30+animatevar+increaseSize, 325, 99-animatevar, 151);
           
        }else{
            g.setColor(Color.black);
            g.fillRect(30+animatevar, 325, 100-animatevar, 150);
            g.setColor(Color.white);
            g.drawRect(30+animatevar, 325, 100-animatevar, 150);
        }
        
        g.drawString("Deck", 40, 180+175);
        g.drawString("", 40, 210+175);
        g.drawString("Card", 40, 240+175);
         
        //draw current cards in hand
        int yIncriment = 275, xIncriment = 100;;
        for (int i = 0; i < playerCards.size(); i++){
            g.setColor(Color.white);
            g.fillRect(xIncriment+50 + 100 * i, 50+yIncriment, 100, 150);
            g.setColor(Color.black);
            g.drawRect(xIncriment+50 + 100 * i, 50+yIncriment, 100, 150);
            g.drawString(playerCards.get(i).getName(), xIncriment+60 + 100 * i, 80+yIncriment);
            g.drawString("\n of \n",xIncriment+ 60 + 100 * i, 110+yIncriment);
            g.drawString(playerCards.get(i).getSuit(),xIncriment+ 60 + 100 * i, 140+yIncriment);
        }
        
        
        //draw cards in dealers hand
        for (int i = 0; i < dealerCards.size(); i++){
            g.setColor(Color.white);
            g.fillRect(110 + 100 * i, 50, 100, 150);
            g.setColor(Color.black);
            g.drawRect(110 + 100 * i, 50, 100, 150);
            g.drawString(dealerCards.get(i).getName(), 120 + 100 * i, 80);
            g.drawString("\n of \n", 120 + 100 * i, 110);
            g.drawString(dealerCards.get(i).getSuit(), 120 + 100 * i, 140);
        }
        if(total > 21){
            ended = true;
        }
        if(!ended){
            //draw the hidden card in dealers hand
            
            g.setColor(Color.white);
            g.fillRect(110, 50, 100, 150);
            g.setColor(Color.black);
            g.drawRect(110, 50, 100, 150);
            g.drawString("card", 120, 80);
            g.drawString("", 120, 110);
            g.drawString("hidden", 120, 140);
        }
        g.setColor(Color.white);
        g.fillRect(200, 220, 160, 75);
        g.setColor(Color.black);
        g.drawRect(200, 220, 160, 75);
        //calcualte total
        total = 0;
        dealerTotal = 0;
        for (int i = 0; i < playerCards.size(); i++){
            total += playerCards.get(i).getRank();
        }
        for (int i = 0; i < dealerCards.size(); i++){
            dealerTotal += dealerCards.get(i).getRank();
        }
        if(!ended){
            int changeddealTotoal = dealerTotal-dealerCards.get(0).getRank();
            g.drawString("Dealer Total: " + changeddealTotoal, 205, 250);
            g.drawString("Player Total: " + total, 205, 280);
        }
        else{
            g.drawString("Dealer Total: " + dealerTotal, 205, 250);
            g.drawString("Player Total: " + total, 205, 280);
        }
        
        if(total > 21){
            ended = true;
        }
        //reset deck if empty
        if(deck.size() == 0){
            deck = new ArrayList<Card>();
            //create Deck
            for(int i = 0; i < name.length;i++){
                for (int j = 0; j < suits.length; j++){
                    deck.add(new Card(suits[j], name[i], rank[i])); 
                }
            }
            //shuffle the deck arraylist
            shuffle();
            System.out.println();
        }
        //draw win lose tie screens
        if (playerwin == true){
            System.out.println();
        }
    }

	


	public void shuffle(){
		//write code to shuffle your deck
        for (int i = 0; i < deck.size(); i++){
            int r = (int)(Math.random() * deck.size());
            Card temp = deck.get(i);
            deck.set(i, deck.get(r));
            deck.set(r, temp);
        }
	}

    public void dealerPlays(){
        ended = true;
        System.out.println("dealer playing");
        System.out.println("deck length: " + deck.size());
        while(dealerTotal < 17){
            dealerCards.add(deck.get(0));
            deck.remove(0);
            repaint();
            for (int i = 0; i < dealerCards.size(); i++){
                dealerTotal += dealerCards.get(i).getRank();
            }
        }
        end();
    }

    public void end(){
        System.out.println("ending");
        if(dealerTotal > 21){
            System.out.println("player wins");
            playerwin = true;
            clickable = false;
        }
        else if(dealerTotal > total){
            System.out.println("dealer wins");
            dealerwin = true;
            clickable = false;
        }
        else if(dealerTotal == total){
            System.out.println("player ties with dealer");
            tie = true;
            clickable = false;
        }
        else{
            playerwin = true;
            clickable = false;
        }
    }


	public void actionPerformed(ActionEvent e) {
        if(e.getSource() == hit){
            if (clickable){
                if ( total >= 21){
                    
                }
                else{
                    clickable = false;
                    animationPlays = true;
                    animatephase = 1;
                    
                }
            }
            if(total > 21){
                ended = true;
            }
        }
        if(e.getSource() == stand){
            //write code to end the player's turn
            if (clickable){
                System.out.println("stand!");
                dealerPlays();
            }
        }
        //write code to play again
        if(e.getSource() == playAgain){
            //reset game
            playerCards = new ArrayList<Card>();
            dealerCards = new ArrayList<Card>();
            playerCards.add(deck.get(0));
            deck.remove(0);
            playerCards.add(deck.get(0));
            deck.remove(0);
            dealerCards.add(deck.get(0));
            deck.remove(0);
            dealerCards.add(deck.get(0));
            deck.remove(0);
            clickable = true;
            ended = false;
            playerwin = false;
            dealerwin = false;
            tie = false;
        }
        repaint();
	}
    
    public void animate(){
        //System.out.println("animate");
        while(true){
            //wait for .01 second
            try {
                Thread.sleep(10);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            
            //animate the draw card
            if(animationPlays){
                if (animatephase == 1){
                    animatevar += 5;
                    if (animatevar > 200){
                        animatephase = 2;
                        
                    }
                }
                if (animatephase == 2){
                    animatevar += 5;
                    
                    if (animatevar > 100){
                        animatephase = 0;
                        
                        clickable = true;
                        animationPlays = false;
                        animatevar = 0;
                        playerCards.add(0,deck.get(0));
                    deck.remove(0);
                    }
                }
            }
            repaint();
        }
        
    }
    

}