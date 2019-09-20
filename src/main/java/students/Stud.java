package students;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stud 
{
String name;
String age;
String degree;
String branch;
String contact;

public void read() throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter your name:");
name=br.readLine();
System.out.println("Enter your age");
age=br.readLine();
System.out.println("Enter your degree");
degree=br.readLine();
System.out.println("Enter your branch");
branch=br.readLine();
System.out.println("Enter your contact number");
contact=br.readLine();
}
public void display()
{
	System.out.println("Name    : "+name);
	System.out.println("Age     : "+age);
	System.out.println("Degree  : "+degree);
	System.out.println("Branch  : "+branch);
	System.out.println("Contact : "+contact);
}

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
Stud s=new Stud();
s.read();
s.display();
	}}
	


