class Ship extends Transport{
	public Ship(){
		this("",0);
				}
	public Ship(String name,double speed){
		super(name,speed);
				}
	public void move(){
		System.out.println("渡輪在海上航行");
			}	
}
