//Author :Sourav yadav
//Version : 1.3.3
//Purpose :To create a java program to find index of a element in an array
import java.util.Arrays;
import java.util.Scanner;
public class Index {
public static void main(String args[]) {
Scanner a=new Scanner(System.in);
System.out.println("Enter the size of array");
int w=a.nextInt();
int check;
int[] arr=new int[w];
int c;
for (c = 0; c < arr.length; c++) {
System.out.println("Enter the "+(c+1)+" number");
arr[c]=a.nextInt();
}
System.out.println("Enter the number to find index");
check=a.nextInt();
System.out.println("Index is/are : ");
for (c = 0; c < arr.length; c++)
{
if (arr[c]==check)
System.out.println(c);
}
}
}