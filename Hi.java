public class  Hi
{
	public static void main(String[] args) 
	{
		String d = "kau";
	int a = ((int)d.charAt(0));
	int b = ((int)d.charAt(1));
	int c = ((int)d.charAt(2));
 

	if((a-c==10 || a-c==-10)  && (b-c==20||b-c==-20)){
		System.out.println("Not Exceeded");
	}
	
	else{
		System.out.println(" Exceeded");
	}
}
}
