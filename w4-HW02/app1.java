import java.io.*;

public class app1{
        public static void main(String[]args)throws IOException{
               BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));

               int min,max,base,a=1,b;
               
               System.out.print("請輸入範圍最小數:");
               min =Integer.parseInt(buf.readLine());
               
               System.out.print("請輸入範圍最大數:");
               max =Integer.parseInt(buf.readLine());
               
               System.out.print("請輸入要尋找的倍數的基值:");
               base =Integer.parseInt(buf.readLine());
               
               if(max>min){
                       System.out.println(base+"的倍數為");
                       for(b=base;min<b&&b<max;a++){
                        b=base*a;
                        System.out.print(b+" ");   
                       }
               }
              else
              System.out.println("錯誤!");
        }
}
