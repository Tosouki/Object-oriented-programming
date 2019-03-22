import java.io.*;

public class app1{
        public static void main(String[]args)throws IOException{
          int b;
          String city;
          String check[]={"台北市","基隆市","台中市","嘉義市","花蓮市","高雄市","金門市"};
          char ch='N';
          String e;
          BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
          
          do{
                  System.out.print("請輸入想要查詢的城市名稱：");
                  city=buf.readLine();
                  if(city.equals(check[0])){
                  System.out.print(check[0]+"的空氣品質普通無需戴口罩，降雨機率為58%建議帶傘出門");
                  break;}
                  else if(city.equals(check[1])){
                  System.out.print(check[1]+"的空氣品質普通無需戴口罩，降雨機率為42%建議帶傘出門");
                  break;}
                  else if(city.equals(check[2])){
                  System.out.print(check[2]+"的空氣品質對敏感族群不健康需要戴口罩，降雨機率為0%無須帶傘出門");
                  break;}
                  else if(city.equals(check[3])){
                  System.out.print(check[3]+"的空氣品質對敏感族群不健康需要戴口罩，降雨機率為0%無須帶傘出門");
                  break;}
                  else if(city.equals(check[4])){
                  System.out.print(check[4]+"的空氣品質良好無需戴口罩，降雨機率為78%建議帶傘出門");
                  break;
                  }
                  else if(city.equals(check[5])){
                  System.out.print(check[5]+"的空氣品質對敏感族群不健康需要戴口罩，降雨機率為30%無須帶傘出門");
                  break;}
                  else if(city.equals(check[6])){
                  System.out.print(check[6]+"的空氣品質普通無需戴口罩，降雨機率為0%無須帶傘出門");
                  break;}
                  else {
                  System.out.print("查無此城市,請問是否需要重新輸入(Y/N):");
                  e =buf.readLine();
                  ch=e.charAt(0);
                    if(ch=='N')
                    {
                     break;}
                                }
          }while(ch=='Y');
        }
}
