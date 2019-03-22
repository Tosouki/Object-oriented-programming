import java.io.*;

public class app1{
        public static void main(String[]args)throws IOException{
        
               BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));

               int grade;

               System.out.println("請輸入TOEIC成績:");
               grade =Integer.parseInt(buf.readLine());

               if(grade%5==0 ){
               if( grade>=860 & grade<=990)
               System.out.print("證照顏色:金色");

               else if(grade>=730 & grade<=855)
               System.out.print("證照顏色:藍色");

               else if( grade>=470 & grade<=725)
               System.out.print("證照顏色:綠色");

               else if( grade>=220 & grade<=465)
               System.out.print("證照顏色:棕色");

               else if( grade>=10 & grade<=215)
               System.out.print("證照顏色:橘色");
               else 
               System.out.print("輸入格式錯誤");
               }
               else 
               System.out.print("輸入格式錯誤");
        }
}
