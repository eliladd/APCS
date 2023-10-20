import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.awt.Dimension;

public class Scenery extends JPanel {
	String time;
	String season;
	Color sky = new Color(135, 206, 235);
	Color nightsky = new Color(19,24,98);
	Color colorGreen = new Color(0,255,0);
	Color colorGreen1 = new Color(12,255,30);
	Color colorGrey = new Color(128,128,128);
	Color winterGround = new Color(226, 227, 221);
	Color colorBrown = new Color(165,42,42);
	Color colorTreeBrown = new Color(175,40,49);
	Color colorCloud = new Color(236, 240, 241, 64);
	Color colorYellow = new Color(255,255,153);
	Color colorRed = new Color(255,0,0);
	Color colorWindow = new Color(184,134,11);
	Color colorWindowBar = new Color(255,255,255);
	Color colorBlack = new Color(0,0,0);
	Color colorWhite = new Color(255,255,255);
	Color colorOrenge = new Color(255, 165, 0);
	Color colorPink = new Color(255,192,203);
	Color colorPink2 = new Color(255,105,180);
	Color colorPink3 = new Color(255,180,206);
	Color colorBlue = new Color(10,10,255);
	
	int cloudX = 0;
	int moonX = 0;
	boolean right = true;
	boolean groundDrawn = false;
	ArrayList<ArrayList<Integer>> masterflowersList = new ArrayList<>();
	
