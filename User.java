import java.util.*

abstract User implements HasMenu, Serializable {
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

	public vois setPIN(String PIN){
		this.PIN = PIN;
	} // end setPIN
