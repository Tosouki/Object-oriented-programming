import java.io.*;

class app1{
	public static void main(String args[]) throws IOException{
	BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
	String name="",sex="";
	int year=0;
	try{
		System.out.print("請輸入姓名:");
		name=buf.readLine();
		System.out.print("請輸入性別:");
		sex=buf.readLine();
		System.out.print("請輸入年齡:");
		year=Integer.parseInt(buf.readLine());
	}
	catch(NumberFormatException e){
		e.printStackTrace();
	}
	finally{
		System.out.print("姓名:"+name+"\n性別:"+sex+"\n年齡:"+year);
		}
   }
}
