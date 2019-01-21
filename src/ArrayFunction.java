/* Author: Sourav Yadav (18CSU212)
Version:1.0.5
Purpose: Write a Java program to read numbers in an integer array of size 5 and display the following (using functions for each functionality):

 i)  its elements.

 ii) Sum of all the elements

 iii)  Largest number in the array

 iv) Smallest number in the array

 v)  Second largest number in the array

 vi) Sum of alternate elements in the array

 vii)  Count of even numbers in the array

 viii) Occurrence of a given number in the array and its frequency
*/
import java.util.*;
public class ArrayFunction
{
public static void main(String args[])
{
int a,b;
double occ;
int arr[] = new int[5];
Scanner num = new Scanner(System.in);
System.out.println("Enter the 5 numbers");
for(a=0; a<5; a++)
{
arr[a] = num.nextInt();
}
System.out.println("Enter number to find occurrence");
int p= num.nextInt();
System.out.println("Elements entered are:");
elements(arr);
System.out.println("Sum of elements entered is");
sum(arr);
System.out.println("Largest element entered is");
b=largestNum(arr);
System.out.println("Smallest element entered is");
smallestNum(arr, b);
System.out.println("Second largest element entered is");
secLargest(arr,b);
System.out.println("Sum of alternate elements entered is");
sumAlt(arr);
System.out.println("Count of even element entered is");
even(arr);
System.out.println("Occurrence of given element is");
occ= occurrence(arr, p);
System.out.println("Frequency of given element is");
freq(occ);
}
static void elements(int[] arr) 
{
int a;
for (a = 0; a <5; a++) 
{
System.out.println(arr[a]);
}
}
static void sum(int[] arr) 
{
int a, sum=0;
for (a = 0; a <5; a++) 
{
sum= sum+ arr[a];
}
System.out.println(sum);
}
static int largestNum(int[] arr) 
{
int a, large= arr[0];
for (a = 1; a <5; a++) 
{
if (arr[a] > large) 
{ 
large = arr[a]; 
} 
}
System.out.println(large);
return large;
}
static void smallestNum(int[] arr, int b) 
{
int a;
int small= b;
for (a = 0; a <5; a++) 
{
if (arr[a] < small) 
{ 
small = arr[a]; 
} 
}
System.out.println(small);
}
static void secLargest(int[] arr, int b) 
{
int a, seclarge;
int large= b;
seclarge= 0;
for (a = 0; a <5 ; a++) 
{ 
if (arr[a] > seclarge && arr[a] < large) 
{ 
seclarge = arr[a]; 
} 
}
System.out.println(seclarge);
}
static void sumAlt(int[] arr) 
{
int a, sumalt=0;
for (a = 0; a <5; a=a+2) 
{
sumalt= sumalt+ arr[a];
}
System.out.println(sumalt);
}
static void even(int[] arr) 
{
int a, count=0;
for (a = 0; a <5; a++) 
{
if(arr[a] %2 == 0)
{
count++;
}
}	
System.out.println(count);
}
static int occurrence(int[] arr, int c) 
{
int a, occ=0;
for (a = 0; a<5; a++) 
{
if (p == arr[a])
{
occ++;
}     
}
System.out.println(occ);
return occ;
}
static void freq(double occ) 
{
System.out.println(occ/5);
}
}