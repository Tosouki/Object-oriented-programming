import java.io.*;

public class app1{
          public static void main(String[]args)throws IOException{
                   BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));

                   int a,c,d,i,max,min;
                   int b[];
                   c=d=max=min=0;
                   
                   System.out.print("請輸入學生人數：");
                   a =Integer.parseInt(buf.readLine());
                   b=new int[a];
                   System.out.println("開始輸入學生成績");

                   for(i=0;i<a;i++){
                           System.out.print("請輸入第"+(i+1)+"位學生成績：");
                           b[i] =Integer.parseInt(buf.readLine());
                          if(b[i]>=60)d++;
                          if(b[i]<60)c++;
                           if(i==0)max=min=b[i];
                           else
                           {
                          if(b[i]>max)max=b[i];
                          if(b[i]<min)min=b[i];
                           }
                    }
                   System.out.println("成績統計結果如下:");
                   System.out.print("共有"+a+"位學生,"+c+"人不及格，"+d+"人及格，最高分為"+max+"，最低分為"+min);
        }
}
