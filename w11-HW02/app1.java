import java.io.*;
class app1{
          public static void main(String args[]) throws IOException{
          BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
          String a,b;
          System.out.print("請輸入學號:");
          a=buf.readLine();
          System.out.print("請輸入主修課程:");
          b=buf.readLine();
          Student stu=new Student();
          stu.set_student_number(a);
          stu.set_major(b);
          stu.showProfile();
          stu.calcBMI();
           }
}
