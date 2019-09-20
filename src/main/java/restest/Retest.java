package restest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Retest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
int n,sum=0,avg = 0,i,c = 0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number of students");
n=Integer.parseInt(br.readLine());
int a[]=new int[n];
System.out.println("Enter the marks of students");
for( i=0;i<n;i++)
{
	a[i]=Integer.parseInt(br.readLine());
}
for(i=0;i<n;i++)
{
	sum=sum+a[i];
}
for(i=0;i<n;i++)
{
	avg=sum/n;
}
for(i=0;i<n;i++)
{
	if(a[i]<avg)
		c++;
}

System.out.println("Number of students appearing for retest is "+c);
}}
