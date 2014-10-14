import java.util.Scanner;

public class Gravity {
   public static void main (String [] args){
      Scanner scnr = new Scanner(System.in);
      double G = 6.673e-11;
      double M      = 5.98e24;
      double accelGravity = 0.0;
      double distCenter   = 0.0;
      
      System.out.println("What is your distance from the center of the earth?");
      distCenter = scnr.nextDouble();
      
      accelGravity = (G*M)/(distCenter*distCenter);
      System.out.print("accelGravity: ");
      System.out.println(accelGravity);
   }
}