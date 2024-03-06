import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;


public class Screen extends JPanel implements MouseListener{
    private Game game;
    boolean clickable;

	// Initialization Constructor
	public Screen() {
        game = new Game();
        addMouseListener(this);
        clickable = true;
	}
	
	//set the size of the JPanel container
	@Override
	public Dimension getPreferredSize(){
		return new Dimension(800,600);
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
        
        game.drawGrid(g);
        if(game.getTurn() == 1){
            clickable = true;
        }
        if(game.getTurn() == 2){
            clickable = false;
            game.computerPlay();
            
        }
        //game.printTable();
		game.drawGrid(g);
        if(game.checkTicTacToe() == 1){
            System.out.println("player wins!");
        }
        else if(game.checkTicTacToe() == 2){
            System.out.println("Computer wins!");
        }
        else if(game.checkFull()){
            System.out.println("Tie!");
        }
		repaint();
	}
	
	//INCLUDE ALL METHODS OF MOUSELISTENER REGARDLESS IF  
    //YOU USE THEM OR NOT IN ORDER FOR MOUSELISTENER TO WORK!!!!
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed");
        int x = e.getX();
        int y = e.getY();
        if(clickable){
            game.insertXO(x, y);
        }
        

        repaint();
    }

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    public void mouseClicked(MouseEvent e) {}
}