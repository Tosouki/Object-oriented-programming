class Telephone extends Phone{
	private int home,outside,total;
	public Telephone(int home,int outside){
		sethome(home);
		setoutside(outside);

				}
	public void sethome(int home){
		if(home>0)
		this.home=home;
		else
		this.home=0;			
					}
	public int gethome(){
		return home;
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
		this.total=(home*1)+(outside*5);
			}
	public int gettotal(){
		return total;
				}
	public void showMessage(){
		System.out.println("總額:"+total);
			}	
}
