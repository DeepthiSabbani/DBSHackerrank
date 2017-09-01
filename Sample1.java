import java.util.*;

public class Sample1 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter sentense");
		String sentence = in.nextLine();
		String[] str = sentence.split(" ");
        List<Integer> list = new ArrayList<Integer>();
	//System.out.println(str.length);
	int max =0;
	String maxStr ="";
        for(int i=0;i<str.length;i++){
            list.add(str[i].length());
			if(str[i].length()%2==0){
                    max = str[i].length();
				    maxStr=str[i];
			     }else{
                    System.out.println("Word"+"00");
                 }
        }
		
    	System.out.println("Word"+maxStr);
	}
}
