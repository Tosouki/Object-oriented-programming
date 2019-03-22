import java.io.*;

public class app1{
	public static void main(String args[]) throws IOException{
	BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
	int num;
	System.out.print("請輸入寵物數量:");
	num=Integer.parseInt(buf.readLine());
	Dog dog[]=new Dog[num];
	name(dog);
   }

public static void name(Dog dog[])throws IOException{
	BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
	for(int i=0;i<dog.length;i++){
		//**重要:要有初始值，不然編譯為空值(null),會出現java.lang.NullPointerException**
		dog[i]=new Dog();			
		System.out.print("請輸入"+(i+1)+"隻寵物名稱:");
		dog[i].setname(buf.readLine());
		System.out.print("請輸入"+(i+1)+"隻寵物品種:");
		dog[i].setvariety(buf.readLine());
		System.out.print("請輸入"+(i+1)+"隻寵物年紀:");
		dog[i].setage(Integer.parseInt(buf.readLine()));
				}
	choice(dog);
							}
public static void choice(Dog dog[])throws IOException{
	BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
	int i;
	do{
		System.out.println("請選擇以下功能:1 顯示所有寵物資訊，2 顯示最年長寵物資訊");
		System.out.print("3 修改寵物資料，4 離開程式:");
		i=Integer.parseInt(buf.readLine());
		if(i>4||i<=0)
		System.out.print("\n***無此選項,請重新輸入***\n");	
	}while(i>4||i<=0);
	switch(i){
		case 1:
		choice1(dog);
		break;
		case 2:
		choice2(dog);
		break;
		case 3:
		choice3(dog);
		break;
		case 4:
		choice4();
		}
											}
public static void choice1(Dog dog[])throws IOException{
	System.out.println("\n");
	for(int i=0;i<dog.length;i++){
		System.out.println("第"+(i+1)+"隻寵物為:"+dog[i].getName()+" 品種:"+dog[i].getVariety()+" 年紀:"+dog[i].getAge());
					}
	System.out.println("\n");
	choice(dog);

											}
public static void choice2(Dog dog[])throws IOException{
	int y=0;
	for(int i=0;i<dog.length;i++){	//數字由小到大排序
		for(int j=0;j<dog.length-i-1;j++){
			if(dog[j+1].getAge()>dog[j].getAge()){
			y=(j+1);
					}
						}
					}
	System.out.println("\n");
	System.out.println("最年長寵物為:"+dog[y].getName()+" 品種:"+dog[y].getVariety()+" 年紀:"+dog[y].getAge());
	System.out.println("\n");
	choice(dog);
											}
public static void choice3(Dog dog[])throws IOException{
	BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
	int i,j;
	System.out.println("\n");
	do{
		System.out.print("欲修改的寵物:");
		j=Integer.parseInt(buf.readLine());
		if(j>dog.length||j<=0)
		System.out.print("\n***無此選項,請重新輸入***\n");	
	}while(j>dog.length||j<=0);
	do{
		System.out.print("1:修改名稱，2:修改寵物品種，3:修改寵物年齡:");
		i=Integer.parseInt(buf.readLine());
		if(i>3||i<=0)
		System.out.print("\n***無此選項,請重新輸入***\n");	
	}while(i>3||i<=0);
	switch(i){
		case 1:
		System.out.print("原名稱:"+dog[(j-1)].getName()+"欲修改為:");
		dog[(j-1)].setname(buf.readLine());	
		break;
		case 2:
		System.out.print("原品種:"+dog[(j-1)].getVariety()+"欲修改為:");	
		dog[(j-1)].setvariety(buf.readLine());	
		break;
		case 3:
		System.out.print("原年齡:"+dog[(j-1)].getAge()+"欲修改為:");
		dog[(j-1)].setage(Integer.parseInt(buf.readLine()));		
		}
	System.out.println("\n");
	choice(dog);
											}
public static void choice4(){
	System.out.print("\nBye Bye!");		
	return ;
				}
}
