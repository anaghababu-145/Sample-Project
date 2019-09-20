package boardexam;
import java.util.*;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,i;
int sum = 0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of students");
n=sc.nextInt();
int m[]=new int[n];
System.out.println("Enter the marks of students");
for( i=0;i<n;i++)
{
	m[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
	sum=sum+m[i];
}
System.out.println("The average is "+sum/n);
	}

}
