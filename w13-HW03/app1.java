import java.io.*;

public class app1 {
	public static void main(String arg[]) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String account[]={"abc125","ghj583","","",""};
		String a ;
		do{
		System.out.print("請輸入帳號：");
		a = buf.readLine();
		if(a.equals(account[0])|a.equals(account[1]))
		System.out.print("帳號重複!");
		}while(a.equals(account[0])|a.equals(account[1]));
		System.out.print("請輸入密碼：");
		for(int i=0;i<account.length;i++){
			if(account[i].equals(""))
			account[i]=a;
						}
		String p = buf.readLine();
		String p2;
		do{
		System.out.print("請再次輸入密碼：");
		p2 = buf.readLine();
		if(!p2.equals(p))
		System.out.print("錯誤!");		
		}while(!p2.equals(p));
		Game_account c = new Game_account(a,p);
		c.showProfile();
        }
}
