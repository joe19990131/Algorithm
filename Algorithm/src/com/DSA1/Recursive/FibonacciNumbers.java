package com.DSA1.Recursive;

public class FibonacciNumbers {

	public int fibNum(int n) {
		if (n == 0 || n == 1)
			return n;
		else
			return fibNum(n - 1) + fibNum(n - 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciNumbers fn = new FibonacciNumbers();
		System.out.println(fn.fibNum(4));
	}

}
