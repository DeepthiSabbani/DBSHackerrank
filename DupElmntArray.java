import java.util.*;
import java.io.*;
import java.lang.*;


public class DupElmntArray 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size");
		int size = in.nextInt();
		System.out.println("Enter values of array");
		int a[] = new a[size];
		for(int i =0;i<size;i++){
			a[i] = in.nextInt();
		}

		Arrays.sort(a);
		int count[] = new int[];
		for(int i=0;i<a.length;i++){
			count[i]=0;
			if(a[i]==a[i+1]){
				count[i]++;
			}
		}
		System.out.println(count.length);
	}
}
