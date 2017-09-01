import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
public class CpyOfRnge{

public static void main(String[] args){

	int n,a[],b[],i,j;
	Scanner in = new Scanner(System.in);
	System.out.println("enter array size");
	n = in.nextInt();
	System.out.println("enter values of array");
	a = new int[n];
	for(int m=0;m<n;m++){
		a[m] = in.nextInt();
	}
	System.out.println("enter values of i and j");
	i = in.nextInt();
	j = in.nextInt();
	b = Arrays.copyOfRange(a,i,j);
	System.out.println(b.length);
	for(int k=0;k<b.length;k++){
		System.out.println(b[k]);
	}

}

}