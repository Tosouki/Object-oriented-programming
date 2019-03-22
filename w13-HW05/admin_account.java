package game.admin;
import game.*;
public class admin_account extends Game_account{
	
	private String admin_name;
	private String admin_email;
	private static int admin_ID;

	public admin_account(String account,String password,String admin_name,String admin_email,int admin_ID) {
		super(account,password);
		setadmin_name(admin_name);
		setadmin_email(admin_email);
		setadmin_ID(admin_ID);
	}
	public void setadmin_name(String admin_name){
		this.admin_name=admin_name;
						}
	public String getadmin_name(){
		return admin_name;
						}	
	public void setadmin_email(String admin_email){
		String email2[];
		char email3[];
		int a=0;
		email3=admin_email.toCharArray();
		for(int i=0;i<email3.length;i++){
		if(email3[i]=='@')a++;
					}
		if(a>0){
		email2=admin_email.split("@");
		if(email2[1].equals("kuas.edu.tw")||email2[1].equals("gmail.com"))
		this.admin_email=admin_email;
		else
		this.admin_email=null;	
			}
		else
		this.admin_email=null;
						}
	public String getadmin_email(){
		return admin_email;
						}
	public void setadmin_ID(int admin_ID){
		this.admin_ID=admin_ID;
						}
	public int getadmin_ID(){
		return admin_ID;
						}
	public void showProfile(){
		super.showProfile();
		System.out.println("admin_name:"+admin_name+"\nadmin_email:"+admin_email+"\nadmin_ID:"+admin_ID+"\n");
				}
}
