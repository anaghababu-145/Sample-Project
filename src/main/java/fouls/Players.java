package fouls;

import java.util.Scanner;

public class Players {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,idx = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of players");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the number of fouls made by each player");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int min=a[0];
				for(i=0;i<n;i++)
				{
					if(min>a[i])
					{
						min=a[i];
						idx=i;
					}
				}
		System.out.println("The eligible player no :"+ ++idx +"("+min+"fouls)");
	}

}
