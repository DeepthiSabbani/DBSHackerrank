import java.util.Scanner;
public class  printP
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String str = "#";
		for(int i=0;i<n;i++){
			System.out.printf("%"+(n+1)+"S",str+"\n");
			str = str+"#";
		}
	}
}
