import java.io.*;

class app1{
	public static void main(String args[]) throws IOException{
	BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
	int height=0,weight=0,i=1,j;
	while(i==1){
	try{
		System.out.print("請輸入身高:");
		height=Integer.parseInt(buf.readLine());
		System.out.print("請輸入體重:");
		weight=Integer.parseInt(buf.readLine());
		j=weight / (height * height);
		break;
	}
	catch(NumberFormatException e){
		e.printStackTrace();
		System.out.println("請輸入數字!!\n");
	}
	catch(ArithmeticException e){
		e.printStackTrace();
		System.out.println("身高不能為0!!\n");
	}
	}
		System.out.println("你的BMI值：" + (double)weight / (height * height) * 10000);
   }
}
