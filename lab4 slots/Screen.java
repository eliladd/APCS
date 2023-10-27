import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JPanel implements ActionListener{
	// Instance Variables
    JTextField textBuffer = new JTextField();
    SlotMachine customer = new SlotMachine(100);
    


    //create a button
    JButton loginButton;
    JButton withdrawB;
    JButton depositB;
    JButton RollB;
    JButton onePointB;
    JButton threePointB;
    JButton fivePointB;
    JButton tenPointB;

    JTextField userInput;
    //create bank customer
    int bet;

	// Initialization Constructor
	public Screen() {
        
        RollB = new JButton("ROLL!!");
        onePointB = new JButton("1 Point");
        fivePointB = new JButton("5 Points");
        tenPointB = new JButton("10 Points");
        customer = new SlotMachine(100);

        setLayout(null);
        //set up locaiton and size for textbox
        onePointB.setBounds(50, 350, 100, 30);
        fivePointB.setBounds(175, 350, 80, 30);
        tenPointB.setBounds(300, 350, 80, 30);
        RollB.setBounds(50, 400, 250, 30);

        
       
        add(RollB);
        add(onePointB);
        add(fivePointB);
        add(tenPointB);
    
        
        RollB.addActionListener(this);
        onePointB.addActionListener(this);
        fivePointB.addActionListener(this);
        tenPointB.addActionListener(this);
	}
	
	//set the size of the JPanel container
	@Override
	public Dimension getPreferredSize(){
		return new Dimension(800,600);
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);

        //g.drawString("points: " + customer.getBalance(), 50, 200);
        
		
	}
	
	//action to be performed when a button is clicked
	public void actionPerformed(ActionEvent event) {
			if (event.getSource() == RollB){
                //DO RANDOM STUFF/PERFORM ROLL
                
            }
            else if (event.getSource() == onePointB){
                bet = 1;
            }
            else if (event.getSource() == fivePointB){
                bet = 5;
            }
            else if (event.getSource() == tenPointB){
                bet = 10;
            }
			//This line MUST be here refresh the screen
			repaint();

	}
	
}

