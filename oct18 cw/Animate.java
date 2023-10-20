import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;

// This code will move a rectangle across the screen, left to right
public class Animate extends JPanel {

    // Instance variables
    
    Color colorSky = new Color(36,52,67);
    Color colorGround = new Color(233,188,131);
    Color colorMoon = new Color(205,127,79);
    Color colorMoon2 = new Color(180,108,73);
    Color colorCastle = new Color(110,56,69);
    Color colorCastle2 = new Color(79, 44,53);
    Color colorCloud = new Color(236, 240, 241, 64);
    Color colorFlower = new Color(42,51,174);
    Color colorStem = new Color(0,83,44);
    Color colorFrog = new Color(88,188,8);
    Color colorBlack = new Color(0,0,0);
    Color colorRed = new Color(255,0,0);
    int cloudX = 0;
    int sunY = 0;
    int flowerX =0;
    int frogX = 0;
    int frogY = 0;
    boolean up = true;
    

    // Constructor
    public Animate() {
        
    }

    // Set the dimension of the JPanel
	@Override
	public Dimension getPreferredSize() {
		//Sets the size of the panel
		return new Dimension(800,600);
	}

    // Call methods that will draw on the JPanel DRAW STUFF
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
        drawSky(g);
        drawGround(g);
        drawCastle(g);
        drawClouds(g);
        drawFlowers(g);
        drawFrog(g);
	}
    
    /* This method runs in parallel with the other methods.
       That is why a try catch exception handler is needed.
       Copy this code exactly as is. You will add calls to your methods 
       that move your objects. */
    public void animate(){
        while(true){
            //wait for .01 second
            try {
                Thread.sleep(10);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            // UPDADE GRAPHICS
            moveClouds();
            moveSun();
            moveFrog();
            /* Repaint the graphics drawn. You MUST have this in your code
              because each time an object is moved, the panel needs to 
              be updated. */
            repaint();
        }
    }
    public void drawSky(Graphics g){
        g.setColor(colorSky);
        g.fillRect(0,0,800,600);
        g.setColor(colorMoon);
        g.fillOval(100, 50+sunY, 150, 150);
    }
    public void drawGround(Graphics g){
        g.setColor(colorGround);
        g.fillOval(0, 450, 800, 300);
    }
    public void drawCastle(Graphics g){
        g.setColor(colorCastle);
        int[] xPoints = new int[]{265, 270, 235, 235, 272, 272, 335, 335, 380, 380, 455, 455, 510, 510, 455, 455};
        int[] yPoints = new int[]{490, 330, 330, 275, 275, 300, 300, 275, 275, 300, 300, 275, 275, 340, 335, 490};

        g.fillPolygon( xPoints, yPoints, 16 );
        g.setColor(colorCastle2);
        g.fillOval(319,435, 83, 115);
        g.setColor(colorGround);
        g.fillRect( 319, 493, 83, 113);
    }
    public void drawClouds(Graphics g){
        g.setColor(colorCloud);
		g.fillOval(100+cloudX,75,400,112);
		g.fillOval(300+cloudX,40,100,142);
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
    public void moveSun() {
        /* if the rectangle is about to fall off the right side
           of the screen, reset x to it's starting position. */
        if (sunY<-200) {
            sunY = +900;
        }
        else {
            sunY--;   // Move the rectangle one to the right
                     // Change how much you add to increase/decrease the speed
        }
    }
    public void drawFlowers(Graphics g){
        while (flowerX < 800){
            System.out.println(flowerX);
            g.setColor(colorStem);
            g.fillRect(75 + flowerX, 475, 20, 10);
            g.setColor(colorFlower);
            g.fillOval(60 + flowerX,450,50,50);
            System.out.println("I printed a flower!");
            flowerX += 40;
        }
    }
    public void drawFrog(Graphics g){
        g.setColor(colorFrog);
        g.fillOval(0+frogX,550+frogY,50,50);
        g.fillOval(-20+frogX,570+frogY,30,30);
        g.fillOval(40+frogX,570+frogY,30,30);
        g.setColor(colorBlack);
        g.fillOval(10+frogX,560+frogY,10,10);
        g.fillOval(30+frogX,560+frogY,10,10);
        g.setColor(colorRed);
        g.fillOval(20+frogX,570+frogY,10,20);

    }
    public void moveFrog(){
        //System.out.println(frogY);
        if (frogX>800) {
            frogX = -500;
        }
        else {
            frogX++;   // Move the rectangle one to the right
                     // Change how much you add to increase/decrease the speed
        }
        if (up){
            frogY --;
            if (frogY <= -50){
                up = false;
            }
            
        }
        else{
            frogY++;
            if (frogY >= 0){
                up = true;
            }
        }
    }
}