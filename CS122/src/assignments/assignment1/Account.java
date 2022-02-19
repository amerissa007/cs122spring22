package assignments.assignment1;

public class Account {
	
	private int id;
	private double balance;
	private double annualInterestRate;
	
	public Account() {
		id = 0;
		balance = 0.0;
		annualInterestRate = 0.0;
	}
	
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public double getMonthlyInterestRate(double monthlyInterestRate) {
		monthlyInterestRate = annualInterestRate/12;
		return monthlyInterestRate;
	}
	
	public void deposit(double amount) {
		this.balance = this.balance + amount;
		
	}
	
	public void withdraw(double amount) {
		if (amount<this.balance)
			this.balance = this.balance - amount;
		else
			System.out.println("Balance not sufficient.");
		
	}



}
