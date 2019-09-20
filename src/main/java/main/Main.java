/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
package main;
import java.util.Scanner;
public class Main 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
Scanner obj=new Scanner(System.in);
int battery=obj.nextInt();
int totalSongs=obj.nextInt();
int songNo=1;
while(battery>30)
{
	System.out.println("Music On");
	System.out.println("Playing Song"+songNo);
	obj.nextLine();
	do
	{
		System.out.println("Do you want to play again?Yes/No");
		String reply=obj.nextLine();
		if(reply.equals("Yes"))
			System.out.println("Playing Song:"+songNo);
		else if(reply.equals("No"))
			System.out.println("Invalid input string!!Enter Yes/No correctly");
		else if(songNo<totalSongs)
		{
			System.out.println("Do you want to continue with the next song?Yes/no");
		String nextSong=obj.nextLine();
		if(nextSong.equals("No"))
			break;
		else
			System.out.println("Playing Song:"+(++songNo));
		}
	battery -= 5;
	}  
	while(songNo < totalSongs && battery > 30);
if(battery<=30)
	break;
System.out.println("Do you want to stop music?Yes/No");
String stop=obj.next();
if(stop.equals("Yes"))
	break;
else if(songNo>=totalSongs)
{
	System.out.println("restarting");
songNo=1;
}
else
	System.out.println("resume");
	battery-=5;
	}
if(battery<=30)
	System.out.println("low battery!!!");
System.out.println("music player stopped!!!");
	}
}