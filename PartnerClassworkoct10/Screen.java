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
    Bank customer = new Bank("ads", 123, 1234);
    


    //create a button
    JButton loginButton;
    JButton withdrawB;
    JButton depositB;
    
    JTextField userInput;
    //create bank customer
    

	// Initialization Constructor
	public Screen() {
        loginButton = new JButton("Login");
        depositB = new JButton("Depo");
        withdrawB = new JButton("$_$");
        userInput = new JTextField();
        customer = new Bank("Cormey Smith", 350.50, 1234);

        setLayout(null);
        //set up locaiton and size for textbox
        loginButton.setBounds(50, 350, 100, 30);
        withdrawB.setBounds(175, 350, 80, 30);
        depositB.setBounds(300, 350, 80, 30);

        
        userInput.setBounds(50, 300, 100, 30);
        add(loginButton);
        add(userInput);
        add(withdrawB);
        add(depositB);
        
        loginButton.addActionListener(this);
        withdrawB.addActionListener(this);
        depositB.addActionListener(this);
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
            else if (event.getSource() == withdrawB){
                String withdrawString = userInput.getText();
                int withdrawInt = Integer.parseInt(withdrawString);
                customer.withdraw(withdrawInt);
                userInput.setText(customer.getBalance() + "");
            }
            else if (event.getSource() == depositB){
                String depositString = userInput.getText();
                int depositInt = Integer.parseInt(depositString);
                customer.deposit(depositInt);
                userInput.setText(customer.getBalance() + "");
            }
			//This line MUST be here refresh the screen
			repaint();

	}
	
}
