public class app1{
	public static void main(String[] args){

		Transport Yeah[]=new Transport[3];

		Yeah[0]=new Car("Toyota",100);
		Yeah[0].show();
		Yeah[0].move();

		Yeah[1]=new Ship("漁船",500);
		Yeah[1].show();
		Yeah[1].move();

		Yeah[2]=new Plane("波音747",5000);
		Yeah[2].show();
		Yeah[2].move();
		    }
}
