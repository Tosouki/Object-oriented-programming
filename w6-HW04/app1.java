import java.io.*;
public class app1{
        public static void main(String[]args)throws IOException{
              BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));

              char ch='Y';
              String f;
              int b,e,i,o,d=0,j=0;
              int c[][]=new int[][]{{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
              double a[][],max=0,min=0;

              do{
                System.out.print("請輸入學生人數：");
                e =Integer.parseInt(buf.readLine());
                a=new double[e][4];
              }while(e<=0);

              System.out.println("開始輸入學生成績");
              for(i=0;i<e;i++){
              System.out.print("請輸入第"+(i+1)+"位學生平時成績：");
              a[i][0] =Integer.parseInt(buf.readLine());	
              System.out.print("請輸入第"+(i+1)+"位學生期中成績：");
              a[i][1] =Integer.parseInt(buf.readLine());	
              System.out.print("請輸入第"+(i+1)+"位學生期末成績：");
              a[i][2] =Integer.parseInt(buf.readLine());
              a[i][3]=0.3*a[i][0]+0.35*a[i][1]+0.35*a[i][2];
              System.out.println("");
                      }

            do{
               System.out.print("請選擇要查詢資料（1.顯示所有同學全部成績、2.學期成績不及格同學及分數、3.各個分數組距人數、4.查詢某位同學成績、5.選擇列出哪種成績的最高及最低分）：");
               b =Integer.parseInt(buf.readLine());
               while(b<=0||b>=6){
                       System.out.println("輸入錯誤,沒有此功能,請重新輸入\n");
                       System.out.print("請選擇功能（1.顯示所有同學全部成績、2.學期成績不及格同學及分數、3.各個分數組距人數、4.查詢某位同學成績、5.選擇列出哪種成績的最高及最低分）：");
                       b =Integer.parseInt(buf.readLine());
                      }

               switch(b){
                      case 1:
                      System.out.println("\t\t平時成績  期中成績   期末成績  學期成績");
                      for(i=0;i<e;i++){	
                            System.out.print("第"+(i+1)+"位同學:\t   ");
                            System.out.print((int)a[i][0]);
                            System.out.print("\t    "+(int)a[i][1]);
                            System.out.print("\t\t"+(int)a[i][2]);
                            System.out.print("\t "+(float)a[i][3]+"\n");
                              }
                      break;
                      
                      case 2:
                      for(i=0;i<e;i++){
                          if(a[i][3]<60){
                                System.out.print("不及格學生是第"+(i+1)+"學生:\t");
                                System.out.print("平時成績:"+(int)a[i][0]+"\t");
                                System.out.print("期中成績:"+(int)a[i][1]+"\t");
                                System.out.println("期末成績:"+(int)a[i][2]+"\t");
                                System.out.println("");			
                              }
                          }
                      break;
                      
                      case 3:
                      System.out.println("\t\t0~59  60~69   70~79   80~89   90~100");
                      for(i=0;i<e;i++){
                            for(d=0;d<4;d++){
                                  if(a[i][d]>=0&&a[i][d]<60)c[d][0]+=1;	
                                  if(a[i][d]>=60&&a[i][d]<70)c[d][1]+=1;	
                                  if(a[i][d]>=70&&a[i][d]<80)c[d][2]+=1;	
                                  if(a[i][d]>=80&&a[i][d]<90)c[d][3]+=1;	
                                  if(a[i][d]>=90&&a[i][d]<=100)c[d][4]+=1;	
                                  }
                          }
                      System.out.print("平時成績:\t  ");
                      for(j=0;j<4;j++){
                            for(o=0;o<5;o++){
                                  if(c[j][o]==0)
                                  System.out.print("\t");
                                  if(c[j][o]>0)
                                  System.out.print(c[j][o]+"\t");
                                  if(o==4&&j==0)
                                  System.out.print("\n期中成績:\t  ");
                                  if(o==4&&j==1)
                                  System.out.print("\n期末成績:\t  ");
                                  if(o==4&&j==2)
                                  System.out.print("\n學期成績:\t  ");
                                }
                          }
                      System.out.println("");
                      break;
                      
                      case 4:
                      System.out.print("請輸入要查詢學生:");
                      j =Integer.parseInt(buf.readLine());
                      for(i=0;i<e;i++){
                          if(i==(j-1)){
                                System.out.println("第"+j+"學生成績如下:");
                                System.out.println("平時成績:"+(int)a[i][0]);
                                System.out.println("期中成績:"+(int)a[i][1]);
                                System.out.println("期末成績:"+(int)a[i][2]);	
                                System.out.println("學期成績:"+(float)a[i][3]);
                              }			
                          }
                      break;
                      
                      case 5:
                      System.out.print("請選擇要列出最高及最低分的成績:");
                      System.out.println("a:平時成績、b:期中成績、c:期末成績、d:學期成績");
                      f =buf.readLine();
                      ch=f.charAt(0);
                      if(ch=='a'||ch=='b'||ch=='c'||ch=='d'){
                            if(ch=='a')j=0;
                            if(ch=='b')j=1;
                            if(ch=='c')j=2;
                            if(ch=='d')j=3;
                            for(i=0;i<e;i++){
                                  if(i==0)max=min=a[i][j];
                                  else{
                                    if(a[i][j]>max)max=a[i][j];
                                    if(a[i][j]<min)min=a[i][j];
                                      }
                            }
                            if(ch=='a')
                            System.out.println("平時成績中最高分為"+(int)max+"，最低分為"+(int)min);
                            if(ch=='b')
                            System.out.println("期中成績中最高分為"+(int)max+"，最低分為"+(int)min);
                            if(ch=='c')
                            System.out.println("期末成績中最高分為"+(int)max+"，最低分為"+(int)min);
                            if(ch=='d')
                            System.out.println("學期成績中最高分為"+(float)max+"，最低分為"+(float)min);
                       }
                      else
                      System.out.println("無此選項!");
                      break;
                      }
                      System.out.print("請問是否繼續查詢?(Y/N):");
                      f =buf.readLine();	
                      ch=f.charAt(0);
                      if(ch=='N'){
                            break;
                      }
            }while(ch=='Y');
        } 
}
