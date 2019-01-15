import java.util.Scanner;
public class ArithmaticOperators {  
   public static void main (String[] args) {
      int x, y, sum, difference, product, quotient, modulus;
      Scanner in = new Scanner(System.in); 
           System.out.println("Enter first integer: ");  
      x = in.nextInt();                     
      System.out.println("Enter second integer ");
      y = in.nextInt();
      sum = x+y;
      difference = x-y;
      product = x*y;
      quotient = x/y;
      modulus = x%y;
      System.out.println("The sum is: " + sum);    
      System.out.println("The difference is " + difference);
      System.out.println("The product is " + product);
      System.out.println("The quotient is " + quotient);
      System.out.println("The modulus is " + modulus); 
      in.close();  // Close Scanner
   }
}