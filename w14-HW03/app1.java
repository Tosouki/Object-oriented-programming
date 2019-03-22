public class app1{
public static void main(String args[]){
	int i;
	double d;
	Shape shape[] = new Shape[10];
	for(i=0;i<shape.length;i++){
		d=Math.random();
		switch((int)(d*3)){
			case 0:
			shape[i]=new Circle();
			break;
			case 1:
			shape[i]=new Square();
			break;
			case 2:
			shape[i]=new Triangle();
			break;
			}
		}
	for(i=0;i<shape.length;i++){
		shape[i].draw();
					}
		}
}
