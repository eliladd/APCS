import javax.swing.JFrame;

public class Runner {
    public static void main(String[] args){
        JFrame fr = new JFrame("Slots");
		Screen sc = new Screen();
		
		fr.add(sc);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.pack();
		fr.setVisible(true);
    }
}