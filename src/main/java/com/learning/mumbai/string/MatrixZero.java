package com.learning.mumbai.string;

import java.util.HashSet;

class MatrixZero
{
	public static void main(String... s)
	{
		int[][] input = new int[][]{
			{ 0, 1, 1, 1, 1},
			{ 1, 1, 1, 1, 1},
			{ 1, 1, 1, 0, 1},
			{ 1, 1, 1, 1, 1},
			{ 1, 1, 1, 1, 1},
		};
		
		makeZero(input);
		
		for(int i = 0; i < input.length; i++)
		{
			for(int j = 0; j  < input[i].length; j++)
			{
				System.out.print(input[i][j] + " ");
			}
			System.out.println( );
		}
	}
	
	private static void makeZero(int[][] arr) {		
		HashSet<Integer> rows = new HashSet<>();
		HashSet<Integer> cols = new HashSet<>();
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				if( arr[i][j] == 0)
				{
					rows.add(i);
					cols.add(j);	
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j  < arr[i].length; j++)
			{
				if(rows.contains(i) || cols.contains(j)) {
					arr[i][j] = 0;
				}					
			}
		}	
	}

}