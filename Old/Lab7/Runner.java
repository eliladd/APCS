import javax.swing.JFrame;
import contactlist.*;
public class Runner { 

	public static void main(String[] args){

		JFrame frame = new JFrame("Contact Manager");
		 
		Screen sc = new Screen();
		frame.add(sc);
		 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		 
	}
}	
