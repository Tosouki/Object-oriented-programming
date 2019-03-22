import java.io.*;

public class app1{
	public static void main(String[] args)throws IOException{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		int i;
		Vehicle Yeah;
		do{
		System.out.print("(1)腳踏車(2)船(3)飛機\n");
		i=Integer.parseInt(buf.readLine());
		if(i>3||i<=0)
		System.out.print("\n***無此選項,請重新輸入***\n");	
		}while(i>3||i<=0);
		switch(i){
		case 1:
		Yeah=new Bike();
		Yeah.move();
		break;
		case 2:
		Yeah=new Ship();
		Yeah.move();
		choice(2);
		break;
		case 3:
		Yeah=new Plane();
		Yeah.move();
		choice(3);
		}
						}
	public static void choice(int i)throws IOException{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));

		int weight,distance;
		System.out.print("請輸入重量:");
		weight=Integer.parseInt(buf.readLine());
		System.out.print("請輸入距離:");
		distance=Integer.parseInt(buf.readLine());
		if(i==2){
			Ship Yeah=new Ship();
			Yeah.delivery(weight,distance);
			}
		if(i==3){
			Plane Yeah=new Plane();
			Yeah.delivery(weight,distance);
			}
		
		}
}
