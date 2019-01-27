// author = sourav yadav 
// version = 7.7.7


import java.util.*;
class Date
{
int day, month, year;
Date(int a, int b, int c)
{
this.day=a;
this.month=b;
this.year=c;
}
void DisplayDate()
{
System.out.print(day+" "+month+" "+year+" ");
}
}
class Address
{
String line1, line2, city, state;
int pinCode;
Address(String l1, String l2, String c, String s, int p)
{
this.line1=l1;
this.line2=l2;
this.city=c;
this.state=s;
this.pinCode=p;
}
void DisplayAddress()
{
System.out.print(line1+" "+line2+" "+city+" "+state+" "+pinCode+" ");
}
}
class Qualification
{
String qualName, university, institute;
double cgpa;
Qualification(String qa, String ua, String ia, double cgpa)
{
this.qualName=qa;
this.university=ua;
this.institute=ia;
this.cgpa=cgpa;
}
void DisplayQualification()
{
System.out.print(qualName+" "+university+" "+institute+" "+cgpa+" ");
}
}
class Project
{
String name, role;
String[] responsibilities;
Date startDate,endDate;
int z;
Project(String n,String r, int ds, int ms, int ys, int dl, int ml, int yl, int z, Project proj[])
{
int i;
Scanner in = new Scanner(System.in);
startDate= new Date(ds,ms,ys);
endDate= new Date(dl,ml,yl);
this.z=z;	
this.responsibilities=new String[z];
System.out.println("enter responsibilities");
for(i=0;i<z;i++)
{
this.responsibilities[i]=resp[i];
}
}
void DisplayProject(int z)
{
int i;
System.out.print(name+" "+role+" ");
startDate.DisplayDate();
System.out.print(" ");
endDate.DisplayDate();
System.out.print(" ");
for (i=0;i<z;i++)
{
System.out.print(responsibilities[i]+" ");
}
}
int getz()
{
return z;
}
}
class Student 
{
String firstName, lastName, eMail, contactNo;
Address addr;
Date dob;
String[] skills;
Qualification[] qual;
Project[] projects;
Student(String fn, String ln, String em, String cn, String l1, String l2, String c, String s, int p, int d, int m, int y, int x, String skill[], int v, Qualifications quali[], int b, Project proj[])
{
Scanner input = new Scanner(System.in);
int j;
firstName=fn;
lastName=ln;
eMail=em;
contactNo=cn;
addr=new Address(l1,l2,c,s,p);
dob=new Date(d,m,y);
skills=new String[x];
for(j=0;j<x;j++)
{
skills[j]=skill[j];
}
qual=new Qualification[v];
for(j=0;j<v;j++)
{
qual[j]=quali[j];
}
projects= new Project[b];
String n, r;
String resp[];
int ds, ms, ys, dl, ml, yl, z;
for(j=0;j<b;j++)
{
System.out.println("enter name, role, no. of responsibilities, startday, startmonth, startyear, finishday, finishmonth, finishyear of project number "+(j+1));
n=input.next();
r=input.next();
z=input.nextInt();
ds=input.nextInt();
ms=input.nextInt();
ys=input.nextInt();
dl=input.nextInt();
ml=input.nextInt();
yl=input.nextInt();
projects[j] = new Project(n,r,ds,ms,ys,dl,ml,yl,z);
}
}
void DisplayStudent(int x, int v, int b)
{
int j;
System.out.print(firstName+" "+lastName+" "+eMail+" "+contactNo+" ");
for (j=0;j<x;j++)
{
System.out.print(skills[j]+" ");
}
addr.DisplayAddress();
dob.DisplayDate();
for (j=0;j<v;j++)
{
qual[j].DisplayQualification();
}
for (j=0;j<b;j++)
{
projects[j].DisplayProject(projects[j].getz());
}
}
}
class StudentAssigment
{
static public void main(String args[])
{
Scanner input = new Scanner(System.in);
String fn, ln, em, cn, l1, l2, c, s;
int p, d, m, y, x, v, b, n, i;	
System.out.println("Enter the number of students");
n=input.nextInt();
Student[] student = new Student[n];
for (i=0;i<n;i++)
{
System.out.println("Enter fname");
fn=input.next();
System.out.println("Enter lname");
ln=input.next();
System.out.println("Enter email");
em=input.next();
System.out.println("Enter cnumber");
cn=input.next();
System.out.println("Enter l1");
l1=input.next();
System.out.println("Enter l2");
l2=input.next();
System.out.println("Enter city");
c=input.next();
System.out.println("Enter state");
s=input.next();
System.out.println("Enter pincode");
p=input.nextInt();
System.out.println("Enter date");
d=input.nextInt();
m=input.nextInt();
y=input.nextInt();
System.out.println("Enter number of skills");
x=input.nextInt();
String skill = new String[x];
System.out.println("enter skills");
for(j=0;j<x;j++)
{
skill[j]=input.next();
}
System.out.println("Enter number of Qualifications");
v=input.nextInt();
Qualifications[] quali = new Qualifications[v];
String q, u, i;
double cgpa;
for(j=0;j<v;j++)
{
System.out.println("enter qualName, university, institute, cgpa of number "+(j+1)+" Qualification");
q=input.next();
u=input.next();
i=input.next();
cgpa=input.nextDouble();
quali[j]=new Qualification(q,u,i,cgpa);
}
System.out.println("Enter number of Projects");
b=input.nextInt();
Project[] proj = new Project[b];
String n, r;
int ds, ms, ys, dl, ml, yl, z, k;
for(j=0;j<b;j++)
{
proj[j].z=z;
System.out.println("enter name, role, no. of responsibilities, enter responsibilities, startday, startmonth, startyear, finishday, finishmonth, finishyear of project number "+(j+1));
n=input.next();
r=input.next();
z=input.nextInt();
String[] res= new String[z];
for(k=0;k<z;k++)
{
res[k]=input.next();
}
ds=input.nextInt();
ms=input.nextInt();
ys=input.nextInt();
dl=input.nextInt();
ml=input.nextInt();
yl=input.nextInt();
proj[j] = new Project(n,r,ds,ms,ys,dl,ml,yl,z,res[]);
}
student[i]=new Student(fn,ln,em,cn,l1,l2,c,s,p,d,m,y,x,skill[],v,quali[],b,proj[]);
student[i].DisplayStudent(x,v,b);
}
}
}