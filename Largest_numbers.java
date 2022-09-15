import java.util.Scanner;

public class Largest_numbers {
   
	public static void main(String[ ]args) {
	 Scanner sc =new Scanner(System.in);
      System.out.println("Enter the first number ");
      int num1 = sc.nextInt(); 
      System.out.println("Enter the second number ");
     int num2 = sc.nextInt(); 
      System.out.println("Enter the third number ");
      int num3 = sc.nextInt(); 
      
      //Using if else statement find the largest of three numbers
      if( num1 >= num2 && num1 >= num3)
        System.out.println(num1+" is the largest Number");

      else if (num2 >= num1 && num2 >= num3)
        System.out.println(num2+" is the largest Number");

      else
        System.out.println(num3+" is the largest Number");
     
}
}
