import java.io.*;

public class app1{
        public static void main(String[]args)throws IOException{	
            int money=0;
            String name="";
            String account="";
            String password="";
          choice(name,account,password,money);
        }
        public static void choice(String name,String account,String password,int money)throws IOException{
          BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
          int i;
          do{
          System.out.print("(1)登入(2)申請帳號(3)離開程式\n");
          i=Integer.parseInt(buf.readLine());
          if(i>3||i<=0)
          System.out.print("\n***無此選項,請重新輸入***\n");	
          }while(i>3||i<=0);
          switch(i){
            case 1:
            choice1(name,account,password,money);
            break;
            case 2:
            choice2(name,account,password,money);
            break;
            case 3:
            choice3();
            }
        }
        public static void choice1(String name,String account,String password,int money)throws IOException{
          BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
          String account2;
          String password2;
          if(name.equals("")&&account.equals("")&&password.equals("")){
          System.out.println("你是第一次使用請先申請帳號\n");
          choice(name,account,password,money);	
                    }
          else{
          do{
          System.out.print("請輸入帳號:");
          account2=buf.readLine();
          if(!account2.equals(account)){
          System.out.println("\n帳號錯誤請重新輸入\n");
                  }
          }while(!account2.equals(account));

          do{
          System.out.print("請輸入密碼:");
          password2=buf.readLine();
          if(!password2.equals(password)){
          System.out.println("\n密碼錯誤請重新輸入\n");
                  }
          }while(!password2.equals(password));
          if(account2.equals(account)&&password2.equals(password)){
          System.out.println("\n歡迎登入"+name+"\n");	
          choice_s(money);}
          }	
        }
        public static void choice2(String name,String account,String password,int money)throws IOException{
          account op=new account();
          BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
          System.out.print("請輸入姓名:");
          op.set_name(buf.readLine());
          op.get_name();
          System.out.print("請輸入帳號:");
          op.set_account(buf.readLine());
          op.get_account();
          System.out.print("請輸入密碼:");
          op.set_password(buf.readLine());
          op.get_password();
          System.out.print("請輸入儲存金額:");
          op.set_money(Integer.parseInt(buf.readLine()));
          op.get_money();
          choice(op.get_name(),op.get_account(),op.get_password(),op.get_money());
        }
        public static void choice3(){	
          return ;
        }
        public static void choice_s(int mon)throws IOException{
          account op=new account();
          BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
          int i;
          do{
          System.out.print("(1)提款(2)存款(3)查詢餘額(4)離開程式\n");
          i=Integer.parseInt(buf.readLine());
          if(i>4||i<=0)
          System.out.print("\n***無此選項,請重新輸入***\n");	
          }while(i>4||i<=0);
          switch(i){
            case 1:
            choice_1(mon);
            break;
            case 2:
            choice_2(mon);
            break;
            case 3:
            choice_3(mon);
            break;
            case 4:
            choice3();		
            }
        }
        public static void choice_1(int b)throws IOException{
          account op=new account();
          BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
          int c;	
                System.out.print("請輸入提款金額：");
                c =Integer.parseInt(buf.readLine());
                if(c>b)
                System.out.println("\n帳戶餘額不足");
                else{
                b=b-c;
                System.out.println("\n已領取");
                }
                System.out.println("");
          choice_s(b);
        }
        public static void choice_2(int b)throws IOException{
          account op=new account();
          BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
          int d;
          do{	
                System.out.print("請輸入存款金額：");
                d =Integer.parseInt(buf.readLine());
          if(d<0){
                System.out.println("輸入錯誤,請重新輸入存款金額");	
            }
                }while(d<0);
          b=b+d;
                System.out.println("\n存款成功");
                System.out.println("");
          choice_s(b);
        }
        public static void choice_3(int b)throws IOException{	
                System.out.println("\n目前餘額："+b);
                System.out.println("");
          choice_s(b);
        }
}
