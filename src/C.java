//Author= Sourav Yadav
//Version= 2.0.6
class Circle
{
	private int w;
	Circle()
	{
		w=100000;
	}

	
     void displayArea()
     { //w=2;
	  double a =  3.14*w*w;
	  System.out.println("area is "+a);
      System.out.println("radius "+w);	
	  }
}





class C
{
	
	public static void main(String args[])
    {
	
	Circle c = new Circle();
 
    c.displayArea();

    }    

}