import java.util.*;
class Date
{
	 int m,day,year;
	 int m()
	  { 
         this.m=1;
         return m;
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
     void displayDate(int m, int day, int year)
     {
       System.out.print(+m);
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
      DateObject.displayDate(DateObject.m(),DateObject.day(),DateObject.year());

	}


}																																