import java.io.*;

public class app1{
        public static void main(String[]args)throws IOException{
              BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));

              int h,i,j,x,y;
              int a[]=new int[6] ;
              double d;

              for(i=0;i<a.length;i++){	//亂數不重複
                    d=Math.random();
                    h=(int)(d*49)+1;
                    a[i]=h;
                    for(j=0;j<i;j++){
                      if(a[i]==a[j]){
                        i--;
                        break;
                              }
                        }
               }
              for(i=0;i<a.length;i++){	//數字由小到大排序
                    for(j=0;j<a.length-i-1;j++){
                          if(a[j+1]<a[j]){
                                  y=a[j+1];
                                  a[j+1]=a[j];
                                  a[j]=y;
                              }
                        }
              }
              System.out.print("樂透號碼為:");
              for(x=0;x<a.length;x++){
                System.out.print(a[x]+" ");
              }
        } 
}
