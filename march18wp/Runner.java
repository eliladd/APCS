import java.util.ArrayList;

abstract class item{
    private String name;
    private double price;
    public item(String name, double price){
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return "the price is: " + price;
    }
}
class Toy extends item{
    private String company ;
    public Toy(String name, double price, String company ){
        super(name, price);
        this.company  = company ;
    }
    public String toString(){
        return "this toy is a " + getName() + " and is made by " + company + super.toString();
    }
}
class Food extends item{
    public Food(String name, double price){
        super(name, price);
    }
    public String toString(){
        return "this food item is " + super.getName() + "\n" + super.toString();
    }
}
public class Runner {
    public static void main(String[] args){
        ArrayList<item> items = new ArrayList<item>();
        items.add(new Food("apple", .75));
        items.add(new Food("milk", 2.99));
        items.add(new Toy("Game", 19.99, "ABC inc."));
        items.add(new Toy("Puzzle", 15.99, "DEF Inc."));
        for(item i : items){
            System.out.println(i);
        }
    }
}
