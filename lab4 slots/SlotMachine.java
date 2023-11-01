public class SlotMachine {
    int num1, num2, num3, winnings = 0, balance, bet;
    public SlotMachine(int aBalance){
        balance = aBalance;
    }
    public int getBalance(){
        return balance;
    }
    public void roll(int aBet){
        num1 = (int)(Math.random()*9+1);
        num2 = (int)(Math.random()*9+1);
        num3 = (int)(Math.random()*9+1);
        bet = aBet;
        
    }
    public void checkResults(){
        if (num1 == 777 && num2 == 777 && num3 == 777){
            updateBalence(100*bet);
        }
        else if (num1 == num2 && num1 == num3 && num2 == num3){
            updateBalence(5*bet);
        }
        //two of the same number
        else if (num1 == num2 || num1 == num3 || num2 == num3){
            updateBalence(2*bet);
        }
    }
    private void updateBalence(int aChange){
        balance += aChange;
    }
}
