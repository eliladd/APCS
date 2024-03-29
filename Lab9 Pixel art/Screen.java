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

import java.awt.event.MouseEvent;

import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
public class Screen extends JPanel implements ActionListener, MouseListener {


    private Square[][] squareList;
    Scanner sc = new Scanner(System.in);
    


    JButton setcolor;
    JButton submit;
    JButton color1, color2, color3, color4, color5, clear;

    JTextField rValue;
    JTextField gValue;
    JTextField bValue;
    JTextField width;
    JTextField height;
    JTextField squareSize;

    int red = 0, green = 0, blue = 0, stage = 0, r, g,b;
	//create a color
	Color background = new Color(red, green, blue);
    Font font = new Font("Bauhaus 93", Font.PLAIN, 20);
    
    
	public Screen() {
        addMouseListener(this);
        rValue = new JTextField();
        gValue = new JTextField();
        bValue = new JTextField();
        width = new JTextField();
        height = new JTextField();
        squareSize = new JTextField();
        //set up the buttons
        setLayout(null);
        setcolor = new JButton("Set Color");
        submit = new JButton("Submit");
        color1 = new JButton("Select");
        color2 = new JButton("Select");
        color3 = new JButton("Select");
        color4 = new JButton("Select");
        color5 = new JButton("Select");
        clear = new JButton("Clear");
        rValue.setBounds(50, 400, 100, 30);
        gValue.setBounds(50, 450, 100, 30);
        bValue.setBounds(50, 500, 100, 30);
        width.setBounds(450, 250, 100, 30);
        height.setBounds(450, 300, 100, 30);
        squareSize.setBounds(450, 350, 100, 30);
        add(rValue);
        add(gValue);
        add(bValue);
        add(width);
        add(height);
        add(squareSize);


        //add the buttons
        setcolor.setBounds(50, 550, 200, 50);
        setcolor.setFont(font);
        submit.setBounds(450, 400, 200, 50);
        submit.setFont(font);
        color1.setBounds(375, 450, 70, 20);
        color2.setBounds(455, 450, 70, 20);
        color3.setBounds(535, 450, 70, 20);
        color4.setBounds(615, 450, 70, 20);
        color5.setBounds(695, 450, 70, 20);
        clear.setBounds(225, 450, 100, 25);
        add(clear);
        add(setcolor);
        add(submit);
        add(color1);
        add(color2);
        add(color3);
        add(color4);
        add(color5);
        setFocusable(true);	
        setcolor.addActionListener(this);
        submit.addActionListener(this);
        color1.addActionListener(this);
        color2.addActionListener(this);
        color3.addActionListener(this);
        color4.addActionListener(this);
        color5.addActionListener(this);
        clear.addActionListener(this);
        width.setVisible(false);
        height.setVisible(false);
        squareSize.setVisible(false);
        submit.setVisible(false);
        rValue.setVisible(false);
        gValue.setVisible(false);
        bValue.setVisible(false);
        setcolor.setVisible(false);
        color1.setVisible(false);
        color2.setVisible(false);
        color3.setVisible(false);
        color4.setVisible(false);
        color5.setVisible(false);
        clear.setVisible(false);


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
            g.drawString("Width:", 400, 250);
            g.drawString("Height:", 400, 300);
            g.drawString("Square Size:", 350, 350);
            width.setVisible(true);
            height.setVisible(true);
            squareSize.setVisible(true);
            submit.setVisible(true);
            //ask for grid size
        }
        if (stage !=0) {
            for(int i = 0; i < squareList.length; i++){
                for(int j = 0; j < squareList[i].length; j++){
                    squareList[i][j].drawMe(g);
                }
            }
            //draw a test color square
            g.drawString("color selected", 230, 500);
            g.setColor(new Color(r, this.g, b));
            g.fillRect(250, 500, 100, 100);
            //draw the color picker
            g.setColor(new Color(244, 241, 222));
            g.fillRect(375, 500, 75, 75);
            g.setColor(new Color(224, 122, 95));
            g.fillRect(455, 500, 75, 75);
            g.setColor(new Color(61, 64, 91));
            g.fillRect(535, 500, 75, 75);
            g.setColor(new Color(129, 178, 154));
            g.fillRect(615, 500, 75, 75 );
            g.setColor(new Color(242, 204, 143));
            g.fillRect(695, 500, 75, 75);
        }

    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == setcolor){
            int colorR = Integer.parseInt(rValue.getText());
            int colorG = Integer.parseInt(gValue.getText());
            int colorB = Integer.parseInt(bValue.getText());
            r = colorR;
            g = colorG;
            b = colorB;
            System.out.println("Color set to " + r + " " + g + " " + b);
        }
        if(e.getSource() == submit){
            int gridXSize = Integer.parseInt(width.getText());
            int gridYSize = Integer.parseInt(height.getText());
            int squareSize = Integer.parseInt(this.squareSize.getText());
            squareList = new Square[gridXSize][gridYSize];
            for(int i = 0; i < gridXSize; i++){
                for(int j = 0; j < gridYSize; j++){
                    squareList[i][j] = new Square((i*squareSize)-12, (j*squareSize)-12, 255, 255, 255, squareSize);
                }
            }
            stage = 1;
            width.setVisible(false);
            height.setVisible(false);
            this.squareSize.setVisible(false);
            submit.setVisible(false);
            rValue.setVisible(true);
            gValue.setVisible(true);
            bValue.setVisible(true);
            setcolor.setVisible(true);
            color1.setVisible(true);
            color2.setVisible(true);
            color3.setVisible(true);
            color4.setVisible(true);
            color5.setVisible(true);
            clear.setVisible(true);
        }
        if(e.getSource() == color1){
            r = 244;
            g = 241;
            b = 222;
            System.out.println("Color set to " + r + " " + g + " " + b);
        }
        if(e.getSource() == color2){
            r = 224;
            g = 122;
            b = 95;
            System.out.println("Color set to " + r + " " + g + " " + b);
        }
        if(e.getSource() == color3){
            r = 61;
            g = 64;
            b = 91;
            System.out.println("Color set to " + r + " " + g + " " + b);
        }
        if(e.getSource() == color4){
            r = 129;
            g = 178;
            b = 154;
            System.out.println("Color set to " + r + " " + g + " " + b);
        }
        if(e.getSource() == color5){
            r = 242;
            g = 204;
            b = 143;
            System.out.println("Color set to " + r + " " + g + " " + b);
        }
        if(e.getSource() == clear){
            for(int i = 0; i < squareList.length; i++){
                for(int j = 0; j < squareList[i].length; j++){
                    squareList[i][j].changeColor(255, 255, 255);
                }
            }
            repaint();
        }
        
        repaint();
	}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){

        //get the x and y position of the mouse and change the color of the square
        int x = e.getX();
        int y = e.getY();
        for(int i = 0; i < squareList.length; i++){
            for(int j = 0; j < squareList[i].length; j++){
                if(x > squareList[i][j].getX() && x < squareList[i][j].getX() + squareList[i][j].getSize() && y > squareList[i][j].getY() && y < squareList[i][j].getY() + squareList[i][j].getSize()){
                    squareList[i][j].changeColor(r, g, b);
                    System.out.println("Square " + i + " " + j + " changed color to " + r + " " + g + " " + b);
                }
            }
        }
        repaint();
    }
    public void mouseEntered(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}
}