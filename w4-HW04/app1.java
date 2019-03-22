import java.io.*;

public class app1{
        public static void main(String[]args)throws IOException{
               BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));

               int wind;
               
               do{
                       System.out.print("輸入風速等級:");
                       wind =Integer.parseInt(buf.readLine());
               }while(wind<8||wind>17);
               
               if(wind>=8&&wind<12) 
               System.out.println("風速等級"+wind+"為:輕度颱風");      
               else if(wind>=12&&wind<16) 
               System.out.println("風速等級"+wind+"為:中度颱風"); 
               else if(wind>=16&&wind<18) 
               System.out.println("風速等級"+wind+"為:強烈颱風");
        }
}
