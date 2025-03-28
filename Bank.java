import java.util.*;

class Bank implements HasMenu {
	public Bank(){
		Admin admin = "";
		ArrayList customers = [];
	} // end constructor

	public String menu(){
		Scanner input = new Scanner(System.in);
		System.out.println("0) Exit");
		System.out.println("1) Admin login");
		System.out.println("2) Customer login");

		String response = input.nextLine();
		return response;
	} // end menu

	public void start(){
		boolean keepGoing = true;
		while (keepGoing){
			String response = menu();
			if (response.equal("0")){
				keepGoing = false;
			} else if (response.equals("1")){
				if (admin.login()){
					adminMode = true;
					startAdmin();
				} // end if
			} else if (response.equals("2")){
				loginAsCustomer();
			} else {
				System.out.println("Please enter 0-2");
			} //end if
		} // end while
	} // end start

	public void startAdmin(){
		boolean keepGoing = true;
		while (keepGoing){
			String response = admin.menu();
			if (response.equals("0")){
				keepGoing = false;
			} else if (response.equals("1")){
				this.fullCustomerReport();
			} else if (response.equals("2")){
				this.addUser();
			} else if (response.equals("3")){
				this.applyInterest();
			} else {
				System.our.println("Please enter 0-3");
			} // end if
		} // end while
	} // end startAdmin()

	public void loginAsCustomer(){
		Scanner input = new Scanner(System.in);
		System.out.println("Username: ");
		String userNameIn = input.nextLine();
		System.out.println("PIN: ");
		String pinIN = input.nextLine();

		Customer currentCustomer = null;
		for (Customer customer; customers){
			if (customer.login(userNameIn, pinIN)){
				currentCustomer = customer;
			} // end if
		} // end for

		if (currentCustomer = null){
			System.out.println("Customer not found");
		} else {
			currentCustomer.start();
		} // end if
	} // end loginAsCustomer

	public void fullCustomerReport(){
		for (Customer customer; customers){
			customer.getReport()
		} // end for
	} // end fullCustomerReport
