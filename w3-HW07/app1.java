import java.io.*;

public class app1{
        public static void main(String[]args)throws IOException{
               BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));

               int attack,damage;
               double buff,dama;

               System.out.println("輸入攻擊數值:");
               attack =Integer.parseInt(buf.readLine());
               System.out.println("輸入增益值:");
               buff =Double.parseDouble(buf.readLine());
               dama=attack*buff;
               damage=(int)dama;

               if(damage>=2147483647 & attack!=1 & buff!=1)
               System.out.println("增益造成傷害值:2147483647\n增益運算結果:「overflow」");

               else if(damage==0 )
               System.out.println("增益造成傷害值:0\n增益運算結果:「underflow」");

               else
               System.out.println("增益造成傷害值:"+damage+"\n增益運算結果:「正常」");   
        }
}
