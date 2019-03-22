import java.io.*;

public class app1{

        public static void main(String[]args)throws IOException{
               BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));

               int a,b=0,c,d;
               
               do{
                       System.out.print("請選擇功能（1.提款、2.存款、3.查詢餘額、4.離開）：");
                       a =Integer.parseInt(buf.readLine());
                       
                       while(a<=0||a>=5){
                       System.out.println("輸入錯誤,沒有此功能,請重新輸入\n");
                       System.out.print("請選擇功能（1.提款、2.存款、3.查詢餘額、4.離開）：");
                       a =Integer.parseInt(buf.readLine());
                       }
                       
                       switch(a){
                       case 1:
                             System.out.print("請輸入提款金額：");
                             c =Integer.parseInt(buf.readLine());
                             if(c>b)
                             System.out.println("金額不足，目前餘額："+b);
                             else{
                             b=b-c;
                             System.out.println("已領取,剩餘餘額："+b);
                             }
                             continue;
                       case 2:
                             System.out.print("請輸入存款金額：");
                             d =Integer.parseInt(buf.readLine());
                             b=b+d;
                             System.out.println("存款成功，目前餘額："+b);
                             continue;
                       case 3:
                             System.out.println("目前餘額："+b);
                             continue;
                       case 4:
                             System.out.println("感謝您的使用，歡迎下次的光臨。");
                             break;
                       }
                       break;
               }while(a>0&&a<5);
        }
}
