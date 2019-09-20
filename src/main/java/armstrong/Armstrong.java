package armstrong;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Armstrong 
{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int n,sum=0,temp,r;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number : ");
		n=Integer.parseInt(br.readLine());
		temp=n; 
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum+(r*r*r);
			
		}
		if(temp==sum)
			System.out.println("The given number is armstrong");
		else
			System.out.println("The given number is not armstrong");
}}
