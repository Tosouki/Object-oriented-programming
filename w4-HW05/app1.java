import java.io.*;

public class app1{
        public static void main(String[]args)throws IOException{
               BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));

               int number,a=0;
               String ag;

               do{
                       double d=Math.random();
                       number=(int)(d*60)+1;
                       
                       if(number==3||number==31||number==35||number==46||number==47||number==57)
                       continue;
                       
                       System.out.println("抽到的號碼為:"+number);
                       System.out.print("是否繼續點名(Y/N):");
                       
                       ag =buf.readLine();
                       char ch=ag.charAt(0);
                       
                       if(ch=='Y')
                       continue;
                       else if(ch=='N')
                       break;
                       else {
                       System.out.print("輸入錯誤");
                       break;
                       }
              }while(a==0);
        } 
}
