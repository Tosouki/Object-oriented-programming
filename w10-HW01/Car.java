class Car{
          private String modelName;
          private int carLength,engCC,maxSpeed;
          Car(String modelName,int carLength,int engCC,int maxSpeed){
          setModel(modelName);
          setCarlength(carLength);
          setEngCC(engCC);
          setMaxSpeed(maxSpeed);
          }
          public void setModel(String name){
            modelName=name;
          }
          public void setCarlength(int length){
            if(length<0)
            carLength=0;
            else		
            carLength=length;
          }
          public void setEngCC(int engcc){
            if(engcc>5000||engcc<2000)
            engCC=0;
            else				
            engCC=engcc;
          }
          public void setMaxSpeed(int speed){
            if(speed>400||speed<0)
            maxSpeed=0;
            else
            maxSpeed=speed;
          }
          void showProfile(){
          System.out.print("品牌名稱:"+modelName+"\n車身長度:"+carLength+"\n汽缸CC數:"+engCC+"\n最高車速:"+maxSpeed);
        }
}
