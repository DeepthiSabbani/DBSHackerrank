import java.util.*;
import java.io.*;
import java.lang.*;

public class AddMatrix 
{
	public static void main(String[] args) 
	{
		int a[][] = new int[2][2];
		int b[][] = new int[2][2];
		int c[][] = new int[2][2];

		Scanner in = new Scanner(System.in);
		System.out.println("Enter values of a");
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				a[i][j] = in.nextInt();
			}
		}
		System.out.println("Enter values of b");
		for(int m=0;m<2;m++){
			for(int n=0;n<2;n++){
				a[m][n] = in.nextInt();
			}
		}
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				c[i][j] = a[i][j]+b[i][j];
				System.out.println("c="+c[i][j]);
			}
		}
		
	}
}
