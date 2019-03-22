import java.io.*;

class app1{
          public static void main(String args[]) throws IOException{
          BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
          String a,b;
          int c,d;
          System.out.print("請輸入車子的品牌:");
          a=buf.readLine();
          System.out.print("請輸入車子的種類:");
          b=buf.readLine();
          System.out.print("請輸入車子的最大時速:");
          c=Integer.parseInt(buf.readLine());
          System.out.print("請輸入車子的最大轉速:");
          d=Integer.parseInt(buf.readLine());
          Sports_car c1=new Sports_car(a,b);
          c1.setkmh(c);
          c1.setRPM(d);
          c1.show();
           }
}
