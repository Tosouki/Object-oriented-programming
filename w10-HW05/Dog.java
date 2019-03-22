class Dog{
	private String name,variety;
	private int age;
	public Dog(){
		this("","",0);
	}
	public Dog(String modelName){
		this(modelName,"",0);
	}
	public Dog(String modelName,String variety){
		this(modelName,variety,0);
	}		
	public Dog(String name,String variety,int age){
		setname(name);
		setvariety(variety);
		setage(age);
	}
	public void setname(String name1){
		if(name1.equals(""))
		name="沒有名字";
		else
		name=name1;
	}
	public String getName(){
		return name;
				}
	public void setvariety(String variety1){
		String Pet[]={"哈士奇","鬆獅","柴犬","獵腸犬","吉娃娃","博美犬","貴賓犬","牧羊犬","藏敖","柯基"};
		int y;
		for(y=0;y<Pet.length;y++){
			if(Pet[y].equals(variety1)){
				variety=Pet[y];
				break;
						}
			if(!Pet[y].equals(variety1)&&y==(Pet.length-1))
				variety="混種犬";		
					}
	}
	public String getVariety(){
		return variety;		
				}	
	public void setage(int age1){
		if(age1<=0)
		age=1;
		else				
		age=age1;
	}
	public int getAge(){
		return age;
			}
}
