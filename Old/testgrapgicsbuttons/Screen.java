import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

	
/* This code is an example of using a Button and textbox. 
   Other useful JButton methods are:
          setVisible(boolean) - when true, the button will display. True by default.
		  setEnabled(boolean) - when true, the button will be clickable. True by default.
*/	
public class Screen extends JPanel implements ActionListener{
	
	// Create a string that will print
	String printS = "";

	// Create a test button
	JButton testB;

	// Create a test textfield
	JTextField testTF;

	// 

	// Initialization Constructor
	public Screen() {

		// Instantiate the button. Parameter to the JButton constructor is the button name.
		testB = new JButton("Try Me");

		// Instantiate the textfield
		testTF = new JTextField();

		setLayout(null);   // JPanel method that initializes the layout.
		
		// Set the position and size of testB and testTF
		testB.setBounds(50, 350, 100, 30);  // x, y, width, height
		testTF.setBounds(50, 300, 100, 30); // x, y, width, height

		// add the testB and testTF to the screen
		add(testB);
		add(testTF);

		// Set up to listen for the button clicks
		testB.addActionListener(this); // this refers to the current screen object
	}
	
	//set the size of the JPanel container
	@Override
	public Dimension getPreferredSize(){
		return new Dimension(800,600);
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);

		if (!printS.equals("")) {
			g.drawString(printS, 400, 300);
		}
		
	}
	
	//action to be performed when a button is clicked
	public void actionPerformed(ActionEvent event) {
			
		// Check to see if the button was pushed
		if (event.getSource()== testB) {
			// Assign the information in the textbox to printS
			printS = testTF.getText();
		}
		// Optional. You can erase the text in the textbox
		testTF.setText("");

		// You MUST have this line to repaint the screen
		repaint();

	}
	
}
