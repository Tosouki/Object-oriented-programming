public class app1{
	public static void main(String[] args){

		Animal Yeah[]=new Animal[3];
		Yeah[0]=new Puppy("鬥牛犬","白色");
		Yeah[1]=new Tiger("孟加拉虎","橘色");
		Yeah[2]=new Lion("非洲獅","棕色");
		Yeah[0].show();
		if(Yeah[1] instanceof Tiger){
			Tiger tiger=(Tiger)Yeah[1];
			tiger.show();
			tiger.attack();
					}
		if(Yeah[2] instanceof Lion){
			Lion lion=(Lion)Yeah[2];
			lion.show();
			lion.attack();
					}
		}
}
