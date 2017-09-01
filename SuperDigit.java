import java.io.*;
import java.util.*;

public class SuperDigit {

    static int sumOfDigits(int n){
        int temp,r,sum=0,tmp;
        temp = n;
        while(n>0){
            r = n%10;
            sum=sum+r;
            n=n/10;
        }
		tmp = sum;
		
        return sumOfDigits(tmp);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n,k;
        Scanner in = new Scanner(System.in);
		System.out.println("enter n value");
        n = in.nextInt();
		System.out.println("enter k value");
		k = in.nextInt();
        String str = String.valueOf(n);
		String	temp = str;
		for(int i=1;i<k;i++){
			temp = temp+str;
		}
		//		System.out.println(temp);
        int superDigit = sumOfDigits(Integer.parseInt(temp));
        System.out.println(superDigit);
    }
}