import java.io.*;

public class app1{
        public static void main(String[]args)throws IOException{
        
                BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));

                int mooncake,price,cash,total;

                System.out.println("月餅單價為:");
                mooncake =Integer.parseInt(buf.readLine());

                System.out.println("請輸入欲購買的月餅數量:");
                price =Integer.parseInt(buf.readLine());

                System.out.println("請輸入付款金額:");
                cash =Integer.parseInt(buf.readLine());

                total=mooncake*price;

                if(total<=cash)
                        System.out.println("實付金額:"+cash+"，應付金額"+total+"，找零:"+(cash-total));
                else
                        System.out.println("付款金額不足");
        }
}
