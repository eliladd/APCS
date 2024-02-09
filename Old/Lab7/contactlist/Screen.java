package contactlist;
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


public class Screen extends JPanel implements ActionListener{

	Contact[] mylist;
	JButton firstName, lastName, username, domainName, domainExtension, showAll;
	JTextField searchField;
	int red = 0, green = 0, blue = 0;
	//create a color
	Color background = new Color(red, green, blue);
	Font font = new Font("Bauhaus 93", Font.PLAIN, 25);

	
	public Screen(){
		mylist = new Contact[10];
		mylist[0] = new Contact("John", "Doe", "john.doe@email.com");
		mylist[1] = new Contact("Jane", "Doe", "jane.doe@email.com");
		mylist[2] = new Contact("luke", "skywalker", "skywalker@jedicouncil.edu");
		mylist[3] = new Contact("darth", "vader", "vader@empire.gov");
		mylist[4] = new Contact("Kip", "Glazer", "kip.glazer@mvla.net");
		mylist[5] = new Contact("Evan", "Murdock", "buba@gmail.com");
		mylist[6] = new Contact("Ronan", "Ercan", "ronanercan1@gmail.com");
		mylist[7] = new Contact("Charlotte", "Eastham", "coolestpersonever@gmail.com");
		mylist[8] = new Contact("Star", "Rail", "StarRail@mihoyo.net");
		mylist[9] = new Contact("Pancho ", "Morris", "ZacharyMorris@gmail.com");
		// Create a button,  Search buttons are for the first name, last name, username, domain name, and domain extension
		firstName = new JButton("First Name");
		lastName = new JButton("Last Name");
		username = new JButton("Username");
		domainName = new JButton("Domain Name");
		domainExtension = new JButton("Domain Extension");
		showAll = new JButton("Show all");
		searchField = new JTextField();
		searchField.setText("search");

		setLayout(null);
		// Set the position and size of buttons
		firstName.setBounds(50, 350, 200, 50); 
		lastName.setBounds(150, 400, 200, 50);
		username.setBounds(250, 350, 200, 50); 
		domainName.setBounds(350, 400, 200, 50); 
		domainExtension.setBounds(450, 350, 250, 50);  
		searchField.setBounds(50, 300, 200, 50);
		showAll.setBounds(250, 450,200,50);


		firstName.setFont(font);
		lastName.setFont(font);
		username.setFont(font);
		domainName.setFont(font);
		domainExtension.setFont(font);
		searchField.setFont(font);
		showAll.setFont(font);
		//add the buttons to the screen
		add(firstName);
		add(lastName);
		add(username);
		add(domainName);
		add(domainExtension);
		add(searchField);
		add(showAll);
		
		setFocusable(true);	
		// Set up to listen for the button clicks
		firstName.addActionListener(this); // this refers to the current screen object
		lastName.addActionListener(this); // this refers to the current screen object
		username.addActionListener(this); // this refers to the current screen object
		domainName.addActionListener(this); // this refers to the current screen object
		domainExtension.addActionListener(this); // this refers to the current screen object
		showAll.addActionListener(this);

	}
	
	public Dimension getPreferredSize(){
		//Sets the size of the panel
		return new Dimension(800,600);
	}
 
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setFont(font);
		//draw background
		for(int i = 800; i > 0; i-=5){
			g.setColor(background);
			
			if (red < 255 && green < 255 && blue < 255){
				g.setColor(background);
				red += 1;
				green += 1;
				blue += 1;
				System.out.println(red+" " +green+" " +blue+ " i= "+i);
				g.fillRect(0, 0, 800, i);
				background = new Color(red, green, blue);
			}
			
			
		}
		red = 0;
		green = 0;
		blue = 0;
		background = new Color(red, green, blue);
		//g.setColor(background);
		//g.fillRect(0, 0, 800, 600);
		int yPos = 50;
		g.setColor(Color.WHITE);
		for(Contact person : mylist){
			if(person.isVisable()){
				g.drawString(person.toString(), 50, yPos);
				yPos+=25;
			}
		}
		
	
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == firstName) {
			for (int i = 0; i < mylist.length; i++) {
				if (mylist[i].getFirstName().equals(searchField.getText().toLowerCase())) {
					mylist[i].show();
				}
				else{
					mylist[i].hide();
				}
			}
		}
		if (e.getSource() == lastName) {
			for (int i = 0; i < mylist.length; i++) {
				if (mylist[i].getLastName().equals(searchField.getText().toLowerCase())) {
					mylist[i].show();
				}
				else{
					mylist[i].hide();
				}
			}
		}
		if (e.getSource() == username) {
			for (int i = 0; i < mylist.length; i++) {
				if (mylist[i].getUsername().equals(searchField.getText().toLowerCase())) {
					mylist[i].show();
				}
				else{
					mylist[i].hide();
				}
			}
		}
		if (e.getSource() == domainName) {
			for (int i = 0; i < mylist.length; i++) {
				if (mylist[i].getDomainName().equals(searchField.getText().toLowerCase())) {
					mylist[i].show();
				}
				else{
					mylist[i].hide();
				}
			}
		}
		if (e.getSource() == domainExtension) {
			for (int i = 0; i < mylist.length; i++) {
				if (mylist[i].getDomainExtension().equals(searchField.getText().toLowerCase())) {
					mylist[i].show();
				}
				else{
					mylist[i].hide();
				}
			}
		}
		if (e.getSource() == showAll){
			for (int i = 0; i < mylist.length; i++) {
					mylist[i].show();
			}
		}
		repaint();

	}

}