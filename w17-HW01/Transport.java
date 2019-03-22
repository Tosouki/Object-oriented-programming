abstract class Transport{
	private String name;
	private double speed;
	
	public Transport(String name,double speed){
		setname(name);
		setspeed(speed);
				}
	public void setname(String name){
		this.name=name;		
					}
	public String getname(){
		return name;
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
	public void show(){
		System.out.println("名稱:"+name+" 時速:"+speed);		
					}
	public abstract void move();
			}
