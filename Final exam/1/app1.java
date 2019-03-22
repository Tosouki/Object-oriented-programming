import java.io.*;

public class app1{
          public static void main(String args[]) throws IOException{
          BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
          String name,number;
          int year;
          System.out.print("請輸入員工姓名:");
          name=buf.readLine();
          System.out.print("請輸入員工編號:");
          number=buf.readLine();
          System.out.print("請輸入員工年資:");
          year=Integer.parseInt(buf.readLine());

          Employee E1=new Employee();
          E1.set_name(name);
          E1.set_number(number);
          E1.set_year(year);
          E1.show();
        }
}
