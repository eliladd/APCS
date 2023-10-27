public class SlotMachine {
    int num1, num2, num3, winnings = 0, balance, bet;
    public SlotMachine(int aBalance){
        balance = aBalance;
    }
    public int getBalance(){
        return balance;
    }
    public void roll(){
        num1 = (int)(Math.random()*9+1);
        num2 = (int)(Math.random()*9+1);
        num3 = (int)(Math.random()*9+1);
        
    }
    public void checkResults(){

    }
    public void updateBalence(){

    }
}
