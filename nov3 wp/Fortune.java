public class Fortune {
    public String getFortune(int aNum){
        int num = aNum;
        if ((num % 2)==0 && num>8){
            return "You will have good luck";
        }
        else if ((num % 5)==0 || num<9){
            return "You will not have good or bad luck.";
        }
        else{
            return "You will have bad luck.";
        }
    }   
    public void tellFortune(int aNum){
        switch (aNum) {
            case 2:
                System.out.println("You will have good luck");
                break;
        
            case 5:
                System.out.println("You will not have good or bad luck");
                break;
        
            default:
                System.out.println("You will have bad luck");
                break;
        }
    }
}
