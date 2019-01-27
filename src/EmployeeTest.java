import java.util.*;
class Employee
   {
   	 private String firstName, lastName;
   	 private double salary, raisedSalary;

   	 public Employee(String firstName, String lastName, double salary)
   	 {
   	 	this.firstName = firstName;
   	 	this.lastName = lastName;
   		this.salary = salary;
       
   	 }

   	 public void raisedSalary(double salary)
      {
       raisedSalary = salary + (salary * 0.1);
       
      }

     public void display()
     {
       System.out.println("First Name: " + firstName);
       System.out.println("Last NAme: " + lastName);
       System.out.println("yearly salary: " + salary);
       System.out.println("yearly salary after 10% rise: " + raisedSalary);
     }
     

   	 /*
     Scanner input=new Scanner(System.in);
     public String FirstName()
     {
       System.out.println("Enter your first name");
       String FirstName=input.nextLine();
       return FirstName;
     }
     public String LastName()
     {
      System.out.println("enter your last name here ");
      String LastName=input.nextLine();
      return LastName;
     }
     public double Salary()
     {
      System.out.println("enter your salary here:");
      double Salary;
      Salary=input.nextDouble();
      
      if(Salary<0)
      {
       System.out.println("please enter your salary again");
       Salary=input.nextDouble();
       }
       
      return Salary;
      }
     */

   }

public class EmployeeTest
{
	
 public static void main(String args[])
 {
   Scanner sc = new Scanner(System.in);
   String firstName,lastName;
   double salary;
   double raised_salary;   
   firstName = sc.nextLine();
   lastName = sc.nextLine();
   salary = sc.nextDouble();

   Employee employee = new Employee(firstName, lastName, salary);
   employee.raisedSalary(salary);
   employee.display();

   //employeeObject.display(firstName,lastName,salary,raised_salary(salary));
   //EmployeeObject.display(EmployeeObject.FirstName(), EmployeeObject.LastName(),EmployeeObject.Salary(),EmployeeObject.Raised_salary(EmployeeObject.Salary()));
 }

}





