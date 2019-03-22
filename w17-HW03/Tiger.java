class Tiger extends Animal implements attack{
	public Tiger(){
		this("","");
				}
	public Tiger(String name,String color){
		super(name,color);
				}
	public	void attack(){
		System.out.println("我是動物老虎，我會咬人。");	
			}
	public void show(){
		System.out.println("我是動物老虎，我的名稱是泰格，顏色橘色，我會咬人。");
			}
}
