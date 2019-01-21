//Author= Sourav Yadav
//Version= 5.5.5

import java.util.*;
import java.lang.*;

class Circle
{
	private double r;
	private String c;
    public Circle()
	{
	this.r = 1.0;
	this.c = "red";  
	}
	public Circle(double r)
	{
		this.r=r;
        this.c="red";

	}
    public Circle(double r, String c)
    {
    	this.r=r;
        this.c=c;
    }
    public double getRadius()
    {

    	return this.r;
    }
    public void setRadius(double r)
    {

    	this.r=r;
    }
    public String getColor()
    {
    	return this.c;
    }
    public void setColor(String c)
    {
    	this.c=c;
    }
    public double getArea()
    {
    	double ar=Math.PI*getRadius()*getRadius();
    	return ar;
    }



}

class Cylinder extends Circle
{

	private double h;
	public Cylinder()
	{

		super();
		this.h=1;
	}
	public Cylinder(double r)
	{

		super(r);
		this.h=1;
	}
	public Cylinder(double r, double h, String c)
	{
		super(r,c);
		this.h=h;
	}
	public double getHeight()
	{
		return this.h;

	}
	public void setHeight(double h)
	{

		this.h=h;
	}
	public double getVolume()
	{
		double vol=Math.PI*getRadius()*getRadius()*getHeight();
		return vol;
	}
}
class TestCylinder
{
	static public void main(String args[])
	{
	Scanner input = new Scanner(System.in); 
	double r,h;
	String c;
	System.out.println("enter radius ");
	r=input.nextDouble();
    System.out.println("height of cylinder");
	h=input.nextDouble();
	System.out.println("enter base color");
	c=input.next();
	
	Cylinder ob = new Cylinder(r,h,c);
	System.out.println("base area of cyliner is : "+ob.getArea()+"volume of cylinder: "+ob.getVolume()+"color of base :"+ ob.getColor());
    }
}