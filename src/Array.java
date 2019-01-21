//Author: Sourav yadav
//Version :1.21
//Purpose: To Use a one-dimensional array to solve the following problem: Write an application that inputs five numbers, each between 10 and 100, inclusive.

import java.util.*;
class Array
{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int ar[] = new int[5];
int count = 0; 
int a = 0;
int numb = 0;
while (a < arr.length) 
{
System.out.println("Enter number: ");
numb = input.nextInt();
if ((numb >= 10) && (numb <= 100)) 
{
boolean digit = false;
a++;
for (int i = 0; i < ar.length; i++)  
{
if (ar[i] == numb)     
digit = true;
}  
if (!digit) 
{
arr[count] = numb;
count++;
} 
else
System.out.printf("the number was entered before \n");
}
else
System.out.println("number must be between 10 and 100");
for (int i =0;  i < a; i++) 
{
System.out.print(arr[i] +" ");
}
System.out.println();  
} 
} 
} 