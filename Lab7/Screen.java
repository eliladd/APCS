import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Screen extends JPanel implements ActionListener{

	
	public Screen(){
		
		setLayout(null);
		

		
		setFocusable(true);	
		
	}
	
	public Dimension getPreferredSize(){
		//Sets the size of the panel
		return new Dimension(800,600);
	}
 
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);

	
	}

	public void actionPerformed(ActionEvent e) {
	

	}

}