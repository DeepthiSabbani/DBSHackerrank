import java.io.*;
import java.util.*;

public class MaxElmntStack {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
		System.out.println("Enter n value ");
	        int n = in.nextInt();
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0;i<n;i++){
			System.out.println("Enter query value ");
	        int query = in.nextInt();
			if(query ==1){
				System.out.println("push value into Stack");
				stack.push(in.nextInt());
			}
			 if(query==2){
				 stack.pop();
			 }
			if(query==3){
				 System.out.println(stack.peek());
			}
        }
    }
}