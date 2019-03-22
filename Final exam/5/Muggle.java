class Muggle extends Person{
	public Muggle(){
		this("",0);
				}
	public Muggle(String name,int hp){
		super(name,hp);
				}
	public void show(){
		System.out.println("我是"+getname()+"是平民，血量="+gethp());
			}
}
