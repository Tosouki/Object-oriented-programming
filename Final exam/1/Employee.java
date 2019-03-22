class Employee{
          private String name,number;
          private int year;
          public void set_name(String name){
            if(name.equals(""))
            this.name="沒有名字";
            else
            this.name=name;
          }
          public String get_name(){
            return name;
          }
          public void set_number(String number){
            this.number=number;
          }
          public String get_number(){
            return number;
          }
          public void set_year(int year){
            if(year<=0)
            this.year=1;
            else				
            this.year=year;
          }
          public int get_year(){
            return year;
          }
          void show(){
          System.out.println("姓名:"+name+"，員工編號為:"+number+"，年資:"+year);
        }
}
