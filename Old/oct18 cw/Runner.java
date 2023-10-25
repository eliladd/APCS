import javax.swing.JFrame;

public class Runner {
	public static void main( String args[] ) {
        
        // Create the frame object. Give it a title appropriate to the application
        JFrame frame = new JFrame("Scene with animation. how long can this go? idk will it wrap or do a ... thing? lets find out!!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!!!!");

        //Create the JPanel object and add it to the frame
         Animate canvas = new Animate();

        
        frame.add(canvas);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        /* You MUST add this line. Start the animate method 
        that will run continously. animate() goes in your java class that has 
        paintComponent(). */
        canvas.animate();

        
    }
}