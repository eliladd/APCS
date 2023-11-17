import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.awt.Dimension;

public class Scenery extends JPanel {
	int r = 135, g = 206, b = 235;
	Color currentSkyColor = new Color(r, g, b);
	Color ground = new Color(213,207,207);
	Color bark = new Color(102, 73, 58);
	Color darkGreen = new Color(102, 200, 58);

	
	int cloudX = 0;
	int celestialX = 0;
	int time = 0;
	boolean day = true;
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
		drawTrees(g);
		drawSun(g);
	}
	private void drawBackground(Graphics g){
		g.setColor(currentSkyColor);
		
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
				int [] storeWindowX = {x+10, x+60, x+60, x+10};
				int [] storeWindowY = {y+20, y+20, y+40, y+40};
				g.setColor(Color.BLUE);
				g.fillPolygon(storeWindowX, storeWindowY, 4);
				g.setColor(Color.black);
				g.fillRect(x+70, y+10, 20, 40);
			}
		}
		
	}
	private void drawTrees(Graphics g){
			g.setColor(darkGreen);
			g.fillRect(600, 200, 200, 225);
		for (int x = 600; x < 800; x+=75){
			for (int y = 200; y < 400; y+=100){
				g.setColor(bark);
				g.fillRect(x+7, y+50, 25, 60);
				int [] treeCanopyX = {x-20, x+17, x+50};
				int [] treeCanopyy = {y+50, y, y+50};
				g.setColor(Color.green);
				g.fillPolygon(treeCanopyX, treeCanopyy, 3);
			}
		}
	}
	private void drawSun(Graphics g){
		if (day){
			g.setColor(Color.yellow);
			g.fillOval(-50 + celestialX, 100, 50, 50);
		}
		if (!day){
			g.setColor(Color.gray);
			g.fillOval(-50 + celestialX, 100, 50, 50);
			g.setColor(currentSkyColor);
			g.fillOval(-40 + celestialX, 102, 45, 45);
		}
	}
	public void moveClouds(){
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
            celestialX ++;
			if (celestialX > 840){
				celestialX = 0;
				if (day){
					day = false;
				}
				else{
					day = true;
				}
			}
            if (celestialX > 650 && day){
				//turn night
				

				if (r >=19){
					r--;
				}
				if (g >=24){
					g--;
				}
				if (b >=98){
					b--;
				}
				
			}
			else if (celestialX > 650 && !day){
				//turn day
				if (r <=135){
					r++;
				}
				if (g <=206){
					g++;
				}
				if (b <=235){
					b++;
				}
			}
			currentSkyColor = new Color(r,g,b);
            /* Repaint the graphics drawn. You MUST have this in your code
              because each time an object is moved, the panel needs to 
              be updated. */
            repaint();
        }
    }
}
	/*

		Color sky = new Color(135, 206, 235);

		Color nightSky = new Color(19,24,98);

		Color currentSkyColor = new Color(r, g, b);

		19 <= r <= 135
		24 <= g <= 206
		98 <= b <= 235

		decrease by -1

	*/