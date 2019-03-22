import java.io.*;

public class app1{
        public static void main(String[]args)throws IOException{
          String name,sex,yo;
          BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
          System.out.print("請輸入姓名：");
          name=buf.readLine();
          System.out.print("請輸入性別(男/女)：");
          sex=buf.readLine();
          do{
          System.out.print("請輸入就讀系所(資工系/資管系/電子系)：");
          yo=buf.readLine();
          if(yo.equals("資工系")&&sex.equals("男")){
          System.out.print("姓名:"+name+"，性別"+sex+"，就讀"+yo+"，學號為10600111");
          break;
          }
          if(yo.equals("資工系")&&sex.equals("女")){
          System.out.print("姓名:"+name+"，性別"+sex+"，就讀"+yo+"，學號為10600101");
          break;
          }
          if(yo.equals("資管系")&&sex.equals("男")){
          System.out.print("姓名:"+name+"，性別"+sex+"，就讀"+yo+"，學號為10600211");
          break;
          }
          if(yo.equals("資管系")&&sex.equals("女")){
          System.out.print("姓名:"+name+"，性別"+sex+"，就讀"+yo+"，學號為10600201");
          break;
          }
          if(yo.equals("電子系")&&sex.equals("男")){
          System.out.print("姓名:"+name+"，性別"+sex+"，就讀"+yo+"，學號為10600311");
          break;
          }
          if(yo.equals("電子系")&&sex.equals("女")){
          System.out.print("姓名:"+name+"，性別"+sex+"，就讀"+yo+"，學號為10600301");
          break;
          }
          if(!yo.equals("資工系")||!yo.equals("資管系")||!yo.equals("電子系"))
          System.out.println("請重新輸入");
          }while(!yo.equals("資工系")||!yo.equals("資管系")||!yo.equals("電子系"));
        }
}
