//Author= Sourav Yadav
//Version= 2.1.4

class Circle
{
	private int rd;
	void Circle()
   {
      this.rd=2;
    }

	
     void displayArea()
     {
	  double a =  3.14*rd*rd;
	  System.out.println("area is "+a);
      System.out.println("radius "+rd);	
	  }
}





class CircleDemo
{
	
	public static void main(String args[])
    {
	
	Circle c = new Circle();
 
    c.displayArea();

    }    

}