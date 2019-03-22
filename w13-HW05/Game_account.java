package game;
public class Game_account{
	private static int KeyID;
	private int UID;
	private String account,password;		

	public Game_account(String account,String password) {
		setaccount(account);
		setpassword(password);
		getKeyID();
		getUID();
	}
	public void setaccount(String account){
		this.account=account;
						}
	public String getaccount(){
		return account;
						}	
	public void setpassword(String password){
		this.password=password;
						}
	public String getpassword(){
		return password;
						}
	public int getKeyID(){
		return KeyID++;
						}
	public int getUID(){
		
		return UID=1105108100+KeyID;
						}
	public void showProfile(){
		System.out.println("account:"+account+"\npassword:"+password+"\nKeyID:"+KeyID+"\nUID:"+UID);
				}
}
