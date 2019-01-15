import java.util.Arrays;
import java.util.Scanner;
public class MyClass {
public static void main(String args[]) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the size of array");
int n=s.nextInt();
int check;
int[] arr=new int[n];
int i; 
for (i = 0; i < arr.length; i++) {
System.out.println("Enter the "+(i+1)+" number");
arr[i]=s.nextInt();
}
System.out.println("Enter the number to check index");
check=s.nextInt();
System.out.println("Index is/are ");
for (i = 0; i < arr.length; i++)
{
if (arr[i]==check)
System.out.println(i);
else
System.out.println(-1);
}
}
}