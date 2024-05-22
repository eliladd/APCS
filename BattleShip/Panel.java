import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
// import KeyListener classes
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel implements KeyListener, MouseListener, ActionListener{
	
    // Instance variables here
    int moveSea = 0;
    boolean moveUp = true;
    Color sky = new Color(135, 205, 225);
    Color sea = Color.BLUE;
    Color darkGrey = new Color(169, 169, 169);
    JButton carrier, battleship, cruiser, submarine, destroyer, rotate, place;
    JTextField placex, placey;
    Logic logic = new Logic();
    // Constructor
	public Panel() {
		setFocusable(true); 
        carrier = new JButton("Carrier");
        battleship = new JButton("Battleship");
        cruiser = new JButton("Cruiser");
        submarine = new JButton("Submarine");
        destroyer = new JButton("Destroyer");
        rotate = new JButton("Rotate");
        place = new JButton("Place");

		// Instantiate the textfield
		placex = new JTextField("x-grid location of front of ship");
        placey = new JTextField("y-grid location of front of ship");
        setLayout(null);
        carrier.setBounds(100, 100, 100, 50);
        battleship.setBounds(100, 200, 100, 50);
        cruiser.setBounds(100, 300, 100, 50);
        submarine.setBounds(100, 400, 100, 50);
        destroyer.setBounds(100, 500, 100, 50);
        rotate.setBounds(100, 600, 100, 50);
        place.setBounds(100, 700, 100, 50);
        placex.setBounds(100, 800, 100, 50);
        placey.setBounds(100, 900, 100, 50);

        add(carrier);
        add(battleship);
        add(cruiser);
        add(submarine);
        add(destroyer);
        add(rotate);
        add(place);
        add(placex);
        add(placey);
        carrier.addActionListener(this);
        battleship.addActionListener(this);
        cruiser.addActionListener(this);
        submarine.addActionListener(this);
        destroyer.addActionListener(this);
        rotate.addActionListener(this);
        place.addActionListener(this);
        carrier.setVisible(false);
        battleship.setVisible(false);
        cruiser.setVisible(false);
        submarine.setVisible(false);
        destroyer.setVisible(false);
        rotate.setVisible(false);
        place.setVisible(false);
        placex.setVisible(false);
        placey.setVisible(false);
		// add Key listener
		addKeyListener(this);

        
	}

    // You do not have to change this.
	@Override
	public Dimension getPreferredSize() {
		//Sets the size of the panel
		return new Dimension(1920,1080);
        
	}

    // Do not remove the super call. Add all drawing calls here
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		// Call your drawing methods from here. 
		// You need to pass 'g'
		drawBackground(g);
        logic.draw(g, carrier, battleship, cruiser, submarine, destroyer, rotate, place, placex, placey);


	}


	// You will have one method for each different element that you draw.
	private void drawBackground(Graphics g) {
		// Code that draws something
        //draw the sky
        //create sky color
        g.setColor(sky);
        g.fillRect(0, 0, 1920, 900);
        //draw the sea
        g.setColor(sea);
        g.fillRect(0, 300+moveSea, 1920, 1080);
        //draw waves
        g.setColor(Color.WHITE);
        for (int i = 0; i < 1920; i+=20) {
            g.drawLine(i, 300+moveSea, i+10, 1080);
        }

	}
    
    public void animate(){
        while(true){
            //wait for .01 second
            try {
                Thread.sleep(10);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            
            // You add code here. moveRectangle is called continously to simulate movement
            //move the sea up and down rythmicly
            if (moveUp) {
                moveSea++;
                if(moveSea == 50){
                    moveUp = false;
                }
            } else {
                moveSea--;
                if(moveSea == 0){
                    moveUp = true;
                }
            }
            /* Repaint the graphics drawn. You MUST have this in your code
              because each time an object is moved, the panel needs to 
              be updated. */
            repaint();
        }
    }
    public void keyPressed(KeyEvent e){
		// testing
		System.out.println(e.getKeyCode());

		//interpret key clicks
		if (e.getKeyCode() == 32){   // up arrow
			if(logic.getPhase() == 0){
                logic.setPhase(1);
            }
		}
		
		
	}


	// You must have method signatures for all methods that are
	// part of an interface.
	public void keyReleased(KeyEvent e){}
	public void keyTyped(KeyEvent e){}
    public void mouseClicked(java.awt.event.MouseEvent e){
        logic.click(e.getX(), e.getY());
    }
    public void mouseEntered(java.awt.event.MouseEvent e){}
    public void mouseExited(java.awt.event.MouseEvent e){}
    public void mousePressed(java.awt.event.MouseEvent e){}
    public void mouseReleased(java.awt.event.MouseEvent e){}

    public void actionPerformed(ActionEvent event) {
		
	
		repaint();

	}
    
}