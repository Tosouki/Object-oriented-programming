class Person{
	private String name;
	private int hp;

	public Person(String name,int hp){
		setname(name);
		sethp(hp);
				}
	public void setname(String name){
		this.name=name;			
					}
	public String getname(){
		return name;
				}
	public void sethp(int hp){
		if(hp>0)
		this.hp=hp;
		else
		this.hp=0;			
					}
	public int gethp(){
		return hp;
				}
	public void show(){
		System.out.println("姓名:"+name+"血量:"+hp);
				}
}
