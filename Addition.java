//My 5th Java program

import java.util.Scanner;// scanner class has methods for inputting in command line

public class Addition
{

 //main method starts execution of the Java App
 public static void main(String[] args) 
 {
   //create a scanner to obtain input from the  command window
   Scanner input = new Scanner(System.in);

   int number1;// first number to add
   int number2;// second number to add
   int sum;// sum of the first and second numbers


   System.out.print("Enter the First integer: ");//prompt
   number1 = input.nextInt();// read first no. from user

   System.out.print("Enter the second integer: ");
   number2 = input.nextInt(); // read the second integer

   sum = number1 + number2;

   System.out.printf("Sum is %d\n", sum); // display sum

 }// end method main



}//end class Addition