import java.io.*;

class app1{
          public static void main(String args[]) throws IOException{
          BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
          String a,b,c;
          int d,e;

          System.out.print("請輸入工程師姓名:");
          a=buf.readLine();
          System.out.print("請輸入工程師手機:");
          b=buf.readLine();
          System.out.print("請輸入工程師年資:");
          d=Integer.parseInt(buf.readLine());
          System.out.print("請輸入工程師薪水:");
          e=Integer.parseInt(buf.readLine());
          System.out.print("請輸入工程師專長:");
          c=buf.readLine();

          Engineer stu=new Engineer(a,b,d,e,c);
          stu.showProfile(); 
           }
}
