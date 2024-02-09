import javax.swing.JFrame;
public class Runner { 

	public static void main(String[] args){

		JFrame frame = new JFrame("BLACKJACK w/ ARRAY!!!!!!!!!");
		 
		Table tb = new Table();
		frame.add(tb);
		 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		 
	}
}	