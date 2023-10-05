public class MiniBank {
    private double balence;
    private int pin;
    private boolean access = false;
    public MiniBank(double aBalence, int aPin){
        balence = aBalence;
        pin = aPin;
        access = false;
    }
    
    public void setAccess(int aPin){
        if (aPin == pin){
            access = true;
        }
        else{
            System.out.println("You dont have Access!");
        }
    }
    public void widthDraw(double aAmount){
        if (access == true){
            System.out.println("You withdrew " + aAmount + " dollars");
            balence -= aAmount;
            System.out.println("You now have " + balence + " dollars");
        }
        else{
            System.out.println("You dont have Access!");
        }

    }
    public void deposit(double aAmount){
        if (access == true){
            System.out.println("You added " + aAmount + " to your account");
            balence += aAmount;
            System.out.println("You now have " + balence + " dollars");
        }
        else{
            System.out.println("You dont have Access!");
        }
    }
    public double getBalance(){
        if (access == true){
            return balence;
        }
        else{
            return -1;
        }
    }
}

