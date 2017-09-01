
import java.util.*;
public class ArrtoList 
{
	public static void main(String[] args) 
	{
		Integer[] a = {1,2,3,4};
		System.out.println(a.length);
		List<Integer> b = Arrays.asList(a);
		System.out.println(b.size());
	}
}
