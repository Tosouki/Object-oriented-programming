import java.io.*;
import java.util.*;

public class app1{
        public static void main(String[]args)throws IOException{
          System.out.println("請輸入7種不同的餐點和其價格");
          String name[]=new String[7];
          int cost[]=new int[7];
          int a[]=new int[7] ;
          input_data(name,cost);
          change(a);
          choice(name,cost,a);

        }
        public static int input_cost()throws IOException{
          BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
          int n;
          do{
            System.out.print("價錢  :");
            n=Integer.parseInt(buf.readLine());
            if(n<0)
            System.out.println("輸入格式錯誤，請重新輸入。");
          }while(n<0);
          return n;
        }
        public static int input_data(String name[],int cost[])throws IOException{
          BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
          int i;
          String str;
          for(i=0;i<name.length;i++){
            System.out.print("菜單 "+(i+1)+":");
            str=buf.readLine();
            name[i]=str;
            cost[i]=input_cost();
        }
            return 0;
        }
        public static void change(int a[]){
          int i,h;
          double d;
          for(i=0;i<a.length;i++){	
            d=Math.random();
            h=(int)(d*(6+1));
            a[i]=h;
            if(i>0&&a[i]==a[(i-1)]){
              i--;
              continue;
                }	
                 }
        }
        public static void choice(String name[],int cost[],int a[])throws IOException{
          BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
          int i;
          do{
          System.out.print("\n請選擇功能(1.當天要吃什麼2.價格排序3.列出一周菜單4.離開程式)");
          i=Integer.parseInt(buf.readLine());
          if(i>4||i<=0)
          System.out.print("\n***無此選項,請重新輸入***\n");	
          }while(i>4||i<=0);
          switch(i){
            case 1:
            choice1(name,cost,a);
            break;
            case 2:
            choice2(name,cost,a);
            break;
            case 3:
            choice3(name,cost,a);
            break;
            case 4:
            choice4();
            }
        }
        public static void choice1(String name[],int cost[],int a[])throws IOException{
          Calendar cal = Calendar.getInstance();
          int day = cal.get(Calendar.DAY_OF_WEEK);
            System.out.println("");	
          switch(day){
          case Calendar.SUNDAY:
            System.out.println("今天星期日我要吃"+name[a[6]]+"，價格"+(int)cost[a[6]]+"元");
            break;
          case Calendar.MONDAY:
            System.out.println("今天星期一我要吃"+name[a[0]]+"，價格"+(int)cost[a[0]]+"元");
            break;
          case Calendar.TUESDAY:
            System.out.println("今天星期二我要吃"+name[a[1]]+"，價格"+(int)cost[a[1]]+"元");
            break;
          case Calendar.WEDNESDAY:
            System.out.println("今天星期三我要吃"+name[a[2]]+"，價格"+(int)cost[a[2]]+"元");
            break;
          case Calendar.THURSDAY:
            System.out.println("今天星期四我要吃"+name[a[3]]+"，價格"+(int)cost[a[3]]+"元");
            break;
          case Calendar.FRIDAY:
                  System.out.println("今天星期五我要吃"+name[a[4]]+"，價格"+(int)cost[a[4]]+"元");	
            break;
          case Calendar.SATURDAY:
            System.out.println("今天星期六我要吃"+name[a[5]]+"，價格"+(int)cost[a[5]]+"元");
            }
          choice(name,cost,a);
        }
        public static void choice2(String name[],int cost[],int a[])throws IOException{
          String d;
          int i,j,y;
          for(i=0;i<cost.length;i++){	
            for(j=0;j<cost.length-i-1;j++)
            {
              if(cost[j+1]<cost[j])
              {
              y=cost[j+1];
              cost[j+1]=cost[j];
              cost[j]=y;
              d=name[j+1];
              name[j+1]=name[j];
              name[j]=d;
              }
            }
          }
            System.out.println("");	
          for(i=0;i<name.length;i++){
            if(name[i]!=null&&!name[i].equals("")){
            System.out.print(name[i]+(int)cost[i]+"元");
            if(i!=(name.length-1))
            System.out.print("、");				
                      }
                }
            System.out.println("");	
          choice(name,cost,a);
        }
        public static void choice3(String name[],int cost[],int a[])throws IOException{
          int i,j;
            System.out.println("");	
          for(i=0,j=1;i<name.length;i++,j++){
            System.out.println("星期"+j+"吃"+name[a[i]]+"，"+(int)cost[a[i]]+"元");	
              }
          change(a);
          choice(name,cost,a);
        }
        public static void choice4(){	
          return ;
        }
}
