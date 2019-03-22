import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class app1{
        public static void main(String[]args)throws IOException{	

        input_account();
}

public static String input_account()throws IOException{
      BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
      int a,b,c,i,y;
        String account[]={"Abc@12345","Cba#54321","","",""};
      String account2;
        String account3[];
      char account4[];
      do{
      System.out.print("請輸入帳號：");
      account2=buf.readLine();
        account3=account2.split("");
      account4=account2.toCharArray();
      for(y=0;y<account.length;y++){
      if(account[y].equals(account2)){
        System.out.println("此帳號已被使用，請重新輸入");		
              }
              } 
      if(account3.length<8||account3.length>12){
        System.out.println("帳號長度必須在8~12字元，請重新輸入");		
              }
      if(!Character.isUpperCase(account4[0])){
        System.out.println("帳號開頭必須為大寫英文，請重新輸入");
      }
      for(i=0,a=0,b=0,c=0;i<account3.length;i++){
        if(Character.isUpperCase(account4[i])||Character.isLowerCase(account4[i])){
        a++;}
        else if(Character.isDigit(account4[i])){
        b++;}
        else {
        c++;}
              }
      if(a==0||b==0||c==0){
        System.out.println("帳號必須英數符號混合，請重新輸入");
            }
      }while((a==0||b==0||c==0)||!Character.isUpperCase(account4[0])||(account3.length<8||account3.length>12)||account[0].equals(account2)||account[1].equals(account2));
      input_password(account2);
      return account2;
    }
    public static void input_password(String account2)throws IOException{
      BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
      int a,b,c,d,y;
      String password;
        String password2[];
      char password3[];
      do{
      System.out.print("請輸入密碼：");
      password=buf.readLine();
      password2=password.split("");
      password3=password.toCharArray();
      if(password.equals(account2)){
        System.out.println("密碼不能與帳號相同，請重新輸入");		
              }
      if(password2.length<8||password2.length>12){
        System.out.println("密碼長度必須在8~12字元，請重新輸入");		
              }
      for(d=0,a=0,b=0,c=0;d<password2.length;d++){
        if(Character.isUpperCase(password3[d])||Character.isLowerCase(password3[d])){
        a++;}
        else if(Character.isDigit(password3[d])){
        b++;}
        else {
        c++;}
              }
      if(a==0||b==0||c==0){
        System.out.println("密碼必須英數符號混合，請重新輸入");
            }
      }while((a==0||b==0||c==0)||password2.length<8||password2.length>12||password.equals(account2));
      input_password2(password);
    }
    public static void input_password2(String password)throws IOException{
      BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
      String password4;
        String password6[];
      char password7[];
      do{
      System.out.print("請再輸入一次密碼確認：");
      password4=buf.readLine();
        password6=password4.split("");
      password7=password4.toCharArray();
      if(!password4.equals(password)){
        System.out.println("密碼與第一次輸入的不同，請重新輸入");		
              }
      }while(!password4.equals(password));
      input_email();
    }
    public static String input_email()throws IOException{
      BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
      String email;
      String email2[];
      char email3[];
      int a=0,i;
      do{
      System.out.print("請輸入信箱：");
      email=buf.readLine();
        email2=email.split("");
      email3=email.toCharArray();
      if(email3[0]=='@'||email3[(email2.length-1)]=='@'){
      System.out.println("「@」不能放在第一個或最後一個");	
                  }
      for(i=0;i<email2.length;i++){
        if(email3[i]=='.')a++;
              }
      if(a==0){
        System.out.println("信箱格式錯誤，請重新輸入");
        }
      }while(email3[0]=='@'||email3[(email2.length-1)]=='@'||a==0);
      show(email);
      return email;
    }
    public static void show(String email){
        String email2[]=email.split("[@._]");
      Date date = new Date();
        SimpleDateFormat klio=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        klio.setTimeZone(TimeZone.getTimeZone("GMT+8"));
      String strDate = klio.format(date);
      System.out.print(email2[0]+"你好，歡迎來自"+email2[1]+"的你，你的註冊時間是"+strDate);
    }
}
