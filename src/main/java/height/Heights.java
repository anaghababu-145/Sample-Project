package height;
import java.util.*;
import java.io.IOException;

public class Heights {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
int no;
float temp;
Scanner br=new Scanner(System.in);
System.out.println("Enter the number of students");
no=br.nextInt();
float a[]=new float[no];
System.out.println("Enetr height of students");
for(int i=0;i<no;i++)
{
	a[i]=br.nextFloat();
}
for(int i=0;i<no;i++)
{
	for(int j=i+1;j<no;j++) 
	{
		if(a[i]>a[j])
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		
		}
	}
}

System.out.println("Heights in order");
for(int i=0;i<no-1;i++)
{
	System.out.println(a[i] +" ");
}
System.out.println(a[no-1]);
	}

}
