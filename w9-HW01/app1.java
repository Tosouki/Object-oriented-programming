import java.io.*;

class app1{
	public static void main(String args[]) throws IOException{
	RPGcharacter RPG=new RPGcharacter();
	BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("請輸入姓名:");
	RPG.setname(buf.readLine());
	RPG.getname();
	System.out.print("請輸入等級:");
	RPG.setlevel(Integer.parseInt(buf.readLine()));
	RPG.getlevel();
	System.out.print("請輸入職業:");
	RPG.setjob(buf.readLine());
	RPG.getjob();
	System.out.print("請輸入技能:");
        RPG.setskill(buf.readLine());
	RPG.getskill();
	RPG.showProfile();
   }
}
class RPGcharacter{
	private String name,job,skill;
	private int level;
	public void setname(String n){
		name=n;
	}
	public String getname(){
		return name;
				}
	public void setjob(String j){
		job=j;
	}
	public String getjob(){
		return job;
				}
	public void setskill(String s){
		skill=s;
	}
	public String getskill(){
		return skill;
				}
	public void setlevel(int l){
		if(l>0)
		level=l;
		else{
		System.out.print("等級無負數,故直接歸零\n");
		level=0;}
	}
	public int getlevel(){
		return level;
				}
	public void showProfile(){
		System.out.print("姓名:"+name+"等級:"+level+"職業:"+job+"技能:"+skill);
 					}
}
