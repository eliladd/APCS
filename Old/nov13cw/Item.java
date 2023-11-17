public class Item {
    private String name;
    private double price;
    public Item(String aName, double aPrice){
        name = aName;
        price = aPrice;
    }
    public double getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }
    public String toString(){
	    return name  + " : " + price;

    }
}
