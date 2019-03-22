import java.io.*;

public class app1{
	public static void main(String[] args)throws IOException{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		int i;
		Person Yeah[]=new Person[3];
		Yeah[0]=new Muggle("飛七",30);
		Yeah[0].show();		
		Yeah[1]=new Kind_mage("小明",4000,1000);
		Yeah[2]=new Wicked_mage("大明",5000,900);
		if(Yeah[1] instanceof Kind_mage){
			Kind_mage kind_mage=(Kind_mage)Yeah[1];
			kind_mage.show();
			kind_mage.magic_atk();
			kind_mage.magic_def();
					}
		if(Yeah[2] instanceof Wicked_mage){
			Wicked_mage wicked_mage=(Wicked_mage)Yeah[2];
			wicked_mage.show();
			wicked_mage.magic_atk();
			wicked_mage.magic_def();
					}
						}
		}
