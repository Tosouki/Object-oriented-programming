import game.Game_account;
import game.user.user_account;
import game.admin.admin_account;
import java.io.*;
public class app1 {
	public static void main(String arg[]) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int num=0;
		do{
                System.out.print("請輸入帳號：");
                String c = buf.readLine();
                System.out.print("請輸入密碼：");
                String p = buf.readLine();
                String p2;
            do{
                System.out.print("請再次輸入密碼：");
                p2 = buf.readLine();
            }while(!p2.equals(p));
            System.out.print("請輸入姓名：");
            String a = buf.readLine();
            System.out.print("請輸入信箱：");
            String b = buf.readLine();
            if(num==0){
                System.out.print("請輸入管理員編號：");
                int  n =Integer.parseInt(buf.readLine());
                admin_account admin = new admin_account(c,p,a,b,n);
                admin.showProfile();
              }
            if(num==1){
                user_account user1 = new user_account(c,p,a,b);
                user1.showProfile();
              }
            if(num==2){
                user_account user2 = new user_account(c,p,a,b);
                user2.showProfile();
              }
            num++;
		}while(num!=3);
			}
}
