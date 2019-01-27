import java.util.*;
class Array
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
    int arr[]=new int[10];
    int g;
    System.out.println("enter elements");
    for(int i=0;i<arr.length;i++)
    {
     arr[i]=s.nextInt();
    }
    System.out.println("enter the element you want to search");
    int p=s.nextInt();
    for(int i=0;i<arr.length;i++)
    { 
    if(p==arr[i])
    {
      g=i;
      break;
      }
      else 
      {	
      	continue;
    
       }
     }
     	
     




    }









}




