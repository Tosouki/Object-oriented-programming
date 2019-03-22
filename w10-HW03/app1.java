import java.io.*;
public class app1{
          public static void main(String args[]) throws IOException{
          BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
          name();
           }

          public static void name()throws IOException{
                  BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
                  String name,variety,age;
                  System.out.print("請輸入名字:");
                  name=buf.readLine();
                  System.out.print("請輸入品種:");
                  variety=buf.readLine();
                  System.out.print("請輸入年紀:");
                  age=buf.readLine();
                  if(variety.equals("")){
                  Dog d1=new Dog(name);
                  d1.showProfile();
                  }
                  else if(variety.equals("")&&age.equals("")){
                  Dog d2=new Dog(name,variety);
                  d2.showProfile();
                  }
                  else{
                  int age1=Integer.parseInt(age);
                  Dog d3=new Dog(name,variety,age1);
                  d3.showProfile();
                }
        }
}
