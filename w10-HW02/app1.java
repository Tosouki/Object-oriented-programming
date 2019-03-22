import java.io.*;

class app1{
          public static void main(String args[]) throws IOException{
          Car c1=new Car();
          c1.showProfile();
          Car c2=new Car("Ford");
          c2.showProfile();
          Car c3=new Car("BMW",468);
          c3.showProfile();
          Car c4=new Car("Benz",500,50,750);
          c4.showProfile();
           }
}
