import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.awt.Dimension;

public class Scenery extends JPanel {
	Color sky = new Color(135, 206, 235);
	Color ground = new Color(213,207,207);
	
	int cloudX = 0;
	int moonX = 0;
	boolean right = true;
	boolean groundDrawn = false;
	
	
	public Scenery() {
		
	}
	@Override
	public Dimension getPreferredSize() {
		//Sets the size of the panel
		return new Dimension(800,600);
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		// Create a method for each item that you draw
		drawBackground(g);
		drawHouses(g);
		drawStores(g);
	}
	private void drawBackground(Graphics g){
		g.setColor(sky);
		g.fillRect(0, 0, 800, 600);
		g.setColor(ground);
		g.fillRect(0, 200, 800, 600);

	}
	private void drawHouses(Graphics g){
		for (int x = 0; x < 200; x+=50){
			for (int y = 200; y < 400; y+=50){
				g.setColor(Color.BLUE);
				g.fillRect(x, y, 40, 30);
				int [] houseRoofX = {x, x+40, x+20};
				int [] houseRoofY = {y, y, y-20};
				g.setColor(Color.darkGray);
				g.fillPolygon(houseRoofX, houseRoofY, 3);
			}
		}
		g.setColor(Color.darkGray);
	}
	private void drawStores(Graphics g){
		for (int x = 200; x < 600; x+=150){
			for (int y = 400; y < 800; y+=70){
				g.setColor(Color.green);
				g.fillRect(x, y, 100, 50);
				int [] storeWindowX = {x+10, x+30, x+10, x+30};
				int [] storeWindowY = {y+20, y+400, y+20, y+100};
				g.setColor(Color.BLUE);
				g.fillPolygon(storeWindowX, storeWindowY, 4);
			}
		}
		
	}
	public void moveClouds() {
        /* if the rectangle is about to fall off the right side
           of the screen, reset x to it's starting position. */
        if (cloudX>800) {
            cloudX = -500;
        }
        else {
            cloudX++;   // Move the rectangle one to the right
                     // Change how much you add to increase/decrease the speed
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
            
            
            /* Repaint the graphics drawn. You MUST have this in your code
              because each time an object is moved, the panel needs to 
              be updated. */
            repaint();
        }
    }
}