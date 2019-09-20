package ncr;
import java.util.Scanner;
public class Ncr {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter te value of n");
		n=sc.nextInt();
		System.out.println("Enter te value of r");
		r=sc.nextInt();
		int ncr=fact(n)/(fact(r)*fact(n-r));
		System.out.println("The ncr value is"+ncr);
	}
	static int fact(int n)
	{
		int i,f=1;
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
		return f;
		}
	}

