import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;

// This class creates and draws a rainy day scene on a JPanel
public class RainyDay extends JPanel{

	// Declare a RainDrop object
	private RainDrop[] rain;
	private Tree[] tre;
	Color ground = new Color(139,69,19);
	// Constructor that initializes a RainyDay object
	public RainyDay() {
		rain = new RainDrop[999];
		tre = new Tree[10];
		//instanseate each raindrop
		for(int i = 0; i<rain.length; i++){
			int x = (int)Math.floor(Math.random() * (800 - 0 + 1) + 0);
			int y = (int)Math.floor(Math.random() * (600 - 0 + 1) + 0);
			rain[i] = new RainDrop(x,y);
		}
		for(int i = 0; i<tre.length; i++){
			int x = (int)Math.floor(Math.random() * (800 - 0 + 1) + 0);
			int y = (int)Math.floor(Math.random() * (550 - 450 + 1) + 450);
			tre[i] = new Tree(x,y);
		}
		
	}
	
	// JPanel method that sets the size of the JPanel
	@Override
	public Dimension getPreferredSize() {
		//Sets the size of the panel
		return new Dimension(800,600);
	}

	// JPanel method that invokes methods that draw on the JPanel
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		drawGround(g);
		//draw rain
		
		
		for(Tree each : tre){
			each.drawTree(g);
		}
		for (RainDrop each : rain){
			each.drawRainDrop(g);
		}
			
		
	}

	// Method runs continuously to simulate object movement
	public void animate(){
		while(true){
			//wait for .01 second
			try {
			    Thread.sleep(10);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
			
			//animate the rain
			for(RainDrop each : rain){
				each.moveDown();
			}
			//repaint the graphics drawn
			repaint();
		}

	}
	public void drawGround(Graphics g){
		g.setColor(ground);
		g.fillRect(0, 500,800, 100);
	}
	
	
	
}