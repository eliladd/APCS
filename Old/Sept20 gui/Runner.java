import javax.swing.JFrame;
public class Runner {

	public static void main( String args[] ) {
        //(1) What parameter is passed to the constructor of JFrame? What does it do? this is a string, it sets the name of the window
        JFrame frame = new JFrame("Circle");

        //Create JPanel object and add it to the frame
        GuiCircle canvas = new GuiCircle();
        frame.add(canvas);

        //(2) What do you think this command does?
		//Comment the code out and test it.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //(3) What happens when you remove the code below? THIS SETS THE DRAWING, TELLS IT WHERE EVERYTHING GOES
        //Comment the code out and test it.
        frame.pack();

        //(4) What does setVisible do? What happens when you remove the code below? OPENS THE TERMINAL
        //Comment the code out and test it.
        frame.setVisible(true);

    }

}