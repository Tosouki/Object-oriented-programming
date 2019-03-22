class Person{
	private String name,rank;

	public Person(String name,String rank){
		setname(name);
		setrank(rank);
				}
	public void setname(String name){
		this.name=name;			
					}
	public String getname(){
		return name;
				}
	public void setrank(String rank){
		String Rank[]={"二兵","一兵","上兵","下士","中士","上士","三等長","二等長","一等長"};
		int y;
		for(y=0;y<Rank.length;y++){
			if(Rank[y].equals(rank)){
				this.rank=Rank[y];
				break;
						}
			if(!Rank[y].equals(Rank[y])&&y==(Rank.length-1))
				this.rank="菜鳥";		
					}		
					}
	public String getrank(){
		return rank;
				}
}
