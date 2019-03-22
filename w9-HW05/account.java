import java.io.*;

class account {
	private String name,account,password;
	private int money;
	BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
	void set_name(String num){
		name=num;
	}
	public String get_name(){
		return name;
				}
	void set_account(String account2)throws IOException{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		int a,b,c=0,i,y;
   		String account3[]=account2.split("");
		char account4[]=account2.toCharArray();
		if(Character.isUpperCase(account4[0])||Character.isLowerCase(account4[0])){
		c++;}
		for(i=0,a=0,b=0;i<account3.length;i++){
			if(Character.isUpperCase(account4[i])||Character.isLowerCase(account4[i])){
			a++;}
			else if(Character.isDigit(account4[i])){
			b++;}
							}
		if(c==0||a==0||b==0||account3.length<8||account3.length>12){
			System.out.print("\n創建帳號請符合以下三條件\n(1)開頭必須為英文\n(2)帳號長度需為8~12\n(3)帳號內至少需要一個數字及英文\n\n請重新輸入:");
			set_account(buf.readLine());	
			}
		if(account3.length>=8&&account3.length<=12&&a!=0&&b!=0)
		account=account2;
	}
	public String get_account(){
		return account;
				}
	void set_password(String password2){
		password=password2;
	}
	public String get_password(){
		return password;
				}
	void set_money(int num4)throws IOException{
		if(num4>=0)
		money=num4;
		else{
			System.out.print("錯誤,請重新輸入:");
			set_money(Integer.parseInt(buf.readLine()));
			}
	}
	public int get_money(){
		return money;
				}
}
