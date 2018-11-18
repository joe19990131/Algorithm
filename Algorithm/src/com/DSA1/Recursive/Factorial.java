package com.DSA1.Recursive;

public class Factorial {

	public int factorial(int n) {
		int ans;
		if(n == 1) {
			ans = 1;
		}else {
			ans = n*factorial(n-1);
		}
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial factorial = new Factorial();
		
		System.out.println(factorial.factorial(5));
	}

}
