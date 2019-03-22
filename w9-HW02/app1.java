import java.io.*;

class app1{
          public static void main(String args[]) throws IOException{
          circle op=new circle();
          BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
          System.out.print("請輸入半徑:");
          op.set_radius(Integer.parseInt(buf.readLine()));
          op.get_radius();
          op.get_area();
          op.get_perimeter();
          op.show();
           }
}
class circle{
          private int radius;
          void set_radius(int num){
            radius=num;
          }
          public int get_radius(){
            return radius;
                }
          public double get_area(){
            return (radius*radius*3.14);		
                }
          public double get_perimeter(){
            return (2*3.14*radius);
                }
          void show(){
          System.out.print("此圓半徑為:"+get_radius()+"面積為"+get_area()+"周長為"+get_perimeter());
        }
}
