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
	private Projectile projectile;
	private Color textColor;
	//keep track of enemies killed and level
	private int level = 1, score = 0, lives = 3, spawned = 0;
	//keep track of int shots, int score, int collisions, int frames
	private int shots, collisions, frames;
	private boolean setvisible;
	public GamePanel(){
		score = 0;
		textColor = new Color(255,255,153);
		font = new Font("Arial", Font.PLAIN, 20);
		//instanceate instance variables
		ship = new Ship(50,300);
        setFocusable(true); 
		//add key listeners
		addKeyListener(this);
		enemy = new Enemy[5];
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
			if (spawned >=3){
				setvisible = true;
			}
			else{
				setvisible = false;
				spawned++;
			}
			enemy[i] = new Enemy(x,y, level, setvisible);
			spawned++;
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
			shots++;
		}
		//click the o button to kill all ships and move to the next level
		if (e.getKeyCode() == 79){
			for(Enemy each : enemy){
				each.dissapear();
			}
			if (score < 3){
				score = 3;
			}
			else{
				score = 8;
			}
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
			frames++;
			//shoot the projectile
			ship.moveProjectile(800);
			//animate the rain
			for(Star each : star){
				each.moveLeft();
			}
			for(Enemy each : enemy){
				each.move();
				//reset enemy position if it goes out of bounds
				if (each.getX()<-50 && each.getVisible()){
					//System.out.println("enemy reset");
					//System.out.println(each.getX());
					//System.out.println(each.getY());
					lives--;
					each.changeX(850);
					each.changeY((int)Math.floor(Math.random() * (550 - 0 + 1) + 0));
					
				}
			}
			//check for collisions
			for (Enemy each : enemy) {
				if (ship.checkProjectileCollision(each)) {
					score++;
				}
			}
			
			
			//check if all enemies are gone
			if (score == 3 && level == 1){
				for(Enemy each : enemy){
					each.setVisible();
					each.changeX(900);
					each.changeY((int)Math.floor(Math.random() * (600 - 0 + 1) + 0));
					each.setSpeed(3);
				}
				level++;
				
			}
			//check is score is 8 and level is 2 to go the end screen
			if (score == 8 && level == 2){
				//System.out.println("end screen");
				EndScreen end = new EndScreen(shots, score, collisions, frames);
				//end.setVisible(true);
				break;
			}
			//repaint the graphics drawn
			repaint();
		}

	}

}


