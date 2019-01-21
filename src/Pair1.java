/* Author: Sourav Yadav
Version: 3.3.3  
Purpose: Given an array of pairs of integers. The task is to sort the array with respect to second element of the pair.
*/
import java.util.*; 
class Pair 
{ 
int a; 
int b; 
int x,y;
Scanner numb = new Scanner(System.in); 
void setvalue1()
{
System.out.println("Enter first element of pair");
a= numb.nextInt(); 
}
void setvalue2()
{
System.out.println("Enter second element of pair");
b= numb.nextInt(); 
}  
int getvalue1()
{
return a;
}
int getvalue2()
{
return b;
}
void display(Pair[] pr) 
{ 
Pair temp= new Pair();
for ( x= 0; x < 5; x++) 
{
for ( y = x + 1; y < 5; y++) 
{
if (pr[x].getvalue2() > pr[y].getvalue2()) 
{
temp = pr[x];
pr[x] = pr[y];
pr[y] = temp;
}
}
}
for(x=0; x< 5; x++)
{
System.out.println("("+pr[x].getvalue1() +", "+ pr[x].getvalue2()+")"); 
} 
}
public Pair()     // Non-Parameterized Constructor 
{ 
this.a = 0; 
this.b = 0; 
} 
} 
class Pair1
{ 
public static void main(String[] args) 
{ 
Scanner numb = new Scanner(System.in); 
int x,a,b; 
Pair[] pr= new Pair[5];
Pair pr1= new Pair();
for(x=0; x< 5; x++)
{
pr[x]= new Pair();
pr[x].setvalue1();
pr[x].setvalue2(); 
}
System.out.println("After sorting with respect to second element of the pair");
pr1.display(pr);
} 
} 