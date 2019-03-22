import java.io.*;

public class app1{
	public static void main(String[] args)throws IOException{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		int total=0;
		Telephone Yeah=new Telephone(30,50);
		Yeah.calculatePrice();
		total+=Yeah.gettotal();

		Cellphone Yeah2=new Cellphone(120,40,120);
		Yeah2.calculatePrice();
		total+=Yeah2.gettotal();
		Yeah2.internetprice();
		total+=Yeah2.gettotal();
	
		Tablet Yeah3=new Tablet(30,20,30);
		Yeah3.calculatePrice();
		total+=Yeah3.gettotal();
		Yeah3.internetprice();
		total+=Yeah3.gettotal();
		System.out.println("通話費總額:"+total+"元");
		}
}
