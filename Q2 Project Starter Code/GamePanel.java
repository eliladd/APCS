import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;

// import KeyListener classes
import java.awt.event.KeyListener;
import java.io.IOException;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;


public class GamePanel extends JPanel implements KeyListener{

	//instance variables
	private Ship ship;
	private Star[] rain;
	private BufferedImage spaceship;
	public GamePanel(){
		//Instantiate the image object in the constructor 
		try{
			spaceship = ImageIO.read(new File("Spaceship.png"));
		}
		catch(IOException  e){
			System.out.println("error loading image");
		}
		//instanceate instance variables
		ship = new Ship(50,300);
        setFocusable(true); 
		//add key listeners
		addKeyListener(this);
		rain = new Star[999];
		//instanseate each Star
		for(int i = 0; i<rain.length; i++){
			int x = (int)Math.floor(Math.random() * (800 - 0 + 1) + 0);
			int y = (int)Math.floor(Math.random() * (600 - 0 + 1) + 0);
			rain[i] = new Star(x,y);
		}
	}
	

	@Override
	public Dimension getPreferredSize() {
		//Sets the size of the panel
        	return new Dimension(800,600);
	}
	
	@Override
	public void paintComponent(Graphics g) {
        super.paintComponent(g);
		//draw background
		g.setColor(Color.BLACK);
		g.fillRect(0,0,800,600);
		//draw stars
		for(Star each : rain){
			each.drawStar(g);
		}
		//draw ship
		ship.draw(g);
		
	} 

	
	public void keyPressed(KeyEvent e){
		//System.out.println("key: " + e.getKeyCode());
		//interprate key presses

		if (e.getKeyCode() == 38 || e.getKeyCode() == 87){
			//up arrow
			ship.moveUp();
		}
		if (e.getKeyCode() == 40 || e.getKeyCode() == 83){
			//down arrow
			ship.moveDown();
		}
		if (e.getKeyCode() == 32){
			//space bar
			System.out.println("fire");
			ship.setfire();
		}
		
		repaint();
	}


	// You must have method signatures for all methods that are
	// part of an interface.
	public void keyReleased(KeyEvent e){}
	public void keyTyped(KeyEvent e){}
	
	public void animate(){
		
		while(true){
			//wait for .01 second
			try {
			    Thread.sleep(10);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
			//shoot the projectile
			ship.moveProjectile(800);
			//animate the rain
			for(Star each : rain){
				each.moveLeft();
			}
			//repaint the graphics drawn
			repaint();
		
			//repaint the graphics
			repaint();
		}

	}

}


