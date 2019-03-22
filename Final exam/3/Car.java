package traffic.car;
import traffic.*;
public class Car extends Traffic{

	public Car(String name,double gas_L,double loss){
		super(name,gas_L,loss);
				}
	public void show_message(){
		System.out.println(getname()+"還可以在道路上行駛"+cal_Distance()+"公里");
			}
}
