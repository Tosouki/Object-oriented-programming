import java.io.*;

public class app1{
        public static void main(String[]args)throws IOException{
           BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));

           int i,temp;
           System.out.print("請輸入數值：");
           String k =buf.readLine();
           String [] arr=k.split(",");

          int[] data=new int[arr.length];
          for(i=0;i<arr.length;i++){
          temp=Integer.parseInt(arr[i]);
          data[i]+=temp;
        }
        if(i==1)
        show(data[0]);
        if(i==2)
        show(data[0],data[1]);
        if(i==3)
        show(data[0],data[1],data[2]);
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
          if((o*o)==(n*n+m*m))
            System.out.print("這是一個直角三角形，面積為"+(n*m/2));
          else if((n*n)==(o*o+m*m))
            System.out.print("這是一個直角三角形，面積為"+(o*m/2));
          else if((m*m)==(n*n+o*o))
            System.out.print("這是一個直角三角形，面積為"+(o*n/2));
          else
              System.out.print("很抱歉您輸入的不是直角三角形，我無法幫你計算面積");
        }
}
