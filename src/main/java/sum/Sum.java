package sum;
import java.util.*;
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
n=sc.nextInt();
for(int i=0;i<=n;i++)
{
	sum=sum+i;
}
System.out.println("The sum is "+sum);
	}

}
