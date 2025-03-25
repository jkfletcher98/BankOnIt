import java.util.*;

class Admin extends User {
	public Admin(){
		String userName = "admin";
		String PIN = "0000";
	}

	public String menu(){
		Scanner input = new Scanner(System.in);
		System.out.println("0) Quit");
		System.out.println("1) Full customer report");
		System.out.println("2) Add user");
		System.out.println("3) Apply interest to savings account");
		
		String response = input.nextLine();
		return response;
	} // end menu

	public void start(){
		// will be written in bank
	} // end start

} // end class
