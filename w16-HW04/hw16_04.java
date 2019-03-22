public class hw16_04 {
	public static void main(String[] args) {
		Animal animal = new Horse();
	try{
		animal = (Bird) animal;
	}
	catch(ClassCastException e){
		e.printStackTrace();
		System.out.println("醒醒吧，馬不會飛唷\n");
				}
	}
}
