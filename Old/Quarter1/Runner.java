import java.util.Scanner;
import javax.swing.JFrame;
// Runner that can be used with JPanel Graphics
public class Runner {
	public static void main( String args[] ) {
        Scanner sc = new Scanner(System.in);
        // Create the frame object. Give it a title appropriate to the application
        JFrame frame = new JFrame("Scenery");
        System.out.print("What season is it? (Winter, Fall, Spring)");
        String season = sc.nextLine();
        System.out.print("Is it Day or Night? ");
        String time = sc.nextLine();
        //Create the JPanel object and add it to the frame
        Scenery canvas = new Scenery(season, time);
        frame.add(canvas);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        canvas.animate();
    }
}