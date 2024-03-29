import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.util.ArrayList;


public class Screen extends JPanel{
	private ArrayList<Automobile> carList;
	int speed = 5;
    public Screen(){
		carList = new ArrayList<Automobile>();
		carList.add(new SmallCar(Color.red, 0, 320));


		
		setLayout(null);
		setFocusable(true);
	}
	
	@Override
	public Dimension getPreferredSize(){
		return new Dimension(800,600);
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		//draw a road
		g.setColor(Color.gray);
		g.fillRect(0, 300, 800, 200);

		
		//draw cars
		for(Automobile car : carList){
            car.drawCar(g);
        }
		if (carList.get(0).getX() > 800){
			carList.remove(0);
			//add a random car
			int random = (int)(Math.random()*9);
			if (random == 0){
				carList.add(new SmallCar(Color.red, 0, 320));
			}
			else if (random== 1){
				carList.add(new CompactCar(Color.red, 0, 320));
			}
			else if (random == 2){
				carList.add(new MediumCar(Color.red, 0, 320));
			}
			else if (random == 3){
				carList.add(new Sedan(Color.red, 0, 320));
			}
			else if (random == 4){
				carList.add(new BigCar(Color.red, 0, 320));
			}
			else if (random == 5){
				carList.add(new SUV(Color.red, 0, 320));
			}
			else if (random == 6){
				carList.add(new SmallSportsCar(Color.red, 0, 320));
			}
			else if (random == 7){
				carList.add(new Truck(Color.red, 0, 320));
			}
			else if (random == 8){
				carList.add(new SportsCar(Color.red, 0, 320));
			}
			speed = (int)(Math.random()*10) + 1;
		}
	}

	// move the cars on the roads
	public void animate(){
		while(true){
			//wait for .01 second
			try {
			    Thread.sleep(10);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
		
			
		    // put your animate code here
			for(Automobile car : carList){
				car.move(speed);
			}
		
		    repaint();
		}
	}
	
}