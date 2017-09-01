import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.*;

public class MinMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Long[] arr = new Long[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextLong();
        }
         LongStream b = LongStream.of(arr[0], arr[1], arr[2],arr[3],arr[4]);
          long s = b.sum();
        Long[] minmax = new Long[5];
            for(int i=0;i<5;i++){
                minmax[i] = s - arr[i] ;
            }
        LongStream b1 = LongStream.of(minmax[0], minmax[1], minmax[2],minmax[3],minmax[4]);
        OptionalLong oMin = b1.min();
        OptionalLong oMax = b1.max();
         
        System.out.println("min= "+oMin.getAsLong()+"max= "+oMax.getAsLong());
        
        
    }
}
