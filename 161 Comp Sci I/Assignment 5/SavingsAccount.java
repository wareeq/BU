public class SavingsAccount{
	private double balance;
	private double interestRate;

	public SavingsAccount(double amount, double annualInterestRate){
		this.balance = amount;
		this.interestRate = annualInterestRate;
	}

	public SavingsAccount(){
		this.balance = 0.0;
		this.interestRate = 0.0;
	}

	//subtract the amount of withdrawal from the balance.
	public void withdraw(double amount){
		this.balance -= amount;
	}

	//add deposit to the balance.
	public void deposit(double amount){
		this.balance += amount;
	}

	//add the monthly interest to the balance.
	public void addInterest(){
		this.balance += (this.interestRate / 12) * this.balance;
	}

	//return the monthly interest.
	public double calcInterest(){
		return (this.interestRate / 12) * this.balance;
	}
	
	public double getBalance(){
		return this.balance;
	}


}