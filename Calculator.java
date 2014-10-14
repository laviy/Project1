import java.util.Scanner;

public class Calculator {
   public static void main (String [] args){
      Scanner scnr = new Scanner(System.in);
      double value1 = 0;
      double value2 = 0;
      
      System.out.println("Hello, please enter value.");
      value1 = scnr.nextDouble();
      System.out.println("Please enter second value.");
      value2 = scnr.nextDouble();
      
      System.out.println("The sum of " + value1 + " and " + value2 + " is " + (value1 + value2));
      System.out.println("The difference of " + value1 + " and " + value2 + " is " + (value1 - value2));
      System.out.println("The product of " + value1 + " and " +  value2 + " is " + (value1 * value2));
      System.out.println("The quotent of " + value1 + " and " + value2 + " is " + (value1 / value2));
    }
}