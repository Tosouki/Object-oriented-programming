class Plane extends Transport{
	public Plane(){
		this("",0);
				}
	public Plane(String name,double speed){
		super(name,speed);
				}
	public void move(){
		System.out.println("飛機在天上飛");
			}	
}
