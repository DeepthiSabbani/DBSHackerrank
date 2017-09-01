import java.util.*;
import java.io.*;
import java.lang.*;

public class MinRowMatrix 
{
	public static void main(String[] args) 
	{
		int row,col;
			
		Scanner in = new Scanner(System.in);
		System.out.println("Enter values of row and column size");
		row = in.nextInt();
		col = in.nextInt();
		
		int a[][] = new int[row][col];
		System.out.println("Enter values of a");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				a[i][j] = in.nextInt();
			}
		}
		int count[] = new int[row];
		for(int i=0;i<row;i++){
			count[i]=0;
			for(int j=0;j<col;j++){
				count[i] = count[i]+a[i][j];
			}
		}
		int minValue = count[0]; 
		int minRow =0;
		for(int i=1;i<count.length;i++){ 
			if(count[i] < minValue){ 
				minValue = count[i]; 
				minRow = i;
			} 
		 } 
	  System.out.println(minRow);
		
	}
}
