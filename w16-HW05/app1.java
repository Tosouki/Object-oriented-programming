import java.io.*;
class app1{
          public static void main(String args[]) throws IOException{
          BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
          String name="",sex="",high="";
          int year=0,array;
          int i=1,k;
          while(i==1){
          try{
            System.out.print("請問要幾筆學生資料:");
            array=Integer.parseInt(buf.readLine());
            String a[]=new String [array];
            String b[]=new String [array];
            int c[]=new int [array];
            String d[]=new String [array];
            for(k=0;k<array;k++){
            try{
              System.out.print("請輸入姓名:");
              a[k]=buf.readLine();
              System.out.print("請輸入性別:");
              b[k]=buf.readLine();
              System.out.print("請輸入年齡:");
              c[k]=Integer.parseInt(buf.readLine());
              System.out.print("請輸入科系:");
              d[k]=buf.readLine();
            }	
            catch(NumberFormatException e){
            e.printStackTrace();
            System.out.println("請輸入數字!!\n");
            k--;
              }
                }
            choice(a,b,c,d);
            break;
          }
          catch(NumberFormatException e){
            e.printStackTrace();
            System.out.println("請輸入數字!!\n");
          }
          catch(NegativeArraySizeException e){
            e.printStackTrace();
            System.out.println("不得輸入負數!!\n");
          }
            }
           }
        public static void choice(String name[],String sex[],int year[],String high[])throws IOException{
          BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
          int i;
          do{
          System.out.print("\n1.顯示所有資料\n2.查詢資料\n3.修改資料\n4.離開\n");
          System.out.print("請選擇處理方式:");
          i=Integer.parseInt(buf.readLine());
          if(i>4||i<=0)
          System.out.print("\n***無此選項,請重新輸入***\n");	
          }while(i>4||i<=0);
          switch(i){
            case 1:
            choice1(name,sex,year,high);
            break;
            case 2:
            choice2(name,sex,year,high);
            break;
            case 3:
            choice3(name,sex,year,high);
            break;
            case 4:
            break;
            }
        }
        public static void choice1(String name[],String sex[],int year[],String high[])throws IOException{
            int k;
            for(k=0;k<name.length;k++){
              System.out.println("姓名:"+name[k]+"\n性別:"+sex[k]+"\n年齡:"+year[k]+"\n科系:"+high[k]);
                }
          choice(name,sex,year,high);
        }
        public static void choice2(String name[],String sex[],int year[],String high[])throws IOException{
          int i=1,k;
          BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
          while(i==1){
          try{
            System.out.print("請輸入要查詢資料:");
            k=Integer.parseInt(buf.readLine());
            System.out.println("姓名:"+name[(k-1)]+"\n性別:"+sex[(k-1)]+"\n年齡:"+year[(k-1)]+"\n科系:"+high[(k-1)]);
            break;
            }
          catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("超出上限!!\n");
                    }
              }
          choice(name,sex,year,high);
        }
        public static void choice3(String name[],String sex[],int year[],String high[])throws IOException{
          int o=1,k,i;
          BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
          while(o==1){
          try{
            System.out.print("請輸入要更改第幾個資料:");
            k=Integer.parseInt(buf.readLine());
            do{
            System.out.print("請選擇要更改的資料:\n1.姓名\n2.性別\n3.年齡\n4.科系\n");
            i=Integer.parseInt(buf.readLine());
            if(i>4||i<=0)
            System.out.print("\n***無此選項,請重新輸入***\n");	
            }while(i>4||i<=0);
            switch(i){
              case 1:
              System.out.print("請輸入姓名:");
              name[(k-1)]=buf.readLine();
              break;
              case 2:
              System.out.print("請輸入性別:");
              sex[(k-1)]=buf.readLine();
              break;
              case 3:
              System.out.print("請輸入年齡:");
              year[(k-1)]=Integer.parseInt(buf.readLine());
              break;
              case 4:
              System.out.print("請輸入科系:");
              high[(k-1)]=buf.readLine();
              break;
              }
            break;
            }
            catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("超出上限!!\n");
                    }
            catch(NumberFormatException e){
            e.printStackTrace();
            System.out.println("請輸入數字!!\n");
              }
            }
          choice(name,sex,year,high);
        }
}
