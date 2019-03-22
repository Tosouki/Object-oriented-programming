package game.user;
import game.*;
public class user_account extends Game_account{
	private String user_name;
	private String user_email;

	public user_account(String account,String password,String user_name,String user_email) {
		super(account,password);
		setuser_name(user_name);
		setuser_email(user_email);
	}
	public void setuser_name(String user_name){
		this.user_name=user_name;
						}
	public String getuser_name(){
		return user_name;
						}	
	public void setuser_email(String user_email){
		String email2[];
		char email3[];
		int a=0;
		email3=user_email.toCharArray();
		for(int i=0;i<email3.length;i++){
		if(email3[i]=='@')a++;
					}
		if(a>0){
		email2=user_email.split("@");
		if(email2[1].equals("kuas.edu.tw")||email2[1].equals("gmail.com"))
		this.user_email=user_email;
		else
		this.user_email=null;	
			}
		else
		this.user_email=null;
						}
	public String getuser_email(){
		return user_email;
						}
	public void showProfile(){
		super.showProfile();
		System.out.println("user_name:"+user_name+"\nuser_email:"+user_email+"\n");
				}
}
