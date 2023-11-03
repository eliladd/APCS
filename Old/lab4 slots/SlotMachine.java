public class SlotMachine {
    int num1, num2, num3, winnings = 0, balance, bet;
    boolean gotJack = false;
    public SlotMachine(int aBalance){
        balance = aBalance;
    }
    public int getBalance(){
        return balance;
    }
    public void setBet(int aBet){
        bet = aBet;
    }
    public void roll(){
        num1 = (int)(Math.random()*9+1);
        num2 = (int)(Math.random()*9+1);
        num3 = (int)(Math.random()*9+1);
        System.out.println(num1+" " +num2+" " +num3);
        checkResults();
        
    }
    public void checkResults(){
        if (num1 == 7 && num2 == 7 && num3 == 7){
            updateBalence(100*bet);
            gotJack = true;
        }
        else if (num1 == num2 && num1 == num3 && num2 == num3){
            updateBalence(5*bet);
        }
        //two of the same number
        else if (num1 == num2 || num1 == num3 || num2 == num3){
            updateBalence(2*bet);
        }
        else{
            updateBalence(-1 * bet);
        }
        //System.out.println("ballance: " + balance);
    }
    private void updateBalence(int aChange){
        balance += aChange;
    }
    public int getBetSize(){
        return bet;
    }
    public boolean gotJack(){
        return gotJack;
    }
}
