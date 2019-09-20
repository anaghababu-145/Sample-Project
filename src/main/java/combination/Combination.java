package combination;
import java.util.Scanner;
public class Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,fact=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of alphabets in your name");
n=sc.nextInt();

for(int i=1;i<=n;i++)
{
	fact=fact*i;
}
System.out.println("The number of combination is"+fact);
	}

}
