package com.learning.mumbai.string;

public class UniqueCharString
{	
	public boolean findUniqueChar(String str)
	{
		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			for(int j = i + 1; j < str.length(); j++)
			{
				if(ch == str.charAt(j))
				{
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String... s)
	{	
		System.out.println(" -- Check all charactors are Unique in String -- ");
		System.out.println("Enter String:");
		String inputString = new java.util.Scanner(System.in).next();
		
		UniqueCharString ucs = new UniqueCharString();
		boolean result = ucs.findUniqueChar(inputString);
		
		if(result == true)
		{
			System.out.println("String has all unique characters");
		}
		else
		{
			System.out.println("String not contains all unique characters");
		}			
	}
}