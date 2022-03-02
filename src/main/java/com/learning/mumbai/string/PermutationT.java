package com.learning.mumbai.string;

import java.util.HashMap;
import java.util.Scanner;

public class PermutationT
{	
	public boolean permutation(String str1, String str2)
	{		
		if(str1.length() != str2.length())
		{
			return false;
		}

		HashMap<Character, Integer> map = new HashMap<>(); 
		
		for(int i = 0; i < str1.length(); i++)
		{	
			//add elements of input1 in HashMap
			char ch1 = str1.charAt(i);
			if(map.containsKey(ch1))
			{
				map.put(ch1, map.get(ch1)+1);
			}
			else
			{
				map.put(ch1, 1);
			}
		    
			//take second input2 elements and check frequency
			char ch2 = str2.charAt(i);
			if(map.containsKey(ch2))
			{
				map.put(ch2, map.get(ch2) - 1);
			}
			else
			{
				map.put(ch2, -1);
			}
		}
		
		for(char ch : map.keySet())
        {
            if(map.get(ch) == null || map.get(ch) != 0)
			{
				return false;
			}
        }	
		return true;
	}
	
	public static void main(String... s)
	{	
		System.out.println("Enter String first: ");
		String input1 = new Scanner(System.in).next();
		
		System.out.println("Enter String second: ");
		String input2 = new Scanner(System.in).next();
		
		PermutationT per = new  PermutationT();
		boolean result = per.permutation(input1, input2);
		
		//System.out.println( (result == true) ? "PermutationT" : "No_PermutationT");
		System.out.println(result);		
	}
}