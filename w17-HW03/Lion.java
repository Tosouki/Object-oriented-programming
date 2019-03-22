class Lion extends Animal implements attack{
	public Lion(){
		this("","");
				}
	public Lion(String name,String color){
		super(name,color);
				}
	public	void attack(){
		System.out.println("我是動物獅子，我會咬人。");	
			}
	public void show(){
		System.out.println("我是動物獅子，我的名稱是萊恩，顏色棕色，我會咬人。");
			}
}
