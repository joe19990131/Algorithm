package com.DSA1.Recursive;

public class FibonacciNumbers {

	public int recursiveFibNum(int n) {
		if (n == 0 || n == 1)
			return n;
		else
			return recursiveFibNum(n - 1) + recursiveFibNum(n - 2);
	}

	public int nonRecursiveFibNum(int n) {
		if (n == 0 || n == 1)
			return n;
		else if (n == 2)
			return 1;
		else {
			int a = 0, b = 1, c = 1, i;
			for (i = 3; i <= n; i++) {
				a = b;
				b = c;
				c = a+b;
			}return c;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciNumbers fn = new FibonacciNumbers();
		System.out.println(fn.nonRecursiveFibNum(5));
		System.out.println(fn.recursiveFibNum(5));
		
	}

}
