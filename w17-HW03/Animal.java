class Animal{
	private String name,color;
	public Animal(){
		this("","");
				}
	public Animal(String name,String color){
		setname(name);
		setcolor(color);
				}
	public void setname(String name){
		this.name=name;			
					}
	public String getname(){
		return name;
				}
	public void setcolor(String color){
		this.color=color;			
					}
	public String getcolor(){
		return color;
				}
	public void show(){
		System.out.println("名稱:"+name+" 顏色:"+color);
				}
}
