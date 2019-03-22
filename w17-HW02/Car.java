class Car extends Transport{
	public Car(){
		this("",0);
				}
	public Car(String name,double speed){
		super(name,speed);
				}
	public void move(){
		System.out.println("汽車開在馬路上");
			}
	public void atk(){
		System.out.println("三寶衝撞");
			}	
}
