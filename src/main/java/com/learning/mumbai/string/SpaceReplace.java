package com.learning.mumbai.string;

public class SpaceReplace
{	
	
	public char[] spaceReplace(char[] input)
	{
		int trueLength = findTrueLength(input);
		return replaceSpaces(input, trueLength);
	}
	
	private static int findTrueLength(char[] input) 
	{
		int spaceCountAtTheEnd = 0;
		for (int i = input.length - 1; i >= 0; i--) 
		{
			if(input[i] != ' ') 
			{
				break;
			}
			spaceCountAtTheEnd++;
		}
		return input.length - spaceCountAtTheEnd;
	}
	
	private static int countSpaces(char[] input, int trueLength) 
	{
		int spaceCount = 0;
		for (int i = 0; i < trueLength; i++) 
		{
			if(input[i] == ' ') 
			{
				spaceCount++;
			}
		}
		return spaceCount;
	}

	private char[] replaceSpaces(char[] input, int trueLength)
	{
		int spaceCount = countSpaces(input, trueLength);
		int newLength = trueLength + spaceCount*2;
		if (newLength > input.length) 
		{
			return input;
		}
		
		int idx = newLength - 1;
		for (int i = trueLength - 1; i >= 0; i--)
		{
			if (input[i] == ' ')
			{
				input[idx--] = '0';
				input[idx--] = '2';	
				input[idx--] = '%';
			}
			else
			{
				input[idx--] = input[i];
			}
		}
		return input;
	}	
	
	
	public static void main(String... s)
	{	
		String input = "  Mr.  Deepu  Kumar   Jalap                         ";
		
		SpaceReplace sr = new SpaceReplace();
		char[] result = sr.spaceReplace(input.toCharArray());
		
		System.out.println("I: '" + input + "'");
		System.out.print("O: '");
		for(int i = 0; i < result.length; i++)
		{
			System.out.print(result[i]);
		}	
		System.out.println("'");
	}
}