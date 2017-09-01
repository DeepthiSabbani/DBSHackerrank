import java.util.*;
class Sample 
{
	public static void main(String[] args) 
	{
		
	//	int a[] = new int[5];
   //     int n=0;
//		System.out.println("Hello World!"+a[++n]);
		List<Integer> a = new ArrayList<Integer>();
		for(int i =0; i<10;i++){
			a.add(i);
			a.remove(0);
		}
		System.out.println(a.size());
	}
}
