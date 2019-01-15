import java.util.*;
public class comp {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println ("Input the first floating number: ");
double a = in.nextDouble();
System.out.println ("Input the second floating number:");
double b = in.nextDouble();
if ((Math.floor (a*100))/100 == (Math.floor(b*100)/100))
System.out.println ("Numbers are the same upto two decimals");
else
System.out.println ("Numbers are different");
}
}