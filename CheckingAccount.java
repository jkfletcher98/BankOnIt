class CheckingAcount implements HasMenu {
	double balance;

	public CheckingAccount(){

	} // end initializer

	public CheckingAccount(double balance){

	}

	public String menu(){
		System.out.println("0) Quit");
		System.out.println("1) Check balance");
		System.out.println("2) Make a deposit");
		System.out.println("3) Make a withdrawal");

		String response = input.nextLine();
		return response;
	} // end menu

	public double getBalance(){
		return this.balance;
	} // end getBalance

	public void setBalance(double balance){
		this.balance = balance;
	} // end setBalance

	public String getBalanceString(){
		System.out.println(

	public void makeDeposit(){
		System.out.println("Deposit amount: ");
		int deposit = input.nextLine();
		
		this.balance += deposit;
	} // end makeDeposit

	public void makeWithdrawal(){
		System.out.println("Withdrawal amount: ");
		int withdrawal = input.nextLine();

		this.balance -= withdrawal;
	} // end makeWithdrawal


