class Cellphone extends Phone implements internet{
	private int inside,outside,total;
	public Cellphone(){
		this(0,0,0);
				}
	public Cellphone(int inside,int outside,double time){
		super(time);
		setinside(inside);
		setoutside(outside);
				}
	public void setinside(int inside){
		if(inside>0)
		this.inside=inside;
		else
		this.inside=0;			
					}
	public int getinside(){
		return inside;
				}
	public void setoutside(int outside){
		if(outside>0)
		this.outside=outside;
		else
		this.outside=0;			
					}
	public int getoutside(){
		return outside;
				}
	public void calculatePrice(){
		total=250+(inside*2)+(outside*10);
			}
	public	void internetprice(){
		int hour=(int)gettime();
		if((hour*hourprice)>=1300)
		total=1300;
		else
		total=(hour*hourprice);		
			}
	public int gettotal(){
		return total;
				}
	public void showMessage(){
		System.out.println("總額:"+total);
			}
}
