package com.learning.mumbai.string;

public class ReverseString
{	
	public String reverse(String s1)
	{
		char[] str = s1.toCharArray();
		
		for(int i = 0; i < str.length - i; i++)
		{
			char temp1 = str[i];
			str[i] = str[(str.length - 1) - i];
			str[(str.length - 1) - i] = temp1;
		}
		
		return String.valueOf(str);
	}
	
	public static void main(String... s)
	{	
		System.out.println("Enter String:");
		String inputString = new java.util.Scanner(System.in).next();
		
		ReverseString rs = new ReverseString();
		String result = rs.reverse(inputString);
		
		System.out.println("Reverse String: " + result);		
	}
}