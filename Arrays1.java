import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
public class Arrays1{

public static void main(String[] args){

	int n,a[],key;
	Scanner in = new Scanner(System.in);
	System.out.println("enter array size");
	n = in.nextInt();
	System.out.println("enter values of array");
	a = new int[n];
	for(int i=0;i<n;i++){
		a[i] = in.nextInt();
	}
	System.out.println("enter key value");
	key = in.nextInt();
	Arrays.sort(a);
	System.out.println(Arrays.binarySearch(a,key));
}

}