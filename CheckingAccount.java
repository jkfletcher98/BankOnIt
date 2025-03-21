import java.util.*;

class CheckingAccount implements HasMenu {
	double balance;

	public static void main(String[] args){
		CheckingAccount checking = new CheckingAccount();
		checking.start();
	} 

	public CheckingAccount(){
          this.balance = 0d;
	} // end initializer

	public CheckingAccount(double balance){
          this.balance = balance;
	}

	public String menu(){
		Scanner input = new Scanner(System.in);
		System.out.println("0) Quit");
		System.out.println("1) Check balance");
		System.out.println("2) Make a deposit");
		System.out.println("3) Make a withdrawal");

		String response = input.nextLine();
		return response;
	} // end menu

        public void start(){
                boolean keepGoing = true;
		while (keepGoing){
			String response = menu();
			if (response.equals("0")){
				keepGoing = false;
			} else if (response.equals("1")){
				this.checkBalance();
			} else if (response.equals("2")){
				this.makeDeposit();
			} else if (response.equals("3")){
				this.makeWithdrawal();
			} else {
				System.out.println("Please enter 0-3");
			} // end if
		} // end while
	} // end start

	public double getBalance(){
		return this.balance;
	} // end getBalance

	public void setBalance(double balance){
		this.balance = balance;
	} // end setBalance

	public String getBalanceString(){
		//System.out.println("$" + this.balance);
		String result = String.format("$%.02f", this.balance);
		return result;
	}// end getBalanceString

	public void checkBalance(){
	        System.out.println("Currect balance: " + getBalanceString());
		
	} //end checkBalance

	public void makeDeposit(){
		Scanner input = new Scanner(System.in);
		System.out.println("Deposit amount: ");
		double deposit = Double.parseDouble(input.nextLine());
		
		this.balance += deposit;
	} // end makeDeposit

	public void makeWithdrawal(){
		Scanner input = new Scanner(System.in);
		System.out.println("Withdrawal amount: ");
		double withdrawal = Double.parseDouble(input.nextLine());

		this.balance -= withdrawal;
	} // end makeWithdrawal
} // end class def

