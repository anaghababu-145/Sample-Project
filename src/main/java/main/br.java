package main;
import java.io.*;
public class br {

	public static void main(String[] args) {
		try
		{
		FileReader fr = new FileReader("hai.txt");    
		BufferedReader bur = new BufferedReader(fr);    
		  
		int i;    
		while((i=bur.read())!=-1)
		{  
			System.out.print((char)i);  
		}  
		bur.close();    
		fr.close();
		}
		catch (Exception e){}
	}

}
