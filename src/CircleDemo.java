
class Circle{
	int r=2;
	public void displayArea()
	{

	  double a=3.14*r*r;
	  System.out.println("area is "+a);
	}
}





class CircleDemo{
	
	public static void main(String args[])
    {
	Circle c=new Circle();
    c.r=2;
    c.displayArea();

    }    

}