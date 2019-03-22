package traffic;
abstract public class Traffic{
	private String name;
	private double gas_L,loss;

	public Traffic(String name,double gas_L,double loss){
		setname(name);
		setgas_L(gas_L);
		setloss(loss);
				}
	public void setname(String name){
		this.name=name;			
					}
	public String getname(){
		return name;
				}
	public void setgas_L(double gas_L){
		if(gas_L>0)
		this.gas_L=gas_L;
		else
		this.gas_L=0;			
					}
	public double getgas_L(){
		return gas_L;
				}
	public void setloss(double loss){
		if(loss>0)
		this.loss=loss;
		else
		this.loss=0;			
					}
	public double getloss(){
		return loss;
				}
	public double cal_Distance(){
		return (gas_L/loss);
				}
	public abstract void show_message();
}
