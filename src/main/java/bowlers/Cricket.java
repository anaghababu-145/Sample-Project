package bowlers;
import java.util.Scanner;
public class Cricket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,i,count=0;
float sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of bowlers");
n=sc.nextInt();
float r[]=new float[n];
float b[]=new float[n];
float e[]=new float[n];
System.out.println("Enter the runs conceded by the bowlers");
for( i=0;i<n;i++)
{
	r[i]=sc.nextInt();
}
System.out.println("Enter the number of balls for each bowler");
for( i=0;i<n;i++)
{
	b[i]=sc.nextInt();
}

for( i=0;i<n;i++)
{
	b[i]=b[i]/6;
	e[i]=r[i]/b[i];
}
System.out.println("Economy of the bowlers is");
for(i=0;i<n;i++) 
{
System.out.println(e[i]);
}
for(i=0;i<n;i++)
{
	sum=sum+e[i];
}
float avg=sum/n;
System.out.println("The overall economy of the team is"+avg);

for(i=0;i<n;i++)
{
	if(avg>e[i])
		count++;
}
System.out.println("The number of bowlers eligible are"+count);
	}

}
