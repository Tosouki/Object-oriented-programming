class Engineer extends Employee{
	private String skill;   
	private int salary;  
	private double YearSalary;

	Engineer(String name,String telephone,int year,int salary,String skill) {
		super(name,telephone,year);
		setskill(skill);
		setsalary(salary);
		setYearSalary(year,salary);
	}

	void setsalary(int salary){
		if(salary>0)
		this.salary = salary;
		else{
		this.salary = 1;}
	}

	int getsalary(){
		return salary;
	}

	void setskill(String skill) {
		this.skill = skill;
	}

	String getskill(){
		return skill;
	}

	void setYearSalary(int year,int salary) {
		if(year<=5){
			this.YearSalary =(double)(salary*12*1.1);
			}
		else if(year>5&&year<=15){
			this.YearSalary =(double)(salary*12*1.2);
			}
		else if(year>15&&year<=25){
			this.YearSalary =(double)(salary*12*1.3);
			}
		else if(year>25&&year<=30){
			this.YearSalary =(double)(salary*12*1.4);
			}
	}

	double getYearSalary(){
		return YearSalary;
	}

	void showProfile(){
		super.showProfile();
		System.out.print("工程師專長：" +skill+ "\n工程師年薪：" +(int)YearSalary);
	}
}