	public Scenery(String aSeason, String aTime) {
		time = aTime;
		season = aSeason;
		int numflowers = randomnum(100,50);
		//System.out.println("number of flowers: " + numflowers);
		for (int i = 0; i <= numflowers; i++){
			
			ArrayList<Integer> stripperClipList = new ArrayList<>();
			stripperClipList.add(randomnum(0, 800)); //Adds X-Coords : Index is 0
			//System.out.print("xvalue: " + stripperClipList.get(0));
			stripperClipList.add(500 + randomnum(100, -100)); //Adds Y-Coords : Index is 1
			//System.out.print("Yvalue: " + stripperClipList.get(1));
			stripperClipList.add(10 + randomnum(10, 0)); // Adds width : Index is 2
			//System.out.print("width: " + stripperClipList.get(2));
			stripperClipList.add(10 + randomnum(10, 0)); // Adds height : Index is 3
			//System.out.print("height: " + stripperClipList.get(3));
			stripperClipList.add(randomRGB()); // Adds R Value : Index is 4
			stripperClipList.add(randomRGB()); // Adds G Value : Index is 5
			stripperClipList.add(randomRGB()); // Adds B Value : Index is 6
			//System.out.println();
			masterflowersList.add(stripperClipList);
			
		}
		//System.out.println("the slzie of masterflower list is: "+ masterflowersList.size());
		/*
				**Assume this is Class-Wide***
				masterflowersList {flower1[],flower2[]...} <-arraylist

				
				***Assume this code is for the constructor***
				pick a random number(N) of flwoers to generate
				for loop n times{
					add new flowerI to masterflowerslist with values:
						generate random x
						generate random y
						generate random size
						generate random rgb value <- I need to check this
				}

				***Assume this code is for the method that draws all of the flowers***
					
				for each slot in masterflowersList:
					set color black
					draw rectangle with XY values with extra math and size from slot 2
					set color from slot 3
					draw oval with XY values and size from slot 2

				individualFlowerList <- An Int[] ArrayList
				individualFlowerList {x-coord,y-coord,size,rValue,gValue,bValue}
				Color.getColor(r,g,b);
				g.setColor(Color.getColor(rValue,gValue,bValue))

				IN DRAWFLOWERS:
				create a loop that draws each flower in 'slot' N of the list, untill the list is empty/gone through.
		 */
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
		drawBackground(g, season, time);
		drawBuilding(g, season);
		
		drawTrees(g, season);
		
		
		drawGround(g, season);
		drawFlowers(g, season);
		drawAnimal1(g);
		drawAnimal2(g);
	}
	private void drawGround(Graphics g,String aSeason){
				//draw Ground
		if (aSeason.equals("Spring")){
			g.setColor(colorGreen);
		}
		if (aSeason.equals("Fall")){
			g.setColor(colorBrown);
		}
		if (aSeason.equals("Winter")){
			g.setColor(winterGround);
		}
		g.fillRect(0,400,800,600);
	}
	private void drawBackground(Graphics g,String aSeason, String aTime) {

		
		

		//draw sun or moon
		if (aTime.equals("Night")){
			g.setColor(nightsky);
			g.fillRect(0,0,800,400);
			g.setColor(sky);
			g.fillOval(50, 50, 100, 100);
			g.setColor(nightsky);
			g.fillOval(80+moonX, 60, 80, 80);
		}
		else{
			//draw sun
			g.setColor(colorYellow);
			g.fillOval(-100, -100, 200, 200);
			g.setColor(sky);
			g.fillRect(0,0,800,600);
		}

		//draw clouds
		g.setColor(colorCloud);
		g.fillOval(100+cloudX,75,400,112);
		g.fillOval(300+cloudX,40,100,142);

		
	}
	private void drawTrees(Graphics g,String aSeason) {
		int tree1x = 200;
		int tree1y = 300;
		Color colorTree = new Color(160,82,45);
		if (aSeason.equals("Spring")){
			g.setColor(colorTree);
			g.fillRect(tree1x,tree1y,50,200);
			g.fillRect(tree1x-100,tree1y-100,50,200);
			g.setColor(colorGreen);
			g.fillPolygon(new int[] {150, 225, 300}, new int[] {300, 100, 300}, 3);
			g.setColor(colorGreen1);
			g.fillPolygon(new int[] {50, 125, 200}, new int[] {300, 150, 300}, 3);
		}
		if (aSeason.equals("Fall")){
			g.setColor(colorTree);
			g.fillRect(tree1x,tree1y,50,200);
			g.fillRect(tree1x-100,tree1y-100,50,200);
			g.setColor(colorGreen);
			g.fillPolygon(new int[] {150, 225, 300}, new int[] {300, 100, 300}, 3);
			g.setColor(colorGreen1);
			g.fillPolygon(new int[] {50, 125, 200}, new int[] {300, 150, 300}, 3);
		}
		if (aSeason.equals("Winter")){
			g.setColor(colorTree);
			g.fillRect(tree1x,tree1y,50,200);
			g.fillPolygon(new int[] {200, 225, 250}, new int[] {300, 250, 300}, 3);
			g.fillRect(tree1x-100,tree1y-100,50,200);
			g.fillPolygon(new int[] {200-100, 225-100, 250-100}, new int[] {300-100, 250-100, 300-100}, 3);
			//g.setColor(colorGreen);
			//g.fillPolygon(new int[] {150, 225, 300}, new int[] {300, 100, 300}, 3);
			//g.setColor(colorGreen1);
			//g.fillPolygon(new int[] {50, 125, 200}, new int[] {300, 150, 300}, 3);
		}
		
		
		
	}
	private void drawBuilding(Graphics g,String aSeason) {
		g.setColor(colorRed);
		g.fillPolygon(new int[] {400, 400, 500, 600, 600}, new int[] {400, 300, 200, 300, 400}, 5);
		//window
		g.setColor(colorBlue);
		g.fillPolygon(new int[] {410, 410, 500, 500}, new int[] {350, 300, 300, 350}, 4);
		//window bar
		g.setColor(colorBlack);
		g.fillPolygon(new int[] {410, 410, 440, 440, 450, 450, 500, 500, 450,450,440,440}, new int[] {330, 320, 320,300,300, 320, 320, 330, 330, 350, 350, 330}, 12);

	}
	private void drawFlowers(Graphics g,String aSeason) {
		
		for (ArrayList<Integer> i: masterflowersList) { 
			//System.out.println(i);
			g.setColor(colorBlack);
			g.fillRect(i.get(0) + ((i.get(0))/2),i.get(1) + ((i.get(1))/2),4,20 + ((i.get(3))/4));
			Color flowerColor = new Color(i.get(4), i.get(5), i.get(6));
			g.setColor(flowerColor);
			g.fillOval(i.get(0), i.get(1), i.get(2), i.get(3));
			//System.out.println("I should have moved on by now.");
		}
		
		
		
		/*
		for (int i = 0; i < masterflowersList.size(); i++) { 
			System.out.println(i);
			g.setColor(colorBlack);
			g.fillRect(masterflowersList.get(i.get(0)) + ((i.get(0))/2),i.get(1) + ((i.get(1))/2),4,20 + ((i.get(1))/4));
			Color flowerColor = new Color(i.get(4), i.get(5), i.get(6));
			g.setColor(flowerColor);
			g.fillOval(i.get(0), i.get(1), i.get(2), i.get(3));
		}
		 */
	}
	private void drawAnimal1(Graphics g) {
		// penguin
		//body
		g.setColor(colorBlack);
		g.fillOval(650, 300, 75, 100);
		g.setColor(colorWhite);
		g.fillOval(660, 310, 55, 80);
		//head
		g.setColor(colorBlack);
		g.fillOval(660, 250, 50, 50);
		g.setColor(colorWhite);
		g.fillOval(665, 255, 40, 40);
		//feet
		g.setColor(colorOrenge);
		g.fillOval(630, 380, 55, 20);
		g.fillOval(690, 380, 55, 20);
		//beak
		g.fillOval(673, 275, 23, 30);
		g.setColor(colorBlack);
		g.drawLine(670, 275, 683, 263);
		g.drawLine(703, 275, 693, 263);
		
	}
	private void drawAnimal2(Graphics g) {
		// pig
		g.setColor(colorPink);
		g.fillOval(280, 360, 100, 40);
		//head
		g.setColor(colorPink2);
		g.fillOval(270, 340, 40, 40);
		//legs
		g.setColor(colorPink3);
		g.fillOval(270, 380, 20, 40);
		g.fillOval(280, 380, 20, 40);
		g.fillOval(350, 380, 20, 40);
		g.fillOval(360, 380, 20, 40);
	}
	private int randomnum(int aMax, int aMin){
		return (int)Math.floor(Math.random() * (aMax - aMin + 1) + aMin);
	}
	private int randomRGB(){
		return randomnum(255,0);
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
	public void moveMoon() {
        /* if the rectangle is about to fall off the right side
           of the screen, reset x to it's starting position. */
        if (right) {
            moonX ++;
			if (moonX > 80){
				right = false;
			}
        }
        else {
            moonX--;   // Move the rectangle one to the right
                     // Change how much you add to increase/decrease the speed
			if (moonX < 0){
				right = true;
			}
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
            moveClouds();
			moveMoon();
            
            /* Repaint the graphics drawn. You MUST have this in your code
              because each time an object is moved, the panel needs to 
              be updated. */
            repaint();
        }
    }
}