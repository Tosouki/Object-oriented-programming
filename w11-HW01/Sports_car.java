class Sports_car extends car{
          private int kmh,RPM;
          public Sports_car(){
            super();
          }	
          public Sports_car(String Brand,String Vehicles){
            super(Brand,Vehicles);
          }
          public void setkmh(int Kmh){
            kmh=Kmh;
          }
          public int getkmh(){
            return kmh;
          }
          public void setRPM(int rPM){
            RPM=rPM;
          }
          public int getRPM(){
            return RPM;
          }
          void show(){
          super.show();
          System.out.println("最大時速為:"+kmh+"，最大轉速為:"+RPM);
        }
}
