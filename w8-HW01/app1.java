import java.io.*;
public class app1{
        public static void main(String[]args)throws IOException
        {
           BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));

           int b=0,c[],i=0,j,k,y;
           c=new int[3]	;
           char ch;
           String e;

        do{
           System.out.print("請輸入第"+(i+1)+"個數值：");
           c[i] =Integer.parseInt(buf.readLine());

           if(b==2)
           {
          for(k=0;k<3;k++){	//數字由小到大排序
            for(j=0;j<3-k-1;j++)
            {
              if(c[j+1]<c[j])
              {
              y=c[j+1];
              c[j+1]=c[j];
              c[j]=y;
              }
            }
          }
           show(c[0],c[1],c[2]);
           break;}

           System.out.print("請問是否有第"+(i+2)+"個數值要輸入?(Y/N):");
            e =buf.readLine();
           ch=e.charAt(0);
           if(ch=='N'&&b==0)
           {
           show(c[0]);}
           if(ch=='N'&&b==1)
           {
           show(c[0],c[1]);}
          i++;
          b++;
        }while(ch=='Y');
        }
        static void show(int n)
        {
           System.out.print("這是一個圓形，面積為"+(float)(n*n*3.14));
        }
        static void show(int n,int m)
        {
           System.out.print("這是一個矩形，面積為"+(n*m));
        }
        static void show(int n,int m,int o)
        {
          if((o*o)!=(n*n+m*m))
              System.out.print("很抱歉您輸入的不是直角三角形，我無法幫你計算面積");
          else
            System.out.print("這是一個直角三角形，面積為"+(n*m/2));
        }
}
