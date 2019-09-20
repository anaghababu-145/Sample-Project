package fibonacci;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,a=0,b=0,c=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
n=sc.nextInt();
System.out.println(b);
System.out.println(c);
for(int i=1;i<=n;i++)
{
	a=b;
	b=c;
	c=a+b;
	
	System.out.println(c+" ");
}
	}

}
