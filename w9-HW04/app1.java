import java.io.*;

class app1{
          public static void main(String args[]) throws IOException{
          student op=new student();
          BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
          System.out.print("請輸入姓名:");
          op.set_name(buf.readLine());
          op.get_name();
          System.out.print("請輸入平時成績:");
          op.set_usual_score(Integer.parseInt(buf.readLine()));
          op.get_usual_score();
          System.out.print("請輸入期中考成績:");
          op.set_mid_score(Integer.parseInt(buf.readLine()));
          op.get_mid_score();
          System.out.print("請輸入期末考成績:");
          op.set_final_score(Integer.parseInt(buf.readLine()));
          op.get_final_score();
          op.print();
           }
        }
        class student {
          private String name;
          private int usual_score,mid_score,final_score;
          BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
          void set_name(String num){
            name=num;
          }
          public String get_name(){
            return name;
                }
          void set_usual_score(int num2)throws IOException{
            if(num2<=100&&num2>=0)
            usual_score=num2;
            else{
              System.out.print("錯誤,請輸入0~100的數:");
              set_usual_score(Integer.parseInt(buf.readLine()));	
              }
          }
          public int get_usual_score(){
            return usual_score;
                }
          void set_mid_score(int num3)throws IOException{
            if(num3<=100&&num3>=0)
            mid_score=num3;
            else{
              System.out.print("錯誤,請輸入0~100的數:");
              set_mid_score(Integer.parseInt(buf.readLine()));	
              }
          }
          public int get_mid_score(){
            return mid_score;
                }
          void set_final_score(int num4)throws IOException{
            if(num4<=100&&num4>=0)
            final_score=num4;
            else{
              System.out.print("錯誤,請輸入0~100的數:");
              set_final_score(Integer.parseInt(buf.readLine()));
              }
          }
          public int get_final_score(){
            return final_score;
                }
          public double get_score(){
            return (usual_score*0.3+mid_score*0.3+final_score*0.4);		
                }
          void print(){
          System.out.print("學生:"+get_name()+"\n平時成績:"+usual_score+"\n期中考成績:"+mid_score
                +"\n期末考成績:"+final_score+"\n期末總成績:"+get_score());
        }
}
