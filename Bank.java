import java.util.*;
import java.util.ArrayList;

class Bank implements HasMenu {
	Admin admin = new Admin();
	ArrayList<String> customers = new ArrayList();

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
			if (response.equals("0")){
				keepGoing = false;
			} else if (response.equals("1")){
				if (admin.login(userNameIn, pinIn)){
					boolean adminMode = true;
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
				System.out.println("Please enter 0-3");
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
		for (Customer customer; customers;){
			if (customer.login(userNameIn, pinIN)){
				currentCustomer = customer;
			} // end if
		} // end for

		if (currentCustomer == null){
			System.out.println("Customer not found");
		} else {
			currentCustomer.start();
		} // end if
	} // end loginAsCustomer

	public void fullCustomerReport(){
		for (Customer customer; customers;){
			customer.getReport();
		} // end for
	} // end fullCustomerReport

	public void addUser(){
		Scanner input = new Scanner(System.in);
		customer = new Customer();

		System.out.println("New user username: ");
		String userNameIn = input.nextLine();
		customer.userName = this.userNameIN;

		System.out.println("New user PIN: ");
		String pinIN = input.nextLine();
		customer.PIN = this.pinIN;
	} // end addUser

	public void applyInterest(){
		for (Customer customer; customers;){
			customer.calcInterest();
		} // end for
	} // end applyInterest
} // end Bank
