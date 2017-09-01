/*
 * Complete the function below.
 */
import java.io.*;
import java.util.*;

public class AsceOrdSent
{

    static String arrange(String sentence) {
        //String REGEX = "^[A-Z][a-z ]*.";
      Pattern p = Pattern.compile("^[A-Z][a-z ]*");
      Matcher m = p.matcher(sentence); 
        String[] str = sentence.split(" ");
        String s = str[str.length-1];                                            
        s.replace(s.charAt(s.length-1),"");
       Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String a, String b) 
            {
                return StringCompare(a,b);
            }
        }); 
        StringBuffer str1 = new StringBuffer();
//str[0].setCharAt(0, Character.toUpperCase(str[0].charAt(0)));
   //     char ch = str[0].charAt(0);
   //     Character.toUpperCase(ch);
        //System.out.println(ch);
          for(int i=0;i<str.length;i++){
              str1.append(str[i].toLowerCase()+" ");
          }
        String str2 = str1.substring(0, 1).toString().toUpperCase()+str1.substring(1).toString()+".";
       // Character.toUpperCase(str1.charAt(0));
        return str2;
    }

public static int StringCompare(String s1,String s2)
    {
         if(s1.length() > s2.length()) return 1;
        if(s1.length() < s2.length()) return -1;
        for(int i = 0; i < s1.length(); i++)
        {
            if((int)s1.charAt(i) > (int)s2.charAt(i)) return 1;
            if((int)s1.charAt(i) < (int)s2.charAt(i)) return -1;
        }
        return 0;
    }
}
 


