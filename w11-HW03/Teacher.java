class Teacher extends Person{
	private String IDcard,phone;
	public void set_IDcard(String iDcard){
		IDcard=iDcard;
	}
	public String get_IDcard(){
		return IDcard;
	}
	public void set_phone(String Phone){
		phone=Phone;
	}
	public String get_phone(){
		return phone;
	}
	void showProfile(){
	super.showProfile();
	System.out.println("人事編號為:"+IDcard+"，分機號碼為:"+phone);
			}
	void calcBMI() {
	double sum=(double)weight / (height * height) * 10000;
		System.out.print(name+"老師，您的BMI值：" + sum);
	if(sum<18.5)
		System.out.print("屬於:體重過輕");
	else if(18.5<=sum&&sum<24)
		System.out.print("屬於:正常體重");
	else if(24<=sum&&sum<28)
		System.out.print("屬於:輕度肥胖");
	else if(28<=sum&&sum<32)
		System.out.print("屬於:中度肥胖");
	else
		System.out.print("屬於:過度肥胖");
	}
}
