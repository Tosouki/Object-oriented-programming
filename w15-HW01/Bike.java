class Bike extends Vehicle{
	public Bike(){
		this(0);
				}
	public Bike(double speed){
		super(speed);
				}
	public void move(){
		System.out.println("腳踏車無法乘載物品");
			}	
}
