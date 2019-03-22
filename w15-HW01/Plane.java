class Plane extends Vehicle implements delivery{

	private int price;
	public Plane(){
		this(0,100);
				}
	public Plane(double speed,int price){
		super(speed);
		setprice(price);
				}
	public void setprice(int price){
		if(price>0)
		this.price=price;
		else
		this.price=0;			
					}
	public int getprice(){
		return price;
				}
	public void move(){
		System.out.println("飛機可以乘載物品");
			}
	public void delivery(int weight,int distance){
		
		int total;
		if(weight>MaxWeight)
			System.out.println("貨物過重");		
		else
			System.out.println("運費:"+(price*weight*distance));			
				}
}
