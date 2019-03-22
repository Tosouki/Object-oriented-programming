class Student extends Person{
          private String student_number,major;
          public void set_student_number(String Student_number){
            student_number=Student_number;
          }
          public String get_student_number(){
            return student_number;
          }
          public void set_major(String Major){
            major=Major;
          }
          public String get_major(){
            return major;
          }
          void showProfile(){
          System.out.println("學號為:"+student_number+"，主修課程為:"+major);
          super.showProfile();
        }
}
