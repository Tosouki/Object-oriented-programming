public class supervisors extends Employee{
	private int salary;
	
	public supervisors(String name,String sex,String phone,String address,int year){
		
		super(name,sex,phone,address);
		setsalary(year);
									}
	public void setsalary(int year){	
		salary=50000+3000+(2500*year);
	}
	public int getsalary(){
		return salary;
				}
	public int salary(){
		return getsalary();
			}

	public void show(){
		super.show();
		System.out.println("薪資:"+salary());
			}
}
