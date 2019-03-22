public abstract class Employee{
	private String name,sex,phone,address;
	private int year;
	
	public Employee(String name,String sex,String phone,String address){
		setname(name);
		setsex(sex);
		setphone(phone);
		setaddress(address);
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
	public void setphone(String phone){
		this.phone=phone;
	}
	public String getphone(){
		return phone;
				}
	public void setaddress(String address){
		this.address=address;
	}
	public String getaddress(){
		return address;
				}
	public void setyear(int year){
		this.year=year;
	}
	public int getyear(){
		return year;
				}

	public void show(){
		System.out.println("姓名:"+name+"\n性別:"+sex+"\n電話:"+phone+"\n地址:"+address);
			}
	public abstract int salary();
}
