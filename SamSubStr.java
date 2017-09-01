package com.dynamic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SamSubStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner in = new Scanner(System.in);
        System.out.println("Enter n value");
        String n = in.nextLine();
        List<String> li = new ArrayList<String>();
        int sum =0;
        int n1;
        for(int i=0;i<n.length();i++){
        	String s = n.substring(i,n.length());
        	if(s.length()>1)
        		li.add(s);
        }
        for(int i=n.length()-1;i>=0;i--){
        	String s = n.substring(0,i);
        	if(s.length()>1){
        		if(!li.contains(s)){
        			li.add(s);
        		}
        	}
        }
        for(int i=0;i<n.length();i++){
        	li.add( Character.toString(n.charAt(i)));
        }
        for(String st:li){
        	if(st!=null && !st.equals("")){
        		n1 = Integer.parseInt(st);
        		sum= sum+n1;
        	}
        }
        System.out.println(sum);
        
	}

}