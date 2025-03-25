import java.util.*;

class Admin extends User {
	public Admin(){
	}

	public String menu(){
		Scanner input = new Scanner(System.in);
		System.out.println("0) Exit system");
		System.out.println("1) Admin login");
		System.out.println("2) Customer login");
		
		String response = input.nextLine();
		return response;
	} // end menu
