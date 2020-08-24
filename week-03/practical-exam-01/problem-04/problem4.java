public class problem{
  //==================================
// Foundations of Computer Science
// Student: Zhuofan Zhang
// id:a1806522
// Semester: 1
// Year:2020
// Practical Exam Number:01
//===================================
 
    public static void main(String[] args){
    
      int a =1;
      // control the number from 50 to 1
      for (int i = 48; i >= 3; i=i-3 ){
     // if the number less than 9 then print out i "*"
     if (i == 33) {
       for (int j=1;j<=i ; ++j ) {
       System.out.print("3"); 
       } 
       System.out.println();
     }

     if (i >= 30 && i<50 && i !=33) {
       for (int j=1;j<=i ; ++j ) {
       System.out.print("o"); 
       } 
       System.out.println();
     }

     if (i >= 20 && i <30) {
       for (int j=1;j<=i ; ++j ) {
       System.out.print("x"); 
       } 
       System.out.println();
     }

     if (i >= 10 && i<20) {
       for (int j=1;j<=i ; ++j ) {
       System.out.print("="); 
       } 
       System.out.println();
     }


     else if (i <= 9 && i>=1) {
       for (int j=1;j<=i ; ++j ) {
       System.out.print("*"); 
       } 
       System.out.println();
     }