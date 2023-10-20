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
    //create a button
    JButton loginButton;
    JTextField userInput;

    //create bank customer
    Bank customer;

	// Initialization Constructor
	public Screen() {
        loginButton = new JButton("Login");
        userInput = new JTextField();
        customer = new Bank("Cormey Smith", 350.50, 1234);

        setLayout(null);
        //set up locaiton and size for textbox
        loginButton.setBounds(50, 350, 100, 30);
        userInput.setBounds(50, 300, 100, 30);
        add(loginButton);
        add(userInput);
        loginButton.addActionListener(this);
	}
	
	//set the size of the JPanel container
	@Override
	public Dimension getPreferredSize(){
		return new Dimension(800,600);
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);

        // if acsess code is  true, display customer info
        if (customer.getAccess()){
            g.drawString(customer.getName(), 50, 200);
            g.drawString(customer.getBalance() + "", 200, 200);

        }
        else{
            g.drawString("Please enter the correct pin: ", 50, 280);
        }
		
	}
	
	//action to be performed when a button is clicked
	public void actionPerformed(ActionEvent event) {
			if (event.getSource() == loginButton){
                String pinText = userInput.getText();
                int pin = Integer.parseInt(pinText);
                customer.checkPin(pin);
                userInput.setText("");
            }
			//This line MUST be here refresh the screen
			repaint();

	}
	
}