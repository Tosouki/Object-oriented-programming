import java.io.*;

public class app1{
        public static void main(String[]args)throws IOException{

               BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));

               int time,day,hour,min,sec;

               System.out.println("請輸入秒數:");
               time =Integer.parseInt(buf.readLine());
               System.out.print("一共經過");

               if(time>=86400){
               day=time/86400; 
               System.out.print(+day+"天");
               time=time-86400*day; 

                     if(86400>time&time>=3600){
                     hour=time/3600;
                     System.out.print(+hour+"小時");
                     time=time-3600*hour;
                            }
                     if(3600>time&time>=60){
                     min=time/60;
                     System.out.print(+min+"分鐘");
                     time=time-60*min;
                            }
                      if(time<60&time>0){
                     sec=time;
                     System.out.print(+sec+"秒");
                             }
                 }

                 else if(86400>time&time>=3600){
                 hour=time/3600;
                 System.out.print(+hour+"小時");
                 time=time-3600*hour;

                         if(3600>time&time>=60){
                         min=time/60;
                         System.out.print(+min+"分鐘");
                         time=time-60*min;
                            }
                         if(time<60&time>0){
                         sec=time;
                         System.out.print(+sec+"秒");
                             }
                 }

                 else if(3600>time&time>=60){
                 min=time/60;
                 System.out.print(+min+"分鐘");
                 time=time-60*min;

                        if(time<60&time>0){
                        sec=time;
                        System.out.println(+sec+"秒");
                        }
                 }

                 else if(time<60){
                 sec=time;
                 System.out.println(+sec+"秒");
                 }
        }
}
