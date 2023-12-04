import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;

// import KeyListener classes
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.Font;



public class GamePanel extends JPanel implements KeyListener{

	//instance variables
	private Ship ship;
	private Enemy[] enemy;
	private Star[] star;
	private Font font;
	private Color textColor;
	//keep track of enemies killed and level
	private int level = 1, score = 0, lives = 3;
	public GamePanel(){
		score = 0;
		textColor = new Color(255,255,153);
		font = new Font("Arial", Font.PLAIN, 20);
		//instanceate instance variables
		ship = new Ship(50,300);
        setFocusable(true); 
		//add key listeners
		addKeyListener(this);
		enemy = new Enemy[3];
		star = new Star[999];
		//instanseate each Star
		for(int i = 0; i<star.length; i++){
			int x = (int)Math.floor(Math.random() * (800 - 0 + 1) + 0);
			int y = (int)Math.floor(Math.random() * (600 - 0 + 1) + 0);
			int speed = (int)Math.floor(Math.random() * (2 - 0 + 1) + 0);
			star[i] = new Star(x,y, speed);
		}
		//instanseate each Enemy
		for(int i = 0; i<enemy.length; i++){
			int x = 900;
			int y = (int)Math.floor(Math.random() * (600 - 0 + 1) + 0);
			enemy[i] = new Enemy(x,y, level);
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
		for(Star each : star){
			each.drawStar(g);
		}
		for(Enemy each : enemy){
			each.draw(g);
		}
		g.setFont(font);
		g.setColor(textColor);
		g.drawString("score: " + score + "\t Lives: " + lives, 20, 30);
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
			for(Star each : star){
				each.moveLeft();
			}
			for(Enemy each : enemy){
				each.move();
				//reset enemy position if it goes out of bounds
				if (each.getX()<-50){
					System.out.println("enemy reset");
					lives--;
					each.changeX(850);
					each.changeY((int)Math.floor(Math.random() * (550 - 0 + 1) + 0));
					
				}
			}
			//check for collisions
			for(Enemy each : enemy){
				if(ship.checkProjectileCollision(each)){
					score++;
				}
			}
			
			
			//check if all enemies are gone
			if (score == 3){
				level++;
				for(int i = 0; i<enemy.length; i++){
					int x = 900;
					int y = (int)Math.floor(Math.random() * (600 - 0 + 1) + 0);
					enemy[i] = new Enemy(x,y, level);
				}

				
			}
			//repaint the graphics drawn
			repaint();
		}

	}

}


