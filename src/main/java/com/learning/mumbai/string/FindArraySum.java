package com.learning.mumbai.string;

import java.util.HashSet;

class FindArraySum
{
	public static void main(String... s)
	{
		int number = 9;
		int[] input = { 1, 2, 3, 4, 5, 6};
		
		FindArraySum fs = new FindArraySum();
		boolean result = fs.findSum(input, number);
		
		if(result == true){
			System.out.print(" Two elements of sum equal to input number: " + number);
		}else{
			System.out.print(" Two elements of sum not equal to input number: " + number);
		}
	}
	
	boolean findSum(int[] input, int number)
	{
		int temp = 0;
		
		for(int i = 0; i < input.length; i++)
		{
			for(int j = i + 1; j < input.length; j++)
			{
				temp = input[i] + input[j];
				if(temp == number){
					return true;
				}
			}
		}
		return false;	
	}
	
	boolean findSum1(int[] input, int sum)
	{	
		int temp = 0;
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i = 0; i < input.length; i++)
		{
			temp = sum - input[i];
			if (set.contains(temp)) 
			{
                return true;
            }
            set.add(input[i]);
		}
		return false;
	}
}