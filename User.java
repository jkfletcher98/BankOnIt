import java.util.*;

abstract class User implements HasMenu, Serializable {
	String userName;
	String PIN;

	public String getUserName(){
		return userName;
	} // end getUserName

	public void setUserName(String userName){
		this.userName = userName;
	} // end set UserName

	public String getPIN(){
		return PIN;
	} // end getPIN

	public void setPIN(String PIN){
		this.PIN = PIN;
	} // end setPIN

	public boolean login(String userNameIn, String pinIn){
		boolean result = false;
		if (userNameIn.equals(this.userName)){
			if (pinIn.equals(this.PIN)){
				result = true;
				System.out.println("Login successful!");
			} else {
				System.out.println("Incorrect PIN");
			} // end if
		} else {
			System.out.println("Incorrect Username");
		} // end if

		return result;
	} // end login

} // end class
