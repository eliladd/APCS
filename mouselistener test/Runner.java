import javax.swing.JFrame;

public class Runner {

    public static void main(String args[]) {

        JFrame frame = new JFrame("MouseTest");

        MouseTest mt = new MouseTest();
        frame.add(mt);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}

