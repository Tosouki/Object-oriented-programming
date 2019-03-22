import java.io.*;

public class app1{
        public static void main(String[]args)throws IOException{
          BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
          int i,k,a=0,b=0,c=0;
          String str,e;
          char ch;
          System.out.print("請輸入需要建立的資料總筆數：");
          k=Integer.parseInt(buf.readLine());
          String name[]=new String[k];
          String sex[]=new String[k];
          String yo[]=new String[k];
          String id[]=new String[k];

          for(i=0;i<name.length;i++){
            System.out.print("輸入姓名:");
            str=buf.readLine();
            name[i]=str;
            sex[i]=input_sex();
            yo[i]=input_yo();
            if(sex[i].equals("男")&&yo[i].equals("資工系"))id[i]="1060011"+(c+1);
            if(sex[i].equals("女")&&yo[i].equals("資工系"))id[i]="1060010"+(c+1);
            if(sex[i].equals("男")&&yo[i].equals("資管系"))id[i]="1060021"+(a+1);
            if(sex[i].equals("女")&&yo[i].equals("資管系"))id[i]="1060020"+(a+1);
            if(sex[i].equals("男")&&yo[i].equals("電子系"))id[i]="1060031"+(b+1);
            if(sex[i].equals("女")&&yo[i].equals("電子系"))id[i]="1060030"+(b+1);
          System.out.println("姓名:"+name[i]+"，性別:"+sex[i]+"，就讀"+yo[i]+"，學號為"+id[i]);	

        }
          do{
          System.out.print("請問是否需要查詢資訊(Y/N):");
          e =buf.readLine();
          ch=e.charAt(0);
            if(ch=='N')
            {
             break;}
            if(ch=='Y')
            {
          do{
          System.out.print("清輸入要查詢的項目(1.所有學生資訊2.男女人數3.系所人數):");
          i=Integer.parseInt(buf.readLine());
          if(i>3||i<=0)
          System.out.print("\n***無此選項,請重新輸入***\n");	
          }while(i>3||i<=0);
          switch(i){
            case 1:
            choice(name,sex,yo,id);
            break;
            case 2:
            choice(sex);
            break;
            case 3:
            choice(name,yo);
            }}
          }while(ch!='Y'&&ch!='N');
        }
        public static String input_sex()throws IOException{
          BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
          String str;
          do{
          System.out.print("輸入性別(男/女):");
          str=buf.readLine();
          if(str.equals("男")||str.equals("女")){
          return str;
          }
          }while(!str.equals("男")||!str.equals("女"));
          return "";
                }
        public static String input_yo()throws IOException{
          BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
          String str;
          do{
          System.out.print("請輸入就讀系所(資工系/資管系/電子系)：");
          str=buf.readLine();
          if(str.equals("資工系")||str.equals("資管系")||str.equals("電子系")){
          return str;
          }	
          }while(!str.equals("資工系")||!str.equals("資管系")||!str.equals("電子系"));
          return"";
                }
        public static void choice(String name[],String sex[],String yo[],String id[])throws IOException{
          int i;
          for(i=0;i<name.length;i++){
          System.out.println("姓名:"+name[i]+"，性別:"+sex[i]+"，就讀"+yo[i]+"，學號為"+id[i]);	
                }
        }
        public static void choice(String sex[])throws IOException{
          int a=0,b=0,i;
          for(i=0;i<sex.length;i++){
            if(sex[i].equals("男"))a+=1;
            if(sex[i].equals("女"))b+=1;
                }
            if(a>0)
            System.out.print(" 男生一共"+a+"人");
            if(b>0)
            System.out.print(" 女生一共"+b+"人");	
            System.out.print("\n");
        }
        public static void choice(String name[],String yo[])throws IOException{
          int a=0,b=0,c=0,i;
          for(i=0;i<yo.length;i++){
            if(yo[i].equals("資工系"))a+=1;
            if(yo[i].equals("資管系"))b+=1;
            if(yo[i].equals("電子系"))c+=1;
                }
            if(a>0)
            System.out.print(" 資工系"+a+"人");
            if(b>0)
            System.out.print(" 資管系"+b+"人");
            if(c>0)
            System.out.print(" 電子系"+c+"人");
            System.out.print("\n");	
        }
}
