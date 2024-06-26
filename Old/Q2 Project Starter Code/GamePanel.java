import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;

// import KeyListener classes
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.Font;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class GamePanel extends JPanel implements KeyListener{

	//instance variables
	private Ship ship;
	private Enemy[] enemy;
	private Star[] star;
	private Planet[] planet;
	private Font font, largeFont;
	private Color textColor;
	private BufferedImage end_Screen, Loss_Screen, level2BG;

	//keep track of enemies killed and level
	private int level = 1, score = 0, lives = 3, spawned = 0, collisions = 0;
	private boolean end = false;
	//keep track of int shots, int score, int collisions, int frames
	private int shots, frames;
	private boolean setvisible;
	public GamePanel(){
		try{
			end_Screen = ImageIO.read(new File("End Screen.png"));
			Loss_Screen = ImageIO.read(new File("Loss screen.png"));
			level2BG = ImageIO.read(new File("Level 2.png"));
		}
		catch(IOException  e){
			System.out.println("error loading image");
		}
		score = 0;
		textColor = new Color(255,255,153);
		largeFont = new Font("Arial", Font.PLAIN, 50);
		font = new Font("Arial", Font.PLAIN, 25);

		//instanceate instance variables
		ship = new Ship(50,300);
		planet = new Planet[5];
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
		//instanseate each Planet
		for(int i = 0; i<planet.length; i++){
			int x = (int)Math.floor(Math.random() * (800 - 0 + 1) + 0);
			int y = (int)Math.floor(Math.random() * (600 - 0 + 1) + 0);
			int speed = (int)Math.floor(Math.random() * (2 - 0 + 1) + 0);
			planet[i] = new Planet(x,y, speed);
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
	public int getLevel(){
		return level;
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
		//draw stars or planets
		if (score < 3){
			for(Star each : star){
				each.drawStar(g);
			}
		}
		else{
			g.drawImage(level2BG, 0, 0, null);
		}
		
		for(Enemy each : enemy){
			each.draw(g);
		}
		//draw projectiles
		g.setFont(font);
		g.setColor(textColor);
		g.drawString("score: " + score + "\t Lives: " + lives, 20, 30);
		//draw ship
		if(level == 2){
			for(Enemy each : enemy){
				if (each.getVisible()){
					ship.draw2(g);
				}
			}
			
		}
		else{
			for(Enemy each : enemy){
				if (each.getVisible()){
					ship.draw(g);
				}
			}
		}
		
		if (end){
			if(lives <=0){
				g.drawImage(Loss_Screen, 0, 0, null);
			}
			else{
				g.drawImage(end_Screen, 0, 0, null);
			}
			
			g.setFont(font);
			g.setColor(textColor);
			g.drawString("Shots: " + shots, 50, 250);
			g.drawString("frames drawn: "+frames, 50, 310);
			//g.drawString("Average FPS: "+(frames/10), 50, 340);
			g.drawString("Collisions: "+collisions, 50, 370);
			g.setFont(largeFont);
			g.drawString("Press (P) to play again!", 120, 50);
		}
		
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
			//System.out.println("fire");
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
		//click p button to play again
		if (e.getKeyCode() == 80){
			//reset all variables
			score = 0;
			lives = 3;
			level = 1;
			shots = 0;
			ship.resetCollisions();
			frames = 0;

			//reset all enemies
			for(Enemy each : enemy){
				each.dissapear();
				each.changeX(900);
				each.changeY((int)Math.floor(Math.random() * (600 - 0 + 1) + 0));
				each.setSpeed(level);
				each.resetExploded();
			}
			//set 3 enemies to visible
			for(int i = 0; i<3; i++){
				//System.out.println("enemy reset" + i);
				enemy[i].setVisible();
			}
			end = false;
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
			//animate the stars
			for(Star each : star){
				each.moveLeft();
			}
			//animate the planets
			for(Planet each : planet){
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
					for(Enemy each2 : enemy){
						each2.changeX(850);
					}
					each.changeY((int)Math.floor(Math.random() * (550 - 0 + 1) + 0));
					
				}
			}
			//check for collisions
			for (Enemy each : enemy) {
				if (ship.checkProjectileCollision(each)) {
					score++;
				}
				if (ship.checkEnemyCollision(each)) {
					score++;
					lives--;
					collisions++;
					ship.resetPos();
					for(Enemy each2 : enemy){
						each2.changeX(850);
					}
				}
				
			}

			
			
			//check if all enemies are gone
			if (score == 3 && level == 1){
				level++;
				for(Enemy each : enemy){
					each.setVisible();
					each.changeX(900);
					each.changeY((int)Math.floor(Math.random() * (600 - 0 + 1) + 0));
					each.setSpeed(level+1);
					each.resetExploded();
				}
				
				
			}

			if (lives <= 0){
				//System.out.println("You Died");
				end = true;
			}
			//check is score is 8 and level is 2 to go the end screen
			if (score == 8 && level == 2){
				//System.out.println("end screen");
				end = true;
				//end.setVisible(true);
				
			}
			//repaint the graphics drawn
			repaint();
		}

	}

}


