import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class app1{
        public static void main(String[]args)throws IOException{
           BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));

           int y;		
           Date date = new Date();
           String d[]={"舊金山","倫敦","巴黎","曼谷","台灣","東京","雪梨"};
           String city;
           System.out.print("請輸入要查詢的城市：");
           city=buf.readLine();
           for(y=0;y<d.length;y++){
          if(d[y].equals(city)){
                 SimpleDateFormat klio=new SimpleDateFormat("HH:mm:ss");
            if(y==0)
                 klio.setTimeZone(TimeZone.getTimeZone("GMT-8"));
            else if(y==1)
                 klio.setTimeZone(TimeZone.getTimeZone("GMT"));
            else if(y==2)
                 klio.setTimeZone(TimeZone.getTimeZone("GMT+1"));
            else if(y==3)
                 klio.setTimeZone(TimeZone.getTimeZone("GMT+7"));
            else if(y==4)
                 klio.setTimeZone(TimeZone.getTimeZone("GMT+8"));
            else if(y==5)
                 klio.setTimeZone(TimeZone.getTimeZone("GMT+9"));
            else if(y==6)
                 klio.setTimeZone(TimeZone.getTimeZone("GMT+11"));
               String strDate = klio.format(date);
               System.out.print(d[y]+"現在時間:"+strDate);		
            break;}
          if(y==(d.length-1))
               System.out.print("查無此城市");
                }   
        }
}
