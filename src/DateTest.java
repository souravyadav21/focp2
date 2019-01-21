//Author= Sourav Yadav
//Version= 2.3.1

import java.util.*;
class Date
{
	 int e,day,year;
	 int e()
	  { 
         this.e=1;
         return e;
	  }
     int day()
      {
        this.day=1;
        return day;
      }
     int year()
     {
       this.year=2000;
       return year;
     }
     void displayDate(int e, int day, int year)
     {
       System.out.print(+e);
       System.out.print(" / ");
       System.out.print(+day);
       System.out.print(" / ");
       System.out.print(+year);

     }


}
class DateTest
{
	public static void main(String args[])
	{
      Date DateObject=new Date();
      DateObject.displayDate(DateObject.e(),DateObject.day(),DateObject.year());

	}


}