class Kind_mage extends Person implements Magic{

	private int mp;

	public Kind_mage(String name,int hp,int mp){
		super(name,hp);
		setmp(mp);
				}
	public void setmp(int mp){
		if(mp>0)
		this.mp=mp;
		else
		this.mp=0;			
					}
	public int getmp(){
		return mp;
				}
	public void show(){
		System.out.println("我是"+getname()+"是好法師，血量="+gethp());
			}
	public void magic_atk(){
		double d;
		int mp;
		d=Math.random();
		mp=(int)(d*mp_Max);
		if(mp>=0&&mp<=30)
		System.out.println("攻擊魔法:火球");
		else if(mp>=31&&mp<=70)
		System.out.println("攻擊魔法:大火球");
		else if(mp>=71&&mp<=100)
		System.out.println("攻擊魔法:炎爆術");
				}
	public void magic_def(){
		double d;
		int mp;
		d=Math.random();
		mp=(int)(d*mp_Max);
		if(mp>=0&&mp<=30)
		System.out.println("防禦魔法:聖盾術");
		else if(mp>=31&&mp<=70)
		System.out.println("防禦魔法:光之護封劍");
		else if(mp>=71&&mp<=100)
		System.out.println("防禦魔法:冰之結界");
		}
}
