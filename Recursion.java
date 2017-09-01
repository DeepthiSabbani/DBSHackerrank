import java.io.*;
import java.util.*;
import java.text.*;

public class Recursion 
{
	public static void main(String[] args) 
	{
		int n=1;
		
		recursive(n);
		
       
	}
	static void recursive(int n){
		
		if(n<=20){
			System.out.println(n);
			recursive(n+1);
		}
	}
}
