import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;


public class Scenery extends JPanel {
	String time;
	String season = "Spring";
	Color sky = new Color(135, 206, 235);
	Color nightsky = new Color(19,24,98);
	Color colorGreen = new Color(0,255,0);
	Color colorGreen1 = new Color(12,255,30);
	Color colorGrey = new Color(128,128,128);
	Color colorBrown = new Color(165,42,42);
	Color colorCloud = new Color(236, 240, 241, 64);
	Color colorYellow = new Color(255,255,153);
	Color colorRed = new Color(255,0,0);
	Color colorWindow = new Color(184,134,11);
	Color colorWindowBar = new Color(255,255,255);
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
		drawBackground(g, season, "Night");
		drawTrees(g, season);
		drawBuilding(g, season);
		drawFlowers(g, season);
		drawAnimal1(g);
		drawAnimal2(g);
		

	}
	
	private void drawBackground(Graphics g,String aSeason, String aTime) {

		//draw sky
		if (aTime.equals("Night")){
			//draw moon
			g.setColor(nightsky);
			g.fillRect(0,0,800,600);
			g.setColor(sky);
			g.fillOval(50, 50, 100, 100);
			g.setColor(nightsky);
			g.fillOval(80, 60, 80, 80);
		}
		else{
			//draw sun
			g.setColor(sky);
			g.fillRect(0,0,800,600);
		}
		
		//draw Ground
		if (aSeason.equals("Spring")){
			g.setColor(colorGreen);
		}
		if (aSeason.equals("Fall")){
			g.setColor(colorBrown);
		}
		if (aSeason.equals("Winter")){
			g.setColor(colorGrey);
		}
		g.fillRect(0,400,800,600);
		//draw sun or moon
		if (aTime.equals("Night")){
			//draw moon
		}
		else{
			//draw sun
			g.setColor(colorYellow);
			g.fillOval(-100, -100, 200, 200);
		}

		//draw clouds
		g.setColor(colorCloud);
		g.fillOval(100,75,400,112);
		g.fillOval(300,40,100,142);

		
	}
	private void drawTrees(Graphics g,String aSeason) {
		int tree1x = 200;
		int tree1y = 300;
		Color colorTree = new Color(160,82,45);
		g.setColor(colorTree);
		g.fillRect(tree1x,tree1y,50,200);
		g.fillRect(tree1x-100,tree1y-100,50,200);
		g.setColor(colorGreen);
		g.fillPolygon(new int[] {150, 225, 300}, new int[] {300, 100, 300}, 3);
		g.setColor(colorGreen1);
		g.fillPolygon(new int[] {50, 125, 200}, new int[] {300, 150, 300}, 3);
	}
	private void drawBuilding(Graphics g,String aSeason) {
		g.setColor(colorRed);
		g.fillPolygon(new int[] {400, 400, 500, 600, 600}, new int[] {400, 300, 200, 300, 400}, 5);
		//window
		g.setColor(colorWindow);
		g.fillPolygon(new int[] {410, 410, 500, 500}, new int[] {350, 300, 300, 350}, 4);
		//window bar
		g.setColor(colorWindowBar);
		g.fillPolygon(new int[] {410, 410, 440, 440, 450, 450, 500, 500, 450,450,440,440}, new int[] {330, 320, 320,300,300, 320, 320, 330, 330, 350, 350, 330}, 12);

	}
	private void drawFlowers(Graphics g,String aSeason) {
		// need the graphics object to invoke the draw methods
	}
	private void drawAnimal1(Graphics g) {
		// need the graphics object to invoke the draw methods
	}
	private void drawAnimal2(Graphics g) {
		// need the graphics object to invoke the draw methods
	}
}