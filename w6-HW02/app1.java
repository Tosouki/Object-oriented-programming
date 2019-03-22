import java.io.*;

public class app1{
        public static void main(String[]args)throws IOException{
               BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));

               int b,c,i=0;
               char ch;
               String e;
               int a[]={153,198,211,286,384,426,999};
               String d[]={"A區","C區","E區","F區","G區","H區","Z區"};

               do{
                      System.out.print("商品編號：");
                      for(b=0;b<a.length;b++)
                      System.out.print(a[b]+" ");
                      System.out.print("\n");
                      System.out.print("請輸入要查詢位置的商品編號：");
                      c =Integer.parseInt(buf.readLine());
                      
                      for(b=0;b<a.length;b++){
                              if(a[b]==c){
                              System.out.println("商品位置在"+d[b]);
                              break;
                              }
                              else if(a[b]!=c&&b==(a.length-1))
                              System.out.println("無此商品編號");	
                      }
                      
                      System.out.print("請問是否繼續查詢?(Y/N):");
                      e =buf.readLine();
                      ch=e.charAt(0);
                      if(ch=='N'){
                              break;
                       }
            }while(ch=='Y');
        }
}
