import java.io.*;
public class app1{
        public static void main(String[]args)throws IOException{
              String name,birth,sex;
              String check[]={"子宮頸抹片檢查","乳房超音波檢查","乳房超音波或乳房X光檢查","膽固醇檢測","攝護腺癌","骨質密度檢測"};
              String birth2[];
              int i;
              BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
              System.out.print("請輸入姓名");
              name =buf.readLine();
              System.out.print("請輸入生日");
              birth =buf.readLine();
              birth2=birth.split("/");
              i=Integer.parseInt(birth2[0]);
              System.out.print("請輸入性別");
              sex =buf.readLine();
              if(sex.equals("M")){
                if((106-i)>=20&&(106-i)<50)
                  System.out.println(name+"先生，年齡"+(106-i)+"建議進行以下健康檢查:"+check[3]);
                else if((106-i)>=50&&(106-i)<65)
                  System.out.println(name+"先生，年齡"+(106-i)+"建議進行以下健康檢查:"+check[3]+","+check[4]);
                else if((106-i)>=65)
                  System.out.println(name+"先生，年齡"+(106-i)+"建議進行以下健康檢查:"+check[3]+","+check[4]+","+check[5]);
                else
                  System.out.println(name+"先生，年齡"+(106-i));
              }
              if(sex.equals("F")){
                if((106-i)>=18&&(106-i)<30)
                  System.out.println(name+"小姐，年齡"+(106-i)+"建議進行以下健康檢查:"+check[0]);
                else if((106-i)>=30&&(106-i)<40)
                  System.out.println(name+"小姐，年齡"+(106-i)+"建議進行以下健康檢查:"+check[0]+","+check[1]);
                else if((106-i)>=40&&(106-i)<65)
                  System.out.println(name+"小姐，年齡"+(106-i)+"建議進行以下健康檢查:"+check[0]+","+check[1]+","+check[2]);
                else if((106-i)>=65)
                  System.out.println(name+"小姐，年齡"+(106-i)+"建議進行以下健康檢查:"+check[0]+","+check[1]+","+check[2]+","+check[5]);
                else
                  System.out.println(name+"小姐，年齡"+(106-i));
                    }
        }
}
