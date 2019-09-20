package divisor;
import java.util.Scanner;
public class Perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,s=0,i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
n=sc.nextInt();
System.out.println("The divisors of the number are");
for( i=1;i<n;i++)
{
	if(n%i==0)
		System.out.println(i+"");
}

System.out.println("The sum of divisors are ");
for( i=1;i<n;i++)
{
	if(n%i==0)
		s=s+i;
}
System.out.println(s);
if(n==s)
	System.out.println("Its a perfect number");
else 
	System.out.println("Its not a perfect number");
	}

}
