package com.learning.mumbai.string;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueCharStringT
{	
	public boolean findUniqueChar(String str)
	{
		HashSet<Character> set = new HashSet<>();
		boolean result;
		
		for(int i = 0; i < str.length(); i++)
		{
			result = set.add(str.charAt(i));
			if(result == false)
			{ 
				return false;
			}
		}
		return true;
	}
	
	public static void main(String... s)
	{	
		System.out.println(" -- Check all charactors are Unique in String -- ");
		
		System.out.println("Enter String:");
		String inputString = new Scanner(System.in).next();
		
		UniqueCharStringT ucsT = new UniqueCharStringT();
		boolean result = ucsT.findUniqueChar(inputString);
		
		if(result == true)
		{
			System.out.println("String has all unique characters");
		}
		else
		{
			System.out.println("String not all unique characters");
		}			
	}
}