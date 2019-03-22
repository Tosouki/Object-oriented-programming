import java.io.*;

public class app1{
        public static void main(String[]args)throws IOException{
                BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));

                int year;
   
                System.out.println("輸入西元年份:");
                year =Integer.parseInt(buf.readLine());

                if(year%4==0&year%100!=0)
                System.out.println("西元"+year+"是閏年");
                else if(year%4==0 & year%100==0 & year%400==0)
                System.out.println("西元"+year+"是閏年");
                else
                System.out.println("西元"+year+"不是閏年");
        }
}
