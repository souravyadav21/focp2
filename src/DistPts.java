//Author= Sourav Yadav
//Version= 2.4.4

import java.util.*;
import java.lang.*;
class Pts
{
private double x,y;
public Pts()
{
x=0;
y=0;
}
public Pts(double a)
{
x=a;
y=a;	
}
public Pts(double a, double b)
{
	x=a;
	y=b;
}
public void Display()
{
	System.out.println("x="+x+"\ny= "+y);
}
public double getx()
{
	return x;
}
public double gety()
{
  return y;
  }
  }
  class DistPts
  {
  static void Distance(Pts ob1,Pts ob2)
  {
  double dist;
  dist=Math.sqrt(Math.pow(ob1.getx()-ob2.getx(),2)+Math.pow(ob1.gety()-ob2.gety(),2));
  System.out.println(dist);
  }
  public static void main(String args[])
  {
  Scanner input = new Scanner(System.in);
  Pts ob1 = new Pts();
  double a,b;
  System.out.println("Enter value of x and y");
  a=input.nextDouble();
  b=input.nextDouble();
  Pts ob2 = new Pts(a,b);
  Distance(ob1,ob2);
  }
  }