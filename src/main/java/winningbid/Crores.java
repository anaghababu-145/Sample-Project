package winningbid;
import java.util.*;
public class Crores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of applications");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter the amount (in crores)");
for(i=0;i<n;i++)
{
	a[i]=sc.nextInt();
}
int max=a[0];
		for(i=0;i<n;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
System.out.println("The winning bid is "+max);
	}

}
