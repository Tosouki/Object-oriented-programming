import java.io.*;

public class app1{
	static int total=0;
	public static void main(String args[])throws IOException{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		int j,k,l;
		do{
		System.out.print("請輸入一級主管人數(最少一位):");
		j=Integer.parseInt(buf.readLine());
		if(j<1)
		System.out.print("\n***最少一位,請重新輸入***\n");
		}while(j<1);
		Employee employees[] = new Employee[j];
		cheer(employees,1);
		do{
		System.out.print("請輸入二級主管人數(最少二位):");
		k=Integer.parseInt(buf.readLine());
		if(k<2)
		System.out.print("\n***最少二位,請重新輸入***\n");
		}while(k<2);
		Employee employees2[] = new Employee[k];
		cheer(employees2,2);
		do{
		System.out.print("請輸入員工人數(最少三位):");
		l=Integer.parseInt(buf.readLine());
		if(l<3)
		System.out.print("\n***最少三位,請重新輸入***\n");
		}while(l<3);
		Employee employees3[] = new Employee[l];
		cheer(employees3,3);
		System.out.print("一個月共花費:"+total);
						}
	public static void cheer(Employee employees[],int i)throws IOException{
		String name,sex,phone,adress;
		int year,num1=0,num2=0,num3=0;
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		for(int j=0;j<employees.length;j++){
		System.out.print("請輸入姓名:");
		name=buf.readLine();	
		System.out.print("請輸入性別:");
		sex=buf.readLine();
		System.out.print("請輸入電話:");
		phone=buf.readLine();
		System.out.print("請輸入地址:");
		adress=buf.readLine();
		System.out.print("請輸入工作幾年:");
		year=Integer.parseInt(buf.readLine());	
		switch(i){
			case 1:
			employees[j]=new managers(name,sex,phone,adress,year);
			total+=employees[j].salary();
			break;
			case 2:
			employees[j]=new supervisors(name,sex,phone,adress,year);
			total+=employees[j].salary();
			break;
			case 3:
			employees[j]= new Basic_Employee(name,sex,phone,adress,year);
			total+=employees[j].salary();
			break;
			}
							}
									}
}
