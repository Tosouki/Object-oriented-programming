import traffic.Traffic;
import traffic.car.Car;
import traffic.ship.Ship;
import java.io.*;
public class app1{
	public static void main(String[] args)throws IOException{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		int i;
		Traffic Yeah[]=new Traffic[2];
		Yeah[0]=new Car("車子",6500,50);
		Yeah[1]=new Ship("郵輪",6500,20);
		for(i=0;i<Yeah.length;i++){
			Yeah[i].show_message();
						        }
						}
		}
