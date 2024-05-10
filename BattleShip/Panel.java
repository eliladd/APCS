import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;


public class Panel extends JPanel {
	
    // Instance variables here
    int moveSea = 0;
    boolean moveUp = true;
    Color sky = new Color(135, 205, 225);
    Color sea = Color.BLUE;
    Color darkGrey = new Color(169, 169, 169);
    // Constructor
	public Panel() {
		
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
        drawBoard(g);


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
    private void drawBoard(Graphics g) {
        //draw the board
        g.setColor(Color.gray);
        g.fillRect(200, 200, 1520, 680);
        //draw the grid
        g.setColor(Color.darkGray);
        //draw the player ship board
        for (int x = 0; x < 10; x+=1) {
            for (int y = 0; y <10; y+=1) {
                g.fillOval(250+ x*62,250 + y*62, 20, 20);
            }
        }
        //draw the enemy ship board
        for (int x = 0; x < 10; x+=1) {
            for (int y = 0; y <10; y+=1) {
                g.fillOval(1050+ x*62,250 + y*62, 20, 20);
            }
        }
        //write the player and enemy labels
        //set size of text
        g.setFont(g.getFont().deriveFont(30.0f));
        g.setColor(Color.white);
        g.drawString("your ships", 250, 200);
        g.drawString("your intel", 1050, 200);
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
}