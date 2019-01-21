/* Author: Sourav Yadav
Version: 6.0.7 
Purpose: Use a two-dimensional array to solve the following problem: A company has four salespeople (1 to 4) who sell five different products (1 to 5). 
Once a day, each salesperson passesin a slip for each type of product sold. Each slip contains the following:
a) The salesperson number
b) The product number
c) The total dollar value of that product sold that day
Thus, each salesperson passes in between 0 and 5 sales slips per day. Assume that the information from all the slips for last month is available.
Write an application that will read all this information for last week’s sales and summarize the total sales by salesperson and by product. 
*/

import java.util.*;
public class Sales
{
public static void main(String[] args) 
{
Scanner numb = new Scanner(System.in); 
int[][] sales= new int[5][6];
int a, b, sum=0;
for(a=0; a<4; a++)
{
for(b=0; b<5; b++)
{
System.out.println("Enter sales by salesperson"+ a + "for product"+ b);
sales[a][b] = numb.nextInt();
}
}
for(a=0; a<5; a++)
{
for(b=0; b<5; b++)
{ 
sum+= sales[a][b];
}
sales[a][b] = sum;
sum=0;
}
for(b=0; b<5; b++)
{ 
for(a=0; a<4; a++)
{
sum+= sales[a][b];
}
sales[a][b] = sum;
sum=0;
}
for(a=0; a<5; a++)
{
for(b=0; b<6; b++)
{
System.out.print(sales[a][b]+"  ");
}
System.out.println("");
}
}
}