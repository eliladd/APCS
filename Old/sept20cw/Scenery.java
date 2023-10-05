package Old.sept20cw;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;

public class Scenery extends JPanel{
	private int groundx, groundy, grassx, grassy;
	int tree1x = 200;
		int tree1y = 300;
	
	public Scenery(){
		groundx = 0;
		groundy = 500;
		grassx = 0;
		grassy = 450;
	}

	@Override
	public Dimension getPreferredSize(){
        return new Dimension(800,600);
    }

	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Color colorblue = new Color(0,0,255);
		g.setColor(colorblue);
		g.fillRect(0,0,800,600);
		Color colorBrown = new Color(139,69,19);
		g.setColor(colorBrown);
		g.fillRect(groundx,groundy,800,100);
		Color colorGreen = new Color(0,255,0);
		g.setColor(colorGreen);
		g.fillRect(grassx,grassy,800,50);
		Color colorTree = new Color(160,82,45);
		g.setColor(colorTree);
		g.fillRect(tree1x,tree1y,50,200);
		g.setColor(colorGreen);
		g.fillPolygon(new int[] {150, 225, 300}, new int[] {300, 100, 300}, 3);
		Color colorYellow = new Color(255,255,0);
		g.setColor(colorYellow);
		g.fillOval(-100,-100,200,200);
	}
}
