import java.util.Scanner;

       /* danien Raja A
        CG java Batch 2576*/

public class java {
  
    
     public static void  main(String args[]){
        int Student_id;             //int datatpye
        String student_Name;        // string datatype
        double student_attendance;   // primitive data type double
         Scanner obj = new Scanner(System.in); // object create
         Student_id=obj.nextInt();  // get input
         student_Name=obj.next(); // get input 
         student_attendance=obj.nextDouble();  // get input
         
      System.out.println("Enter the Student Name"+student_Name);
      System.out.println("Enter the Student Name"+student_attendance);
      System.out.println("Enter the Student ID"+Student_id);
      }
}