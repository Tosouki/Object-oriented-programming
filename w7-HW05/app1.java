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
          choice(name,score);

        }
        public static double input_score()throws IOException{
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
        public static int input_data(String name[],double score[])throws IOException{
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
        public static  void show(String name[],double score[]){
          int i,j;
          System.out.println("\n學生名稱\t座號\t平均");
          for(i=0,j=1;i<name.length;i++,j++){
            if(name[i]!=null&&!name[i].equals("")){
            System.out.print(name[i]);
            System.out.print("\t\t");
            System.out.print(j);
            System.out.print("\t");		
            System.out.println((int)score[i]);
                      }
                }
          return ;
        }
        public static void choice(String name[],double score[])throws IOException{
          BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
          int i;
          do{
          System.out.print("\n1.顯示及格人數和不及格人數\n2.顯示最高分座號及姓名\n3.顯示最低分座號及姓名\n");
          System.out.print("4.列出各個組距的人數\n5.列出不及格的學生座號及姓名\n6.修改學生成績\n7.離開\n");
          System.out.print("請選擇處理方式:");
          i=Integer.parseInt(buf.readLine());
          if(i>7||i<=0)
          System.out.print("\n***無此選項,請重新輸入***\n");	
          }while(i>7||i<=0);
          switch(i){
            case 1:
            choice1(name,score);
            break;
            case 2:
            choice2(name,score);
            break;
            case 3:
            choice3(name,score);
            break;
            case 4:
            choice4(name,score);
            break;
            case 5:
            choice5(name,score);
            break;
            case 6:
            choice6(name,score);
            break;
            case 7:
            choice7();
            }
        }
        public static void choice1(String name[],double score[])throws IOException{
          int i,j=0,k=0;
          for(i=0;i<score.length;i++){
            if(score[i]>=60)
            j++;
            else
            k++;
                }
          System.out.println("\n及格:"+j+"人，不及格:"+k+"人");	

          choice(name,score);
        }
        public static void choice2(String name[],double score[])throws IOException{
          int i;
          double max=0;
          for(i=0;i<score.length;i++){
            if(i==0)max=score[i];
            else{
              if(score[i]>max)max=score[i];
              }
              }
          for(i=0;i<score.length;i++){
            if(score[i]==max)
              System.out.print("\n最高分座號:"+(i+1)+"，姓名:"+name[i]);
              }
            System.out.print("\n");	

          choice(name,score);
        }
        public static void choice3(String name[],double score[])throws IOException{
          int i;
          double min=0;
          for(i=0;i<score.length;i++){
            if(i==0)min=score[i];
            else{
              if(score[i]<min)min=score[i];
              }
              }
          for(i=0;i<score.length;i++){
            if(score[i]==min)
              System.out.print("\n最低分座號:"+(i+1)+"，姓名:"+name[i]);
              }
            System.out.print("\n");	

          choice(name,score);
        }
        public static void choice4(String name[],double score[])throws IOException{
          int i,j=0,k=0,l=0,m=0,n=0;
          for(i=0;i<score.length;i++){
            if(score[i]>=0&&score[i]<60)j++;
            else if(score[i]>=60&&score[i]<70)k++;
            else if(score[i]>=70&&score[i]<80)l++;
            else if(score[i]>=80&&score[i]<90)m++;
            else if(score[i]>=90&&score[i]<=100)n++;
                }
          if(j>0)
          System.out.println("\n0分~59分:"+j+"人");
          if(k>0)
          System.out.println("\n60分~69分:"+k+"人");
          if(l>0)
          System.out.println("\n70分~79分:"+l+"人");
          if(m>0)
          System.out.println("\n80分~89分:"+m+"人");
          if(n>0)
          System.out.println("\n90分~100分:"+n+"人");	

          choice(name,score);
        }
        public static void choice5(String name[],double score[])throws IOException{
          int i;
          for(i=0;i<score.length;i++){
            if(score[i]<60)
              System.out.print("\n不及格學生座號:"+(i+1)+"，姓名:"+name[i]);
                }
            System.out.print("\n");	
          choice(name,score);
        }
        public static void choice6(String name[],double score[])throws IOException{
          BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
          int i,k;
          do{
          System.out.print("\n請輸入要修改成績的同學座號:");	
          i=Integer.parseInt(buf.readLine());
          if(i>score.length)
          System.out.println("無此座號，請重新輸入");		
          }while(i>score.length);
          score[(i-1)]=input_score();
          System.out.print("\n修改成功");	
          show(name,score);
          choice(name,score);
        }
        public static void choice7(){
          System.out.print("\nBye Bye!祝你有美好的一天");		
          return ;
        }
}
