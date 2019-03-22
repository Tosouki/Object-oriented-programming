public class app1{
        public static void main(String[]args){
        circle(2.5);
        square(3);
        rectangle(4,8);
        trapezium(5,6,2);
        } 

        public static double circle(double a){
          System.out.println("此圖形為圓形");
          System.out.println("圓形面積:"+(a*a*3.14)+"\n");
          return 0;
        }
        public static double square(double a){
          System.out.println("此圖形為正方形");
          System.out.println("正方形面積:"+(a*a)+"\n");
          return 0;
        }
        public static double rectangle(double a,double b){
          System.out.println("此圖形為矩形");
          System.out.println("矩形面積:"+(a*b)+"\n");
          return 0;
        }
        public static double trapezium(double a,double b,double c){
          System.out.println("此圖形為梯形");
          System.out.println("梯形面積:"+((a+b)*c/2));
          return 0;
        }
}
