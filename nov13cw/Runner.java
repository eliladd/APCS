import java.util.Scanner;
public class Runner{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Item[] myItems = new Item[11];
        myItems[0] = new Item("book", 9.99);
        myItems[1] = new Item("cat", 12.99);
        myItems[2] = new Item("dog", 30.30);
        myItems[3] = new Item("green", 2.99);
        myItems[4] = new Item("pencil", 1.99);
        myItems[5] = new Item("teacher", 89.99);
        myItems[6] = new Item("phone", 60.00);
        myItems[7] = new Item("fork", 3.99);
        myItems[8] = new Item("veggie", .99);
        myItems[9] = new Item("time", 99.99);
        myItems[10] = new Item("a life", 99999.00);
        System.out.println("what option? (1-list items, 2-find object from price, 3-find price from name, 4-quit)");
        int num = sc.nextInt();
        while (num != 4){
            switch (num) {
                        case 1:
                            for(int i = 0; i < myItems.length; i++){
                                //System.out.println(i);
                                System.out.println(myItems[i].toString());
                                
                            }
                            System.out.println("what option? (1-list items, 2-find object from price, 3-find price from name, 4-quit)");
                            num = sc.nextInt();
                            break;
                    
                        case 2:
                            System.out.println("What price is the object? ");
                            double userinput = sc.nextDouble();
                            for(int i = 0; i < myItems.length; i++){
                                //System.out.println(myItems[i].getPrice());
                                if( userinput == myItems[i].getPrice() ){
                                    System.out.println(myItems[i].toString());
                                   // System.out.println("TRIGGER ");
                                   break;
                                }
                            }
                            System.out.println("what option? (1-list items, 2-find object from price, 3-find price from name, 4-quit)");
                            num = sc.nextInt();
        
                            break;
                    
                        case 3:
                            System.out.println("What is the name of the object? ");
                            String userinput3 = sc.next();
                             for(int i = 0; i < myItems.length; i++){
                                if(myItems[i].getName().equals(userinput3)){
                                    System.out.println(myItems[i].toString());
                                }
                            }
                            System.out.println("what option? (1-list items, 2-find object from price, 3-find price from name, 4-quit)");
                            num = sc.nextInt();
                            break;
                    
                        default:
                            System.out.println("what option? (1-list items, 2-find object from price, 3-find price from name, 4-quit)");
                            num = sc.nextInt();
                            break;
                    }
        }
        
    }
}