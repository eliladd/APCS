package bank;

public class AccountManager {

    private Account[] account;

    public AccountManager() {
        account = new Account[3];
        account[0] = new Account("John",1234,10.10);
        account[1] = new Account("Jen",1111,99.99);
        account[2] = new Account("Jay",4321,11.11);
    }

    public void printInfo() {
        for (int i = 0; i<3; i++) {
            System.out.println("The name is: " + account[i].name);
            System.out.println("The pin is: " + account[i].getPin());
            System.out.println("The balance is: " + account[i].balance);
            System.out.println();
        }
    }
}
