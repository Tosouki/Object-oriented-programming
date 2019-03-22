import java.io.*;

public class app1{
        public static void main(String[]args)throws IOException{
                BufferedReader buf;
                String str,sex,bir,from;
                
                buf=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("請輸入你的姓名:");
                str = buf.readLine();
                
                buf=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("請輸入你的性別:");
                sex = buf.readLine();
                
                buf=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("請輸入你的西元出生年份:");
                bir = buf.readLine();
                
                buf=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("請輸入你的出生地:");
                from = buf.readLine();
                
                System.out.println("姓名:"+str);
                System.out.println("性別:"+sex);
                System.out.println("西元出生年份:"+bir);
                System.out.println("出生地:"+from);
        }
}
