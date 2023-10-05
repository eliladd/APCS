public class Runner {
    public static void main(String[] args){
        MiniBank bank = new MiniBank(100, 1234);
        double balence;
        bank.setAccess(1234);
        System.out.println(bank.getBalance());
        bank.deposit(25);
        balence = bank.getBalance();
        if (balence >=80){
            bank.widthDraw(80);
        }
        System.out.println(bank.getBalance());
        if (bank.getBalance() == -1){
            System.out.println("You dont have Access!");
        }

    }
}
