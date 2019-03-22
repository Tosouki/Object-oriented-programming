class Employee{
          private String name,position;
          private int year,money;
          public Employee(String name,int year){
            this(name,"",year);
          }
          public Employee(String name,String position){
            this(name,position,0);
          }
          public Employee(String name,String position,int year){
            set_name(name);
            set_position(position);
            set_year(year);
            set_money();
          }	
          public void set_name(String name1){
            if(name1.equals(""))
            name="沒有名字";
            else
            name=name1;
          }
          public String get_name(){
            return name;
          }
          public void set_position(String position1){
            String pos[]={"一般員工","主管","部長"};
            int y;
            for(y=0;y<pos.length;y++){
              if(pos[y].equals(position1)){
                position=pos[y];
                break;
                    }
              if(!pos[y].equals(position1)&&y==(pos.length-1))
                position=pos[0];		
                  }
          }
          public String get_position(){
            return position;
          }
          public void set_year(int year1){
            if(year1<=0||year1>15)
            year=1;
            else				
            year=year1;
          }
          public int get_year(){
            return year;
          }
          public void set_money(){
            if(position.equals("一般員工")){
            money=22000;}
            if(position.equals("主管")){
            money=40000;}
            if(position.equals("部長")){
            money=55000;}
            if(year<=5){
            money+=2000;}
            if(year>5&&year<=10){
            money+=6000;}
            if(year>10&&year<=15){
            money+=12000;}		

          }
          public int get_money(){
            return money;
          }
          void show(){
          System.out.println("姓名:"+name+" 職位:"+position+" 年資:"+year+"月薪:"+money);
        }
}
