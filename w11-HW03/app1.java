import java.io.*;

class app1{
          public static void main(String args[]) throws IOException{
          BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
          String a,b;
          System.out.print("請輸入人事編號:");
          a=buf.readLine();
          System.out.print("請輸入分機號碼:");
          b=buf.readLine();
          Teacher stu=new Teacher();
          stu.set_IDcard(a);
          stu.set_phone(b);
          stu.showProfile();
          stu.calcBMI();
           }
}
