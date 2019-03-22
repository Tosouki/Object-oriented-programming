import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

class Game_account{
	private static int KeyID;
	private int UID;
	private final String account;
	private String password,Date;		
	Game_account(String account,String password){
		this.account=account;
		setpassword(password);
		getKeyID();
		getUID();
		getdate();
	}
	Game_account(String account,String password,String Date){
		this(account,password);
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
	public String getdate(){
	Date date= new Date();
   	SimpleDateFormat klio=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
   	klio.setTimeZone(TimeZone.getTimeZone("GMT+8"));
	String strDate = klio.format(date);
	return Date=strDate;
				}
	public void showProfile(){
		System.out.println("account:"+account+"\npassword:"+password+"\nKeyID:"+KeyID+"\nUID:"+UID+"\ndate:"+Date);
				}
}
