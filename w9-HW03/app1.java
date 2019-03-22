import java.io.*;

class app1{
          public static void main(String args[]) throws IOException{
          cylinder op=new cylinder();
          BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
          int b;
          System.out.print("請輸入半徑:");
          op.set_radius(Integer.parseInt(buf.readLine()));
          op.get_radius();
          System.out.print("請輸入高:");
          op.set_high(Integer.parseInt(buf.readLine()));
          op.get_high();
          System.out.print("請選擇要顯示的項目(1.表面積2.體積3.所有資訊):");
          b=Integer.parseInt(buf.readLine());
          switch(b){
            case 1:
            op.show1();
            break;
            case 2:
            op.show2();
            break;
            case 3:
            op.show3();
            break;
            }
           }
        }
        class cylinder{
          private int radius,high;
          void set_radius(int num){
            radius=num;
          }
          public int get_radius(){
            return radius;
                }
          void set_high(int num2){
            high=num2;
          }
          public int get_high(){
            return high;
                }
          public double get_area(){
            return (radius*radius*3.14*2+radius*2*3.14*high);		
                }
          public double get_perimeter(){
            return (radius*radius*3.14*high);
                }
          void show1(){
          System.out.print("圓柱體的表面積為:"+get_area());
        }
          void show2(){
          System.out.print("圓柱體的體積為:"+get_perimeter());
        }
          void show3(){
          System.out.print("圓柱體的表面積為:"+get_area()+",體積為:"+get_perimeter());
        }
}
