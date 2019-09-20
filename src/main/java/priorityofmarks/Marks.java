package priorityofmarks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Marks {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
int n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number of students");
n=Integer.parseInt(br.readLine());
int no[]=new int[n];
System.out.println("Enter the marks of students");
for(int i=0;i<n;i++)
{
	no[i]=Integer.parseInt(br.readLine());
}
for(int i=0;i<n;i++)
{
	for(int j=i+1;j<n;j++) 
	{
		if(no[i]<no[j])
		{
			int temp=no[i];
			no[i]=no[j];
			no[j]=temp;
		
		}
	}
}

System.out.println("The priority of marks is");
for(int i=0;i<n-1;i++)
{
	System.out.println(no[i] +" ");
}
System.out.println(no[n-1]);
	}

}
