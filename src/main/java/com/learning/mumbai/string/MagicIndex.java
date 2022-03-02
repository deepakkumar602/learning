package com.learning.mumbai.string;

import java.util.Scanner;

class MagicIndex
{
	public static void main(String... s)
	{
		System.out.println("How many values do you want to enter: ");
		int size = new Scanner(System.in).nextInt();
		
		int[] input = new int[size];
		
		for(int i = 0; i < input.length; i++)
		{
			System.out.println("Enter the value at index " + i + ": ");
			input[i] = new Scanner(System.in).nextInt();
		}	
		
		System.out.println(" Magic index number is: " + getMinArray(input, 0 , input.length - 1));
	}

	
	static int getMinArray(int[] input, int start, int end)
	{
		if (end < start) {
			return -1;
		}

		int midIndex = (start + end) /2;
		if( midIndex == input[midIndex])
		{	
			return midIndex;
		}
		if ( midIndex < input[midIndex])
		{
            return getMinArray(input, start, midIndex-1 );
		}
		if ( midIndex > input[midIndex])
		{	
			return getMinArray(input, midIndex+1, end);
		}
		
		return -1;
	}
	
}
			
			
			
			