import java.io.*;

public class app1{
          public static void main(String args[]) throws IOException{
                  BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
                  String name;
                    String employee[]=new String[3];
                  System.out.print("請輸入員工資訊[名稱、職位、年資]:");
                  name=buf.readLine();
                  System.out.println("員工資訊:");
                    employee=name.split(",");
                  char str2[]=employee[1].toCharArray();
                  if(employee.length==3){
                  int year=Integer.parseInt(employee[2]);
                  Employee E1=new Employee(employee[0],employee[1],year);
                  E1.show();
                        }
                  else if(employee.length==2){
                    for(int i=0;i<str2.length;i++){
                    if(!Character.isDigit(str2[i])){
                      Employee E1=new Employee(employee[0],employee[1]);
                      E1.show();
                      break;
                              }
                    else{
                      int year=Integer.parseInt(employee[1]);
                      Employee E1=new Employee(employee[0],year);
                      E1.show();
                      break;
                              }
                      }	
                }
        }
}
