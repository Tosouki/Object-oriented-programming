import java.io.*;

class app1{
          public static void main(String args[]) throws IOException{
          BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
          String a,b,d,e;
          int c,f;

          System.out.print("請輸入員工姓名:");
          a=buf.readLine();
          System.out.print("請輸入員工手機:");
          b=buf.readLine();
          System.out.print("請輸入員工年資:");
          c=Integer.parseInt(buf.readLine());

          System.out.print("請輸入員工姓名:");
          d=buf.readLine();
          System.out.print("請輸入員工手機:");
          e=buf.readLine();
          System.out.print("請輸入員工年資:");
          f=Integer.parseInt(buf.readLine());

          Employee stu=new Employee(a,b,c);
          stu.showProfile(); 

          Employee std=new Employee(d,e,f);
          std.setName(d);
          std.settelephone(e);
          std.setyear(f);
          std.showProfile(); 
           }
}
