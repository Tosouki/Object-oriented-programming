abstract class Phone{
	private double time;
	public Phone(){
		this(0);
				}
	public Phone(double time){
		settime(time);
				}
	public void settime(double time){
		if(time>0)
		this.time=time;
		else
		this.time=0;			
					}
	public double gettime(){
		return time;
				}
	public abstract void calculatePrice();
	public abstract void showMessage();
}
