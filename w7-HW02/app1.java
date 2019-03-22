import java.io.*;

public class app1{

        public static void main(String[]args)throws IOException
        {
          BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
            int h;
            System.out.print("請輸入變形費氏數列的第幾項:");
            h =Integer.parseInt(buf.readLine());
            System.out.print("第"+h+"項費氏數列的為:"+abc(h));
        }   
        public static int abc(int k){
          if(k==1){
            return 5;
            }
          else if(k==2){
            return 6;
        }
          else
          return abc(k-2)+abc(k-1);
        }
}
