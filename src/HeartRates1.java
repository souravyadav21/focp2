//Author : Sourav Yadav
//Version : 4.4.4
//Purpose :Create a class called HeartRates. The class attributes should include the person’s first name, last name and date of birth (consisting of separate attributes for the month, day and year of birth). The class should have a constructor that receives this data as parameters. For each attribute provide set and get methods. The class also should include the following methods:
//a)  a method that calculates and returns the person’s age (in years)
//b)  a method that calculates and returns the person’s maximum heart rate (the formula for calculating your maximum heart rate in beats per minute is 220 minus your age in Years) 
//c)  a method that calculates and returns the person’s target heart rate (target heart rate is a range that’s 50–85% of your maximum heart rate. 
//Write a Java application that prompts for two person’s information, instantiates object of class HeartRates and prints the information from that object—including the person’s first name, last name and date of birth—then calculates and prints the person’s age in (years), maximum heart rate and target-heart-rate range.


import java.util.*;
public class HeartRates1 

{

    public static void main(String[] args)

    {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter First Name");
        String firstname = data.nextLine();
        System.out.println("Enter Last Name");
        String lastname = data.nextLine();
        System.out.println("Enter Date of Birth");
        System.out.println("Enter day");
        int month = data.nextInt();
        System.out.println("Enter month");
        int day = data.nextInt();
        System.out.println("Enter year");
        int year = data.nextInt();
        HeartRates rt = new HeartRates(firstname, lastname, day, month, year);
        rt.firstname= firstname;
        rt.lastname= lastname;
        rt.day= day;
        rt.month= month;
        rt.year= year;
        System.out.println("Name: "+ rt.getFirstname() +" " + r.getLastname());
        System.out.println("Age in years: "+ rt.getAge());
        System.out.println("Maximum Heartrate: "+ rt.MaxHeartRates());
        rt.targetHeartRate();

    }

}

 class HeartRates 

 {
     String firstname, lastname; 
     int month, day, year= 0;
     HeartRates(String firstname, String lastname, int month, int day, int year) 

{
        this.firstname = firstname;
        this.lastname = lastname;
        this.month = month;
        this.day = day;
        this.year = year;
}
        void setFisrtname(String firstname) 

    {
        firstname= firstname;

    }
        String getFirstname() 

    {
        return firstname;

    }
        void setLastname(String lastname) 

    {
        lastname= lastname;

    } 
        String getLastname() 

    {
        return lastname;

    }
        void setDOB(int month, int day, int year) 

    {
        month = month;
        day = day;
        year = year;

    }

         void getDOB() 

    {
        System.out.println("Date of Birth: "+ day +"/"+ month +"/"+ year);

    }
       int getAge()

    {
        return (2019- year);
    }
        int MaxHeartRates() 
    {
        return (220- getAge());

    }
        void targetHeartRate() //method to display the targeted heartrate range

    {
         System.out.print("Target Heart Rate Range: "+ (MaxHeartRates()* 0.5) + " to "+ (MaxHeartRates()* 0.85));

    }

  }