import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
public class Screen extends JPanel implements ActionListener {


    private int[][] squareList;
    Scanner sc = new Scanner(System.in);
    


    JButton hit;

    int red = 0, green = 0, blue = 0, stage = 0;
	//create a color
	Color background = new Color(red, green, blue);
    Font font = new Font("Bauhaus 93", Font.PLAIN, 20);
    
    
	public Screen() {
        
        //set up the buttons
        setLayout(null);
        hit = new JButton("Hit");

        //add the buttons
        hit.setBounds(50, 500, 200, 50);
        hit.setFont(font);

        add(hit);
  
        setFocusable(true);	
        hit.addActionListener(this);

	}
	@Override
	public Dimension getPreferredSize() {
		//Sets the size of the panel
		return new Dimension(800,600);
	}
    @Override
	public void paintComponent(Graphics g){
        //background
		super.paintComponent(g);
        for(int i = 800; i > 0; i-=5){
			g.setColor(background);
			if (red < 255 && green < 255 && blue < 255){
				g.setColor(background);
				red += 1;
				green += 1;
				blue += 1;
				g.fillRect(0, 0, 800, i);
				background = new Color(red, green, blue);
			}
		}
        red = 0;
		green = 0;
		blue = 0;
		background = new Color(red, green, blue);
        //during onboarding, ask user for size of grid and square size
        if(stage == 0){
            //ask for grid size
            //Instantiates a 2D array of Square objects which is the grid 
            
            System.out.println("How wide should the grid be?");
            int gridXSize = sc.nextInt();
            System.out.println("How Tall should the grid be?");
            int gridYSize = sc.nextInt();
            //ask for square size
            System.out.println("How how large should the squares be?(in pixels)");
            int squareSize = sc.nextInt();

            squareList = new int[gridXSize][gridYSize];
            for(int i = 0; i < gridXSize; i++){
                for(int j = 0; j < gridYSize; j++){
                    squareList[i][j] = Square((i*squareSize)-12, (j*squareSize)-12, 255, 255, 255, squareSize);
                }
            }
        }

    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == hit){

        }
        
        repaint();
	}
}