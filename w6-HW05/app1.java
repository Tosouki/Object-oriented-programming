import java.io.*;

public class app1{
        public static void main(String[]args)throws IOException{
              BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));

              String Card[][]=new String[13][4];
              String card[]=new String[52];
              int card2[]=new int[52];
              String player[]=new String[20];//玩家的牌
              String computer[]=new String[20];//電腦的牌
              int i,j,k=2,h,u=0,v=0,x=0,y=0,z=0;
              double sum=0,sum2=0;

              for (j=0; j<52; j++){					//產生4花色，1~13張牌
                if(j>=0&&j<13)
                  card[j] = "黑桃"+(j%13+1);
                else if(j>=13&&j<26)
                  card[j] = "紅心"+(j%13+1);
                else if(j>=26&&j<39)
                  card[j] = "方塊"+(j%13+1);
                else if(j>=39&&j<52)
                  card[j] = "梅花"+(j%13+1);
                          }

              for(i=0;i<52;i++){					//洗牌+不重複
                h=(int)(Math.random()*52);
                card2[i]=h;
                for(j=0;j<i;j++){
                  if(card2[i]==card2[j]){
                        i--;
                        break;
                          }
                    }
              }
              for(j=0,h=0;j<13;j++){					//存入二維陣列(花色+點數)
                    for(i=0;i<4;i++){
                        Card[j][i]=card[card2[h]];
                        //System.out.print(Card[j][i]+"\t");(所有點數顯示)
                        h++;								
                        }
                  }
              do{							//判別+存入一維陣列
              if((card2[z]%13+1)==11||(card2[z]%13+1)==12||(card2[z]%13+1)==13){
                    player[y]=card[card2[z]];
                    sum+=0.5;
                    if((sum/0.5)%2==1)
                    System.out.println("抽到:"+Card[v][x]+"，你的點數:"+sum);
                    else
                    System.out.println("抽到:"+Card[v][x]+"，你的點數:"+(int)sum);		
              }
              else{
                    player[y]=card[card2[z]];
                    sum+=(card2[z]%13+1);
                    if((sum/0.5)%2==1)
                    System.out.println("抽到:"+Card[v][x]+"，你的點數:"+sum);
                    else
                    System.out.println("抽到:"+Card[v][x]+"，你的點數:"+(int)sum);
              }
              if(sum>10.5){
                  System.out.println("玩家點數爆掉，電腦獲勝");
                  break;
                  }
                  System.out.print("加牌請輸入1，不加牌請輸入0:");
                  k=Integer.parseInt(buf.readLine());
                  x++;
              if(x==4){
                  v++;
                  x=0;
                  }
              z++;
                            //若不抽牌(0)，電腦抽牌+存值+最後判別(若抽牌點數總和>十點半 電腦勝)
              while(k==0){						
                if((card2[z]%13+1)==11||(card2[z]%13+1)==12||(card2[z]%13+1)==13){
                      computer[u]=card[card2[z]];
                      sum2+=0.5;	
                      if((sum2/0.5)%2==1)
                      System.out.println("電腦抽到:"+Card[v][x]+"，電腦的點數:"+sum2);
                      else
                      System.out.println("電腦抽到:"+Card[v][x]+"，電腦的點數:"+(int)sum2);		
                                }
                else{
                      computer[u]=card[card2[z]];
                      sum2+=(card2[z]%13+1);
                      if((sum2/0.5)%2==1)
                      System.out.println("電腦抽到:"+Card[v][x]+"，電腦的點數:"+sum2);
                      else
                      System.out.println("電腦抽到:"+Card[v][x]+"，電腦的點數:"+(int)sum2);
                  }
                if(sum2>=(sum-(card2[0]%13+1))&&sum2>=7){
                   if(sum2>10.5){
                        System.out.println("電腦點數爆掉，玩家獲勝");
                        break;
                      }
                   if(sum>sum2)
                        System.out.println("玩家獲勝，恭喜!");
                   else if(sum==sum2)
                        System.out.println("點數相同，電腦獲勝");
                   else if(sum<sum2)
                        System.out.println("電腦獲勝");
                        break;
                      }
                   x++;
                   if(x==4){
                        v++;
                        x=0;	
                      }
                   z++;
                   u++;
                }
              y++;
              }while(k==1);
        }
}
