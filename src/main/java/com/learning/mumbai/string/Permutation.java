package com.learning.mumbai.string;

public class Permutation
{	
	public boolean permutation(String str1, String str2)
	{	
		if(str1.length() != str2.length())
		{
			return false;
		}
		
		char[] temp = str2.toCharArray();
		
		for(int i = 0; i < 	str1.length(); i++)
		{
			for(int j = 0; j < str2.length(); j++) {
				if (temp[j] == str1.charAt(i)) {
					temp[j] = ' ';
				}
			}
		}
		return true;
	}
	
	public static void main(String[] ss)
	{	
		System.out.println("Enter String first: ");
		String input1 = new java.util.Scanner(System.in).next();
		
		System.out.println("Enter String second: ");
		String input2 = new java.util.Scanner(System.in).next();
		
		Permutation per = new  Permutation();
		boolean result = per.permutation(input1, input2);
		
		//System.out.println( (result == true) ? "Permutation" : "No_Permutation");
		System.out.println(result);		
	}
}