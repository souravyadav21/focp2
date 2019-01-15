import java.util.*;
import java.lang.*;

class Circle
{
	int r;
	Circle()
	{

	this.r=1;
    } 
    Circle(int radius)
    {
     this.r=radius;
    }
    double area()
    {
     double ar;
     ar=Math.PI*r*r;
     return ar;

    }
    double circumference()
    {
      double circum;
      circum=2*r*Math.PI;
      return circum;
    }
    void display(double ar,double circum)
    {
    System.out.println("area and circumference are" +ar+" " +circum);
    }

}
class CircleAndConstructor
{
	public static void main(String args[])
	{
	Scanner in=new Scanner(System.in);
	System.out.println("enter the radius");
	int radius;
	radius=in.nextInt();
	Circle c1=new Circle(radius);
	c1.display(c1.area(),c1.circumference());


	}
}