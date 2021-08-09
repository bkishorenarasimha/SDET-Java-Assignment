package com.broadridge.corejava;

public class Fibonacci {

	public static void main(String[] args) 
	{
		int N = 10, A = 0, B = 1;
		System.out.println("Fibonacci Series till " + N + " values");

		for (int i = 1; i <= N; ++i) 
		{ 
			System.out.println(A);
			
			int C = A + B;
			A = B;
			B = C;
		}
	}
}
