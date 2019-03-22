import java.io.*;

class app1{
	public static void main(String args[]) throws IOException{
	BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
	String name="",sex="";
	int year=0,array;
	int i=1,k;
	while(i==1){
	try{
		System.out.print("請問要幾筆資料:");
		array=Integer.parseInt(buf.readLine());
		String a[]=new String [array];
		String b[]=new String [array];
		int c[]=new int [array];
		for(k=0;k<array;k++){
		try{
			System.out.print("請輸入姓名:");
			a[k]=buf.readLine();
			System.out.print("請輸入性別:");
			b[k]=buf.readLine();
			System.out.print("請輸入年齡:");
			c[k]=Integer.parseInt(buf.readLine());
		}	
		catch(NumberFormatException e){
		e.printStackTrace();
		System.out.println("請輸入數字!!\n");
		k--;
			}
				}
		for(k=0;k<array;k++){
			System.out.println("姓名:"+a[k]+"\n性別:"+b[k]+"\n年齡:"+c[k]);
				}
		break;
	}
	catch(NumberFormatException e){
		e.printStackTrace();
		System.out.println("請輸入數字!!\n");
	}
	catch(NegativeArraySizeException e){
		e.printStackTrace();
		System.out.println("不得輸入負數!!\n");
	    }
		        } 
      }
}
