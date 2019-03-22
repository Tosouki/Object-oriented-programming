abstract class Vehicle{
	private double speed;
	
	public Vehicle(double speed){
		setspeed(speed);
				}
	public void setspeed(double speed){
		if(speed>0)
		this.speed=speed;
		else
		this.speed=0;			
					}
	public double getspeed(){
		return speed;
				}
	public abstract void move();
}
