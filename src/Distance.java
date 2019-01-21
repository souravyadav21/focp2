//Author= Sourav Yadav
//Version= 3.0.4

import java.util.*;
import java.lang.Math.*;
class Point
{
   private double x1, x2, distCal;
   

  
   double setPoint(double x1, double x2)
   {
      this.x1 = x1;
      this.x2 = x2;
      return x1;

   }

    double caldistance(Point pnt1)
    {
     
     distCal = Math.sqrt((pnt1.x1 - pnt1.x2)*(pnt1.x1 - pnt1.x2)+(x1-x2)*(x1-x2));
     return distCal;
    
    }
    void displayDistance()
    {

         System.out.println("distace between the points is :" + distCal);
    }


}

class Distance
{
    public static void main(String args[])
    {
    	Scanner c = new Scanner(System.in);
    	System.out.println("enter value for x1");
    	double x1 = c.nextDouble();
    	System.out.println("enter value for x2");
    	double x2 = c.nextDouble();
    	System.out.println("enter value for y1");
    	double y1 = c.nextDouble();
    	System.out.println("enter value for y2");
    	double y2 = c.nextDouble();
        Point pnt = new Point();
        Point pnt1 = new Point();
        pnt.setPoint(x1, x2);
        pnt1.setPoint(y1, y2);
        pnt.caldistance(pnt1);
        pnt.displayDistance();
    }

}