import java.util.Scanner;

public class Calendar {
   public static void main (String [] args){
      Scanner scnr = new Scanner(System.in);
      int schoolDays = 0;
      int period = 0;
      System.out.println("What day is it of the school year?");
      schoolDays = scnr.nextInt();
      period = schoolDays%8; 
      System.out.println("On day " + schoolDays +" of the year it will be day " + period);
  }
}      
      