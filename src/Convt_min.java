public class Convt_min
{
	public static void main(String args[])
	{
	float min, days, months, years;
	min = 525600;
	System.out.println("Minutes=525600");
	days = min/(24*60);
	months =  days/30;
    years = months/12;
    System.out.println("Number of years =" +years);
    System.out.println("Number of months =" +months);
    System.out.println("Number of days =" +days);
    } 
}