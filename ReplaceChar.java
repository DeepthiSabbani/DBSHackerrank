import java.util.*;
import java.io.*;
import java.lang.*;

public class  ReplaceChar
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String");
		String str;
		
		str = in.nextLine();
		
		System.out.println(str.replace('a','i'));
	}
}
