package com.learning.mumbai.string;

import java.util.Scanner;

public class MatrixProcessor
{
	private int[][] getInput()
	{
		//Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size n of Matrix(n*n): ");
		int size = new Scanner(System.in).nextInt();
		
		int[][] input = new int[size][size];
		
		for(int i = 0; i < size; i++)
		{
			for(int j = 0; j < size; j++)
			{
				System.out.printf(" Enter value at i[%d][%d] Index :" , i, j);
				input[i][j] = new Scanner(System.in).nextInt();
			}
		}
		return input;
	}
	
	private void print(int[][] input)
	{
		System.out.println( "--  Output --");
		for(int i = 0; i < input.length; i++)
		{
			for(int j = 0; j < input.length; j++)
			{
				System.out.print("  " + input[i][j]);
			}
			System.out.println();
		}
	}

	
	private int[][] transpose(int[][] input)
	{
		int temp = 0;
		int length = input.length - 1; 
		
		for(int i = 0; i < input.length/2 ; i++)
		{
			
			for(int j = i; j < length - i; j++)
			{	
				temp = input[i][j];
		
				input[i][j] = input[length - j][i];
				
				input[length - j][i] = input[length - i][length - j];
	
				input[length - i][length - j] = input[j][length - i];
				
				input[j][length - i] = temp;
			}
		}
		return input;
	}
	
	public static void main(String... s)
	{	
		MatrixProcessor matrixProcessor = new MatrixProcessor();
		
		int[][] input = matrixProcessor.getInput();
		matrixProcessor.print(input);
		
		int[][] output = matrixProcessor.transpose(input);
		matrixProcessor.print(output);	
	}
}