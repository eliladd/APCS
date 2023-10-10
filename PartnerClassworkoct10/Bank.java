public class Bank{

	private String name;
	private int pin;
	private double balance;
	private boolean access;
	
	//Initialize constructor
	public Bank(String name, double balance, int pin) {
		this.name = name;
		this.pin = pin;
		this.balance = balance;
		this.access = false;
	}
	
	//If access is true, return the name of the customer
	public String getName() {
		return name;
	}	
	
	//Return the access (true or false)
	public boolean getAccess() {
		return access;
	}
	
	//Check to see if the pin is valid
	public void checkPin(int pin) {
		if (pin == this.pin)
			access = true;
	}

	// Return the balance
	public double getBalance() {
		return balance;
	}
    public double withdraw(double aWithdrawNum){
        if (access = true){
            balance -= aWithdrawNum;
            return balance;
        }
        return 0;

    }
    public double deposit(double aDepositNum){
        if (access = true){
            balance += aDepositNum;
            return balance;
        }
        return 0;
    }
    public double emptyAccount(){
        if (access = true){
            balance = 0;
            return balance;
        }
        return 0;
    }
	
}