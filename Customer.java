import java.util.*;

class Customer extends User {
	CheckingAccount checking = new CheckingAccount();
	SavingsAccount savings = new SavingsAccount();

	public static void main(String[] args){
		Customer customer = new Customer();
		customer.start();
	} // end main

	public String menu(){
		Scanner input = new Scanner(System.in);
		System.out.println("0) Exit");
		System.out.println("1) Manage checking account");
		System.out.println("2) Manage savings account");
		System.out.println("3) Change PIN");

		String response = input.nextLine();
		return response;
	} // end menu

	public void start(){
		boolean keepGoing = true;
		while (keepGoing){
			String response = menu();
			if (response. equals("0")){
				keepGoing = false;
			} else if (response.equals("1")){
				this.checking.start();
			} else if (response.equals("2")){
				this.savings.start();
			} else if (response.equals("3")){
				this.changePIN();
			} else {
				System.out.println("Please enter 0-3");
			} // end if
		} // end while
	} // end start

	public void changePIN(){
		Scanner input = new Scanner(System.in);
		System.out.println("Input new PIN: ");
		String newPIN = input.nextLine();
		this.PIN = newPIN;
	} // end changePIN

} // end Customer

