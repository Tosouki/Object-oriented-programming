class Employee {
          private String name; 
          private String telephone;     
          private int year;  

          Employee(String name,String telephone,int year) {
            setName(name);
            settelephone(telephone);
            setyear(year);
          }

          void setName(String name) {
            this.name = name;
          }

          String getName() {
            return name;
          }

          void settelephone(String telephone) {
            int i,a;
            char telephone2[];
            telephone2=telephone.toCharArray();
            for(i=0,a=0;i<telephone2.length;i++){
              if(Character.isDigit(telephone2[i])){
              a++;
                        }
                      }
            if(telephone2.length==10&&telephone2[0]=='0'&&telephone2[1]=='9'&&a==10){
            this.telephone = telephone;}
            else{
            this.telephone ="0912345678";}	
          }

          String gettelephone() {
            return telephone;
          }

          void setyear(int year) {
            if(year>=1&&year<=30)
            this.year = year;
            else{
            this.year = 1;}
          }

          int getyear() {
            return year;
          }

          void showProfile() {
            System.out.println("工程師姓名：" + name + "\n工程師手機：" + telephone + "\n工程師年資：" + year );
          }
}
