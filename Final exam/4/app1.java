import java.io.*;

class app1{
	public static void main(String args[]) throws IOException{
	BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
	int height=0,weight=0,i=1,p=0;
	int tri[]=new int[3];
	String ag;
	while(i==1){
	try{
		System.out.print("請輸入底:");
		height=Integer.parseInt(buf.readLine());
		System.out.print("請輸入高:");
		weight=Integer.parseInt(buf.readLine());
		tri[p]=(height*weight/ 2);
		p++;
		System.out.println("面積："+height*weight/ 2);
   		System.out.print("是否繼續運算(Y/N):");
		ag =buf.readLine();
		char ch=ag.charAt(0);
		if(ch=='Y')
		continue;
		else 
		break;
	}
	catch(NumberFormatException e){
		e.printStackTrace();
		System.out.println("輸入格式錯誤，請重新輸入!\n");
	}
	catch(ArithmeticException e){
		e.printStackTrace();
		System.out.println("分母不可為0，請重新輸入!\n");
	}
	catch(ArrayIndexOutOfBoundsException e){
		e.printStackTrace();
		System.out.println("陣列索引值超過上限，程式結束!\n");
		break;
	        }
	    }
   }
}
