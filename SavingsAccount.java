import java.util.*;

class SavingsAccount extends CheckingAccount {
	double interestRate;

	public static void main(String[] args){
		SavingsAccount savings = new SavingsAccount();
		savings.start();
	} // end main

	public double getInterestRate(){
		return this.interestRate;
	} // end getter

	public void getInterestRate(double interestRate){
		this.interestRate = interestRate;
	} // end setter

	public void calcInterestRate(){
		double interest = this.balance * this.interestRate;
		this.balance += interest;
	} // end calcInterestRate
} // end class

