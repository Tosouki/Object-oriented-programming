class car{
          private String Brand,Vehicles;
          public car(){
            this("","");
          }	
          public car(String Brand,String Vehicles){
            setBrand(Brand);
            setVehicles(Vehicles);
          }
          public void setBrand(String brand){
            Brand=brand;
          }
          public String getBrand(){
            return Brand;
          }
          public void setVehicles(String vehicles){
            Vehicles=vehicles;
          }
          public String getVehicles(){
            return Vehicles;
          }
          void show(){
          System.out.print("品牌:"+Brand+Vehicles+"，");
        }
}
