// File Name : ExcepTest.java
import java.io.*;

public class ExcepTest {

   public static void main(String args[]) {
      try {
         int a[] = new int[2];
         System.out.println("Access element three :" + a[3]);
      }catch(ArithmeticException e) {
         System.out.println("Exception thrown  :" + e);
      }
      finally {
      	 System.out.println("in finally block");
      }
      System.out.println("Rest of the main method");
   }
}