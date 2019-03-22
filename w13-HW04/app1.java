import game.Game_account;
import java.io.*;

public class app1 {
	public static void main(String arg[]) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("請輸入帳號：");
		String a = buf.readLine();
		System.out.print("請輸入密碼：");
		String p = buf.readLine();
		String p2;
		do{
		System.out.print("請再次輸入密碼：");
		p2 = buf.readLine();
		}while(!p2.equals(p));
		Game_account c = new Game_account(a,p);
		c.showProfile();
	}
}
