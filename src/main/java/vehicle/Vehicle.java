package vehicle;
import java.util.*;
public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n,count1=0,count2=0;
System.out.println("Enter the number of vehicles");
n=sc.nextInt();
int v[]=new int[n];
System.out.println("Enter the fare collected by each vehicles");
for(int i=0;i<n;i++)
{
	v[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
	if(v[i]>50)
		count1++;
	if(v[i]<50&&v[i]>0)
		count2++;
}
System.out.println("Number of heavy vehicles "+count1);
System.out.println("Number of light vehicles "+count2);

	}

}
