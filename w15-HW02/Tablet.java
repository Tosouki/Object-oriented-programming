class Tablet extends Phone implements internet{
	private int inside,outside,total;
	public Tablet(){
		this(0,0,0);
				}
	public Tablet(int inside,int outside,double time){
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
		total=200+(inside*3)+(outside*13);
			}
	public	void internetprice(){
		int hour=(int)gettime();
		if((hour*hourprice)>=1000)
		total=1000;
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
