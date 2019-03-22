import java.io.*;

public class app1{
        public static void main(String[]args)throws IOException{
               BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));

               int month,date;
               System.out.print("請輸入月份:");
               month =Integer.parseInt(buf.readLine());
               System.out.print("請輸入日期:");
               date=Integer.parseInt(buf.readLine());
               if(month>0&&month<13){
               switch(month){
               case 1:
                     if(date>0&&date<21){
                     System.out.print("您的星座為:魔羯座");
                     break;             
                     }
                     else if(date>20&&date<32){
                     System.out.print("您的星座為:水瓶座");
                     break;             
                     }
                     else{
                     System.out.println("請輸入正確的日期");
                     break;
                     }
               case 2:
                     if(date>0&&date<21){
                     System.out.print("您的星座為:水瓶座");
                     break;             
                     }
                     else if(date>20&&date<30){
                     System.out.print("您的星座為:雙魚座");
                     break;             
                     }
                     else{
                     System.out.println("請輸入正確的日期");
                     break;
                     }
               case 3:
                     if(date>0&&date<21){
                     System.out.print("您的星座為:雙魚座");
                     break;             
                     }
                     else if(date>20&&date<32){
                     System.out.print("您的星座為:牡羊座");
                     break;             
                     }
                     else{
                     System.out.println("請輸入正確的日期");
                     break;
                     }   
               case 4:
                     if(date>0&&date<21){
                     System.out.print("您的星座為:牡羊座");
                     break;             
                     }
                     else if(date>20&&date<31){
                     System.out.print("您的星座為:金牛座");
                     break;             
                     }
                     else{
                     System.out.println("請輸入正確的日期");
                     break;
                     }
               case 5:
                     if(date>0&&date<21){
                     System.out.print("您的星座為:金牛座");
                     break;             
                     }
                     else if(date>20&&date<32){
                     System.out.print("您的星座為:雙子座");
                     break;             
                     }
                     else{
                     System.out.println("請輸入正確的日期");
                     break;
                     }
               case 6:
                     if(date>0&&date<21){
                     System.out.print("您的星座為:雙子座");
                     break;             
                     }
                     else if(date>20&&date<31){
                     System.out.print("您的星座為:巨蟹座");
                     break;             
                     }
                     else{
                     System.out.println("請輸入正確的日期");
                     break;
                     }
               case 7:
                     if(date>0&&date<21){
                     System.out.print("您的星座為:巨蟹座");
                     break;             
                     }
                     else if(date>20&&date<32){
                     System.out.print("您的星座為:獅子座");
                     break;             
                     }
                     else{
                     System.out.println("請輸入正確的日期");
                     break;
                     }
               case 8:
                     if(date>0&&date<21){
                     System.out.print("您的星座為:獅子座");
                     break;             
                     }
                     else if(date>20&&date<32){
                     System.out.print("您的星座為:處女座");
                     break;             
                     }
                     else{
                     System.out.println("請輸入正確的日期");
                     break;
                     }
               case 9:
                     if(date>0&&date<21){
                     System.out.print("您的星座為:處女座");
                     break;             
                     }
                     else if(date>20&&date<31){
                     System.out.print("您的星座為:天秤座");
                     break;             
                     }
                     else{
                     System.out.println("請輸入正確的日期");
                     break;
                     }
               case 10:
                     if(date>0&&date<21){
                     System.out.print("您的星座為:天秤座");
                     break;             
                     }
                     else if(date>20&&date<32){
                     System.out.print("您的星座為:天蠍座");
                     break;             
                     }
                     else{
                     System.out.println("請輸入正確的日期");
                     break;
                     }
               case 11:
                     if(date>0&&date<21){
                     System.out.print("您的星座為:天蠍座");
                     break;             
                     }
                     else if(date>20&&date<31){
                     System.out.print("您的星座為:射手座");
                     break;             
                     }
                     else{
                     System.out.println("請輸入正確的日期");
                     break;
                     }
               case 12:
                     if(date>0&&date<21){
                     System.out.print("您的星座為:射手座");
                     break;             
                     }
                     else if(date>20&&date<32){
                     System.out.print("您的星座為:魔羯座");
                     break;             
                     }
                     else{
                     System.out.println("請輸入正確的日期");
                     break;
                     }
                  }
               }
              else
              System.out.println("請輸入正確的日期");
        }
}
