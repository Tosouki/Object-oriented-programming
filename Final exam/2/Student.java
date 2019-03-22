import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;
class Student{
	private static int count;
	private int ID;
	private String name,sex,Date;		
	Student(){
		this("第X位學生","無");
	}
	Student(String name,String sex){
		setname(name);
		setsex(sex);
		getcount();
		getID();
	}
	public void setname(String name){
		this.name=name;
						}
	public String getname(){
		return name;
						}
	public void setsex(String sex){
		this.sex=sex;
						}
	public String getsex(){
		return sex;
						}
	public int getcount(){
		return count++;
						}
	public int getID(){
		
		return ID=10700+count;
						}
	public String getdate(){
	Date date= new Date();
   	SimpleDateFormat klio=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
   	klio.setTimeZone(TimeZone.getTimeZone("GMT+8"));
	String strDate = klio.format(date);
	return Date=strDate;
				}
	public void showStudent(){
		System.out.println("姓名:"+name+"\n性別:"+sex+"\n學號:"+ID);
				}
}
