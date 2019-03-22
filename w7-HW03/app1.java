import java.io.*;

public class app1{
        public static void main(String[]args)throws IOException{
          BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
          int k;
          System.out.print("請輸入學生人數：");
          k=Integer.parseInt(buf.readLine());
          String name[]=new String[k];
          double score[]=new double[k];
          input_data(name,score);
          show(name,score);

        }
        public static double input_score()throws IOException
        {
          BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
          int n;
          do{
            System.out.print("輸入總平均的分數:");
            n=Integer.parseInt(buf.readLine());
            if(n<0||n>100)
            System.out.println("輸入格式錯誤，請重新輸入。");
          }while(n<0||n>100);
          return n;
        }
        public static int input_data(String name[],double score[])throws IOException
        {
          BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
          int i;
          String str;
          for(i=0;i<name.length;i++){
            System.out.print("輸入學生名稱:");
            str=buf.readLine();
            name[i]=str;
            score[i]=input_score();
        }
            return 0;
        }
        public static  void show(String name[],double score[])
        {
          int i;
          System.out.println("學生名稱\t總平均");
          for(i=0;i<name.length;i++){
            System.out.print(name[i]);
            System.out.print("\t\t");		
            System.out.println((int)score[i]);
                }
          return ;
        }
}
