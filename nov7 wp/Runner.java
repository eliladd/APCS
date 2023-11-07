public class Runner {
    public static void main(String[] args){
        ForPractice yes = new ForPractice();
        yes.printEven(25);
        System.out.println();
        if (yes.findNum(9,20,7) == -1){
            System.out.println("A number was not found");
        }
        else{
            System.out.println(yes.findNum(9,20,7));
        }
        
        if (yes.findNum(12,21,11) == -1){
            System.out.println("A number was not found");
        }
        else{
            System.out.println(yes.findNum(12,21,11));
        }
        

    }
}
